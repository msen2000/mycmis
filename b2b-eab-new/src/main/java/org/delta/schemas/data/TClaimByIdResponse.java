/**
 * TClaimByIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The response of the get claim by id service call
 */
public class TClaimByIdResponse  implements java.io.Serializable {
    private org.delta.schemas.data.TClaim claim;

    private org.delta.schemas.data.SClaimByIdResponseStatusType claimResponseStatus;

    public TClaimByIdResponse() {
    }

    public TClaimByIdResponse(
           org.delta.schemas.data.TClaim claim,
           org.delta.schemas.data.SClaimByIdResponseStatusType claimResponseStatus) {
           this.claim = claim;
           this.claimResponseStatus = claimResponseStatus;
    }


    /**
     * Gets the claim value for this TClaimByIdResponse.
     * 
     * @return claim
     */
    public org.delta.schemas.data.TClaim getClaim() {
        return claim;
    }


    /**
     * Sets the claim value for this TClaimByIdResponse.
     * 
     * @param claim
     */
    public void setClaim(org.delta.schemas.data.TClaim claim) {
        this.claim = claim;
    }


    /**
     * Gets the claimResponseStatus value for this TClaimByIdResponse.
     * 
     * @return claimResponseStatus
     */
    public org.delta.schemas.data.SClaimByIdResponseStatusType getClaimResponseStatus() {
        return claimResponseStatus;
    }


    /**
     * Sets the claimResponseStatus value for this TClaimByIdResponse.
     * 
     * @param claimResponseStatus
     */
    public void setClaimResponseStatus(org.delta.schemas.data.SClaimByIdResponseStatusType claimResponseStatus) {
        this.claimResponseStatus = claimResponseStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TClaimByIdResponse)) return false;
        TClaimByIdResponse other = (TClaimByIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claim==null && other.getClaim()==null) || 
             (this.claim!=null &&
              this.claim.equals(other.getClaim()))) &&
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
        if (getClaim() != null) {
            _hashCode += getClaim().hashCode();
        }
        if (getClaimResponseStatus() != null) {
            _hashCode += getClaimResponseStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TClaimByIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tClaimByIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "claim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tClaim"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimResponseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "claimResponseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sClaimByIdResponseStatusType"));
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
