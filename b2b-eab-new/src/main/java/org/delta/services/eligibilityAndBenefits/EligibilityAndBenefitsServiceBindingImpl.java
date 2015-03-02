/**
 * EligibilityAndBenefitsServiceBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.services.eligibilityAndBenefits;

import java.rmi.RemoteException;

import org.sen.schemas.data.TBenefitPackageInquiryResponse;
import org.sen.schemas.data.TContractListResponse;
import org.sen.schemas.data.TContractListResponses;
import org.sen.schemas.data.TProcedureCodeAndName;
import org.sen.schemas.error.SDomainType;
import org.sen.schemas.error.TInquiryError;
import org.sen.services.OperationException;
import org.sen.services.SpringApplicationContext;
import org.sen.services.TInquiryErrorConverter;
import org.sen.services.eligibilityAndBenefits.facade.EligibilityAndBenefitsIVRFacade;

public class EligibilityAndBenefitsServiceBindingImpl implements org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServicePortType{
	private EligibilityAndBenefitsIVRFacade eligibilityIVRFacade;

	/*
	public java.lang.String getEligibilityByEnrolleeIdentifier(java.lang.String enrolleeIdentifier, java.util.Date enrolleeBirthDate) throws java.rmi.RemoteException, org.sen.schemas.error.TInquiryError {
		return "Hello World";		
	}
	*/
	
	public org.sen.schemas.data.TContractListResponses getB2BEligibilityAndBenefits(java.util.Date DOB, java.lang.String firstName, java.lang.String lastName, java.lang.String personIdentifier, java.lang.String enrolleeIdentifier, java.lang.String enrolleeType) throws java.rmi.RemoteException, org.sen.schemas.error.TInquiryError {
		try {
			TContractListResponse cont = getEligibilityIVRFacade().getEligibilityByEnrolleeIdentifier(enrolleeIdentifier, DOB);
			TBenefitPackageInquiryResponse bp = getEligibilityIVRFacade().getBenefitPackage("CPP00001", null, null, null, null);
			// CPP00001, CPPTXAT2, PEN01099
			TContractListResponses conts = new TContractListResponses();
			conts.setBenefitPackage(bp);
			conts.setContractList(cont.getContractList());
			conts.setContractResponseStatus(cont.getContractResponseStatus());
			return conts;
        }
        catch(Throwable e) {
        	throw TInquiryErrorConverter.convertToTInquiryError(e, SDomainType.eligibility);
        }
	}
	
	/*
	public org.sen.schemas.data.TBenefitPackageInquiryResponse getBenefitPackageByPackageIdentifier(String packageIdentifier, String contractIdentifier, String memberNumber, String personIdentifier, String[] procedureCode) throws RemoteException, TInquiryError {
        try {
        	return getEligibilityIVRFacade().getBenefitPackage(packageIdentifier, contractIdentifier, memberNumber, personIdentifier, procedureCode);
        }
        catch(Throwable e) {
        	throw TInquiryErrorConverter.convertToTInquiryError(e, SDomainType.benefit);
        }
	}
	*/
	
	public EligibilityAndBenefitsIVRFacade getEligibilityIVRFacade() throws OperationException {
		if ( eligibilityIVRFacade == null ) {
			eligibilityIVRFacade = (EligibilityAndBenefitsIVRFacade) SpringApplicationContext.getBean("eligibilityIVRFacade");
		}
		return eligibilityIVRFacade;
	}

}
