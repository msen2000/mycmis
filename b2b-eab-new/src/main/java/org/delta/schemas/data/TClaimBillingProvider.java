/**
 * TClaimBillingProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class TClaimBillingProvider  extends org.sen.schemas.data.TPerson  implements java.io.Serializable {
    private java.lang.String providerIdentifier;

    private java.lang.String providerSuffix;

    public TClaimBillingProvider() {
    }

    public TClaimBillingProvider(
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String providerIdentifier,
           java.lang.String providerSuffix) {
        super(
            firstName,
            lastName);
        this.providerIdentifier = providerIdentifier;
        this.providerSuffix = providerSuffix;
    }


    /**
     * Gets the providerIdentifier value for this TClaimBillingProvider.
     * 
     * @return providerIdentifier
     */
    public java.lang.String getProviderIdentifier() {
        return providerIdentifier;
    }


    /**
     * Sets the providerIdentifier value for this TClaimBillingProvider.
     * 
     * @param providerIdentifier
     */
    public void setProviderIdentifier(java.lang.String providerIdentifier) {
        this.providerIdentifier = providerIdentifier;
    }


    /**
     * Gets the providerSuffix value for this TClaimBillingProvider.
     * 
     * @return providerSuffix
     */
    public java.lang.String getProviderSuffix() {
        return providerSuffix;
    }


    /**
     * Sets the providerSuffix value for this TClaimBillingProvider.
     * 
     * @param providerSuffix
     */
    public void setProviderSuffix(java.lang.String providerSuffix) {
        this.providerSuffix = providerSuffix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TClaimBillingProvider)) return false;
        TClaimBillingProvider other = (TClaimBillingProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.providerIdentifier==null && other.getProviderIdentifier()==null) || 
             (this.providerIdentifier!=null &&
              this.providerIdentifier.equals(other.getProviderIdentifier()))) &&
            ((this.providerSuffix==null && other.getProviderSuffix()==null) || 
             (this.providerSuffix!=null &&
              this.providerSuffix.equals(other.getProviderSuffix())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getProviderIdentifier() != null) {
            _hashCode += getProviderIdentifier().hashCode();
        }
        if (getProviderSuffix() != null) {
            _hashCode += getProviderSuffix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TClaimBillingProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tClaim>billingProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "providerIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "providerSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
