/**
 * EligibilityAndBenefitsServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.services.eligibilityAndBenefits;

public interface EligibilityAndBenefitsServicePortType extends java.rmi.Remote {

    /**
     * A method to retrieve the Eligibility information for the primary
     * enrollee
     */
    public org.delta.schemas.data.TContractListResponses getB2BEligibilityAndBenefits(java.util.Date DOB, java.lang.String firstName, java.lang.String lastName, java.lang.String personIdentifier, java.lang.String enrolleeIdentifier, java.lang.String enrolleeType) throws java.rmi.RemoteException, org.delta.schemas.error.TInquiryError;
}
