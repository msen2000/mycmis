/**
 * TProcedureCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The definition of a procedure code object
 */
public class TProcedureCode  implements java.io.Serializable {
    /* The procedure code identifier */
    private java.lang.String procedureCode;

    /* The procedure code name */
    private java.lang.String procedureCodeName;

    private org.sen.schemas.data.SCopaymentType copayType;

    private java.lang.Double copayAmount;

    private org.sen.schemas.data.TLimitation frequencyLimitation;

    private org.sen.schemas.data.TWaitingPeriod waitingPeriod;

    private boolean preApprovalRequired;

    private boolean deductibleExemption;

    private java.lang.Boolean maximumExemption;

    private java.lang.String tierType;  // attribute

    public TProcedureCode() {
    }

    public TProcedureCode(
           java.lang.String procedureCode,
           java.lang.String procedureCodeName,
           org.sen.schemas.data.SCopaymentType copayType,
           java.lang.Double copayAmount,
           org.sen.schemas.data.TLimitation frequencyLimitation,
           org.sen.schemas.data.TWaitingPeriod waitingPeriod,
           boolean preApprovalRequired,
           boolean deductibleExemption,
           java.lang.Boolean maximumExemption,
           java.lang.String tierType) {
           this.procedureCode = procedureCode;
           this.procedureCodeName = procedureCodeName;
           this.copayType = copayType;
           this.copayAmount = copayAmount;
           this.frequencyLimitation = frequencyLimitation;
           this.waitingPeriod = waitingPeriod;
           this.preApprovalRequired = preApprovalRequired;
           this.deductibleExemption = deductibleExemption;
           this.maximumExemption = maximumExemption;
           this.tierType = tierType;
    }


    /**
     * Gets the procedureCode value for this TProcedureCode.
     * 
     * @return procedureCode   * The procedure code identifier
     */
    public java.lang.String getProcedureCode() {
        return procedureCode;
    }


    /**
     * Sets the procedureCode value for this TProcedureCode.
     * 
     * @param procedureCode   * The procedure code identifier
     */
    public void setProcedureCode(java.lang.String procedureCode) {
        this.procedureCode = procedureCode;
    }


    /**
     * Gets the procedureCodeName value for this TProcedureCode.
     * 
     * @return procedureCodeName   * The procedure code name
     */
    public java.lang.String getProcedureCodeName() {
        return procedureCodeName;
    }


    /**
     * Sets the procedureCodeName value for this TProcedureCode.
     * 
     * @param procedureCodeName   * The procedure code name
     */
    public void setProcedureCodeName(java.lang.String procedureCodeName) {
        this.procedureCodeName = procedureCodeName;
    }


    /**
     * Gets the copayType value for this TProcedureCode.
     * 
     * @return copayType
     */
    public org.sen.schemas.data.SCopaymentType getCopayType() {
        return copayType;
    }


    /**
     * Sets the copayType value for this TProcedureCode.
     * 
     * @param copayType
     */
    public void setCopayType(org.sen.schemas.data.SCopaymentType copayType) {
        this.copayType = copayType;
    }


    /**
     * Gets the copayAmount value for this TProcedureCode.
     * 
     * @return copayAmount
     */
    public java.lang.Double getCopayAmount() {
        return copayAmount;
    }


    /**
     * Sets the copayAmount value for this TProcedureCode.
     * 
     * @param copayAmount
     */
    public void setCopayAmount(java.lang.Double copayAmount) {
        this.copayAmount = copayAmount;
    }


    /**
     * Gets the frequencyLimitation value for this TProcedureCode.
     * 
     * @return frequencyLimitation
     */
    public org.sen.schemas.data.TLimitation getFrequencyLimitation() {
        return frequencyLimitation;
    }


    /**
     * Sets the frequencyLimitation value for this TProcedureCode.
     * 
     * @param frequencyLimitation
     */
    public void setFrequencyLimitation(org.sen.schemas.data.TLimitation frequencyLimitation) {
        this.frequencyLimitation = frequencyLimitation;
    }


    /**
     * Gets the waitingPeriod value for this TProcedureCode.
     * 
     * @return waitingPeriod
     */
    public org.sen.schemas.data.TWaitingPeriod getWaitingPeriod() {
        return waitingPeriod;
    }


    /**
     * Sets the waitingPeriod value for this TProcedureCode.
     * 
     * @param waitingPeriod
     */
    public void setWaitingPeriod(org.sen.schemas.data.TWaitingPeriod waitingPeriod) {
        this.waitingPeriod = waitingPeriod;
    }


    /**
     * Gets the preApprovalRequired value for this TProcedureCode.
     * 
     * @return preApprovalRequired
     */
    public boolean isPreApprovalRequired() {
        return preApprovalRequired;
    }


    /**
     * Sets the preApprovalRequired value for this TProcedureCode.
     * 
     * @param preApprovalRequired
     */
    public void setPreApprovalRequired(boolean preApprovalRequired) {
        this.preApprovalRequired = preApprovalRequired;
    }


    /**
     * Gets the deductibleExemption value for this TProcedureCode.
     * 
     * @return deductibleExemption
     */
    public boolean isDeductibleExemption() {
        return deductibleExemption;
    }


    /**
     * Sets the deductibleExemption value for this TProcedureCode.
     * 
     * @param deductibleExemption
     */
    public void setDeductibleExemption(boolean deductibleExemption) {
        this.deductibleExemption = deductibleExemption;
    }


    /**
     * Gets the maximumExemption value for this TProcedureCode.
     * 
     * @return maximumExemption
     */
    public java.lang.Boolean getMaximumExemption() {
        return maximumExemption;
    }


    /**
     * Sets the maximumExemption value for this TProcedureCode.
     * 
     * @param maximumExemption
     */
    public void setMaximumExemption(java.lang.Boolean maximumExemption) {
        this.maximumExemption = maximumExemption;
    }


    /**
     * Gets the tierType value for this TProcedureCode.
     * 
     * @return tierType
     */
    public java.lang.String getTierType() {
        return tierType;
    }


    /**
     * Sets the tierType value for this TProcedureCode.
     * 
     * @param tierType
     */
    public void setTierType(java.lang.String tierType) {
        this.tierType = tierType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TProcedureCode)) return false;
        TProcedureCode other = (TProcedureCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.procedureCode==null && other.getProcedureCode()==null) || 
             (this.procedureCode!=null &&
              this.procedureCode.equals(other.getProcedureCode()))) &&
            ((this.procedureCodeName==null && other.getProcedureCodeName()==null) || 
             (this.procedureCodeName!=null &&
              this.procedureCodeName.equals(other.getProcedureCodeName()))) &&
            ((this.copayType==null && other.getCopayType()==null) || 
             (this.copayType!=null &&
              this.copayType.equals(other.getCopayType()))) &&
            ((this.copayAmount==null && other.getCopayAmount()==null) || 
             (this.copayAmount!=null &&
              this.copayAmount.equals(other.getCopayAmount()))) &&
            ((this.frequencyLimitation==null && other.getFrequencyLimitation()==null) || 
             (this.frequencyLimitation!=null &&
              this.frequencyLimitation.equals(other.getFrequencyLimitation()))) &&
            ((this.waitingPeriod==null && other.getWaitingPeriod()==null) || 
             (this.waitingPeriod!=null &&
              this.waitingPeriod.equals(other.getWaitingPeriod()))) &&
            this.preApprovalRequired == other.isPreApprovalRequired() &&
            this.deductibleExemption == other.isDeductibleExemption() &&
            ((this.maximumExemption==null && other.getMaximumExemption()==null) || 
             (this.maximumExemption!=null &&
              this.maximumExemption.equals(other.getMaximumExemption()))) &&
            ((this.tierType==null && other.getTierType()==null) || 
             (this.tierType!=null &&
              this.tierType.equals(other.getTierType())));
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
        if (getProcedureCode() != null) {
            _hashCode += getProcedureCode().hashCode();
        }
        if (getProcedureCodeName() != null) {
            _hashCode += getProcedureCodeName().hashCode();
        }
        if (getCopayType() != null) {
            _hashCode += getCopayType().hashCode();
        }
        if (getCopayAmount() != null) {
            _hashCode += getCopayAmount().hashCode();
        }
        if (getFrequencyLimitation() != null) {
            _hashCode += getFrequencyLimitation().hashCode();
        }
        if (getWaitingPeriod() != null) {
            _hashCode += getWaitingPeriod().hashCode();
        }
        _hashCode += (isPreApprovalRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDeductibleExemption() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaximumExemption() != null) {
            _hashCode += getMaximumExemption().hashCode();
        }
        if (getTierType() != null) {
            _hashCode += getTierType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TProcedureCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureCode"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tierType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tierType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedureCodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureCodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "copayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sCopaymentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copayAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "copayAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyLimitation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "frequencyLimitation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tLimitation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "waitingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tWaitingPeriod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preApprovalRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "preApprovalRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductibleExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "deductibleExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "maximumExemption"));
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
