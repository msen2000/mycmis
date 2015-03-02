/**
 * B2BEligibilityAndBenefitsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class B2BEligibilityAndBenefitsRequest  implements java.io.Serializable {
    private java.util.Date DOB;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String personIdentifier;

    private java.lang.String enrolleeIdentifier;

    private java.lang.String enrolleeType;

    public B2BEligibilityAndBenefitsRequest() {
    }

    public B2BEligibilityAndBenefitsRequest(
           java.util.Date DOB,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String personIdentifier,
           java.lang.String enrolleeIdentifier,
           java.lang.String enrolleeType) {
           this.DOB = DOB;
           this.firstName = firstName;
           this.lastName = lastName;
           this.personIdentifier = personIdentifier;
           this.enrolleeIdentifier = enrolleeIdentifier;
           this.enrolleeType = enrolleeType;
    }


    /**
     * Gets the DOB value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @return DOB
     */
    public java.util.Date getDOB() {
        return DOB;
    }


    /**
     * Sets the DOB value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @param DOB
     */
    public void setDOB(java.util.Date DOB) {
        this.DOB = DOB;
    }


    /**
     * Gets the firstName value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the personIdentifier value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @return personIdentifier
     */
    public java.lang.String getPersonIdentifier() {
        return personIdentifier;
    }


    /**
     * Sets the personIdentifier value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @param personIdentifier
     */
    public void setPersonIdentifier(java.lang.String personIdentifier) {
        this.personIdentifier = personIdentifier;
    }


    /**
     * Gets the enrolleeIdentifier value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @return enrolleeIdentifier
     */
    public java.lang.String getEnrolleeIdentifier() {
        return enrolleeIdentifier;
    }


    /**
     * Sets the enrolleeIdentifier value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @param enrolleeIdentifier
     */
    public void setEnrolleeIdentifier(java.lang.String enrolleeIdentifier) {
        this.enrolleeIdentifier = enrolleeIdentifier;
    }


    /**
     * Gets the enrolleeType value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @return enrolleeType
     */
    public java.lang.String getEnrolleeType() {
        return enrolleeType;
    }


    /**
     * Sets the enrolleeType value for this B2BEligibilityAndBenefitsRequest.
     * 
     * @param enrolleeType
     */
    public void setEnrolleeType(java.lang.String enrolleeType) {
        this.enrolleeType = enrolleeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof B2BEligibilityAndBenefitsRequest)) return false;
        B2BEligibilityAndBenefitsRequest other = (B2BEligibilityAndBenefitsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DOB==null && other.getDOB()==null) || 
             (this.DOB!=null &&
              this.DOB.equals(other.getDOB()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.personIdentifier==null && other.getPersonIdentifier()==null) || 
             (this.personIdentifier!=null &&
              this.personIdentifier.equals(other.getPersonIdentifier()))) &&
            ((this.enrolleeIdentifier==null && other.getEnrolleeIdentifier()==null) || 
             (this.enrolleeIdentifier!=null &&
              this.enrolleeIdentifier.equals(other.getEnrolleeIdentifier()))) &&
            ((this.enrolleeType==null && other.getEnrolleeType()==null) || 
             (this.enrolleeType!=null &&
              this.enrolleeType.equals(other.getEnrolleeType())));
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
        if (getDOB() != null) {
            _hashCode += getDOB().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getPersonIdentifier() != null) {
            _hashCode += getPersonIdentifier().hashCode();
        }
        if (getEnrolleeIdentifier() != null) {
            _hashCode += getEnrolleeIdentifier().hashCode();
        }
        if (getEnrolleeType() != null) {
            _hashCode += getEnrolleeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(B2BEligibilityAndBenefitsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">B2BEligibilityAndBenefitsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "DOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "PersonIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrolleeIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "EnrolleeIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrolleeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "EnrolleeType"));
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
