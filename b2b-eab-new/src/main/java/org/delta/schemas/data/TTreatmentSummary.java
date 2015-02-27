/**
 * TTreatmentSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The summary info (mostly derived from the procedure code level)
 * of treatment in a particular tier
 */
public class TTreatmentSummary  implements java.io.Serializable {
    private java.lang.String tierType;

    private org.delta.schemas.data.TCopayment copayment;

    private boolean frequencyLimitationType;

    private org.delta.schemas.data.TWaitingPeriod waitingPeriod;

    private boolean preApprovalRequired;

    private boolean deductibleExemption;

    private java.lang.Boolean maximumExemption;

    public TTreatmentSummary() {
    }

    public TTreatmentSummary(
           java.lang.String tierType,
           org.delta.schemas.data.TCopayment copayment,
           boolean frequencyLimitationType,
           org.delta.schemas.data.TWaitingPeriod waitingPeriod,
           boolean preApprovalRequired,
           boolean deductibleExemption,
           java.lang.Boolean maximumExemption) {
           this.tierType = tierType;
           this.copayment = copayment;
           this.frequencyLimitationType = frequencyLimitationType;
           this.waitingPeriod = waitingPeriod;
           this.preApprovalRequired = preApprovalRequired;
           this.deductibleExemption = deductibleExemption;
           this.maximumExemption = maximumExemption;
    }


    /**
     * Gets the tierType value for this TTreatmentSummary.
     * 
     * @return tierType
     */
    public java.lang.String getTierType() {
        return tierType;
    }


    /**
     * Sets the tierType value for this TTreatmentSummary.
     * 
     * @param tierType
     */
    public void setTierType(java.lang.String tierType) {
        this.tierType = tierType;
    }


    /**
     * Gets the copayment value for this TTreatmentSummary.
     * 
     * @return copayment
     */
    public org.delta.schemas.data.TCopayment getCopayment() {
        return copayment;
    }


    /**
     * Sets the copayment value for this TTreatmentSummary.
     * 
     * @param copayment
     */
    public void setCopayment(org.delta.schemas.data.TCopayment copayment) {
        this.copayment = copayment;
    }


    /**
     * Gets the frequencyLimitationType value for this TTreatmentSummary.
     * 
     * @return frequencyLimitationType
     */
    public boolean isFrequencyLimitationType() {
        return frequencyLimitationType;
    }


    /**
     * Sets the frequencyLimitationType value for this TTreatmentSummary.
     * 
     * @param frequencyLimitationType
     */
    public void setFrequencyLimitationType(boolean frequencyLimitationType) {
        this.frequencyLimitationType = frequencyLimitationType;
    }


    /**
     * Gets the waitingPeriod value for this TTreatmentSummary.
     * 
     * @return waitingPeriod
     */
    public org.delta.schemas.data.TWaitingPeriod getWaitingPeriod() {
        return waitingPeriod;
    }


    /**
     * Sets the waitingPeriod value for this TTreatmentSummary.
     * 
     * @param waitingPeriod
     */
    public void setWaitingPeriod(org.delta.schemas.data.TWaitingPeriod waitingPeriod) {
        this.waitingPeriod = waitingPeriod;
    }


    /**
     * Gets the preApprovalRequired value for this TTreatmentSummary.
     * 
     * @return preApprovalRequired
     */
    public boolean isPreApprovalRequired() {
        return preApprovalRequired;
    }


    /**
     * Sets the preApprovalRequired value for this TTreatmentSummary.
     * 
     * @param preApprovalRequired
     */
    public void setPreApprovalRequired(boolean preApprovalRequired) {
        this.preApprovalRequired = preApprovalRequired;
    }


    /**
     * Gets the deductibleExemption value for this TTreatmentSummary.
     * 
     * @return deductibleExemption
     */
    public boolean isDeductibleExemption() {
        return deductibleExemption;
    }


    /**
     * Sets the deductibleExemption value for this TTreatmentSummary.
     * 
     * @param deductibleExemption
     */
    public void setDeductibleExemption(boolean deductibleExemption) {
        this.deductibleExemption = deductibleExemption;
    }


    /**
     * Gets the maximumExemption value for this TTreatmentSummary.
     * 
     * @return maximumExemption
     */
    public java.lang.Boolean getMaximumExemption() {
        return maximumExemption;
    }


    /**
     * Sets the maximumExemption value for this TTreatmentSummary.
     * 
     * @param maximumExemption
     */
    public void setMaximumExemption(java.lang.Boolean maximumExemption) {
        this.maximumExemption = maximumExemption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTreatmentSummary)) return false;
        TTreatmentSummary other = (TTreatmentSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tierType==null && other.getTierType()==null) || 
             (this.tierType!=null &&
              this.tierType.equals(other.getTierType()))) &&
            ((this.copayment==null && other.getCopayment()==null) || 
             (this.copayment!=null &&
              this.copayment.equals(other.getCopayment()))) &&
            this.frequencyLimitationType == other.isFrequencyLimitationType() &&
            ((this.waitingPeriod==null && other.getWaitingPeriod()==null) || 
             (this.waitingPeriod!=null &&
              this.waitingPeriod.equals(other.getWaitingPeriod()))) &&
            this.preApprovalRequired == other.isPreApprovalRequired() &&
            this.deductibleExemption == other.isDeductibleExemption() &&
            ((this.maximumExemption==null && other.getMaximumExemption()==null) || 
             (this.maximumExemption!=null &&
              this.maximumExemption.equals(other.getMaximumExemption())));
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
        if (getTierType() != null) {
            _hashCode += getTierType().hashCode();
        }
        if (getCopayment() != null) {
            _hashCode += getCopayment().hashCode();
        }
        _hashCode += (isFrequencyLimitationType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWaitingPeriod() != null) {
            _hashCode += getWaitingPeriod().hashCode();
        }
        _hashCode += (isPreApprovalRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeductibleExemption() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaximumExemption() != null) {
            _hashCode += getMaximumExemption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TTreatmentSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tTreatmentSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tierType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "copayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tCopayment"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyLimitationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "frequencyLimitationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "waitingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tWaitingPeriod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preApprovalRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "preApprovalRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductibleExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "deductibleExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "maximumExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
