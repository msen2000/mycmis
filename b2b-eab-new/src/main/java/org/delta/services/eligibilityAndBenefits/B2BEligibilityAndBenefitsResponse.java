/**
 * B2BEligibilityAndBenefitsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.services.eligibilityAndBenefits;

public class B2BEligibilityAndBenefitsResponse  implements java.io.Serializable {
    private org.delta.schemas.data.TContractListResponses response;

    public B2BEligibilityAndBenefitsResponse() {
    }

    public B2BEligibilityAndBenefitsResponse(
           org.delta.schemas.data.TContractListResponses response) {
           this.response = response;
    }


    /**
     * Gets the response value for this B2BEligibilityAndBenefitsResponse.
     * 
     * @return response
     */
    public org.delta.schemas.data.TContractListResponses getResponse() {
        return response;
    }


    /**
     * Sets the response value for this B2BEligibilityAndBenefitsResponse.
     * 
     * @param response
     */
    public void setResponse(org.delta.schemas.data.TContractListResponses response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof B2BEligibilityAndBenefitsResponse)) return false;
        B2BEligibilityAndBenefitsResponse other = (B2BEligibilityAndBenefitsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(B2BEligibilityAndBenefitsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", ">B2BEligibilityAndBenefitsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.delta.org/eligibilityAndBenefits", "Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tContractListResponses"));
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
