package org.delta.services.eligibilityAndBenefits.facade.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.delta.crossplane.benefits.service.BenefitsService;
import org.delta.crossplane.domain.Address;
import org.delta.crossplane.domain.Amount;
import org.delta.crossplane.domain.Person;
import org.delta.crossplane.domain.benefits.BenefitCounter;
import org.delta.crossplane.domain.benefits.BenefitPackage;
import org.delta.crossplane.domain.benefits.DeductiblesMaximums;
import org.delta.crossplane.domain.benefits.ProcedureClass2;
import org.delta.crossplane.domain.benefits.ProcedureCode;
import org.delta.crossplane.domain.benefits.ProcedureCode2;
import org.delta.crossplane.domain.benefits.TreatmentType;
import org.delta.crossplane.domain.benefits.WaitingPeriod;
import org.delta.crossplane.domain.eligibility.EnrolleeEligibility;
import org.delta.crossplane.domain.enrollment.Division;
import org.delta.crossplane.domain.enrollment.Enrollee;
import org.delta.crossplane.domain.enrollment.PrimaryEnrolleeContract;
import org.delta.crossplane.domain.group.Group;
import org.delta.crossplane.domain.provider.SecondaryIdentifier;
import org.delta.crossplane.domain.provider.SecondaryIdentifier.IdentifierCode;
import org.delta.crossplane.domain.provider.TierCode;
import org.delta.crossplane.eligibility.exception.NoPersonFoundException;
import org.delta.crossplane.eligibility.service.EligibilityService;
import org.delta.schemas.data.*;
import org.delta.services.BenefitPackageNotFoundException;
import org.delta.services.IVRUtil;
import org.delta.services.MissingParameterException;
import org.delta.services.OperationException;
import org.delta.services.SpringApplicationContext;
import org.delta.services.UnknownCodeException;
import org.delta.services.eligibilityAndBenefits.facade.EligibilityAndBenefitsIVRFacade;

public class EligibilityAndBenefitsIVRFacadeImpl implements EligibilityAndBenefitsIVRFacade {
	
	private static final TContract[] zeroContractArray = new TContract[0];
	private static final TContractListResponse noEnrolleeMatchResponse = new TContractListResponse(zeroContractArray, SContractResponseStatusType.NO_MATCHING_ENROLLEE);
	private static final TContractListResponse contractFilteredResponse = new TContractListResponse(zeroContractArray, SContractResponseStatusType.CONTRACT_FILTERED);
	private static final TContractListResponse multipleMatchingEnrolleeResponse = new TContractListResponse(zeroContractArray, SContractResponseStatusType.MULTI_MATCHING_ENROLLEE);
	private static final TContractListResponse dobMismatchResponse = new TContractListResponse(zeroContractArray, SContractResponseStatusType.DOB_MISMATCH);
	private EligibilityService eligibilityService;
	private BenefitsService benefitsService;

	
	public TContractListResponse getEligibilityByEnrolleeIdentifier(String enrolleeId, Date enrolleeDob) 
		throws MissingParameterException, OperationException, UnknownCodeException {
		if ( StringUtils.isBlank(enrolleeId) ) {
			throw new MissingParameterException("Enrollee ID is not specified");			
		}
		if ( enrolleeDob == null ) {
			throw new MissingParameterException("Enrollee Date of Birth is not specified");			
		}
		
		//holds return from eligibility service
		List<PrimaryEnrolleeContract> contractList = new ArrayList<PrimaryEnrolleeContract>();
		try {
			contractList = getEligibilityService().getEligibility(enrolleeId);
		}
		catch(NoPersonFoundException npfe) {
			return noEnrolleeMatchResponse;
		}
		catch(Throwable e) {
			throw new OperationException("Error executing getEligibilityByEnrolleeIdentifier("
					+enrolleeId+","+enrolleeDob+")", e);
		}
		
		if (contractList.size() == 0) {
			return noEnrolleeMatchResponse;
		}

		//categorize contracts by person
		Map<String, List<PrimaryEnrolleeContract>> contractByPersonTable = new HashMap<String, List<PrimaryEnrolleeContract>>();
		PrimaryEnrolleeContract curPC;
		String id;
		for ( int i = 0; i < contractList.size(); i++ ) {
			curPC = contractList.get(i);
			id = curPC.getPrimaryEnrollee().getPerson().getPersonIdentifier();
			if ( !contractByPersonTable.containsKey(id) ) {
				List<PrimaryEnrolleeContract> curList = new ArrayList<PrimaryEnrolleeContract>();
				curList.add(curPC);
				contractByPersonTable.put(id, curList);
			}
			else {
				contractByPersonTable.get(id).add(curPC);
			}
		}
		
		//compare dob to get the match lis
		List<PrimaryEnrolleeContract> matchList = new ArrayList<PrimaryEnrolleeContract>();
		if ( contractByPersonTable.size() > 1 ) { //contracts belong to multiple person
			int numMatch = 0;
			Set<String> keys = contractByPersonTable.keySet();
			List<PrimaryEnrolleeContract> curList;
			List<PrimaryEnrolleeContract> curMatchList = new ArrayList<PrimaryEnrolleeContract>();
			for ( Iterator<String> ids = keys.iterator(); ids.hasNext(); ) {
				curList = new ArrayList<PrimaryEnrolleeContract>(contractByPersonTable.get(ids.next()));
				if ( IVRUtil.isBirthDateInPrimaryEnrolleeContractList(curList, enrolleeDob)) {
					numMatch++;
					curMatchList = new ArrayList<PrimaryEnrolleeContract>(curList);
				}
			}
			if ( numMatch > 1 ) {
				return multipleMatchingEnrolleeResponse;
			}
			else if ( numMatch == 1 ) {
				matchList.addAll(curMatchList);
			}
			else {//multiple person, no matching dob
				return dobMismatchResponse;
			}
		}
		else { //contractByPersonTable.size() == 1; all contracts belong to one person, still need to check dob
			if ( IVRUtil.isBirthDateInPrimaryEnrolleeContractList(contractList, enrolleeDob) ) {
				matchList.addAll(contractList);
			}
			else {
				return dobMismatchResponse;
			}
		}
		
		//now matchList contains all contracts of the matching person
		//convert it to TContract[]
		TContract[] contracts = new TContract[matchList.size()];
		for ( int i = 0; i < matchList.size(); i++ ) {
			PrimaryEnrolleeContract c = matchList.get(i);
			contracts[i] = convertToTContract(c);
		}

		return processAndReturnTContractArray(contracts, enrolleeDob);
	}

 
	private TContractListResponse processAndReturnTContractArray(TContract[] contracts, Date enrolleeDob) {

		/*
		 Filter the contracts based on status; filter first before applying dob
		 Up to 2 contracts to be returned: (2+ active or 2+ pending results become exception case)
		 a. 2 active contracts 
		 b. 1 active and 0 or 1 pending active
		 c. 1 or 2 pending
		 d. 1 inactive
		 */

		//sort contracts into active, pending, and inactive 		
		Map<SStatusType, List<TContract>> contractTable = new HashMap<SStatusType, List<TContract>>();
		TContract curContract;
		SStatusType status;
		for (int i = 0; i < contracts.length; i++ ) {
			curContract = contracts[i];
			status = curContract.getCoverageStatus();
			if ( !contractTable.containsKey(status) ) {
				List<TContract> curList = new ArrayList<TContract>();
				curList.add(curContract);
				contractTable.put(status, curList);
			}
			else {
				contractTable.get(status).add(curContract);
			}
		}

		List<TContract> filteredContracts = new ArrayList<TContract>();
		if ( contractTable.containsKey(SStatusType.active) ) { //has active contracts
			if ( contractTable.get(SStatusType.active).size() > 2 ) { //more than 2 active: set flag, return any one 
				TContract[] returnContract = new TContract[]{contractTable.get(SStatusType.active).get(0)};
				return new TContractListResponse(returnContract, SContractResponseStatusType.MORE_THAN_2);												
			}
			else if ( contractTable.get(SStatusType.active).size() == 2 ) {
				filteredContracts.addAll(contractTable.get(SStatusType.active));
			}
			else { //1 active; 0 or 1 pending
				filteredContracts.addAll(contractTable.get(SStatusType.active));
				if ( contractTable.containsKey(SStatusType.pending) ) {
					filteredContracts.add(getFirstTContract(contractTable.get(SStatusType.pending)));
				}
			}
		}
		else { //no active contracts
			if ( contractTable.containsKey(SStatusType.pending) ) { //has pending contracts
				if ( contractTable.get(SStatusType.pending).size() > 2 ) { //more than 2 pending: set flag, return any one 
					TContract[] returnContract = new TContract[]{contractTable.get(SStatusType.pending).get(0)};
					return new TContractListResponse(returnContract, SContractResponseStatusType.MORE_THAN_2);												
				}
				else if ( contractTable.get(SStatusType.pending).size() == 2 ) {
					filteredContracts.addAll(contractTable.get(SStatusType.pending));
				}
				else { //1 pending
					filteredContracts.addAll(contractTable.get(SStatusType.pending));
				}				
			}
			else { //no pending contract
				if ( contractTable.containsKey(SStatusType.inactive) ) { //has inactive contract
					filteredContracts.add(getLastTContract(contractTable.get(SStatusType.inactive)));
				}
				else { //no inactive contract: return contractFilteredResponse
					return contractFilteredResponse;
				}
			}
		}
		
		if ( enrolleeDob == null ) {
			TContract[] matchingTContracts = filteredContracts.toArray(new TContract[filteredContracts.size()]);
			if ( matchingTContracts.length == 0 ) {
				return new TContractListResponse(matchingTContracts, SContractResponseStatusType.CONTRACT_FILTERED);					
			}
			else {
				if ( matchingTContracts.length == 1 
						&& matchingTContracts[0].getCoverageStatus().equals(SStatusType.inactive) )
					return new TContractListResponse(matchingTContracts, SContractResponseStatusType.CONTRACT_TERMINATED);
				else
					return new TContractListResponse(matchingTContracts, SContractResponseStatusType.OK);
			}			
		}		
		else { //enrolleeDob is offered
			//check to see if dob in filtered out contracts
			boolean isDobInFilteredOutContracts = false;
			List<String> filteredContractIds = new ArrayList<String>();
			for ( Iterator<TContract> it = filteredContracts.iterator(); it.hasNext(); ) {
				filteredContractIds.add(it.next().getContractIdentifier());
			}
			for (int i = 0; i < contracts.length; i++ ) {
				curContract = contracts[i];
				curContract.getContractIdentifier();
				if ( !filteredContractIds.contains(curContract.getContractIdentifier()) ) {
					if ( isBirthDateInTContract(curContract, enrolleeDob) ) {
						isDobInFilteredOutContracts = true;
						break;
					}
				}
			}
				
			TContract[] personFilteredTContracts = filteredContracts.toArray(new TContract[filteredContracts.size()]);
			
			//check filtered contracts for matching dob
			for ( Iterator<TContract> it = filteredContracts.iterator(); it.hasNext(); ) {
				if ( !isBirthDateInTContract(it.next(), enrolleeDob) ) {
					it.remove();
				}
			}
			
			TContract[] matchingTContracts = filteredContracts.toArray(new TContract[filteredContracts.size()]);
			
			if ( matchingTContracts.length == 0 ) {
				if ( isDobInFilteredOutContracts ) {
					return new TContractListResponse(personFilteredTContracts, SContractResponseStatusType.DOB_FILTERED);	
				}
				else {
					return new TContractListResponse(personFilteredTContracts, SContractResponseStatusType.DOB_MISMATCH);	
				}
			}
			else {
				if ( matchingTContracts.length == 1 
						&& matchingTContracts[0].getCoverageStatus().equals(SStatusType.inactive) )
					return new TContractListResponse(matchingTContracts, SContractResponseStatusType.CONTRACT_TERMINATED);
				else
					return new TContractListResponse(matchingTContracts, SContractResponseStatusType.OK);
			}
		}
	}

	public TBenefitPackageInquiryResponse getBenefitPackage(String packageIdentifier, String contractIdentifier, String memberNumber, String personIdentifier, String[] procedureCodeArray) 
		throws MissingParameterException, OperationException, BenefitPackageNotFoundException, UnknownCodeException {
		if ( StringUtils.isBlank(packageIdentifier) ) {
			throw new MissingParameterException("Package Identifier is not specified");			
		}
		
		BenefitPackage bp;
		try {
			bp = getBenefitsService().getEnrolleeBenefits(packageIdentifier);
		}
		catch(Throwable e) {
			throw new OperationException("Problem retrieving benefit package "+packageIdentifier, e);
		}
		
		if ( bp == null ) {
			return new TBenefitPackageInquiryResponse(null, SSearchResultType.NOT_FOUND);
		}
		
		//retrieve benefit counter if contract id is provided
		List<BenefitCounter> benefitCounterList = new ArrayList<BenefitCounter>();
		if ( !StringUtils.isBlank(contractIdentifier) ) {
			try {
				benefitCounterList = benefitsService.getBenefitCounterByEnrolleeAndIdentifier(contractIdentifier, memberNumber, null);
			}
			catch(Throwable e) {
				throw new OperationException("Problem retrieving benefit counter for "+contractIdentifier+", "+memberNumber, e);
			}		
		}
		
		//retrieve waiting periods if contract id and member number are provided
		List<WaitingPeriod> waitingPeriodList = new ArrayList<WaitingPeriod>();
		if ( !StringUtils.isBlank(contractIdentifier) && !StringUtils.isBlank(memberNumber) ) {
			try {
				waitingPeriodList = benefitsService.getWaitingPeriod(contractIdentifier, memberNumber, null, new GregorianCalendar(), null, null);
			}
			catch(Throwable e) {
				throw new OperationException("Problem retrieving waiting period for "+contractIdentifier+", "+memberNumber, e);
			}		
		}
	
		TBenefitPackage tbp;
		//check procedureCodeArray to determine whether need filtering by procedure codes
		if ( procedureCodeArray != null && procedureCodeArray.length > 0 && !procedureCodeArray[0].trim().equals(""))
			tbp = convertToTBenefitPackage(bp, waitingPeriodList, benefitCounterList, true, procedureCodeArray);
		else
			tbp = convertToTBenefitPackage(bp, waitingPeriodList, benefitCounterList, false, null);
		
		return new TBenefitPackageInquiryResponse(tbp, SSearchResultType.OK);
	}

	public EligibilityService getEligibilityService() {
		if ( eligibilityService == null ) {
			eligibilityService = (EligibilityService) SpringApplicationContext.getBean("eligibilityService");			
		}
		return eligibilityService;
	}

	public void setEligibilityService(EligibilityService eligibilityService) {
		this.eligibilityService = eligibilityService;		
	}
	
	public BenefitsService getBenefitsService() {
		if ( benefitsService == null ) {
			benefitsService = (BenefitsService) SpringApplicationContext.getBean("benefitsService");
		}
		return benefitsService;
	}

	public void setBenefitsService(BenefitsService benefitsService) {
		this.benefitsService = benefitsService;		
	}

	
	private boolean isBirthDateInTContract(TContract contract, Date enrolleeDob) {
		TEnrollee[] enrollees = contract.getEnrolleeList();
		TEnrollee curEnrollee;
		Date dob;
		for (int i = 0; i < enrollees.length; i++ ) {
			curEnrollee = enrollees[i];
			dob = curEnrollee.getDateOfBirth();
			if ( DateUtils.isSameDay(dob, enrolleeDob) ) {
				return true;
			}				
		}
		return false;		
	}
	
	private TContract convertToTContract(PrimaryEnrolleeContract pc) {
		TContract tc = new TContract();
		
		Enrollee primaryEnrollee = pc.getPrimaryEnrollee();

		//populate contract info
		tc.setContractIdentifier(primaryEnrollee.getPrimaryEnrolleeId());
		tc.setCoverageStartDate(pc.getEffectiveDate());
		tc.setCoverageEndDate(pc.getEndDate());
		
		//populate group/division info from first contract span
		TDivision td = new TDivision();
		Division fromDivision = pc.getCoverageSpans().get(0).getDivision();		
		td.setDivisionName(fromDivision.getDivisionName());
		td.setDivisionNumber(fromDivision.getDivisionNumber());
		//Hard Code value for the Test by Ali 12/16/2008
		td.setDivisionSelfFunded(true);

		TGroup tg = new TGroup();
		tg.setDivision(td);
		Group fromGroup = fromDivision.getGroup();
		tg.setGroupName(fromGroup.getGroupName());
		tg.setGroupNumber(fromGroup.getGroupNumber());
		tc.setGroup(tg);

		//retrieve active eligibility; if not exist, get the first one instead
		EnrolleeEligibility activeEE = null;
		List<EnrolleeEligibility> eeList = primaryEnrollee.getEligibilities();
		EnrolleeEligibility ee;
		for ( int i = 0; i < eeList.size(); i++ ) {
			ee = eeList.get(i);
			if ( ee.isActive() ) {
				activeEE = ee;
				break;
			}
		}
		if ( activeEE == null ) {
			activeEE = eeList.get(0);
		}
				
		//populate businessUnit info from the active eligibility period
		TBusinessUnit tb = new TBusinessUnit();
		//level 5
		tb.setHealthCareContractHolderIdentifier(activeEE.getHealthCareContractHolderIdentifier());
		//level 6
		tb.setFinancialReportingStateIdentifier(activeEE.getFinancialReportingStateIdentifier());
		//level 4
		tb.setGroupTypeIdentifier(activeEE.getGroupTypeIdentifier());
		//level 7
		tb.setProductIdentifier(activeEE.getProductIdentifier());
		tc.setBusinessUnit(tb);		

		List<Enrollee> dependentList = pc.getDependentEnrollee();
		TEnrollee[] enrolleeArray = new TEnrollee[dependentList.size()+1];
		TEnrollee tPrimaryEnrollee = convertToTEnrollee(primaryEnrollee);		
		enrolleeArray[0] = tPrimaryEnrollee;
		for(int i = 0; i < dependentList.size(); i++) {
			enrolleeArray[i+1] = convertToTEnrollee(dependentList.get(i));
		}
		tc.setEnrolleeList(enrolleeArray);
				
		//determine coverageStatus: active/future(start before the end of the following month)/inactive
		Date today = new Date();
		if ( today.after(org.delta.crossplane.common.util.DateUtils.startOfDay(tc.getCoverageStartDate())) 
				&& ( tc.getCoverageEndDate()==null 
						|| today.before(org.delta.crossplane.common.util.DateUtils.endOfDay(tc.getCoverageEndDate()))) ) {
			tc.setCoverageStatus(SStatusType.active);
		}
		else if ( tc.getCoverageEndDate()!=null 
				&& today.after(org.delta.crossplane.common.util.DateUtils.endOfDay(tc.getCoverageEndDate())) ) {
			tc.setCoverageStatus(SStatusType.inactive);
		}
		else {
			Date futureDay = getLastDayOfNextMonth();
			if ( tc.getCoverageStartDate().after(org.delta.crossplane.common.util.DateUtils.endOfDay(today))
				&& tc.getCoverageStartDate().before(org.delta.crossplane.common.util.DateUtils.endOfDay(futureDay)) ) {
					tc.setCoverageStatus(SStatusType.pending);
			}
			else {
				//in far future, status not defined
			}
		}
		
		TEnrollee[] ten = tc.getEnrolleeList();
		for(int i=0; i < ten.length; i ++){
		    if ( ten[i].getEligibilityStatus().equals(SStatusType.active)
					&& tc != null
					&& tc.getCoverageEndDate() != null
					&& today.after(org.delta.crossplane.common.util.DateUtils.endOfDay(tc.getCoverageEndDate()))){
				// CQ defect # DELTA00060351
		    	ten[i].setEligibilityStatus(SStatusType.inactive);
			} 
		}	
		return tc;
	}

	private TEnrollee convertToTEnrollee(Enrollee fromEnrollee) {
		Person fromPerson = fromEnrollee.getPerson();
		String relation = fromEnrollee.getIndividualRelationshipCode().getDisplayCode();
		//populate primary enrollee
		TEnrollee enrollee = new TEnrollee();
		enrollee.setRelationshipCode(IVRUtil.toSEnrolleeType(relation));
		enrollee.setPersonIdentifier(fromPerson.getPersonIdentifier());
		enrollee.setFirstName(fromPerson.getPersonFirstName());
		enrollee.setLastName(fromPerson.getPersonLastName());
		enrollee.setDateOfBirth(fromPerson.getPersonBirthDate());
		
		//Bottom line for CPP is that we should be returning the Alt ID of type ASN in this field; 
		//if that isn’t available, then resort to the full member ID 
		Map<IdentifierCode, SecondaryIdentifier> secondaryIdMap = getEligibilityService().getSecondaryIdentifiers(fromEnrollee.getPrimaryEnrolleeId(), fromEnrollee.getEnrolleeNumber());
		if ( secondaryIdMap.containsKey(IdentifierCode.ASN) ) {
			enrollee.setEnrolleeIdentifier(secondaryIdMap.get(IdentifierCode.ASN).getValue());
		}
		else {
			enrollee.setEnrolleeIdentifier(fromEnrollee.getEnrolleeId());
		}
		
		enrollee.setMemberNumber(fromEnrollee.getEnrolleeNumber());
		enrollee.setEmailAddress(fromPerson.getEmail());
		//get and set person privacy flag (if PersonalIdentifier contains 'PHI RESTRICTION')
		//defaults to false
		enrollee.setPrivacyFlag(false);
		if ( fromEnrollee.getPerson().getPersonalIdentifier() != null ) {
			String personalIdentifier = fromEnrollee.getPerson().getPersonalIdentifier();
			personalIdentifier.toUpperCase();
			if ( personalIdentifier.indexOf("PHI RESTRICTION") >= 0 )
				enrollee.setPrivacyFlag(true);
		}

		List<Address> fromAddress = fromPerson.getAddress();
		if ( fromAddress != null && fromAddress.size() > 0 ) {
			List<TAddress> tAddressList = new ArrayList<TAddress>(5);
			TAddress tAddress;
			Address address;
			for(Iterator<Address> it = fromAddress.iterator(); it.hasNext();) {
				tAddress = new TAddress();
				address = it.next();
				tAddress.setAddressLine1(address.getAddressLine1());
				tAddress.setAddressLine2(address.getAddressLine2());
				tAddress.setCity(address.getCity());
				tAddress.setState(address.getState());
				tAddress.setZipCode(address.getZip().substring(0, 5));
				tAddressList.add(tAddress);
			}
			enrollee.setAddress(tAddressList.toArray(new TAddress[tAddressList.size()]));
		}
		
		//eligibility status and benefitPackageIdentifier
		//get benefitPackageIdentifier is active, otherwise id is empty
		enrollee.setEligibilityStatus(SStatusType.inactive);
		enrollee.setBenefitPackageIdentifier("");
		List<EnrolleeEligibility> eeList = fromEnrollee.getEligibilities();
		for(int i = 0; i < eeList.size(); i++) {
			if(eeList.get(i).isActive()) {
				enrollee.setEligibilityStatus(SStatusType.active);
				enrollee.setEffectiveDate(eeList.get(i).getEnrolleeEligibilityEffectiveDate());
				if ( eeList.get(i).getEnrolleeEligibilityEndDate() != null ) {
					enrollee.setTerminationDate(eeList.get(i).getEnrolleeEligibilityEndDate());
				}
				enrollee.setBenefitPackageIdentifier(eeList.get(i).getBenefitPackageId());
				break;
			}
		}
		
		//if eligibility is inactive, check to see if active in the near future (before the end of the following month)
		if ( enrollee.getEligibilityStatus().equals(SStatusType.inactive) ) {
			Date effectiveDate;
			Date endDate;
			Date futureDay = getLastDayOfNextMonth();
			for(int i = 0; i < eeList.size(); i++) {
				effectiveDate = eeList.get(i).getEnrolleeEligibilityEffectiveDate();
				endDate = eeList.get(i).getEnrolleeEligibilityEndDate();
				if( effectiveDate.after(org.delta.crossplane.common.util.DateUtils.endOfDay(new Date())) &&
						effectiveDate.before(org.delta.crossplane.common.util.DateUtils.endOfDay(futureDay)) ) {
					enrollee.setEligibilityStatus(SStatusType.pending);
					
					if ( eeList.get(i).getEnrolleeEligibilityEndDate() != null ) {
						enrollee.setTerminationDate(eeList.get(i).getEnrolleeEligibilityEndDate());
					}
					
					if ( eeList.get(i).getEnrolleeEligibilityEffectiveDate() != null ) {
						enrollee.setEffectiveDate(eeList.get(i).getEnrolleeEligibilityEffectiveDate());
					}
					enrollee.setBenefitPackageIdentifier(eeList.get(i).getBenefitPackageId());
					break;
				}
				
				else{
					// eligibility inactive , effective date and end date in the past 
					if(effectiveDate.before(org.delta.crossplane.common.util.DateUtils.startOfDay(new Date())) &&
						endDate.before(org.delta.crossplane.common.util.DateUtils.startOfDay(new Date()))				
					){
						
						if ( eeList.get(i).getEnrolleeEligibilityEndDate() != null ) {
							enrollee.setTerminationDate(eeList.get(i).getEnrolleeEligibilityEndDate());
						}
						if ( eeList.get(i).getEnrolleeEligibilityEffectiveDate() != null ) {
							enrollee.setEffectiveDate(eeList.get(i).getEnrolleeEligibilityEffectiveDate());
						}
						enrollee.setBenefitPackageIdentifier(eeList.get(i).getBenefitPackageId());
						break;	
						
					} 
					
					if(effectiveDate.after(org.delta.crossplane.common.util.DateUtils.endOfDay(futureDay))){
						
						if ( eeList.get(i).getEnrolleeEligibilityEffectiveDate() != null ) {
							enrollee.setEffectiveDate(eeList.get(i).getEnrolleeEligibilityEffectiveDate());
						}						
						enrollee.setBenefitPackageIdentifier(eeList.get(i).getBenefitPackageId());
						break;
					}
					
				} 
				
			}			
		}
		return enrollee;
	}
	
	private TBenefitPackage convertToTBenefitPackage(BenefitPackage bp, List<WaitingPeriod> waitingPeriodList, List<BenefitCounter> benefitCounterList, boolean filterByPCodes, String[] requestedPCodes) {
		TBenefitPackage tbp = new TBenefitPackage();
		tbp.setBenefitPackageIdentifier(bp.getBenefitPackageId());
		
		//convert treatment list		
		List<TreatmentType> tpList = bp.getTreatmentTypes();
		List<TTreatment> tTreatmentList = new ArrayList<TTreatment>();
		
		TTreatment tTreatment;
		TTreatmentSummary tSummary;
		List<TProcedureClass> tProcedureClassList;
		
		String treatmentTypeCode;
		List<ProcedureClass2> pcList;
		TreatmentType tt;
		for (Iterator<TreatmentType> it = tpList.iterator(); it.hasNext();) {
			tt = it.next();
			treatmentTypeCode = tt.getCode();
			pcList = tt.getProcedureClasses();
			
			if ( filterByPCodes )
				tProcedureClassList = convertToTProcedureClassList(pcList, true, requestedPCodes);
			else
				tProcedureClassList = convertToTProcedureClassList(pcList, false, null);
				
			//skip treatment that has no procedure classes
			if ( tProcedureClassList.size() == 0 )
				continue;

			tTreatment =  new TTreatment();
			tTreatment.setProcedureClassList(tProcedureClassList.toArray(new TProcedureClass[tProcedureClassList.size()]));
			tTreatment.setTreatmentTypeCode(treatmentTypeCode);
			//use name for description
			tTreatment.setTreatmentTypeDescription(tt.getName());
			
			Set<TierCode> allTiers = tt.allTierCodes();
			TierCode curTier;
			//treatment summary
			List<TTreatmentSummary> summaries = new ArrayList<TTreatmentSummary>();
			for ( Iterator<TierCode> tiers = allTiers.iterator(); tiers.hasNext(); ) {
				curTier = tiers.next();
				tSummary = new TTreatmentSummary();
				tSummary.setTierType(curTier.getCode());
				TCopayment copay = new TCopayment();
				if ( tt.isCopayPercentage(curTier) )
					copay.setCopaymentType(SCopaymentType.percentage);
				else
					copay.setCopaymentType(SCopaymentType.dollar);
				copay.setMaximum(tt.maxCopay(curTier));
				copay.setMinimum(tt.minCopay(curTier));
				tSummary.setCopayment(copay);
				tSummary.setFrequencyLimitationType(tt.hasFrequencyLimitation());
				tSummary.setPreApprovalRequired(tt.isPreApprovalRequired());
				tSummary.setDeductibleExemption(tt.isDeductibleWaived(curTier));
				//maximum exemption is not available in metavance
				//tSummary.setMaximumExemption(tt.isMaximumExempt(curTier));
				summaries.add(tSummary);
			}
			tTreatment.setTreatmentSummaries(summaries.toArray(new TTreatmentSummary[summaries.size()]));			
			
			tTreatmentList.add(tTreatment);
		}
		
		if ( waitingPeriodList.size() > 0 )
			populateWaitingPeriod(tTreatmentList, waitingPeriodList);
		
		tbp.setTreatmentList(tTreatmentList.toArray(new TTreatment[tTreatmentList.size()]));
		
		
		if ( bp.getDeductiblesMaximums() != null && bp.getDeductiblesMaximums().size() > 0 ) 
			populateMaximumsAndDeductibles(bp, tbp, benefitCounterList);
		
		populateCoverageDetails(bp, tbp);
		
		return tbp;
	}
	
	private void populateWaitingPeriod(List<TTreatment> tTreatmentList, List<WaitingPeriod> waitingPeriodList) {
		//filter waiting period list based on 
		//business requirement: explanation code is one of three: 204, 205, 206
		WaitingPeriod curWP;
		String curCode;
		for ( Iterator<WaitingPeriod> it = waitingPeriodList.iterator(); it.hasNext(); ) {
			curWP = it.next();
			curCode = curWP.getExplanationCode();
			if ( !curCode.equals("204") && !curCode.equals("205") && !curCode.equals("206") )
				it.remove();
		}
 
		if ( waitingPeriodList.size() == 0 )
			return;
		
		//construct waiting period map keyed by treatment type code
		Map<String, List<WaitingPeriod>> waitingPeriodMap = new HashMap<String, List<WaitingPeriod>>();
		for ( Iterator<WaitingPeriod> it = waitingPeriodList.iterator(); it.hasNext(); ) {
			curWP = it.next();
			curCode = curWP.getConditionCode();
			if ( waitingPeriodMap.containsKey(curCode) )
				waitingPeriodMap.get(curCode).add(curWP);
			else {
				List<WaitingPeriod> newList = new ArrayList<WaitingPeriod>();
				newList.add(curWP);
				waitingPeriodMap.put(curCode, newList);
			}
		}

		//create comparator for sorting waiting periods of the same treatment
		Comparator<WaitingPeriod> waitingPeriodComparator = new Comparator<WaitingPeriod>() {
			public int compare(WaitingPeriod o1, WaitingPeriod o2) {
				if ( o1.getPreExistingConditionEffectiveDate() == null || o2.getPreExistingConditionEffectiveDate() == null )
					throw new IllegalStateException("WaitingPeriod is missing PreExistingConditionEffectiveDate");
				else
					return o1.getPreExistingConditionEffectiveDate().compareTo(o2.getPreExistingConditionEffectiveDate());
			}
		};

		//populate waiting period data
		List<WaitingPeriod> wpList;
		List<TTreatmentSummary> summaryList;
		WaitingPeriod wp;
		for ( TTreatment curTreatment : tTreatmentList ) {
			wpList = waitingPeriodMap.get(curTreatment.getTreatmentTypeCode());
			if ( wpList != null && wpList.size() > 0 ) {
				//sort by effective date, then get the first (present or nearest future)
				Collections.sort(wpList, waitingPeriodComparator);
				wp = wpList.get(0);
				summaryList = Arrays.asList(curTreatment.getTreatmentSummaries());
				for ( TTreatmentSummary curTSummary : summaryList) {
					TWaitingPeriod newTWP = new TWaitingPeriod();
					newTWP.setFromDate(wp.getPreExistingConditionEffectiveDate());
					if ( wp.getPreExistingConditionEndDate() != null )
						newTWP.setToDate(wp.getPreExistingConditionEndDate());
					curTSummary.setWaitingPeriod(newTWP);
				}
			}
			else
				continue;
		}
	}
	
	private List<TProcedureClass> convertToTProcedureClassList(List<ProcedureClass2> pcList, boolean filterByProcedureCodes, String[] requestedPCodes) {
		List<TProcedureClass> tPCList = new ArrayList<TProcedureClass>();
		ProcedureClass2 pc2;
		TProcedureClass tpc;
		List<ProcedureCode2> pCodeList;
		TProcedureCode[] tPCodeArray;
		ProcedureCode2 pcode;
		TProcedureCode tpcode;
		Set<TierCode> tierCodes;
		TierCode curTierCode;
		Amount curCopayAmount;
		
		List<String> requestedCodeList = null;
		if ( filterByProcedureCodes )
			requestedCodeList = Arrays.asList(requestedPCodes);
			
		for (int i = 0; i < pcList.size(); i++) {
			pc2 = pcList.get(i);
			tpc = new TProcedureClass();
			tpc.setProcedureClassificationCode(pc2.getCode());
			tpc.setProcedureClassificationDescription(pc2.getName());
			
			//retrieve and convert procedure codes
			pCodeList = pc2.getProcedureCodes();
			if ( filterByProcedureCodes ) { //remove unwanted code
				ProcedureCode2 curCode;
				for ( Iterator<ProcedureCode2> it = pCodeList.iterator(); it.hasNext(); ) {
					curCode = it.next();
					if ( !requestedCodeList.contains(curCode.getCode()) )
						it.remove();
				}
			}
			
			if ( pCodeList.size() == 0 )
				continue;
			
			tPCodeArray = new TProcedureCode[pCodeList.size()];
			for (int j = 0; j < pCodeList.size(); j++) {
				pcode = pCodeList.get(j);
				tierCodes = pcode.getNetworkTierCodes();
				//all info but copay and DeductibleWaivedIndicator is being repeated for each tier type
				for ( Iterator<TierCode> it = tierCodes.iterator(); it.hasNext(); ) {
					curTierCode = it.next();
					tpcode = new TProcedureCode();
					tpcode.setTierType(curTierCode.getCode());
					tpcode.setProcedureCode(pcode.getCode());
					//use description as name
					tpcode.setProcedureCodeName(pcode.getDescription());
					
					//get copay by tier type
					curCopayAmount = pcode.getBenefits().getCopay(curTierCode);
					tpcode.setCopayType(SCopaymentType.dollar);
					if ( curCopayAmount.getValue() == null ) {//patient pays all
						tpcode.setCopayType(SCopaymentType.all);
					}
					else {
						if ( curCopayAmount.isPercent() )
							tpcode.setCopayType(SCopaymentType.percentage);
						else
							tpcode.setCopayType(SCopaymentType.dollar);
						tpcode.setCopayAmount(curCopayAmount.getValue());
					}
					
					//get deductible exemption flag by tier type
					tpcode.setDeductibleExemption(pcode.getBenefits().isDeductibleWaived(curTierCode));
					
					//fill in the frequency limitation info
					TLimitation tl = new TLimitation();
					Integer q, tq;
					String timeUnit, qualifier;
					STimeUnitType st;
					SLimitationQualifier sq;
					/*
					if ( (q = pcode.getBenefitQuantity()) != null ) {
						tl.setQuantity(q.intValue());
					}
					if ( (tq = pcode.getIntervalNumber()) != null ) {
						tl.setTimePeriodQuantity(tq.intValue());
						
						timeUnit = pcode.getIntervalUnit();
						st = IVRUtil.toSTimeUnitType(timeUnit, tq.intValue(), pcode.getPeriodType());
						tl.setTimePeriodUnit(st);
					}
					qualifier = pcode.getQualifierCode();					
					
					if ( qualifier != null && qualifier.trim().length() != 0 ) {
						try {
							sq = SLimitationQualifier.fromString(qualifier);
						}
						catch(IllegalArgumentException ie) {
							throw new UnknownCodeException("unrecognized limitation qualifier code", "limitationQualifier", qualifier);
						}
						tl.setLimitationQualifier(sq);
					
					}
					*/
					tpcode.setFrequencyLimitation(tl);
					
					//tpcode.setWaitingPeriod(new TWaitingPeriod());
					tpcode.setPreApprovalRequired(pcode.getPreapproval());
					
					tPCodeArray[j] = tpcode;
				}
			}
			tpc.setProcedureCodeList(tPCodeArray);
			
			tPCList.add(tpc);
		}

		return tPCList;
	}
	
	private void populateMaximumsAndDeductibles(BenefitPackage bp, TBenefitPackage tbp, List<BenefitCounter> benefitCounterList) {
		//construct a counter map keyed by benefit counter identifier
		Map<String, List<BenefitCounter>> counterMap = new HashMap<String, List<BenefitCounter>>();
		if ( benefitCounterList.size() > 0 ) {
			BenefitCounter curBC;
			String curCounterId;
			for ( Iterator<BenefitCounter> it = benefitCounterList.iterator(); it.hasNext(); ) {
				curBC = it.next();
				curCounterId = curBC.getBenefitCounterIdentifier();
				if ( counterMap.containsKey(curCounterId) )
					counterMap.get(curCounterId).add(curBC);
				else {
					List<BenefitCounter> newList = new ArrayList<BenefitCounter>();
					newList.add(curBC);
					counterMap.put(curCounterId, newList);
				}
			}			
		}

		List<DeductiblesMaximums> dmList = bp.getDeductiblesMaximums();
		List<TMaximumDeductible> tDeductiblesList = new ArrayList<TMaximumDeductible>();
		List<TMaximumDeductible> tMaximumsList = new ArrayList<TMaximumDeductible>();
		DeductiblesMaximums curDM;
		TMaximumDeductible newMD;
		String curCounterId;
		List<BenefitCounter> curBCList;
		for ( Iterator<DeductiblesMaximums> it = dmList.iterator(); it.hasNext(); ) {
			curDM = it.next();
			newMD = new TMaximumDeductible();
			if ( curDM.getTierCode() != null )
				newMD.setTierType(curDM.getTierCode().getCode());
			if ( curDM.getKeyword() != null )
				newMD.setDescription(curDM.getKeyword());
			if ( curDM.getType() != null )
				newMD.setAppliesTo(curDM.getType().getCode());
			if ( curDM.getPeriodTypeDescription() != null )
				newMD.setTimeUnit(curDM.getPeriodTypeDescription());
			if ( curDM.getIntervalNumber() != null )
				newMD.setIntervalNumber(curDM.getIntervalNumber());
			if ( curDM.getIntervalUnitDescription() != null )
				newMD.setIntervalUnitDescription(curDM.getIntervalUnitDescription());
			if ( curDM.getAmount() != null )
				newMD.setAmount(curDM.getAmount().getValue());
			//level: plan (if multiple treatment) or treatment
			if ( curDM.getTreatmentTypes() != null && curDM.getTreatmentTypes().size() > 0 ) {
				if ( curDM.getTreatmentTypes().size() > 1 )
					newMD.setLevel("PLAN");
				else
					newMD.setLevel(curDM.getTreatmentTypes().get(0).getCode());
			}
			
			//set counter info if available
			if ( counterMap.size() > 0 ) {
				curCounterId = curDM.getBenefitCounterIdentifier();
				if ( counterMap.containsKey(curCounterId) ) {
					curBCList = counterMap.get(curCounterId);
					processCounterInfo(newMD, curBCList);
				}
			}

			//add to the appropriate list
			if ( curDM.isDeductible() )
				tDeductiblesList.add(newMD);
			else
				tMaximumsList.add(newMD);
		}
		
		tbp.setDeductibles(tDeductiblesList.toArray(new TMaximumDeductible[tDeductiblesList.size()]));
		tbp.setMaximums(tMaximumsList.toArray(new TMaximumDeductible[tMaximumsList.size()]));
	}

	private void processCounterInfo(TMaximumDeductible md, List<BenefitCounter> bcList) {
		BenefitCounter bc;
		Date beginDate, endDate;
		
		//remove benefit counter that has no accumulation period or in the past
		for ( Iterator<BenefitCounter> it = bcList.iterator(); it.hasNext(); ) {
			bc = it.next();
			beginDate = bc.getAccumulationPeriodBeginDate();
			endDate = bc.getAccumulationPeriodEndDate();
			if ( beginDate == null )
				it.remove();
			else if ( IVRUtil.comparePeriodToToday(beginDate, endDate) == -1 )
				it.remove();
		}
			
		//condition 1: only one left
		if ( bcList.size() > 0 ) {
			if ( bcList.size() == 1 )
				setCounterInfo(md, bcList.get(0));			
			else { //sort by begin date, take the first one
				Collections.sort(bcList,
						new Comparator<BenefitCounter>() {
							public int compare(BenefitCounter o1, BenefitCounter o2) {
								if ( o1.getAccumulationPeriodBeginDate() == null || o2.getAccumulationPeriodBeginDate() == null )
									throw new IllegalStateException("BenefitCounter must have accumulation begin date for comparasion");
								else
									return o1.getAccumulationPeriodBeginDate().compareTo(o2.getAccumulationPeriodBeginDate());
							}
						}
				);
				setCounterInfo(md, bcList.get(0));
			}
		}
	}
	
	private void setCounterInfo(TMaximumDeductible md, BenefitCounter bc) {
		Date beginDate = bc.getAccumulationPeriodBeginDate();
		Date endDate = bc.getAccumulationPeriodEndDate();
		Double remaining = toAmount(bc.getCounterAvailableAmount());
		md.setAccumulationBeginDate(beginDate);
		md.setAccumulationEndDate(endDate);
		md.setRemaining(remaining);
	}

	private Double toAmount(String amount) {
		//remove + or - sign 
		if ( amount.indexOf("+")==0 || amount.indexOf("-")==0 )
			amount = amount.substring(1);
		return Double.parseDouble(amount);
	}
	
	private void populateCoverageDetails(BenefitPackage bp, TBenefitPackage tbp) {
		TCoverageDetail tcd = new TCoverageDetail();
		tcd.setCoordinationOfBenefit(TCoverageDetailCoordinationOfBenefit.S);
		if ( bp.getProgramTypeCode() != null )
			tcd.setProgramType(bp.getProgramTypeCode());
		tbp.setCoverageDetail(tcd);
	}
	
	private Date getLastDayOfNextMonth() {
		Calendar todayCal = GregorianCalendar.getInstance();
		todayCal.add(Calendar.MONTH, 1);
		todayCal.set(Calendar.DAY_OF_MONTH, todayCal.getActualMaximum(Calendar.DAY_OF_MONTH));
		return todayCal.getTime();
	}
	
	private TContract getFirstTContract(List<TContract> contracts) {
		if ( contracts.size() == 0 )
			return null;
		else if ( contracts.size() == 1 ) {
			return contracts.get(0);
		}
		else {
			Collections.sort(contracts, new TContractComparator());
			return contracts.get(0);
		}
	}
	
	private TContract getLastTContract(List<TContract> contracts) {
		if ( contracts.size() == 0 )
			return null;
		else if ( contracts.size() == 1 ) {
			return contracts.get(0);
		}
		else {
			Collections.sort(contracts, new TContractComparator());
			return contracts.get(contracts.size()-1);
		}
	}
	
	private class TContractComparator implements Comparator<TContract> {
		public int compare(TContract c1, TContract c2) {
			return c1.getCoverageStartDate().compareTo(c2.getCoverageStartDate());
		}		
	}

}
