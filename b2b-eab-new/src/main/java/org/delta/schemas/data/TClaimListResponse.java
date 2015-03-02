/**
 * TClaimListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The response of the get claim list call
 */
public class TClaimListResponse  implements java.io.Serializable {
    private org.sen.schemas.data.TClaim[] claimList;

    private org.sen.schemas.data.SClaimListResponseStatusType claimResponseStatus;

    public TClaimListResponse() {
    }

    public TClaimListResponse(
           org.sen.schemas.data.TClaim[] claimList,
           org.sen.schemas.data.SClaimListResponseStatusType claimResponseStatus) {
           this.claimList = claimList;
           this.claimResponseStatus = claimResponseStatus;
    }


    /**
     * Gets the claimList value for this TClaimListResponse.
     * 
     * @return claimList
     */
    public org.sen.schemas.data.TClaim[] getClaimList() {
        return claimList;
    }


    /**
     * Sets the claimList value for this TClaimListResponse.
     * 
     * @param claimList
     */
    public void setClaimList(org.sen.schemas.data.TClaim[] claimList) {
        this.claimList = claimList;
    }


    /**
     * Gets the claimResponseStatus value for this TClaimListResponse.
     * 
     * @return claimResponseStatus
     */
    public org.sen.schemas.data.SClaimListResponseStatusType getClaimResponseStatus() {
        return claimResponseStatus;
    }


    /**
     * Sets the claimResponseStatus value for this TClaimListResponse.
     * 
     * @param claimResponseStatus
     */
    public void setClaimResponseStatus(org.sen.schemas.data.SClaimListResponseStatusType claimResponseStatus) {
        this.claimResponseStatus = claimResponseStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TClaimListResponse)) return false;
        TClaimListResponse other = (TClaimListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimList==null && other.getClaimList()==null) || 
             (this.claimList!=null &&
              java.util.Arrays.equals(this.claimList, other.getClaimList()))) &&
            ((this.claimResponseStatus==null && other.getClaimResponseStatus()==null) || 
             (this.claimResponseStatus!=null &&
              this.claimResponseStatus.equals(other.getClaimResponseStatus())));
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
        if (getClaimList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClaimList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClaimList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClaimResponseStatus() != null) {
            _hashCode += getClaimResponseStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TClaimListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tClaimListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tClaim"));
        elemField.setNillable(false);
        elemField.setMinOccurs(0);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claim"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimResponseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimResponseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sClaimListResponseStatusType"));
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
