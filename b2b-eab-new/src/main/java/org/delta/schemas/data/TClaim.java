/**
 * TClaim.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The definition of a claim object
 */
public class TClaim  implements java.io.Serializable {
    /* A unique claim identifier */
    private java.lang.String claimIdentifier;

    /* The Claim Case Number used for CPP only */
    private java.lang.String claimCaseNumber;

    /* The date the claim was received by Sen Den and was entered
     * into the claims processor. */
    private java.util.Calendar claimReceivedTime;

    /* Claim From Date */
    private java.util.Date claimFromDate;

    /* Claim To Date */
    private java.util.Date claimToDate;

    /* Contract Identifier */
    private java.lang.String contractIdentifier;

    /* Product Identifier */
    private java.lang.String productIdentifier;

    /* Claim Source */
    private java.lang.String claimSource;

    /* Claim Network Indicator */
    private java.lang.String claimNetworkIndicator;

    /* Enrollee Id */
    private java.lang.String enrolleeId;

    /* Primary First Name */
    private java.lang.String primaryFirstName;

    /* Primary Last Name */
    private java.lang.String primaryLastName;

    /* Primary Person Id */
    private java.lang.String primaryPersonId;

    /* Claim Predetermination Flage */
    private org.sen.schemas.data.SClaimPredeterminationFlag claimPredeterminationFlag;

    /* Group Name */
    private java.lang.String groupName;

    /* Group Number */
    private java.lang.String groupNumber;

    /* Division Name */
    private java.lang.String divisionName;

    /* Division Number */
    private java.lang.String divisionNumber;

    /* Division Self Funded */
    private boolean divisionSelfFunded;

    private org.sen.schemas.data.TClaimClaimStatus claimStatus;

    /* The summary payment gives high  level information about the
     * whole claim. */
    private org.sen.schemas.data.TSummaryPayment summaryPayment;

    /* The patient that is one the claim */
    private org.sen.schemas.data.TClaimPatient patient;

    /* The provider that submitted the claim */
    private org.sen.schemas.data.TClaimBillingProvider billingProvider;

    /* A detailed list of all individual line items on the Claim.
     * Each line item is associated with a procedure and a tooth code as
     * well as lineItem payment information. */
    private org.sen.schemas.data.TLineItem[] claimServiceLines;

    /* Claim Business Levels */
    private org.sen.schemas.data.TBusinessUnit claimBusinessLevels;

    private org.sen.schemas.data.SClaimType claimType;  // attribute

    public TClaim() {
    }

    public TClaim(
           java.lang.String claimIdentifier,
           java.lang.String claimCaseNumber,
           java.util.Calendar claimReceivedTime,
           java.util.Date claimFromDate,
           java.util.Date claimToDate,
           java.lang.String contractIdentifier,
           java.lang.String productIdentifier,
           java.lang.String claimSource,
           java.lang.String claimNetworkIndicator,
           java.lang.String enrolleeId,
           java.lang.String primaryFirstName,
           java.lang.String primaryLastName,
           java.lang.String primaryPersonId,
           org.sen.schemas.data.SClaimPredeterminationFlag claimPredeterminationFlag,
           java.lang.String groupName,
           java.lang.String groupNumber,
           java.lang.String divisionName,
           java.lang.String divisionNumber,
           boolean divisionSelfFunded,
           org.sen.schemas.data.TClaimClaimStatus claimStatus,
           org.sen.schemas.data.TSummaryPayment summaryPayment,
           org.sen.schemas.data.TClaimPatient patient,
           org.sen.schemas.data.TClaimBillingProvider billingProvider,
           org.sen.schemas.data.TLineItem[] claimServiceLines,
           org.sen.schemas.data.TBusinessUnit claimBusinessLevels,
           org.sen.schemas.data.SClaimType claimType) {
           this.claimIdentifier = claimIdentifier;
           this.claimCaseNumber = claimCaseNumber;
           this.claimReceivedTime = claimReceivedTime;
           this.claimFromDate = claimFromDate;
           this.claimToDate = claimToDate;
           this.contractIdentifier = contractIdentifier;
           this.productIdentifier = productIdentifier;
           this.claimSource = claimSource;
           this.claimNetworkIndicator = claimNetworkIndicator;
           this.enrolleeId = enrolleeId;
           this.primaryFirstName = primaryFirstName;
           this.primaryLastName = primaryLastName;
           this.primaryPersonId = primaryPersonId;
           this.claimPredeterminationFlag = claimPredeterminationFlag;
           this.groupName = groupName;
           this.groupNumber = groupNumber;
           this.divisionName = divisionName;
           this.divisionNumber = divisionNumber;
           this.divisionSelfFunded = divisionSelfFunded;
           this.claimStatus = claimStatus;
           this.summaryPayment = summaryPayment;
           this.patient = patient;
           this.billingProvider = billingProvider;
           this.claimServiceLines = claimServiceLines;
           this.claimBusinessLevels = claimBusinessLevels;
           this.claimType = claimType;
    }


    /**
     * Gets the claimIdentifier value for this TClaim.
     * 
     * @return claimIdentifier   * A unique claim identifier
     */
    public java.lang.String getClaimIdentifier() {
        return claimIdentifier;
    }


    /**
     * Sets the claimIdentifier value for this TClaim.
     * 
     * @param claimIdentifier   * A unique claim identifier
     */
    public void setClaimIdentifier(java.lang.String claimIdentifier) {
        this.claimIdentifier = claimIdentifier;
    }


    /**
     * Gets the claimCaseNumber value for this TClaim.
     * 
     * @return claimCaseNumber   * The Claim Case Number used for CPP only
     */
    public java.lang.String getClaimCaseNumber() {
        return claimCaseNumber;
    }


    /**
     * Sets the claimCaseNumber value for this TClaim.
     * 
     * @param claimCaseNumber   * The Claim Case Number used for CPP only
     */
    public void setClaimCaseNumber(java.lang.String claimCaseNumber) {
        this.claimCaseNumber = claimCaseNumber;
    }


    /**
     * Gets the claimReceivedTime value for this TClaim.
     * 
     * @return claimReceivedTime   * The date the claim was received by Sen Den and was entered
     * into the claims processor.
     */
    public java.util.Calendar getClaimReceivedTime() {
        return claimReceivedTime;
    }


    /**
     * Sets the claimReceivedTime value for this TClaim.
     * 
     * @param claimReceivedTime   * The date the claim was received by Sen Den and was entered
     * into the claims processor.
     */
    public void setClaimReceivedTime(java.util.Calendar claimReceivedTime) {
        this.claimReceivedTime = claimReceivedTime;
    }


    /**
     * Gets the claimFromDate value for this TClaim.
     * 
     * @return claimFromDate   * Claim From Date
     */
    public java.util.Date getClaimFromDate() {
        return claimFromDate;
    }


    /**
     * Sets the claimFromDate value for this TClaim.
     * 
     * @param claimFromDate   * Claim From Date
     */
    public void setClaimFromDate(java.util.Date claimFromDate) {
        this.claimFromDate = claimFromDate;
    }


    /**
     * Gets the claimToDate value for this TClaim.
     * 
     * @return claimToDate   * Claim To Date
     */
    public java.util.Date getClaimToDate() {
        return claimToDate;
    }


    /**
     * Sets the claimToDate value for this TClaim.
     * 
     * @param claimToDate   * Claim To Date
     */
    public void setClaimToDate(java.util.Date claimToDate) {
        this.claimToDate = claimToDate;
    }


    /**
     * Gets the contractIdentifier value for this TClaim.
     * 
     * @return contractIdentifier   * Contract Identifier
     */
    public java.lang.String getContractIdentifier() {
        return contractIdentifier;
    }


    /**
     * Sets the contractIdentifier value for this TClaim.
     * 
     * @param contractIdentifier   * Contract Identifier
     */
    public void setContractIdentifier(java.lang.String contractIdentifier) {
        this.contractIdentifier = contractIdentifier;
    }


    /**
     * Gets the productIdentifier value for this TClaim.
     * 
     * @return productIdentifier   * Product Identifier
     */
    public java.lang.String getProductIdentifier() {
        return productIdentifier;
    }


    /**
     * Sets the productIdentifier value for this TClaim.
     * 
     * @param productIdentifier   * Product Identifier
     */
    public void setProductIdentifier(java.lang.String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }


    /**
     * Gets the claimSource value for this TClaim.
     * 
     * @return claimSource   * Claim Source
     */
    public java.lang.String getClaimSource() {
        return claimSource;
    }


    /**
     * Sets the claimSource value for this TClaim.
     * 
     * @param claimSource   * Claim Source
     */
    public void setClaimSource(java.lang.String claimSource) {
        this.claimSource = claimSource;
    }


    /**
     * Gets the claimNetworkIndicator value for this TClaim.
     * 
     * @return claimNetworkIndicator   * Claim Network Indicator
     */
    public java.lang.String getClaimNetworkIndicator() {
        return claimNetworkIndicator;
    }


    /**
     * Sets the claimNetworkIndicator value for this TClaim.
     * 
     * @param claimNetworkIndicator   * Claim Network Indicator
     */
    public void setClaimNetworkIndicator(java.lang.String claimNetworkIndicator) {
        this.claimNetworkIndicator = claimNetworkIndicator;
    }


    /**
     * Gets the enrolleeId value for this TClaim.
     * 
     * @return enrolleeId   * Enrollee Id
     */
    public java.lang.String getEnrolleeId() {
        return enrolleeId;
    }


    /**
     * Sets the enrolleeId value for this TClaim.
     * 
     * @param enrolleeId   * Enrollee Id
     */
    public void setEnrolleeId(java.lang.String enrolleeId) {
        this.enrolleeId = enrolleeId;
    }


    /**
     * Gets the primaryFirstName value for this TClaim.
     * 
     * @return primaryFirstName   * Primary First Name
     */
    public java.lang.String getPrimaryFirstName() {
        return primaryFirstName;
    }


    /**
     * Sets the primaryFirstName value for this TClaim.
     * 
     * @param primaryFirstName   * Primary First Name
     */
    public void setPrimaryFirstName(java.lang.String primaryFirstName) {
        this.primaryFirstName = primaryFirstName;
    }


    /**
     * Gets the primaryLastName value for this TClaim.
     * 
     * @return primaryLastName   * Primary Last Name
     */
    public java.lang.String getPrimaryLastName() {
        return primaryLastName;
    }


    /**
     * Sets the primaryLastName value for this TClaim.
     * 
     * @param primaryLastName   * Primary Last Name
     */
    public void setPrimaryLastName(java.lang.String primaryLastName) {
        this.primaryLastName = primaryLastName;
    }


    /**
     * Gets the primaryPersonId value for this TClaim.
     * 
     * @return primaryPersonId   * Primary Person Id
     */
    public java.lang.String getPrimaryPersonId() {
        return primaryPersonId;
    }


    /**
     * Sets the primaryPersonId value for this TClaim.
     * 
     * @param primaryPersonId   * Primary Person Id
     */
    public void setPrimaryPersonId(java.lang.String primaryPersonId) {
        this.primaryPersonId = primaryPersonId;
    }


    /**
     * Gets the claimPredeterminationFlag value for this TClaim.
     * 
     * @return claimPredeterminationFlag   * Claim Predetermination Flage
     */
    public org.sen.schemas.data.SClaimPredeterminationFlag getClaimPredeterminationFlag() {
        return claimPredeterminationFlag;
    }


    /**
     * Sets the claimPredeterminationFlag value for this TClaim.
     * 
     * @param claimPredeterminationFlag   * Claim Predetermination Flage
     */
    public void setClaimPredeterminationFlag(org.sen.schemas.data.SClaimPredeterminationFlag claimPredeterminationFlag) {
        this.claimPredeterminationFlag = claimPredeterminationFlag;
    }


    /**
     * Gets the groupName value for this TClaim.
     * 
     * @return groupName   * Group Name
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this TClaim.
     * 
     * @param groupName   * Group Name
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the groupNumber value for this TClaim.
     * 
     * @return groupNumber   * Group Number
     */
    public java.lang.String getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this TClaim.
     * 
     * @param groupNumber   * Group Number
     */
    public void setGroupNumber(java.lang.String groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the divisionName value for this TClaim.
     * 
     * @return divisionName   * Division Name
     */
    public java.lang.String getDivisionName() {
        return divisionName;
    }


    /**
     * Sets the divisionName value for this TClaim.
     * 
     * @param divisionName   * Division Name
     */
    public void setDivisionName(java.lang.String divisionName) {
        this.divisionName = divisionName;
    }


    /**
     * Gets the divisionNumber value for this TClaim.
     * 
     * @return divisionNumber   * Division Number
     */
    public java.lang.String getDivisionNumber() {
        return divisionNumber;
    }


    /**
     * Sets the divisionNumber value for this TClaim.
     * 
     * @param divisionNumber   * Division Number
     */
    public void setDivisionNumber(java.lang.String divisionNumber) {
        this.divisionNumber = divisionNumber;
    }


    /**
     * Gets the divisionSelfFunded value for this TClaim.
     * 
     * @return divisionSelfFunded   * Division Self Funded
     */
    public boolean isDivisionSelfFunded() {
        return divisionSelfFunded;
    }


    /**
     * Sets the divisionSelfFunded value for this TClaim.
     * 
     * @param divisionSelfFunded   * Division Self Funded
     */
    public void setDivisionSelfFunded(boolean divisionSelfFunded) {
        this.divisionSelfFunded = divisionSelfFunded;
    }


    /**
     * Gets the claimStatus value for this TClaim.
     * 
     * @return claimStatus
     */
    public org.sen.schemas.data.TClaimClaimStatus getClaimStatus() {
        return claimStatus;
    }


    /**
     * Sets the claimStatus value for this TClaim.
     * 
     * @param claimStatus
     */
    public void setClaimStatus(org.sen.schemas.data.TClaimClaimStatus claimStatus) {
        this.claimStatus = claimStatus;
    }


    /**
     * Gets the summaryPayment value for this TClaim.
     * 
     * @return summaryPayment   * The summary payment gives high  level information about the
     * whole claim.
     */
    public org.sen.schemas.data.TSummaryPayment getSummaryPayment() {
        return summaryPayment;
    }


    /**
     * Sets the summaryPayment value for this TClaim.
     * 
     * @param summaryPayment   * The summary payment gives high  level information about the
     * whole claim.
     */
    public void setSummaryPayment(org.sen.schemas.data.TSummaryPayment summaryPayment) {
        this.summaryPayment = summaryPayment;
    }


    /**
     * Gets the patient value for this TClaim.
     * 
     * @return patient   * The patient that is one the claim
     */
    public org.sen.schemas.data.TClaimPatient getPatient() {
        return patient;
    }


    /**
     * Sets the patient value for this TClaim.
     * 
     * @param patient   * The patient that is one the claim
     */
    public void setPatient(org.sen.schemas.data.TClaimPatient patient) {
        this.patient = patient;
    }


    /**
     * Gets the billingProvider value for this TClaim.
     * 
     * @return billingProvider   * The provider that submitted the claim
     */
    public org.sen.schemas.data.TClaimBillingProvider getBillingProvider() {
        return billingProvider;
    }


    /**
     * Sets the billingProvider value for this TClaim.
     * 
     * @param billingProvider   * The provider that submitted the claim
     */
    public void setBillingProvider(org.sen.schemas.data.TClaimBillingProvider billingProvider) {
        this.billingProvider = billingProvider;
    }


    /**
     * Gets the claimServiceLines value for this TClaim.
     * 
     * @return claimServiceLines   * A detailed list of all individual line items on the Claim.
     * Each line item is associated with a procedure and a tooth code as
     * well as lineItem payment information.
     */
    public org.sen.schemas.data.TLineItem[] getClaimServiceLines() {
        return claimServiceLines;
    }


    /**
     * Sets the claimServiceLines value for this TClaim.
     * 
     * @param claimServiceLines   * A detailed list of all individual line items on the Claim.
     * Each line item is associated with a procedure and a tooth code as
     * well as lineItem payment information.
     */
    public void setClaimServiceLines(org.sen.schemas.data.TLineItem[] claimServiceLines) {
        this.claimServiceLines = claimServiceLines;
    }

    public org.sen.schemas.data.TLineItem getClaimServiceLines(int i) {
        return this.claimServiceLines[i];
    }

    public void setClaimServiceLines(int i, org.sen.schemas.data.TLineItem _value) {
        this.claimServiceLines[i] = _value;
    }


    /**
     * Gets the claimBusinessLevels value for this TClaim.
     * 
     * @return claimBusinessLevels   * Claim Business Levels
     */
    public org.sen.schemas.data.TBusinessUnit getClaimBusinessLevels() {
        return claimBusinessLevels;
    }


    /**
     * Sets the claimBusinessLevels value for this TClaim.
     * 
     * @param claimBusinessLevels   * Claim Business Levels
     */
    public void setClaimBusinessLevels(org.sen.schemas.data.TBusinessUnit claimBusinessLevels) {
        this.claimBusinessLevels = claimBusinessLevels;
    }


    /**
     * Gets the claimType value for this TClaim.
     * 
     * @return claimType
     */
    public org.sen.schemas.data.SClaimType getClaimType() {
        return claimType;
    }


    /**
     * Sets the claimType value for this TClaim.
     * 
     * @param claimType
     */
    public void setClaimType(org.sen.schemas.data.SClaimType claimType) {
        this.claimType = claimType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TClaim)) return false;
        TClaim other = (TClaim) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimIdentifier==null && other.getClaimIdentifier()==null) || 
             (this.claimIdentifier!=null &&
              this.claimIdentifier.equals(other.getClaimIdentifier()))) &&
            ((this.claimCaseNumber==null && other.getClaimCaseNumber()==null) || 
             (this.claimCaseNumber!=null &&
              this.claimCaseNumber.equals(other.getClaimCaseNumber()))) &&
            ((this.claimReceivedTime==null && other.getClaimReceivedTime()==null) || 
             (this.claimReceivedTime!=null &&
              this.claimReceivedTime.equals(other.getClaimReceivedTime()))) &&
            ((this.claimFromDate==null && other.getClaimFromDate()==null) || 
             (this.claimFromDate!=null &&
              this.claimFromDate.equals(other.getClaimFromDate()))) &&
            ((this.claimToDate==null && other.getClaimToDate()==null) || 
             (this.claimToDate!=null &&
              this.claimToDate.equals(other.getClaimToDate()))) &&
            ((this.contractIdentifier==null && other.getContractIdentifier()==null) || 
             (this.contractIdentifier!=null &&
              this.contractIdentifier.equals(other.getContractIdentifier()))) &&
            ((this.productIdentifier==null && other.getProductIdentifier()==null) || 
             (this.productIdentifier!=null &&
              this.productIdentifier.equals(other.getProductIdentifier()))) &&
            ((this.claimSource==null && other.getClaimSource()==null) || 
             (this.claimSource!=null &&
              this.claimSource.equals(other.getClaimSource()))) &&
            ((this.claimNetworkIndicator==null && other.getClaimNetworkIndicator()==null) || 
             (this.claimNetworkIndicator!=null &&
              this.claimNetworkIndicator.equals(other.getClaimNetworkIndicator()))) &&
            ((this.enrolleeId==null && other.getEnrolleeId()==null) || 
             (this.enrolleeId!=null &&
              this.enrolleeId.equals(other.getEnrolleeId()))) &&
            ((this.primaryFirstName==null && other.getPrimaryFirstName()==null) || 
             (this.primaryFirstName!=null &&
              this.primaryFirstName.equals(other.getPrimaryFirstName()))) &&
            ((this.primaryLastName==null && other.getPrimaryLastName()==null) || 
             (this.primaryLastName!=null &&
              this.primaryLastName.equals(other.getPrimaryLastName()))) &&
            ((this.primaryPersonId==null && other.getPrimaryPersonId()==null) || 
             (this.primaryPersonId!=null &&
              this.primaryPersonId.equals(other.getPrimaryPersonId()))) &&
            ((this.claimPredeterminationFlag==null && other.getClaimPredeterminationFlag()==null) || 
             (this.claimPredeterminationFlag!=null &&
              this.claimPredeterminationFlag.equals(other.getClaimPredeterminationFlag()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.groupNumber==null && other.getGroupNumber()==null) || 
             (this.groupNumber!=null &&
              this.groupNumber.equals(other.getGroupNumber()))) &&
            ((this.divisionName==null && other.getDivisionName()==null) || 
             (this.divisionName!=null &&
              this.divisionName.equals(other.getDivisionName()))) &&
            ((this.divisionNumber==null && other.getDivisionNumber()==null) || 
             (this.divisionNumber!=null &&
              this.divisionNumber.equals(other.getDivisionNumber()))) &&
            this.divisionSelfFunded == other.isDivisionSelfFunded() &&
            ((this.claimStatus==null && other.getClaimStatus()==null) || 
             (this.claimStatus!=null &&
              this.claimStatus.equals(other.getClaimStatus()))) &&
            ((this.summaryPayment==null && other.getSummaryPayment()==null) || 
             (this.summaryPayment!=null &&
              this.summaryPayment.equals(other.getSummaryPayment()))) &&
            ((this.patient==null && other.getPatient()==null) || 
             (this.patient!=null &&
              this.patient.equals(other.getPatient()))) &&
            ((this.billingProvider==null && other.getBillingProvider()==null) || 
             (this.billingProvider!=null &&
              this.billingProvider.equals(other.getBillingProvider()))) &&
            ((this.claimServiceLines==null && other.getClaimServiceLines()==null) || 
             (this.claimServiceLines!=null &&
              java.util.Arrays.equals(this.claimServiceLines, other.getClaimServiceLines()))) &&
            ((this.claimBusinessLevels==null && other.getClaimBusinessLevels()==null) || 
             (this.claimBusinessLevels!=null &&
              this.claimBusinessLevels.equals(other.getClaimBusinessLevels()))) &&
            ((this.claimType==null && other.getClaimType()==null) || 
             (this.claimType!=null &&
              this.claimType.equals(other.getClaimType())));
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
        if (getClaimIdentifier() != null) {
            _hashCode += getClaimIdentifier().hashCode();
        }
        if (getClaimCaseNumber() != null) {
            _hashCode += getClaimCaseNumber().hashCode();
        }
        if (getClaimReceivedTime() != null) {
            _hashCode += getClaimReceivedTime().hashCode();
        }
        if (getClaimFromDate() != null) {
            _hashCode += getClaimFromDate().hashCode();
        }
        if (getClaimToDate() != null) {
            _hashCode += getClaimToDate().hashCode();
        }
        if (getContractIdentifier() != null) {
            _hashCode += getContractIdentifier().hashCode();
        }
        if (getProductIdentifier() != null) {
            _hashCode += getProductIdentifier().hashCode();
        }
        if (getClaimSource() != null) {
            _hashCode += getClaimSource().hashCode();
        }
        if (getClaimNetworkIndicator() != null) {
            _hashCode += getClaimNetworkIndicator().hashCode();
        }
        if (getEnrolleeId() != null) {
            _hashCode += getEnrolleeId().hashCode();
        }
        if (getPrimaryFirstName() != null) {
            _hashCode += getPrimaryFirstName().hashCode();
        }
        if (getPrimaryLastName() != null) {
            _hashCode += getPrimaryLastName().hashCode();
        }
        if (getPrimaryPersonId() != null) {
            _hashCode += getPrimaryPersonId().hashCode();
        }
        if (getClaimPredeterminationFlag() != null) {
            _hashCode += getClaimPredeterminationFlag().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getGroupNumber() != null) {
            _hashCode += getGroupNumber().hashCode();
        }
        if (getDivisionName() != null) {
            _hashCode += getDivisionName().hashCode();
        }
        if (getDivisionNumber() != null) {
            _hashCode += getDivisionNumber().hashCode();
        }
        _hashCode += (isDivisionSelfFunded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getClaimStatus() != null) {
            _hashCode += getClaimStatus().hashCode();
        }
        if (getSummaryPayment() != null) {
            _hashCode += getSummaryPayment().hashCode();
        }
        if (getPatient() != null) {
            _hashCode += getPatient().hashCode();
        }
        if (getBillingProvider() != null) {
            _hashCode += getBillingProvider().hashCode();
        }
        if (getClaimServiceLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClaimServiceLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClaimServiceLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClaimBusinessLevels() != null) {
            _hashCode += getClaimBusinessLevels().hashCode();
        }
        if (getClaimType() != null) {
            _hashCode += getClaimType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TClaim.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tClaim"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("claimType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "claimType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sClaimType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimCaseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimCaseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimReceivedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimReceivedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "ClaimToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "contractIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "productIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNetworkIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimNetworkIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrolleeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "enrolleeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "primaryFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "primaryLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryPersonId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "primaryPersonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimPredeterminationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimPredeterminationFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sClaimPredeterminationFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "groupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "divisionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "divisionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionSelfFunded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "divisionSelfFunded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tClaim>claimStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "summaryPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tSummaryPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "patient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tClaim>patient"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "billingProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">tClaim>billingProvider"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimServiceLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimServiceLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimBusinessLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "claimBusinessLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBusinessUnit"));
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
