package org.sen.services.eligibilityAndBenefits.facade;

import java.util.Date;

import org.sen.crossplane.benefits.service.BenefitsService;
import org.sen.crossplane.eligibility.service.EligibilityService;
import org.sen.schemas.data.TB2BEligibilityAndBenefitsResponse;
import org.sen.schemas.data.TBenefitPackage;
import org.sen.schemas.data.TBenefitPackageInquiryResponse;
import org.sen.schemas.data.TContractListResponse;
import org.sen.schemas.data.TProcedureCodeAndName;
import org.sen.services.BenefitPackageNotFoundException;
import org.sen.services.MissingParameterException;
import org.sen.services.OperationException;
import org.sen.services.UnknownCodeException;

/**
 * The EligibilityAndBenefitsIVRFacade provides a web service that is used by the IVR client to retrieve eligibility information
 * as well as benefit information. The web service contains four operations: getEligibilityByEnrolleeIdentifier, 
 * getEligibilityByPersonIdentifier, getBenefitPackage, and getAllProcedureCodes.
 * <p/>
 * The getEligibilityByEnrolleeIdentifier operation retrieves all contracts of the specified enrollee information.
 * It accepts two input parameters: the enrolleeId and the enrolleeDob are both required, 
 * <p/>
 * The getEligibilityByPersonIdentifier operation retrieves all contracts of the specified person identifier.
 * <p/>
 * The getBenefitPackage operation retrieves the benefit package information by its identifier. Out of the four 
 * possible input parameters, only the packageIdentifier is required, the other optional input parameters 
 * are being ignored right now.
 * <p/>
 * The getAllProcedureCodes operation retrieves all procedure codes and their names.
 */
public interface EligibilityAndBenefitsIVRFacade {
		
	/**
	 * Retrieve eligibility information, embedded in a list of contracts, for the specified enrollee.
	 * 
	 * @param enrolleeId required
	 * @param enrolleeDob required
	 * @return {@link TContractListResponse}
	 * @throws MissingParameterException
	 * @throws OperationException
	 * @throws UnknownCodeException
	 */
	
	public TContractListResponse getEligibilityByEnrolleeIdentifier(String enrolleeId, Date enrolleeDob) 
		throws MissingParameterException, OperationException, UnknownCodeException;
	
	/**
	 * Retrieve benefit package information for the specified identifier.
	 * 
	 * @param packageIdentifier, required
	 * @param contractIdentifier, ignored for now 
	 * @param memberNumber for retrieving counter info for the specified member, ignored for now
	 * @param personIdentifier for retrieving service level counter info, ignored for now
	 * @param procedureCodeArray for retrieving info for the specified procedure codes
	 * @return TBenefitPackage
	 * @throws MissingParameterException
	 * @throws OperationException
	 * @throws BenefitPackageNotFoundException
	 * @throws UnknownCodeException
	 */
    public TBenefitPackageInquiryResponse getBenefitPackage(String packageIdentifier, String contractIdentifier, String memberNumber, String personIdentifier, String[] procedureCodeArray ) 
    	throws MissingParameterException, OperationException, UnknownCodeException;	
	
	/**
	 * Sets the EligibilityService injected by Spring.
	 * @see EligibilityService
	 */	
	public void setEligibilityService(EligibilityService eligibilityService);

	public EligibilityService getEligibilityService();
	
	/**
	 * Sets the BenefitsService injected by Spring.
	 * @see BenefitsService
	 */	
	public void setBenefitsService(BenefitsService benefitService);

	public BenefitsService getBenefitsService();
}
