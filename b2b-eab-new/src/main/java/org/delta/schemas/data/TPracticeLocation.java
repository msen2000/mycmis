/**
 * TPracticeLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The definition of a practice Location object
 */
public class TPracticeLocation  extends org.sen.schemas.data.TAddress  implements java.io.Serializable {
    /* The practice location identifier */
    private java.lang.String practiceLocationId;

    /* The county */
    private java.lang.String county;

    /* The country */
    private java.lang.String country;

    /* The phone contacts for this practice location */
    private org.sen.schemas.data.TPhoneNumber[] phone;

    /* The email address */
    private java.lang.String email;

    public TPracticeLocation() {
    }

    public TPracticeLocation(
           org.sen.schemas.data.SAddressType addressType,
           java.lang.String addressLine1,
           java.lang.String addressLine2,
           java.lang.String city,
           java.lang.String zipCode,
           java.lang.String state,
           java.lang.String practiceLocationId,
           java.lang.String county,
           java.lang.String country,
           org.sen.schemas.data.TPhoneNumber[] phone,
           java.lang.String email) {
        super(
            addressLine1,
            addressLine2,
            city,
            zipCode,
            state,
            addressType);
        this.practiceLocationId = practiceLocationId;
        this.county = county;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }


    /**
     * Gets the practiceLocationId value for this TPracticeLocation.
     * 
     * @return practiceLocationId   * The practice location identifier
     */
    public java.lang.String getPracticeLocationId() {
        return practiceLocationId;
    }


    /**
     * Sets the practiceLocationId value for this TPracticeLocation.
     * 
     * @param practiceLocationId   * The practice location identifier
     */
    public void setPracticeLocationId(java.lang.String practiceLocationId) {
        this.practiceLocationId = practiceLocationId;
    }


    /**
     * Gets the county value for this TPracticeLocation.
     * 
     * @return county   * The county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this TPracticeLocation.
     * 
     * @param county   * The county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the country value for this TPracticeLocation.
     * 
     * @return country   * The country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this TPracticeLocation.
     * 
     * @param country   * The country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the phone value for this TPracticeLocation.
     * 
     * @return phone   * The phone contacts for this practice location
     */
    public org.sen.schemas.data.TPhoneNumber[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this TPracticeLocation.
     * 
     * @param phone   * The phone contacts for this practice location
     */
    public void setPhone(org.sen.schemas.data.TPhoneNumber[] phone) {
        this.phone = phone;
    }

    public org.sen.schemas.data.TPhoneNumber getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, org.sen.schemas.data.TPhoneNumber _value) {
        this.phone[i] = _value;
    }


    /**
     * Gets the email value for this TPracticeLocation.
     * 
     * @return email   * The email address
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this TPracticeLocation.
     * 
     * @param email   * The email address
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPracticeLocation)) return false;
        TPracticeLocation other = (TPracticeLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.practiceLocationId==null && other.getPracticeLocationId()==null) || 
             (this.practiceLocationId!=null &&
              this.practiceLocationId.equals(other.getPracticeLocationId()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail())));
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
        if (getPracticeLocationId() != null) {
            _hashCode += getPracticeLocationId().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TPracticeLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tPracticeLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("practiceLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "practiceLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tPhoneNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
