/**
 * B2BEligibilityAndBenefitsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.services.eligibilityAndBenefits;

public class B2BEligibilityAndBenefitsServiceLocator extends org.apache.axis.client.Service implements org.sen.services.eligibilityAndBenefits.B2BEligibilityAndBenefitsService {

/**
 * The B2B Eligibility and Benefits Service
 */

    public B2BEligibilityAndBenefitsServiceLocator() {
    }


    public B2BEligibilityAndBenefitsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public B2BEligibilityAndBenefitsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EligibilityAndBenefitsServicePort
    private java.lang.String EligibilityAndBenefitsServicePort_address = "http://localhost:8888/EligibilityAndBenefitsServicePort";

    public java.lang.String getEligibilityAndBenefitsServicePortAddress() {
        return EligibilityAndBenefitsServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EligibilityAndBenefitsServicePortWSDDServiceName = "EligibilityAndBenefitsServicePort";

    public java.lang.String getEligibilityAndBenefitsServicePortWSDDServiceName() {
        return EligibilityAndBenefitsServicePortWSDDServiceName;
    }

    public void setEligibilityAndBenefitsServicePortWSDDServiceName(java.lang.String name) {
        EligibilityAndBenefitsServicePortWSDDServiceName = name;
    }

    public org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServicePortType getEligibilityAndBenefitsServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EligibilityAndBenefitsServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEligibilityAndBenefitsServicePort(endpoint);
    }

    public org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServicePortType getEligibilityAndBenefitsServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServiceBindingStub _stub = new org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServiceBindingStub(portAddress, this);
            _stub.setPortName(getEligibilityAndBenefitsServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEligibilityAndBenefitsServicePortEndpointAddress(java.lang.String address) {
        EligibilityAndBenefitsServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServiceBindingStub _stub = new org.sen.services.eligibilityAndBenefits.EligibilityAndBenefitsServiceBindingStub(new java.net.URL(EligibilityAndBenefitsServicePort_address), this);
                _stub.setPortName(getEligibilityAndBenefitsServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EligibilityAndBenefitsServicePort".equals(inputPortName)) {
            return getEligibilityAndBenefitsServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "B2BEligibilityAndBenefitsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.sen.org/eligibilityAndBenefits", "EligibilityAndBenefitsServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EligibilityAndBenefitsServicePort".equals(portName)) {
            setEligibilityAndBenefitsServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
