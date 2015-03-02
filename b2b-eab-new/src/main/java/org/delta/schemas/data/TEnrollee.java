/**
 * TEnrollee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The definition of an enrollee object
 */
public class TEnrollee  extends org.sen.schemas.data.TPerson  implements java.io.Serializable {
    /* The metavance enrollee identifier */
    private java.lang.String enrolleeIdentifier;

    /* The MetaVance Person Identifier */
    private java.lang.String personIdentifier;

    /* The relation type (Relationship to primary enrollee) */
    private org.sen.schemas.data.SEnrolleeType relationshipCode;

    /* The member number associated with the contract. */
    private java.lang.String memberNumber;

    /* The date of birth of the person */
    private java.util.Date dateOfBirth;

    /* The email Address of the enrollee */
    private java.lang.String emailAddress;

    /* The addresses associated with the enrollee */
    private org.sen.schemas.data.TAddress[] address;

    /* The HIPPA privacy flag */
    private boolean privacyFlag;

    /* The status of the eligibility. (Active/Pending/Inactive) */
    private org.sen.schemas.data.SStatusType eligibilityStatus;

    /* The date covearge begin */
    private java.util.Date effectiveDate;

    /* The date coverage will end (Term date). */
    private java.util.Date terminationDate;

    /* The benefit Package identifier in string format */
    private java.lang.String benefitPackageIdentifier;

    public TEnrollee() {
    }

    public TEnrollee(
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String enrolleeIdentifier,
           java.lang.String personIdentifier,
           org.sen.schemas.data.SEnrolleeType relationshipCode,
           java.lang.String memberNumber,
           java.util.Date dateOfBirth,
           java.lang.String emailAddress,
           org.sen.schemas.data.TAddress[] address,
           boolean privacyFlag,
           org.sen.schemas.data.SStatusType eligibilityStatus,
           java.util.Date effectiveDate,
           java.util.Date terminationDate,
           java.lang.String benefitPackageIdentifier) {
        super(
            firstName,
            lastName);
        this.enrolleeIdentifier = enrolleeIdentifier;
        this.personIdentifier = personIdentifier;
        this.relationshipCode = relationshipCode;
        this.memberNumber = memberNumber;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.address = address;
        this.privacyFlag = privacyFlag;
        this.eligibilityStatus = eligibilityStatus;
        this.effectiveDate = effectiveDate;
        this.terminationDate = terminationDate;
        this.benefitPackageIdentifier = benefitPackageIdentifier;
    }


    /**
     * Gets the enrolleeIdentifier value for this TEnrollee.
     * 
     * @return enrolleeIdentifier   * The metavance enrollee identifier
     */
    public java.lang.String getEnrolleeIdentifier() {
        return enrolleeIdentifier;
    }


    /**
     * Sets the enrolleeIdentifier value for this TEnrollee.
     * 
     * @param enrolleeIdentifier   * The metavance enrollee identifier
     */
    public void setEnrolleeIdentifier(java.lang.String enrolleeIdentifier) {
        this.enrolleeIdentifier = enrolleeIdentifier;
    }


    /**
     * Gets the personIdentifier value for this TEnrollee.
     * 
     * @return personIdentifier   * The MetaVance Person Identifier
     */
    public java.lang.String getPersonIdentifier() {
        return personIdentifier;
    }


    /**
     * Sets the personIdentifier value for this TEnrollee.
     * 
     * @param personIdentifier   * The MetaVance Person Identifier
     */
    public void setPersonIdentifier(java.lang.String personIdentifier) {
        this.personIdentifier = personIdentifier;
    }


    /**
     * Gets the relationshipCode value for this TEnrollee.
     * 
     * @return relationshipCode   * The relation type (Relationship to primary enrollee)
     */
    public org.sen.schemas.data.SEnrolleeType getRelationshipCode() {
        return relationshipCode;
    }


    /**
     * Sets the relationshipCode value for this TEnrollee.
     * 
     * @param relationshipCode   * The relation type (Relationship to primary enrollee)
     */
    public void setRelationshipCode(org.sen.schemas.data.SEnrolleeType relationshipCode) {
        this.relationshipCode = relationshipCode;
    }


    /**
     * Gets the memberNumber value for this TEnrollee.
     * 
     * @return memberNumber   * The member number associated with the contract.
     */
    public java.lang.String getMemberNumber() {
        return memberNumber;
    }


    /**
     * Sets the memberNumber value for this TEnrollee.
     * 
     * @param memberNumber   * The member number associated with the contract.
     */
    public void setMemberNumber(java.lang.String memberNumber) {
        this.memberNumber = memberNumber;
    }


    /**
     * Gets the dateOfBirth value for this TEnrollee.
     * 
     * @return dateOfBirth   * The date of birth of the person
     */
    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this TEnrollee.
     * 
     * @param dateOfBirth   * The date of birth of the person
     */
    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the emailAddress value for this TEnrollee.
     * 
     * @return emailAddress   * The email Address of the enrollee
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this TEnrollee.
     * 
     * @param emailAddress   * The email Address of the enrollee
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the address value for this TEnrollee.
     * 
     * @return address   * The addresses associated with the enrollee
     */
    public org.sen.schemas.data.TAddress[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TEnrollee.
     * 
     * @param address   * The addresses associated with the enrollee
     */
    public void setAddress(org.sen.schemas.data.TAddress[] address) {
        this.address = address;
    }

    public org.sen.schemas.data.TAddress getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, org.sen.schemas.data.TAddress _value) {
        this.address[i] = _value;
    }


    /**
     * Gets the privacyFlag value for this TEnrollee.
     * 
     * @return privacyFlag   * The HIPPA privacy flag
     */
    public boolean isPrivacyFlag() {
        return privacyFlag;
    }


    /**
     * Sets the privacyFlag value for this TEnrollee.
     * 
     * @param privacyFlag   * The HIPPA privacy flag
     */
    public void setPrivacyFlag(boolean privacyFlag) {
        this.privacyFlag = privacyFlag;
    }


    /**
     * Gets the eligibilityStatus value for this TEnrollee.
     * 
     * @return eligibilityStatus   * The status of the eligibility. (Active/Pending/Inactive)
     */
    public org.sen.schemas.data.SStatusType getEligibilityStatus() {
        return eligibilityStatus;
    }


    /**
     * Sets the eligibilityStatus value for this TEnrollee.
     * 
     * @param eligibilityStatus   * The status of the eligibility. (Active/Pending/Inactive)
     */
    public void setEligibilityStatus(org.sen.schemas.data.SStatusType eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }


    /**
     * Gets the effectiveDate value for this TEnrollee.
     * 
     * @return effectiveDate   * The date covearge begin
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this TEnrollee.
     * 
     * @param effectiveDate   * The date covearge begin
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the terminationDate value for this TEnrollee.
     * 
     * @return terminationDate   * The date coverage will end (Term date).
     */
    public java.util.Date getTerminationDate() {
        return terminationDate;
    }


    /**
     * Sets the terminationDate value for this TEnrollee.
     * 
     * @param terminationDate   * The date coverage will end (Term date).
     */
    public void setTerminationDate(java.util.Date terminationDate) {
        this.terminationDate = terminationDate;
    }


    /**
     * Gets the benefitPackageIdentifier value for this TEnrollee.
     * 
     * @return benefitPackageIdentifier   * The benefit Package identifier in string format
     */
    public java.lang.String getBenefitPackageIdentifier() {
        return benefitPackageIdentifier;
    }


    /**
     * Sets the benefitPackageIdentifier value for this TEnrollee.
     * 
     * @param benefitPackageIdentifier   * The benefit Package identifier in string format
     */
    public void setBenefitPackageIdentifier(java.lang.String benefitPackageIdentifier) {
        this.benefitPackageIdentifier = benefitPackageIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TEnrollee)) return false;
        TEnrollee other = (TEnrollee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enrolleeIdentifier==null && other.getEnrolleeIdentifier()==null) || 
             (this.enrolleeIdentifier!=null &&
              this.enrolleeIdentifier.equals(other.getEnrolleeIdentifier()))) &&
            ((this.personIdentifier==null && other.getPersonIdentifier()==null) || 
             (this.personIdentifier!=null &&
              this.personIdentifier.equals(other.getPersonIdentifier()))) &&
            ((this.relationshipCode==null && other.getRelationshipCode()==null) || 
             (this.relationshipCode!=null &&
              this.relationshipCode.equals(other.getRelationshipCode()))) &&
            ((this.memberNumber==null && other.getMemberNumber()==null) || 
             (this.memberNumber!=null &&
              this.memberNumber.equals(other.getMemberNumber()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            this.privacyFlag == other.isPrivacyFlag() &&
            ((this.eligibilityStatus==null && other.getEligibilityStatus()==null) || 
             (this.eligibilityStatus!=null &&
              this.eligibilityStatus.equals(other.getEligibilityStatus()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.terminationDate==null && other.getTerminationDate()==null) || 
             (this.terminationDate!=null &&
              this.terminationDate.equals(other.getTerminationDate()))) &&
            ((this.benefitPackageIdentifier==null && other.getBenefitPackageIdentifier()==null) || 
             (this.benefitPackageIdentifier!=null &&
              this.benefitPackageIdentifier.equals(other.getBenefitPackageIdentifier())));
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
        if (getEnrolleeIdentifier() != null) {
            _hashCode += getEnrolleeIdentifier().hashCode();
        }
        if (getPersonIdentifier() != null) {
            _hashCode += getPersonIdentifier().hashCode();
        }
        if (getRelationshipCode() != null) {
            _hashCode += getRelationshipCode().hashCode();
        }
        if (getMemberNumber() != null) {
            _hashCode += getMemberNumber().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isPrivacyFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEligibilityStatus() != null) {
            _hashCode += getEligibilityStatus().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getTerminationDate() != null) {
            _hashCode += getTerminationDate().hashCode();
        }
        if (getBenefitPackageIdentifier() != null) {
            _hashCode += getBenefitPackageIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TEnrollee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tEnrollee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrolleeIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "enrolleeIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "personIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "relationshipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sEnrolleeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "memberNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privacyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "privacyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibilityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "eligibilityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "terminationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitPackageIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "benefitPackageIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
