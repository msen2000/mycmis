/**
 * TPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * Check Summary Payment Object (A/P)
 */
public class TPayment  implements java.io.Serializable {
    /* The check or EFT number associated with the payment */
    private java.lang.String paymentNumber;

    /* The check or EFT payment date associated with the payment */
    private java.util.Date paymentDate;

    /* Amount of payment */
    private java.lang.Double paymentAmount;

    /* Status of payment: */
    private org.delta.schemas.data.SPaymentStatusType paymentStatus;

    /* As of date for status: Date paid/cashed or printed/sent. */
    private java.util.Date paymentStatusDate;

    /* Accounts payable code associated to the payment */
    private java.lang.String accountsPayableCode;

    /* Tax number for provider payees */
    private java.lang.String taxIdentifer;

    /* Indicator that denotes the type of payee */
    private org.delta.schemas.data.SPayToCode payToIndicatorCode;

    private org.delta.schemas.data.SPaymentType paymentType;  // attribute

    public TPayment() {
    }

    public TPayment(
           java.lang.String paymentNumber,
           java.util.Date paymentDate,
           java.lang.Double paymentAmount,
           org.delta.schemas.data.SPaymentStatusType paymentStatus,
           java.util.Date paymentStatusDate,
           java.lang.String accountsPayableCode,
           java.lang.String taxIdentifer,
           org.delta.schemas.data.SPayToCode payToIndicatorCode,
           org.delta.schemas.data.SPaymentType paymentType) {
           this.paymentNumber = paymentNumber;
           this.paymentDate = paymentDate;
           this.paymentAmount = paymentAmount;
           this.paymentStatus = paymentStatus;
           this.paymentStatusDate = paymentStatusDate;
           this.accountsPayableCode = accountsPayableCode;
           this.taxIdentifer = taxIdentifer;
           this.payToIndicatorCode = payToIndicatorCode;
           this.paymentType = paymentType;
    }


    /**
     * Gets the paymentNumber value for this TPayment.
     * 
     * @return paymentNumber   * The check or EFT number associated with the payment
     */
    public java.lang.String getPaymentNumber() {
        return paymentNumber;
    }


    /**
     * Sets the paymentNumber value for this TPayment.
     * 
     * @param paymentNumber   * The check or EFT number associated with the payment
     */
    public void setPaymentNumber(java.lang.String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }


    /**
     * Gets the paymentDate value for this TPayment.
     * 
     * @return paymentDate   * The check or EFT payment date associated with the payment
     */
    public java.util.Date getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this TPayment.
     * 
     * @param paymentDate   * The check or EFT payment date associated with the payment
     */
    public void setPaymentDate(java.util.Date paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the paymentAmount value for this TPayment.
     * 
     * @return paymentAmount   * Amount of payment
     */
    public java.lang.Double getPaymentAmount() {
        return paymentAmount;
    }


    /**
     * Sets the paymentAmount value for this TPayment.
     * 
     * @param paymentAmount   * Amount of payment
     */
    public void setPaymentAmount(java.lang.Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    /**
     * Gets the paymentStatus value for this TPayment.
     * 
     * @return paymentStatus   * Status of payment:
     */
    public org.delta.schemas.data.SPaymentStatusType getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this TPayment.
     * 
     * @param paymentStatus   * Status of payment:
     */
    public void setPaymentStatus(org.delta.schemas.data.SPaymentStatusType paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the paymentStatusDate value for this TPayment.
     * 
     * @return paymentStatusDate   * As of date for status: Date paid/cashed or printed/sent.
     */
    public java.util.Date getPaymentStatusDate() {
        return paymentStatusDate;
    }


    /**
     * Sets the paymentStatusDate value for this TPayment.
     * 
     * @param paymentStatusDate   * As of date for status: Date paid/cashed or printed/sent.
     */
    public void setPaymentStatusDate(java.util.Date paymentStatusDate) {
        this.paymentStatusDate = paymentStatusDate;
    }


    /**
     * Gets the accountsPayableCode value for this TPayment.
     * 
     * @return accountsPayableCode   * Accounts payable code associated to the payment
     */
    public java.lang.String getAccountsPayableCode() {
        return accountsPayableCode;
    }


    /**
     * Sets the accountsPayableCode value for this TPayment.
     * 
     * @param accountsPayableCode   * Accounts payable code associated to the payment
     */
    public void setAccountsPayableCode(java.lang.String accountsPayableCode) {
        this.accountsPayableCode = accountsPayableCode;
    }


    /**
     * Gets the taxIdentifer value for this TPayment.
     * 
     * @return taxIdentifer   * Tax number for provider payees
     */
    public java.lang.String getTaxIdentifer() {
        return taxIdentifer;
    }


    /**
     * Sets the taxIdentifer value for this TPayment.
     * 
     * @param taxIdentifer   * Tax number for provider payees
     */
    public void setTaxIdentifer(java.lang.String taxIdentifer) {
        this.taxIdentifer = taxIdentifer;
    }


    /**
     * Gets the payToIndicatorCode value for this TPayment.
     * 
     * @return payToIndicatorCode   * Indicator that denotes the type of payee
     */
    public org.delta.schemas.data.SPayToCode getPayToIndicatorCode() {
        return payToIndicatorCode;
    }


    /**
     * Sets the payToIndicatorCode value for this TPayment.
     * 
     * @param payToIndicatorCode   * Indicator that denotes the type of payee
     */
    public void setPayToIndicatorCode(org.delta.schemas.data.SPayToCode payToIndicatorCode) {
        this.payToIndicatorCode = payToIndicatorCode;
    }


    /**
     * Gets the paymentType value for this TPayment.
     * 
     * @return paymentType
     */
    public org.delta.schemas.data.SPaymentType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this TPayment.
     * 
     * @param paymentType
     */
    public void setPaymentType(org.delta.schemas.data.SPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPayment)) return false;
        TPayment other = (TPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentNumber==null && other.getPaymentNumber()==null) || 
             (this.paymentNumber!=null &&
              this.paymentNumber.equals(other.getPaymentNumber()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.paymentAmount==null && other.getPaymentAmount()==null) || 
             (this.paymentAmount!=null &&
              this.paymentAmount.equals(other.getPaymentAmount()))) &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.paymentStatusDate==null && other.getPaymentStatusDate()==null) || 
             (this.paymentStatusDate!=null &&
              this.paymentStatusDate.equals(other.getPaymentStatusDate()))) &&
            ((this.accountsPayableCode==null && other.getAccountsPayableCode()==null) || 
             (this.accountsPayableCode!=null &&
              this.accountsPayableCode.equals(other.getAccountsPayableCode()))) &&
            ((this.taxIdentifer==null && other.getTaxIdentifer()==null) || 
             (this.taxIdentifer!=null &&
              this.taxIdentifer.equals(other.getTaxIdentifer()))) &&
            ((this.payToIndicatorCode==null && other.getPayToIndicatorCode()==null) || 
             (this.payToIndicatorCode!=null &&
              this.payToIndicatorCode.equals(other.getPayToIndicatorCode()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType())));
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
        if (getPaymentNumber() != null) {
            _hashCode += getPaymentNumber().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getPaymentAmount() != null) {
            _hashCode += getPaymentAmount().hashCode();
        }
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getPaymentStatusDate() != null) {
            _hashCode += getPaymentStatusDate().hashCode();
        }
        if (getAccountsPayableCode() != null) {
            _hashCode += getAccountsPayableCode().hashCode();
        }
        if (getTaxIdentifer() != null) {
            _hashCode += getTaxIdentifer().hashCode();
        }
        if (getPayToIndicatorCode() != null) {
            _hashCode += getPayToIndicatorCode().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tPayment"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("paymentType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sPaymentType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "paymentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "paymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "paymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "paymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sPaymentStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "paymentStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountsPayableCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "AccountsPayableCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdentifer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "taxIdentifer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payToIndicatorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "payToIndicatorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sPayToCode"));
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
