/**
 * TBenefitPackageInquiryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The response of the benefits inquiry
 */
public class TBenefitPackageInquiryResponse  implements java.io.Serializable {
    private org.sen.schemas.data.TBenefitPackage benefitPackage;

    private org.sen.schemas.data.SSearchResultType status;

    public TBenefitPackageInquiryResponse() {
    }

    public TBenefitPackageInquiryResponse(
           org.sen.schemas.data.TBenefitPackage benefitPackage,
           org.sen.schemas.data.SSearchResultType status) {
           this.benefitPackage = benefitPackage;
           this.status = status;
    }


    /**
     * Gets the benefitPackage value for this TBenefitPackageInquiryResponse.
     * 
     * @return benefitPackage
     */
    public org.sen.schemas.data.TBenefitPackage getBenefitPackage() {
        return benefitPackage;
    }


    /**
     * Sets the benefitPackage value for this TBenefitPackageInquiryResponse.
     * 
     * @param benefitPackage
     */
    public void setBenefitPackage(org.sen.schemas.data.TBenefitPackage benefitPackage) {
        this.benefitPackage = benefitPackage;
    }


    /**
     * Gets the status value for this TBenefitPackageInquiryResponse.
     * 
     * @return status
     */
    public org.sen.schemas.data.SSearchResultType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TBenefitPackageInquiryResponse.
     * 
     * @param status
     */
    public void setStatus(org.sen.schemas.data.SSearchResultType status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBenefitPackageInquiryResponse)) return false;
        TBenefitPackageInquiryResponse other = (TBenefitPackageInquiryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.benefitPackage==null && other.getBenefitPackage()==null) || 
             (this.benefitPackage!=null &&
              this.benefitPackage.equals(other.getBenefitPackage()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getBenefitPackage() != null) {
            _hashCode += getBenefitPackage().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBenefitPackageInquiryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBenefitPackageInquiryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "benefitPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBenefitPackage"));
        elemField.setNillable(false);
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sSearchResultType"));
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
