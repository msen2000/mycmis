/**
 * EligibilityAndBenefitsServiceBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.services.eligibilityAndBenefits;

public class EligibilityAndBenefitsServiceBindingSkeleton implements org.delta.services.eligibilityAndBenefits.EligibilityAndBenefitsServicePortType, org.apache.axis.wsdl.Skeleton {
    private org.delta.services.eligibilityAndBenefits.EligibilityAndBenefitsServicePortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "DOB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "FirstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "LastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "PersonIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "EnrolleeIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "EnrolleeType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getB2BEligibilityAndBenefits", _params, new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "Response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tContractListResponses"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "getB2BEligibilityAndBenefits"));
        _oper.setSoapAction("urn:getB2BEligibilityAndBenefits");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getB2BEligibilityAndBenefits") == null) {
            _myOperations.put("getB2BEligibilityAndBenefits", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getB2BEligibilityAndBenefits")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("inquiryError");
        _fault.setQName(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "inquiryError"));
        _fault.setClassName("org.delta.schemas.error.TInquiryError");
        _fault.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/error", "tInquiryError"));
        _oper.addFault(_fault);
    }

    public EligibilityAndBenefitsServiceBindingSkeleton() {
        this.impl = new org.delta.services.eligibilityAndBenefits.EligibilityAndBenefitsServiceBindingImpl();
    }

    public EligibilityAndBenefitsServiceBindingSkeleton(org.delta.services.eligibilityAndBenefits.EligibilityAndBenefitsServicePortType impl) {
        this.impl = impl;
    }
    public org.delta.schemas.data.TContractListResponses getB2BEligibilityAndBenefits(java.util.Date DOB, java.lang.String firstName, java.lang.String lastName, java.lang.String personIdentifier, java.lang.String enrolleeIdentifier, java.lang.String enrolleeType) throws java.rmi.RemoteException, org.delta.schemas.error.TInquiryError
    {
        org.delta.schemas.data.TContractListResponses ret = impl.getB2BEligibilityAndBenefits(DOB, firstName, lastName, personIdentifier, enrolleeIdentifier, enrolleeType);
        return ret;
    }

}
