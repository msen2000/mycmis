/**
 * TSummaryPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a claim payment object (whole claim)
 */
public class TSummaryPayment  implements java.io.Serializable {
    /* The total amount paid for the claim */
    private double deltaPaidAmount;

    /* The total amount the patient paid for the claim */
    private double patientPaidAmount;

    /* Total Submitted Amount */
    private java.lang.Double totalSubmittedAmount;

    /* Total Approved Amount */
    private java.lang.Double totalApprovedAmount;

    /* Derived summary total to support claims faxBack */
    private java.lang.Double totalOtherInsuranceCarrierPaidAmount;

    public TSummaryPayment() {
    }

    public TSummaryPayment(
           double deltaPaidAmount,
           double patientPaidAmount,
           java.lang.Double totalSubmittedAmount,
           java.lang.Double totalApprovedAmount,
           java.lang.Double totalOtherInsuranceCarrierPaidAmount) {
           this.deltaPaidAmount = deltaPaidAmount;
           this.patientPaidAmount = patientPaidAmount;
           this.totalSubmittedAmount = totalSubmittedAmount;
           this.totalApprovedAmount = totalApprovedAmount;
           this.totalOtherInsuranceCarrierPaidAmount = totalOtherInsuranceCarrierPaidAmount;
    }


    /**
     * Gets the deltaPaidAmount value for this TSummaryPayment.
     * 
     * @return deltaPaidAmount   * The total amount paid for the claim
     */
    public double getDeltaPaidAmount() {
        return deltaPaidAmount;
    }


    /**
     * Sets the deltaPaidAmount value for this TSummaryPayment.
     * 
     * @param deltaPaidAmount   * The total amount paid for the claim
     */
    public void setDeltaPaidAmount(double deltaPaidAmount) {
        this.deltaPaidAmount = deltaPaidAmount;
    }


    /**
     * Gets the patientPaidAmount value for this TSummaryPayment.
     * 
     * @return patientPaidAmount   * The total amount the patient paid for the claim
     */
    public double getPatientPaidAmount() {
        return patientPaidAmount;
    }


    /**
     * Sets the patientPaidAmount value for this TSummaryPayment.
     * 
     * @param patientPaidAmount   * The total amount the patient paid for the claim
     */
    public void setPatientPaidAmount(double patientPaidAmount) {
        this.patientPaidAmount = patientPaidAmount;
    }


    /**
     * Gets the totalSubmittedAmount value for this TSummaryPayment.
     * 
     * @return totalSubmittedAmount   * Total Submitted Amount
     */
    public java.lang.Double getTotalSubmittedAmount() {
        return totalSubmittedAmount;
    }


    /**
     * Sets the totalSubmittedAmount value for this TSummaryPayment.
     * 
     * @param totalSubmittedAmount   * Total Submitted Amount
     */
    public void setTotalSubmittedAmount(java.lang.Double totalSubmittedAmount) {
        this.totalSubmittedAmount = totalSubmittedAmount;
    }


    /**
     * Gets the totalApprovedAmount value for this TSummaryPayment.
     * 
     * @return totalApprovedAmount   * Total Approved Amount
     */
    public java.lang.Double getTotalApprovedAmount() {
        return totalApprovedAmount;
    }


    /**
     * Sets the totalApprovedAmount value for this TSummaryPayment.
     * 
     * @param totalApprovedAmount   * Total Approved Amount
     */
    public void setTotalApprovedAmount(java.lang.Double totalApprovedAmount) {
        this.totalApprovedAmount = totalApprovedAmount;
    }


    /**
     * Gets the totalOtherInsuranceCarrierPaidAmount value for this TSummaryPayment.
     * 
     * @return totalOtherInsuranceCarrierPaidAmount   * Derived summary total to support claims faxBack
     */
    public java.lang.Double getTotalOtherInsuranceCarrierPaidAmount() {
        return totalOtherInsuranceCarrierPaidAmount;
    }


    /**
     * Sets the totalOtherInsuranceCarrierPaidAmount value for this TSummaryPayment.
     * 
     * @param totalOtherInsuranceCarrierPaidAmount   * Derived summary total to support claims faxBack
     */
    public void setTotalOtherInsuranceCarrierPaidAmount(java.lang.Double totalOtherInsuranceCarrierPaidAmount) {
        this.totalOtherInsuranceCarrierPaidAmount = totalOtherInsuranceCarrierPaidAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSummaryPayment)) return false;
        TSummaryPayment other = (TSummaryPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deltaPaidAmount == other.getDeltaPaidAmount() &&
            this.patientPaidAmount == other.getPatientPaidAmount() &&
            ((this.totalSubmittedAmount==null && other.getTotalSubmittedAmount()==null) || 
             (this.totalSubmittedAmount!=null &&
              this.totalSubmittedAmount.equals(other.getTotalSubmittedAmount()))) &&
            ((this.totalApprovedAmount==null && other.getTotalApprovedAmount()==null) || 
             (this.totalApprovedAmount!=null &&
              this.totalApprovedAmount.equals(other.getTotalApprovedAmount()))) &&
            ((this.totalOtherInsuranceCarrierPaidAmount==null && other.getTotalOtherInsuranceCarrierPaidAmount()==null) || 
             (this.totalOtherInsuranceCarrierPaidAmount!=null &&
              this.totalOtherInsuranceCarrierPaidAmount.equals(other.getTotalOtherInsuranceCarrierPaidAmount())));
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
        _hashCode += new Double(getDeltaPaidAmount()).hashCode();
        _hashCode += new Double(getPatientPaidAmount()).hashCode();
        if (getTotalSubmittedAmount() != null) {
            _hashCode += getTotalSubmittedAmount().hashCode();
        }
        if (getTotalApprovedAmount() != null) {
            _hashCode += getTotalApprovedAmount().hashCode();
        }
        if (getTotalOtherInsuranceCarrierPaidAmount() != null) {
            _hashCode += getTotalOtherInsuranceCarrierPaidAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TSummaryPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tSummaryPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaPaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "deltaPaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientPaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "patientPaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSubmittedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "totalSubmittedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalApprovedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "totalApprovedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalOtherInsuranceCarrierPaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "totalOtherInsuranceCarrierPaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
