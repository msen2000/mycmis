/**
 * TProviderInquiryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The response of the provider inquiry
 */
public class TProviderInquiryResponse  implements java.io.Serializable {
    private org.sen.schemas.data.TProvider[] provider;

    private org.sen.schemas.data.SSearchResultType status;

    public TProviderInquiryResponse() {
    }

    public TProviderInquiryResponse(
           org.sen.schemas.data.TProvider[] provider,
           org.sen.schemas.data.SSearchResultType status) {
           this.provider = provider;
           this.status = status;
    }


    /**
     * Gets the provider value for this TProviderInquiryResponse.
     * 
     * @return provider
     */
    public org.sen.schemas.data.TProvider[] getProvider() {
        return provider;
    }


    /**
     * Sets the provider value for this TProviderInquiryResponse.
     * 
     * @param provider
     */
    public void setProvider(org.sen.schemas.data.TProvider[] provider) {
        this.provider = provider;
    }


    /**
     * Gets the status value for this TProviderInquiryResponse.
     * 
     * @return status
     */
    public org.sen.schemas.data.SSearchResultType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TProviderInquiryResponse.
     * 
     * @param status
     */
    public void setStatus(org.sen.schemas.data.SSearchResultType status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TProviderInquiryResponse)) return false;
        TProviderInquiryResponse other = (TProviderInquiryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.provider==null && other.getProvider()==null) || 
             (this.provider!=null &&
              java.util.Arrays.equals(this.provider, other.getProvider()))) &&
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
        if (getProvider() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProvider());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProvider(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TProviderInquiryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProviderInquiryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "provider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProvider"));
        elemField.setNillable(false);
        elemField.setMinOccurs(0);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "provider"));
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
