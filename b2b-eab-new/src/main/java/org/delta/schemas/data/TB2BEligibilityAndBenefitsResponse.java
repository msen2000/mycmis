/**
 * TB2BEligibilityAndBenefitsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class TB2BEligibilityAndBenefitsResponse  implements java.io.Serializable {
    private org.sen.schemas.data.EligibilityInformation eligibilityInformation;

    private org.sen.schemas.data.TNetworkTier[] benefitsInformation;

    public TB2BEligibilityAndBenefitsResponse() {
    }

    public TB2BEligibilityAndBenefitsResponse(
           org.sen.schemas.data.EligibilityInformation eligibilityInformation,
           org.sen.schemas.data.TNetworkTier[] benefitsInformation) {
           this.eligibilityInformation = eligibilityInformation;
           this.benefitsInformation = benefitsInformation;
    }


    /**
     * Gets the eligibilityInformation value for this TB2BEligibilityAndBenefitsResponse.
     * 
     * @return eligibilityInformation
     */
    public org.sen.schemas.data.EligibilityInformation getEligibilityInformation() {
        return eligibilityInformation;
    }


    /**
     * Sets the eligibilityInformation value for this TB2BEligibilityAndBenefitsResponse.
     * 
     * @param eligibilityInformation
     */
    public void setEligibilityInformation(org.sen.schemas.data.EligibilityInformation eligibilityInformation) {
        this.eligibilityInformation = eligibilityInformation;
    }


    /**
     * Gets the benefitsInformation value for this TB2BEligibilityAndBenefitsResponse.
     * 
     * @return benefitsInformation
     */
    public org.sen.schemas.data.TNetworkTier[] getBenefitsInformation() {
        return benefitsInformation;
    }


    /**
     * Sets the benefitsInformation value for this TB2BEligibilityAndBenefitsResponse.
     * 
     * @param benefitsInformation
     */
    public void setBenefitsInformation(org.sen.schemas.data.TNetworkTier[] benefitsInformation) {
        this.benefitsInformation = benefitsInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TB2BEligibilityAndBenefitsResponse)) return false;
        TB2BEligibilityAndBenefitsResponse other = (TB2BEligibilityAndBenefitsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eligibilityInformation==null && other.getEligibilityInformation()==null) || 
             (this.eligibilityInformation!=null &&
              this.eligibilityInformation.equals(other.getEligibilityInformation()))) &&
            ((this.benefitsInformation==null && other.getBenefitsInformation()==null) || 
             (this.benefitsInformation!=null &&
              java.util.Arrays.equals(this.benefitsInformation, other.getBenefitsInformation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEligibilityInformation() != null) {
            _hashCode += getEligibilityInformation().hashCode();
        }
        if (getBenefitsInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBenefitsInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBenefitsInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TB2BEligibilityAndBenefitsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tB2BEligibilityAndBenefitsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibilityInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "EligibilityInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">EligibilityInformation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitsInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "BenefitsInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">BenefitsInformation"));
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
