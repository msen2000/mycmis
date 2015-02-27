/**
 * TClaimPatient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class TClaimPatient  extends org.delta.schemas.data.TPerson  implements java.io.Serializable {
    private java.lang.String memberNumber;

    /* The relation type (Relationship to primary enrollee) */
    private org.delta.schemas.data.SEnrolleeType relationshipCode;

    /* The date of birth of the person */
    private java.util.Date dateOfBirth;

    /* The HIPPA privacy flag */
    private boolean privacyFlag;

    public TClaimPatient() {
    }

    public TClaimPatient(
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String memberNumber,
           org.delta.schemas.data.SEnrolleeType relationshipCode,
           java.util.Date dateOfBirth,
           boolean privacyFlag) {
        super(
            firstName,
            lastName);
        this.memberNumber = memberNumber;
        this.relationshipCode = relationshipCode;
        this.dateOfBirth = dateOfBirth;
        this.privacyFlag = privacyFlag;
    }


    /**
     * Gets the memberNumber value for this TClaimPatient.
     * 
     * @return memberNumber
     */
    public java.lang.String getMemberNumber() {
        return memberNumber;
    }


    /**
     * Sets the memberNumber value for this TClaimPatient.
     * 
     * @param memberNumber
     */
    public void setMemberNumber(java.lang.String memberNumber) {
        this.memberNumber = memberNumber;
    }


    /**
     * Gets the relationshipCode value for this TClaimPatient.
     * 
     * @return relationshipCode   * The relation type (Relationship to primary enrollee)
     */
    public org.delta.schemas.data.SEnrolleeType getRelationshipCode() {
        return relationshipCode;
    }


    /**
     * Sets the relationshipCode value for this TClaimPatient.
     * 
     * @param relationshipCode   * The relation type (Relationship to primary enrollee)
     */
    public void setRelationshipCode(org.delta.schemas.data.SEnrolleeType relationshipCode) {
        this.relationshipCode = relationshipCode;
    }


    /**
     * Gets the dateOfBirth value for this TClaimPatient.
     * 
     * @return dateOfBirth   * The date of birth of the person
     */
    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this TClaimPatient.
     * 
     * @param dateOfBirth   * The date of birth of the person
     */
    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the privacyFlag value for this TClaimPatient.
     * 
     * @return privacyFlag   * The HIPPA privacy flag
     */
    public boolean isPrivacyFlag() {
        return privacyFlag;
    }


    /**
     * Sets the privacyFlag value for this TClaimPatient.
     * 
     * @param privacyFlag   * The HIPPA privacy flag
     */
    public void setPrivacyFlag(boolean privacyFlag) {
        this.privacyFlag = privacyFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TClaimPatient)) return false;
        TClaimPatient other = (TClaimPatient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.memberNumber==null && other.getMemberNumber()==null) || 
             (this.memberNumber!=null &&
              this.memberNumber.equals(other.getMemberNumber()))) &&
            ((this.relationshipCode==null && other.getRelationshipCode()==null) || 
             (this.relationshipCode!=null &&
              this.relationshipCode.equals(other.getRelationshipCode()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            this.privacyFlag == other.isPrivacyFlag();
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
        if (getMemberNumber() != null) {
            _hashCode += getMemberNumber().hashCode();
        }
        if (getRelationshipCode() != null) {
            _hashCode += getRelationshipCode().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        _hashCode += (isPrivacyFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TClaimPatient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", ">tClaim>patient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "memberNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "relationshipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sEnrolleeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privacyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "privacyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
