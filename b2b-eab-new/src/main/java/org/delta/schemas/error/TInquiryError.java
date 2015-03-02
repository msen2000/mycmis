/**
 * TInquiryError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.error;


/**
 * The definition of an inquiry error
 */
public class TInquiryError  extends org.sen.schemas.error.TError  implements java.io.Serializable {
    private org.sen.schemas.error.SDomainType domainType;  // attribute

    public TInquiryError() {
    }

    public TInquiryError(
           org.sen.schemas.error.SErrorCode errorCode,
           java.lang.String errorDetail,
           org.sen.schemas.error.SDomainType domainType) {
        super(
            errorCode,
            errorDetail);
        this.domainType = domainType;
    }


    /**
     * Gets the domainType value for this TInquiryError.
     * 
     * @return domainType
     */
    public org.sen.schemas.error.SDomainType getDomainType() {
        return domainType;
    }


    /**
     * Sets the domainType value for this TInquiryError.
     * 
     * @param domainType
     */
    public void setDomainType(org.sen.schemas.error.SDomainType domainType) {
        this.domainType = domainType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TInquiryError)) return false;
        TInquiryError other = (TInquiryError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domainType==null && other.getDomainType()==null) || 
             (this.domainType!=null &&
              this.domainType.equals(other.getDomainType())));
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
        if (getDomainType() != null) {
            _hashCode += getDomainType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TInquiryError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/error", "tInquiryError"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("domainType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "domainType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/error", "sDomainType"));
        typeDesc.addFieldDesc(attrField);
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
