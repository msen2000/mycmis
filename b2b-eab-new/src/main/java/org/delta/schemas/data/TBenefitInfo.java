/**
 * TBenefitInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class TBenefitInfo  implements java.io.Serializable {
    private org.delta.schemas.data.TcoAmountType coPaymentAmount;

    private boolean contractYearOrCalendar;

    private org.delta.schemas.data.TLifeTimeAnnualType lifeTimeAnnual;

    private org.delta.schemas.data.TFamilyIndividualType familyIndividual;

    private boolean isDeductibleExemption;

    private int waitingPeriod;

    private org.delta.schemas.data.TAmountType maximumAmount;

    private org.delta.schemas.data.TAmountType remainingMaximumAmount;

    private org.delta.schemas.data.TAmountType deductiblesAmount;

    private org.delta.schemas.data.TAmountType deductiblesRemainingAmount;

    private org.delta.schemas.data.TBenefitClassCodeType benefitClassCode;

    public TBenefitInfo() {
    }

    public TBenefitInfo(
           org.delta.schemas.data.TcoAmountType coPaymentAmount,
           boolean contractYearOrCalendar,
           org.delta.schemas.data.TLifeTimeAnnualType lifeTimeAnnual,
           org.delta.schemas.data.TFamilyIndividualType familyIndividual,
           boolean isDeductibleExemption,
           int waitingPeriod,
           org.delta.schemas.data.TAmountType maximumAmount,
           org.delta.schemas.data.TAmountType remainingMaximumAmount,
           org.delta.schemas.data.TAmountType deductiblesAmount,
           org.delta.schemas.data.TAmountType deductiblesRemainingAmount,
           org.delta.schemas.data.TBenefitClassCodeType benefitClassCode) {
           this.coPaymentAmount = coPaymentAmount;
           this.contractYearOrCalendar = contractYearOrCalendar;
           this.lifeTimeAnnual = lifeTimeAnnual;
           this.familyIndividual = familyIndividual;
           this.isDeductibleExemption = isDeductibleExemption;
           this.waitingPeriod = waitingPeriod;
           this.maximumAmount = maximumAmount;
           this.remainingMaximumAmount = remainingMaximumAmount;
           this.deductiblesAmount = deductiblesAmount;
           this.deductiblesRemainingAmount = deductiblesRemainingAmount;
           this.benefitClassCode = benefitClassCode;
    }


    /**
     * Gets the coPaymentAmount value for this TBenefitInfo.
     * 
     * @return coPaymentAmount
     */
    public org.delta.schemas.data.TcoAmountType getCoPaymentAmount() {
        return coPaymentAmount;
    }


    /**
     * Sets the coPaymentAmount value for this TBenefitInfo.
     * 
     * @param coPaymentAmount
     */
    public void setCoPaymentAmount(org.delta.schemas.data.TcoAmountType coPaymentAmount) {
        this.coPaymentAmount = coPaymentAmount;
    }


    /**
     * Gets the contractYearOrCalendar value for this TBenefitInfo.
     * 
     * @return contractYearOrCalendar
     */
    public boolean isContractYearOrCalendar() {
        return contractYearOrCalendar;
    }


    /**
     * Sets the contractYearOrCalendar value for this TBenefitInfo.
     * 
     * @param contractYearOrCalendar
     */
    public void setContractYearOrCalendar(boolean contractYearOrCalendar) {
        this.contractYearOrCalendar = contractYearOrCalendar;
    }


    /**
     * Gets the lifeTimeAnnual value for this TBenefitInfo.
     * 
     * @return lifeTimeAnnual
     */
    public org.delta.schemas.data.TLifeTimeAnnualType getLifeTimeAnnual() {
        return lifeTimeAnnual;
    }


    /**
     * Sets the lifeTimeAnnual value for this TBenefitInfo.
     * 
     * @param lifeTimeAnnual
     */
    public void setLifeTimeAnnual(org.delta.schemas.data.TLifeTimeAnnualType lifeTimeAnnual) {
        this.lifeTimeAnnual = lifeTimeAnnual;
    }


    /**
     * Gets the familyIndividual value for this TBenefitInfo.
     * 
     * @return familyIndividual
     */
    public org.delta.schemas.data.TFamilyIndividualType getFamilyIndividual() {
        return familyIndividual;
    }


    /**
     * Sets the familyIndividual value for this TBenefitInfo.
     * 
     * @param familyIndividual
     */
    public void setFamilyIndividual(org.delta.schemas.data.TFamilyIndividualType familyIndividual) {
        this.familyIndividual = familyIndividual;
    }


    /**
     * Gets the isDeductibleExemption value for this TBenefitInfo.
     * 
     * @return isDeductibleExemption
     */
    public boolean isIsDeductibleExemption() {
        return isDeductibleExemption;
    }


    /**
     * Sets the isDeductibleExemption value for this TBenefitInfo.
     * 
     * @param isDeductibleExemption
     */
    public void setIsDeductibleExemption(boolean isDeductibleExemption) {
        this.isDeductibleExemption = isDeductibleExemption;
    }


    /**
     * Gets the waitingPeriod value for this TBenefitInfo.
     * 
     * @return waitingPeriod
     */
    public int getWaitingPeriod() {
        return waitingPeriod;
    }


    /**
     * Sets the waitingPeriod value for this TBenefitInfo.
     * 
     * @param waitingPeriod
     */
    public void setWaitingPeriod(int waitingPeriod) {
        this.waitingPeriod = waitingPeriod;
    }


    /**
     * Gets the maximumAmount value for this TBenefitInfo.
     * 
     * @return maximumAmount
     */
    public org.delta.schemas.data.TAmountType getMaximumAmount() {
        return maximumAmount;
    }


    /**
     * Sets the maximumAmount value for this TBenefitInfo.
     * 
     * @param maximumAmount
     */
    public void setMaximumAmount(org.delta.schemas.data.TAmountType maximumAmount) {
        this.maximumAmount = maximumAmount;
    }


    /**
     * Gets the remainingMaximumAmount value for this TBenefitInfo.
     * 
     * @return remainingMaximumAmount
     */
    public org.delta.schemas.data.TAmountType getRemainingMaximumAmount() {
        return remainingMaximumAmount;
    }


    /**
     * Sets the remainingMaximumAmount value for this TBenefitInfo.
     * 
     * @param remainingMaximumAmount
     */
    public void setRemainingMaximumAmount(org.delta.schemas.data.TAmountType remainingMaximumAmount) {
        this.remainingMaximumAmount = remainingMaximumAmount;
    }


    /**
     * Gets the deductiblesAmount value for this TBenefitInfo.
     * 
     * @return deductiblesAmount
     */
    public org.delta.schemas.data.TAmountType getDeductiblesAmount() {
        return deductiblesAmount;
    }


    /**
     * Sets the deductiblesAmount value for this TBenefitInfo.
     * 
     * @param deductiblesAmount
     */
    public void setDeductiblesAmount(org.delta.schemas.data.TAmountType deductiblesAmount) {
        this.deductiblesAmount = deductiblesAmount;
    }


    /**
     * Gets the deductiblesRemainingAmount value for this TBenefitInfo.
     * 
     * @return deductiblesRemainingAmount
     */
    public org.delta.schemas.data.TAmountType getDeductiblesRemainingAmount() {
        return deductiblesRemainingAmount;
    }


    /**
     * Sets the deductiblesRemainingAmount value for this TBenefitInfo.
     * 
     * @param deductiblesRemainingAmount
     */
    public void setDeductiblesRemainingAmount(org.delta.schemas.data.TAmountType deductiblesRemainingAmount) {
        this.deductiblesRemainingAmount = deductiblesRemainingAmount;
    }


    /**
     * Gets the benefitClassCode value for this TBenefitInfo.
     * 
     * @return benefitClassCode
     */
    public org.delta.schemas.data.TBenefitClassCodeType getBenefitClassCode() {
        return benefitClassCode;
    }


    /**
     * Sets the benefitClassCode value for this TBenefitInfo.
     * 
     * @param benefitClassCode
     */
    public void setBenefitClassCode(org.delta.schemas.data.TBenefitClassCodeType benefitClassCode) {
        this.benefitClassCode = benefitClassCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBenefitInfo)) return false;
        TBenefitInfo other = (TBenefitInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coPaymentAmount==null && other.getCoPaymentAmount()==null) || 
             (this.coPaymentAmount!=null &&
              this.coPaymentAmount.equals(other.getCoPaymentAmount()))) &&
            this.contractYearOrCalendar == other.isContractYearOrCalendar() &&
            ((this.lifeTimeAnnual==null && other.getLifeTimeAnnual()==null) || 
             (this.lifeTimeAnnual!=null &&
              this.lifeTimeAnnual.equals(other.getLifeTimeAnnual()))) &&
            ((this.familyIndividual==null && other.getFamilyIndividual()==null) || 
             (this.familyIndividual!=null &&
              this.familyIndividual.equals(other.getFamilyIndividual()))) &&
            this.isDeductibleExemption == other.isIsDeductibleExemption() &&
            this.waitingPeriod == other.getWaitingPeriod() &&
            ((this.maximumAmount==null && other.getMaximumAmount()==null) || 
             (this.maximumAmount!=null &&
              this.maximumAmount.equals(other.getMaximumAmount()))) &&
            ((this.remainingMaximumAmount==null && other.getRemainingMaximumAmount()==null) || 
             (this.remainingMaximumAmount!=null &&
              this.remainingMaximumAmount.equals(other.getRemainingMaximumAmount()))) &&
            ((this.deductiblesAmount==null && other.getDeductiblesAmount()==null) || 
             (this.deductiblesAmount!=null &&
              this.deductiblesAmount.equals(other.getDeductiblesAmount()))) &&
            ((this.deductiblesRemainingAmount==null && other.getDeductiblesRemainingAmount()==null) || 
             (this.deductiblesRemainingAmount!=null &&
              this.deductiblesRemainingAmount.equals(other.getDeductiblesRemainingAmount()))) &&
            ((this.benefitClassCode==null && other.getBenefitClassCode()==null) || 
             (this.benefitClassCode!=null &&
              this.benefitClassCode.equals(other.getBenefitClassCode())));
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
        if (getCoPaymentAmount() != null) {
            _hashCode += getCoPaymentAmount().hashCode();
        }
        _hashCode += (isContractYearOrCalendar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLifeTimeAnnual() != null) {
            _hashCode += getLifeTimeAnnual().hashCode();
        }
        if (getFamilyIndividual() != null) {
            _hashCode += getFamilyIndividual().hashCode();
        }
        _hashCode += (isIsDeductibleExemption() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getWaitingPeriod();
        if (getMaximumAmount() != null) {
            _hashCode += getMaximumAmount().hashCode();
        }
        if (getRemainingMaximumAmount() != null) {
            _hashCode += getRemainingMaximumAmount().hashCode();
        }
        if (getDeductiblesAmount() != null) {
            _hashCode += getDeductiblesAmount().hashCode();
        }
        if (getDeductiblesRemainingAmount() != null) {
            _hashCode += getDeductiblesRemainingAmount().hashCode();
        }
        if (getBenefitClassCode() != null) {
            _hashCode += getBenefitClassCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBenefitInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tBenefitInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "CoPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tcoAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractYearOrCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "ContractYearOrCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeTimeAnnual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "LifeTimeAnnual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tLifeTimeAnnualType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyIndividual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "FamilyIndividual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tFamilyIndividualType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeductibleExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "IsDeductibleExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "WaitingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "MaximumAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingMaximumAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "RemainingMaximumAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductiblesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "DeductiblesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductiblesRemainingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "DeductiblesRemainingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitClassCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "BenefitClassCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tBenefitClassCodeType"));
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
