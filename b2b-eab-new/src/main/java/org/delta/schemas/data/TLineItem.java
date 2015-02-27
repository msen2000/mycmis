/**
 * TLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a line item payment
 */
public class TLineItem  implements java.io.Serializable {
    /* The ToothCode associated with the lineItem on the Claim */
    private java.lang.String toothCode;

    /* Tooth Surface Codese */
    private org.delta.schemas.data.SToothSurfaceCodeType[] toothSurfaceCodes;

    /* The procedure code that was performed on this individual lineItem */
    private java.lang.String procedureCode;

    /* The procedure code name on this individual lineItem */
    private java.lang.String procedureCodeName;

    /* The submitted amount associated with the line item */
    private double submittedAmount;

    /* The Delta Dental paid amount associated with the line item */
    private double deltaPaidAmount;

    /* The Delta Dental paid percentage amount associated with the
     * line item */
    private java.lang.Double deltaPercentageAmount;

    /* The Patient payment amount associated with the line item */
    private double patientPaidPayment;

    /* The prime Payment amount associated with the line item */
    private double primePaidAmount;

    /* The deductable amount associated with the line item */
    private double deductible;

    /* The Delta Dental approved amount associated with the line item */
    private java.lang.Double approvedAmount;

    /* The Delta Dental approved amount associated with the line item */
    private double allowedAmount;

    /* The co-payment amount associated with the line item */
    private double patientCopayPercentage;

    /* The co payment amount associated with the line item */
    private double patientCopayAmount;

    /* The date the procedure (line item) was performed */
    private java.util.Date dateOfService;

    /* The date the line item was adjudicated */
    private java.util.Date processingDate;

    /* Explanation Codes */
    private org.delta.schemas.data.TExCode[] explanationCodes;

    /* The service line status indicator */
    private java.lang.Object serviceLineStatusIndicator;

    /* Servicing Provider Identifier */
    private java.lang.String servicingProviderIdentifier;

    /* Other Insurance Paid Amount */
    private java.lang.Double otherInsurancePaidAmount;

    /* The payment associated with the lineItem. The full payment
     * is referenced in the check payment */
    private org.delta.schemas.data.TPayment payment;

    /* Sequence Number */
    private java.lang.String sequenceNumber;

    /* Servicing Provider First Name */
    private java.lang.String servicingProviderFirstName;

    /* Servicing Provider Last Name */
    private java.lang.String servicingProviderLastName;

    public TLineItem() {
    }

    public TLineItem(
           java.lang.String toothCode,
           org.delta.schemas.data.SToothSurfaceCodeType[] toothSurfaceCodes,
           java.lang.String procedureCode,
           java.lang.String procedureCodeName,
           double submittedAmount,
           double deltaPaidAmount,
           java.lang.Double deltaPercentageAmount,
           double patientPaidPayment,
           double primePaidAmount,
           double deductible,
           java.lang.Double approvedAmount,
           double allowedAmount,
           double patientCopayPercentage,
           double patientCopayAmount,
           java.util.Date dateOfService,
           java.util.Date processingDate,
           org.delta.schemas.data.TExCode[] explanationCodes,
           java.lang.Object serviceLineStatusIndicator,
           java.lang.String servicingProviderIdentifier,
           java.lang.Double otherInsurancePaidAmount,
           org.delta.schemas.data.TPayment payment,
           java.lang.String sequenceNumber,
           java.lang.String servicingProviderFirstName,
           java.lang.String servicingProviderLastName) {
           this.toothCode = toothCode;
           this.toothSurfaceCodes = toothSurfaceCodes;
           this.procedureCode = procedureCode;
           this.procedureCodeName = procedureCodeName;
           this.submittedAmount = submittedAmount;
           this.deltaPaidAmount = deltaPaidAmount;
           this.deltaPercentageAmount = deltaPercentageAmount;
           this.patientPaidPayment = patientPaidPayment;
           this.primePaidAmount = primePaidAmount;
           this.deductible = deductible;
           this.approvedAmount = approvedAmount;
           this.allowedAmount = allowedAmount;
           this.patientCopayPercentage = patientCopayPercentage;
           this.patientCopayAmount = patientCopayAmount;
           this.dateOfService = dateOfService;
           this.processingDate = processingDate;
           this.explanationCodes = explanationCodes;
           this.serviceLineStatusIndicator = serviceLineStatusIndicator;
           this.servicingProviderIdentifier = servicingProviderIdentifier;
           this.otherInsurancePaidAmount = otherInsurancePaidAmount;
           this.payment = payment;
           this.sequenceNumber = sequenceNumber;
           this.servicingProviderFirstName = servicingProviderFirstName;
           this.servicingProviderLastName = servicingProviderLastName;
    }


    /**
     * Gets the toothCode value for this TLineItem.
     * 
     * @return toothCode   * The ToothCode associated with the lineItem on the Claim
     */
    public java.lang.String getToothCode() {
        return toothCode;
    }


    /**
     * Sets the toothCode value for this TLineItem.
     * 
     * @param toothCode   * The ToothCode associated with the lineItem on the Claim
     */
    public void setToothCode(java.lang.String toothCode) {
        this.toothCode = toothCode;
    }


    /**
     * Gets the toothSurfaceCodes value for this TLineItem.
     * 
     * @return toothSurfaceCodes   * Tooth Surface Codese
     */
    public org.delta.schemas.data.SToothSurfaceCodeType[] getToothSurfaceCodes() {
        return toothSurfaceCodes;
    }


    /**
     * Sets the toothSurfaceCodes value for this TLineItem.
     * 
     * @param toothSurfaceCodes   * Tooth Surface Codese
     */
    public void setToothSurfaceCodes(org.delta.schemas.data.SToothSurfaceCodeType[] toothSurfaceCodes) {
        this.toothSurfaceCodes = toothSurfaceCodes;
    }

    public org.delta.schemas.data.SToothSurfaceCodeType getToothSurfaceCodes(int i) {
        return this.toothSurfaceCodes[i];
    }

    public void setToothSurfaceCodes(int i, org.delta.schemas.data.SToothSurfaceCodeType _value) {
        this.toothSurfaceCodes[i] = _value;
    }


    /**
     * Gets the procedureCode value for this TLineItem.
     * 
     * @return procedureCode   * The procedure code that was performed on this individual lineItem
     */
    public java.lang.String getProcedureCode() {
        return procedureCode;
    }


    /**
     * Sets the procedureCode value for this TLineItem.
     * 
     * @param procedureCode   * The procedure code that was performed on this individual lineItem
     */
    public void setProcedureCode(java.lang.String procedureCode) {
        this.procedureCode = procedureCode;
    }


    /**
     * Gets the procedureCodeName value for this TLineItem.
     * 
     * @return procedureCodeName   * The procedure code name on this individual lineItem
     */
    public java.lang.String getProcedureCodeName() {
        return procedureCodeName;
    }


    /**
     * Sets the procedureCodeName value for this TLineItem.
     * 
     * @param procedureCodeName   * The procedure code name on this individual lineItem
     */
    public void setProcedureCodeName(java.lang.String procedureCodeName) {
        this.procedureCodeName = procedureCodeName;
    }


    /**
     * Gets the submittedAmount value for this TLineItem.
     * 
     * @return submittedAmount   * The submitted amount associated with the line item
     */
    public double getSubmittedAmount() {
        return submittedAmount;
    }


    /**
     * Sets the submittedAmount value for this TLineItem.
     * 
     * @param submittedAmount   * The submitted amount associated with the line item
     */
    public void setSubmittedAmount(double submittedAmount) {
        this.submittedAmount = submittedAmount;
    }


    /**
     * Gets the deltaPaidAmount value for this TLineItem.
     * 
     * @return deltaPaidAmount   * The Delta Dental paid amount associated with the line item
     */
    public double getDeltaPaidAmount() {
        return deltaPaidAmount;
    }


    /**
     * Sets the deltaPaidAmount value for this TLineItem.
     * 
     * @param deltaPaidAmount   * The Delta Dental paid amount associated with the line item
     */
    public void setDeltaPaidAmount(double deltaPaidAmount) {
        this.deltaPaidAmount = deltaPaidAmount;
    }


    /**
     * Gets the deltaPercentageAmount value for this TLineItem.
     * 
     * @return deltaPercentageAmount   * The Delta Dental paid percentage amount associated with the
     * line item
     */
    public java.lang.Double getDeltaPercentageAmount() {
        return deltaPercentageAmount;
    }


    /**
     * Sets the deltaPercentageAmount value for this TLineItem.
     * 
     * @param deltaPercentageAmount   * The Delta Dental paid percentage amount associated with the
     * line item
     */
    public void setDeltaPercentageAmount(java.lang.Double deltaPercentageAmount) {
        this.deltaPercentageAmount = deltaPercentageAmount;
    }


    /**
     * Gets the patientPaidPayment value for this TLineItem.
     * 
     * @return patientPaidPayment   * The Patient payment amount associated with the line item
     */
    public double getPatientPaidPayment() {
        return patientPaidPayment;
    }


    /**
     * Sets the patientPaidPayment value for this TLineItem.
     * 
     * @param patientPaidPayment   * The Patient payment amount associated with the line item
     */
    public void setPatientPaidPayment(double patientPaidPayment) {
        this.patientPaidPayment = patientPaidPayment;
    }


    /**
     * Gets the primePaidAmount value for this TLineItem.
     * 
     * @return primePaidAmount   * The prime Payment amount associated with the line item
     */
    public double getPrimePaidAmount() {
        return primePaidAmount;
    }


    /**
     * Sets the primePaidAmount value for this TLineItem.
     * 
     * @param primePaidAmount   * The prime Payment amount associated with the line item
     */
    public void setPrimePaidAmount(double primePaidAmount) {
        this.primePaidAmount = primePaidAmount;
    }


    /**
     * Gets the deductible value for this TLineItem.
     * 
     * @return deductible   * The deductable amount associated with the line item
     */
    public double getDeductible() {
        return deductible;
    }


    /**
     * Sets the deductible value for this TLineItem.
     * 
     * @param deductible   * The deductable amount associated with the line item
     */
    public void setDeductible(double deductible) {
        this.deductible = deductible;
    }


    /**
     * Gets the approvedAmount value for this TLineItem.
     * 
     * @return approvedAmount   * The Delta Dental approved amount associated with the line item
     */
    public java.lang.Double getApprovedAmount() {
        return approvedAmount;
    }


    /**
     * Sets the approvedAmount value for this TLineItem.
     * 
     * @param approvedAmount   * The Delta Dental approved amount associated with the line item
     */
    public void setApprovedAmount(java.lang.Double approvedAmount) {
        this.approvedAmount = approvedAmount;
    }


    /**
     * Gets the allowedAmount value for this TLineItem.
     * 
     * @return allowedAmount   * The Delta Dental approved amount associated with the line item
     */
    public double getAllowedAmount() {
        return allowedAmount;
    }


    /**
     * Sets the allowedAmount value for this TLineItem.
     * 
     * @param allowedAmount   * The Delta Dental approved amount associated with the line item
     */
    public void setAllowedAmount(double allowedAmount) {
        this.allowedAmount = allowedAmount;
    }


    /**
     * Gets the patientCopayPercentage value for this TLineItem.
     * 
     * @return patientCopayPercentage   * The co-payment amount associated with the line item
     */
    public double getPatientCopayPercentage() {
        return patientCopayPercentage;
    }


    /**
     * Sets the patientCopayPercentage value for this TLineItem.
     * 
     * @param patientCopayPercentage   * The co-payment amount associated with the line item
     */
    public void setPatientCopayPercentage(double patientCopayPercentage) {
        this.patientCopayPercentage = patientCopayPercentage;
    }


    /**
     * Gets the patientCopayAmount value for this TLineItem.
     * 
     * @return patientCopayAmount   * The co payment amount associated with the line item
     */
    public double getPatientCopayAmount() {
        return patientCopayAmount;
    }


    /**
     * Sets the patientCopayAmount value for this TLineItem.
     * 
     * @param patientCopayAmount   * The co payment amount associated with the line item
     */
    public void setPatientCopayAmount(double patientCopayAmount) {
        this.patientCopayAmount = patientCopayAmount;
    }


    /**
     * Gets the dateOfService value for this TLineItem.
     * 
     * @return dateOfService   * The date the procedure (line item) was performed
     */
    public java.util.Date getDateOfService() {
        return dateOfService;
    }


    /**
     * Sets the dateOfService value for this TLineItem.
     * 
     * @param dateOfService   * The date the procedure (line item) was performed
     */
    public void setDateOfService(java.util.Date dateOfService) {
        this.dateOfService = dateOfService;
    }


    /**
     * Gets the processingDate value for this TLineItem.
     * 
     * @return processingDate   * The date the line item was adjudicated
     */
    public java.util.Date getProcessingDate() {
        return processingDate;
    }


    /**
     * Sets the processingDate value for this TLineItem.
     * 
     * @param processingDate   * The date the line item was adjudicated
     */
    public void setProcessingDate(java.util.Date processingDate) {
        this.processingDate = processingDate;
    }


    /**
     * Gets the explanationCodes value for this TLineItem.
     * 
     * @return explanationCodes   * Explanation Codes
     */
    public org.delta.schemas.data.TExCode[] getExplanationCodes() {
        return explanationCodes;
    }


    /**
     * Sets the explanationCodes value for this TLineItem.
     * 
     * @param explanationCodes   * Explanation Codes
     */
    public void setExplanationCodes(org.delta.schemas.data.TExCode[] explanationCodes) {
        this.explanationCodes = explanationCodes;
    }

    public org.delta.schemas.data.TExCode getExplanationCodes(int i) {
        return this.explanationCodes[i];
    }

    public void setExplanationCodes(int i, org.delta.schemas.data.TExCode _value) {
        this.explanationCodes[i] = _value;
    }


    /**
     * Gets the serviceLineStatusIndicator value for this TLineItem.
     * 
     * @return serviceLineStatusIndicator   * The service line status indicator
     */
    public java.lang.Object getServiceLineStatusIndicator() {
        return serviceLineStatusIndicator;
    }


    /**
     * Sets the serviceLineStatusIndicator value for this TLineItem.
     * 
     * @param serviceLineStatusIndicator   * The service line status indicator
     */
    public void setServiceLineStatusIndicator(java.lang.Object serviceLineStatusIndicator) {
        this.serviceLineStatusIndicator = serviceLineStatusIndicator;
    }


    /**
     * Gets the servicingProviderIdentifier value for this TLineItem.
     * 
     * @return servicingProviderIdentifier   * Servicing Provider Identifier
     */
    public java.lang.String getServicingProviderIdentifier() {
        return servicingProviderIdentifier;
    }


    /**
     * Sets the servicingProviderIdentifier value for this TLineItem.
     * 
     * @param servicingProviderIdentifier   * Servicing Provider Identifier
     */
    public void setServicingProviderIdentifier(java.lang.String servicingProviderIdentifier) {
        this.servicingProviderIdentifier = servicingProviderIdentifier;
    }


    /**
     * Gets the otherInsurancePaidAmount value for this TLineItem.
     * 
     * @return otherInsurancePaidAmount   * Other Insurance Paid Amount
     */
    public java.lang.Double getOtherInsurancePaidAmount() {
        return otherInsurancePaidAmount;
    }


    /**
     * Sets the otherInsurancePaidAmount value for this TLineItem.
     * 
     * @param otherInsurancePaidAmount   * Other Insurance Paid Amount
     */
    public void setOtherInsurancePaidAmount(java.lang.Double otherInsurancePaidAmount) {
        this.otherInsurancePaidAmount = otherInsurancePaidAmount;
    }


    /**
     * Gets the payment value for this TLineItem.
     * 
     * @return payment   * The payment associated with the lineItem. The full payment
     * is referenced in the check payment
     */
    public org.delta.schemas.data.TPayment getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this TLineItem.
     * 
     * @param payment   * The payment associated with the lineItem. The full payment
     * is referenced in the check payment
     */
    public void setPayment(org.delta.schemas.data.TPayment payment) {
        this.payment = payment;
    }


    /**
     * Gets the sequenceNumber value for this TLineItem.
     * 
     * @return sequenceNumber   * Sequence Number
     */
    public java.lang.String getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this TLineItem.
     * 
     * @param sequenceNumber   * Sequence Number
     */
    public void setSequenceNumber(java.lang.String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the servicingProviderFirstName value for this TLineItem.
     * 
     * @return servicingProviderFirstName   * Servicing Provider First Name
     */
    public java.lang.String getServicingProviderFirstName() {
        return servicingProviderFirstName;
    }


    /**
     * Sets the servicingProviderFirstName value for this TLineItem.
     * 
     * @param servicingProviderFirstName   * Servicing Provider First Name
     */
    public void setServicingProviderFirstName(java.lang.String servicingProviderFirstName) {
        this.servicingProviderFirstName = servicingProviderFirstName;
    }


    /**
     * Gets the servicingProviderLastName value for this TLineItem.
     * 
     * @return servicingProviderLastName   * Servicing Provider Last Name
     */
    public java.lang.String getServicingProviderLastName() {
        return servicingProviderLastName;
    }


    /**
     * Sets the servicingProviderLastName value for this TLineItem.
     * 
     * @param servicingProviderLastName   * Servicing Provider Last Name
     */
    public void setServicingProviderLastName(java.lang.String servicingProviderLastName) {
        this.servicingProviderLastName = servicingProviderLastName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TLineItem)) return false;
        TLineItem other = (TLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.toothCode==null && other.getToothCode()==null) || 
             (this.toothCode!=null &&
              this.toothCode.equals(other.getToothCode()))) &&
            ((this.toothSurfaceCodes==null && other.getToothSurfaceCodes()==null) || 
             (this.toothSurfaceCodes!=null &&
              java.util.Arrays.equals(this.toothSurfaceCodes, other.getToothSurfaceCodes()))) &&
            ((this.procedureCode==null && other.getProcedureCode()==null) || 
             (this.procedureCode!=null &&
              this.procedureCode.equals(other.getProcedureCode()))) &&
            ((this.procedureCodeName==null && other.getProcedureCodeName()==null) || 
             (this.procedureCodeName!=null &&
              this.procedureCodeName.equals(other.getProcedureCodeName()))) &&
            this.submittedAmount == other.getSubmittedAmount() &&
            this.deltaPaidAmount == other.getDeltaPaidAmount() &&
            ((this.deltaPercentageAmount==null && other.getDeltaPercentageAmount()==null) || 
             (this.deltaPercentageAmount!=null &&
              this.deltaPercentageAmount.equals(other.getDeltaPercentageAmount()))) &&
            this.patientPaidPayment == other.getPatientPaidPayment() &&
            this.primePaidAmount == other.getPrimePaidAmount() &&
            this.deductible == other.getDeductible() &&
            ((this.approvedAmount==null && other.getApprovedAmount()==null) || 
             (this.approvedAmount!=null &&
              this.approvedAmount.equals(other.getApprovedAmount()))) &&
            this.allowedAmount == other.getAllowedAmount() &&
            this.patientCopayPercentage == other.getPatientCopayPercentage() &&
            this.patientCopayAmount == other.getPatientCopayAmount() &&
            ((this.dateOfService==null && other.getDateOfService()==null) || 
             (this.dateOfService!=null &&
              this.dateOfService.equals(other.getDateOfService()))) &&
            ((this.processingDate==null && other.getProcessingDate()==null) || 
             (this.processingDate!=null &&
              this.processingDate.equals(other.getProcessingDate()))) &&
            ((this.explanationCodes==null && other.getExplanationCodes()==null) || 
             (this.explanationCodes!=null &&
              java.util.Arrays.equals(this.explanationCodes, other.getExplanationCodes()))) &&
            ((this.serviceLineStatusIndicator==null && other.getServiceLineStatusIndicator()==null) || 
             (this.serviceLineStatusIndicator!=null &&
              this.serviceLineStatusIndicator.equals(other.getServiceLineStatusIndicator()))) &&
            ((this.servicingProviderIdentifier==null && other.getServicingProviderIdentifier()==null) || 
             (this.servicingProviderIdentifier!=null &&
              this.servicingProviderIdentifier.equals(other.getServicingProviderIdentifier()))) &&
            ((this.otherInsurancePaidAmount==null && other.getOtherInsurancePaidAmount()==null) || 
             (this.otherInsurancePaidAmount!=null &&
              this.otherInsurancePaidAmount.equals(other.getOtherInsurancePaidAmount()))) &&
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.servicingProviderFirstName==null && other.getServicingProviderFirstName()==null) || 
             (this.servicingProviderFirstName!=null &&
              this.servicingProviderFirstName.equals(other.getServicingProviderFirstName()))) &&
            ((this.servicingProviderLastName==null && other.getServicingProviderLastName()==null) || 
             (this.servicingProviderLastName!=null &&
              this.servicingProviderLastName.equals(other.getServicingProviderLastName())));
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
        if (getToothCode() != null) {
            _hashCode += getToothCode().hashCode();
        }
        if (getToothSurfaceCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToothSurfaceCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToothSurfaceCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcedureCode() != null) {
            _hashCode += getProcedureCode().hashCode();
        }
        if (getProcedureCodeName() != null) {
            _hashCode += getProcedureCodeName().hashCode();
        }
        _hashCode += new Double(getSubmittedAmount()).hashCode();
        _hashCode += new Double(getDeltaPaidAmount()).hashCode();
        if (getDeltaPercentageAmount() != null) {
            _hashCode += getDeltaPercentageAmount().hashCode();
        }
        _hashCode += new Double(getPatientPaidPayment()).hashCode();
        _hashCode += new Double(getPrimePaidAmount()).hashCode();
        _hashCode += new Double(getDeductible()).hashCode();
        if (getApprovedAmount() != null) {
            _hashCode += getApprovedAmount().hashCode();
        }
        _hashCode += new Double(getAllowedAmount()).hashCode();
        _hashCode += new Double(getPatientCopayPercentage()).hashCode();
        _hashCode += new Double(getPatientCopayAmount()).hashCode();
        if (getDateOfService() != null) {
            _hashCode += getDateOfService().hashCode();
        }
        if (getProcessingDate() != null) {
            _hashCode += getProcessingDate().hashCode();
        }
        if (getExplanationCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExplanationCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExplanationCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceLineStatusIndicator() != null) {
            _hashCode += getServiceLineStatusIndicator().hashCode();
        }
        if (getServicingProviderIdentifier() != null) {
            _hashCode += getServicingProviderIdentifier().hashCode();
        }
        if (getOtherInsurancePaidAmount() != null) {
            _hashCode += getOtherInsurancePaidAmount().hashCode();
        }
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getServicingProviderFirstName() != null) {
            _hashCode += getServicingProviderFirstName().hashCode();
        }
        if (getServicingProviderLastName() != null) {
            _hashCode += getServicingProviderLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toothCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "toothCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toothSurfaceCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "toothSurfaceCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sToothSurfaceCodeType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "procedureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedureCodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "procedureCodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "submittedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaPaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "deltaPaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaPercentageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "deltaPercentageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientPaidPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "patientPaidPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primePaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "primePaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "deductible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "approvedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "allowedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientCopayPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "patientCopayPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patientCopayAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "patientCopayAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "dateOfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "processingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explanationCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "explanationCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tExCode"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLineStatusIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "serviceLineStatusIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicingProviderIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "servicingProviderIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherInsurancePaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "otherInsurancePaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicingProviderFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "servicingProviderFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicingProviderLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "servicingProviderLastName"));
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
