/**
 * TProviderContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * A provider contract object
 */
public class TProviderContract  implements java.io.Serializable {
    /* The status of this provider */
    private org.sen.schemas.data.TProviderContractProviderStatus providerStatus;

    /* The participation status of this provider */
    private java.lang.String participationStatus;

    /* The specialties of this provider */
    private org.sen.schemas.data.SSpecialtyCode[] specialties;

    public TProviderContract() {
    }

    public TProviderContract(
           org.sen.schemas.data.TProviderContractProviderStatus providerStatus,
           java.lang.String participationStatus,
           org.sen.schemas.data.SSpecialtyCode[] specialties) {
           this.providerStatus = providerStatus;
           this.participationStatus = participationStatus;
           this.specialties = specialties;
    }


    /**
     * Gets the providerStatus value for this TProviderContract.
     * 
     * @return providerStatus   * The status of this provider
     */
    public org.sen.schemas.data.TProviderContractProviderStatus getProviderStatus() {
        return providerStatus;
    }


    /**
     * Sets the providerStatus value for this TProviderContract.
     * 
     * @param providerStatus   * The status of this provider
     */
    public void setProviderStatus(org.sen.schemas.data.TProviderContractProviderStatus providerStatus) {
        this.providerStatus = providerStatus;
    }


    /**
     * Gets the participationStatus value for this TProviderContract.
     * 
     * @return participationStatus   * The participation status of this provider
     */
    public java.lang.String getParticipationStatus() {
        return participationStatus;
    }


    /**
     * Sets the participationStatus value for this TProviderContract.
     * 
     * @param participationStatus   * The participation status of this provider
     */
    public void setParticipationStatus(java.lang.String participationStatus) {
        this.participationStatus = participationStatus;
    }


    /**
     * Gets the specialties value for this TProviderContract.
     * 
     * @return specialties   * The specialties of this provider
     */
    public org.sen.schemas.data.SSpecialtyCode[] getSpecialties() {
        return specialties;
    }


    /**
     * Sets the specialties value for this TProviderContract.
     * 
     * @param specialties   * The specialties of this provider
     */
    public void setSpecialties(org.sen.schemas.data.SSpecialtyCode[] specialties) {
        this.specialties = specialties;
    }

    public org.sen.schemas.data.SSpecialtyCode getSpecialties(int i) {
        return this.specialties[i];
    }

    public void setSpecialties(int i, org.sen.schemas.data.SSpecialtyCode _value) {
        this.specialties[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TProviderContract)) return false;
        TProviderContract other = (TProviderContract) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.providerStatus==null && other.getProviderStatus()==null) || 
             (this.providerStatus!=null &&
              this.providerStatus.equals(other.getProviderStatus()))) &&
            ((this.participationStatus==null && other.getParticipationStatus()==null) || 
             (this.participationStatus!=null &&
              this.participationStatus.equals(other.getParticipationStatus()))) &&
            ((this.specialties==null && other.getSpecialties()==null) || 
             (this.specialties!=null &&
              java.util.Arrays.equals(this.specialties, other.getSpecialties())));
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
        if (getProviderStatus() != null) {
            _hashCode += getProviderStatus().hashCode();
        }
        if (getParticipationStatus() != null) {
            _hashCode += getParticipationStatus().hashCode();
        }
        if (getSpecialties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TProviderContract.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProviderContract"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "providerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tProviderContract>providerStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "participationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "specialties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sSpecialtyCode"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
