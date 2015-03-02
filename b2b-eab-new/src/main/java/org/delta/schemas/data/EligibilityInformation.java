/**
 * EligibilityInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class EligibilityInformation  implements java.io.Serializable {
    /* The date coverage began */
    private java.util.Date coverageStartDate;

    /* The date coverage will end (Term date). */
    private java.util.Date coverageEndDate;

    /* Benefit Coverage Level code */
    private java.lang.String benefitCoverageLevelCode;

    private org.sen.schemas.data.TEnrollee enrollee;

    /* The group/contract holder associated with the contract/member */
    private org.sen.schemas.data.TGroup[] groupList;

    /* The Coverage Detail of the contract */
    private org.sen.schemas.data.TCoverageDetail coverageDetail;

    /* The Coverage Detail of the contract */
    private java.lang.String planCoverageDescription;

    private java.lang.String basisOfPaymentURL;

    private java.lang.String customerSvcTelephone;

    public EligibilityInformation() {
    }

    public EligibilityInformation(
           java.util.Date coverageStartDate,
           java.util.Date coverageEndDate,
           java.lang.String benefitCoverageLevelCode,
           org.sen.schemas.data.TEnrollee enrollee,
           org.sen.schemas.data.TGroup[] groupList,
           org.sen.schemas.data.TCoverageDetail coverageDetail,
           java.lang.String planCoverageDescription,
           java.lang.String basisOfPaymentURL,
           java.lang.String customerSvcTelephone) {
           this.coverageStartDate = coverageStartDate;
           this.coverageEndDate = coverageEndDate;
           this.benefitCoverageLevelCode = benefitCoverageLevelCode;
           this.enrollee = enrollee;
           this.groupList = groupList;
           this.coverageDetail = coverageDetail;
           this.planCoverageDescription = planCoverageDescription;
           this.basisOfPaymentURL = basisOfPaymentURL;
           this.customerSvcTelephone = customerSvcTelephone;
    }


    /**
     * Gets the coverageStartDate value for this EligibilityInformation.
     * 
     * @return coverageStartDate   * The date coverage began
     */
    public java.util.Date getCoverageStartDate() {
        return coverageStartDate;
    }


    /**
     * Sets the coverageStartDate value for this EligibilityInformation.
     * 
     * @param coverageStartDate   * The date coverage began
     */
    public void setCoverageStartDate(java.util.Date coverageStartDate) {
        this.coverageStartDate = coverageStartDate;
    }


    /**
     * Gets the coverageEndDate value for this EligibilityInformation.
     * 
     * @return coverageEndDate   * The date coverage will end (Term date).
     */
    public java.util.Date getCoverageEndDate() {
        return coverageEndDate;
    }


    /**
     * Sets the coverageEndDate value for this EligibilityInformation.
     * 
     * @param coverageEndDate   * The date coverage will end (Term date).
     */
    public void setCoverageEndDate(java.util.Date coverageEndDate) {
        this.coverageEndDate = coverageEndDate;
    }


    /**
     * Gets the benefitCoverageLevelCode value for this EligibilityInformation.
     * 
     * @return benefitCoverageLevelCode   * Benefit Coverage Level code
     */
    public java.lang.String getBenefitCoverageLevelCode() {
        return benefitCoverageLevelCode;
    }


    /**
     * Sets the benefitCoverageLevelCode value for this EligibilityInformation.
     * 
     * @param benefitCoverageLevelCode   * Benefit Coverage Level code
     */
    public void setBenefitCoverageLevelCode(java.lang.String benefitCoverageLevelCode) {
        this.benefitCoverageLevelCode = benefitCoverageLevelCode;
    }


    /**
     * Gets the enrollee value for this EligibilityInformation.
     * 
     * @return enrollee
     */
    public org.sen.schemas.data.TEnrollee getEnrollee() {
        return enrollee;
    }


    /**
     * Sets the enrollee value for this EligibilityInformation.
     * 
     * @param enrollee
     */
    public void setEnrollee(org.sen.schemas.data.TEnrollee enrollee) {
        this.enrollee = enrollee;
    }


    /**
     * Gets the groupList value for this EligibilityInformation.
     * 
     * @return groupList   * The group/contract holder associated with the contract/member
     */
    public org.sen.schemas.data.TGroup[] getGroupList() {
        return groupList;
    }


    /**
     * Sets the groupList value for this EligibilityInformation.
     * 
     * @param groupList   * The group/contract holder associated with the contract/member
     */
    public void setGroupList(org.sen.schemas.data.TGroup[] groupList) {
        this.groupList = groupList;
    }


    /**
     * Gets the coverageDetail value for this EligibilityInformation.
     * 
     * @return coverageDetail   * The Coverage Detail of the contract
     */
    public org.sen.schemas.data.TCoverageDetail getCoverageDetail() {
        return coverageDetail;
    }


    /**
     * Sets the coverageDetail value for this EligibilityInformation.
     * 
     * @param coverageDetail   * The Coverage Detail of the contract
     */
    public void setCoverageDetail(org.sen.schemas.data.TCoverageDetail coverageDetail) {
        this.coverageDetail = coverageDetail;
    }


    /**
     * Gets the planCoverageDescription value for this EligibilityInformation.
     * 
     * @return planCoverageDescription   * The Coverage Detail of the contract
     */
    public java.lang.String getPlanCoverageDescription() {
        return planCoverageDescription;
    }


    /**
     * Sets the planCoverageDescription value for this EligibilityInformation.
     * 
     * @param planCoverageDescription   * The Coverage Detail of the contract
     */
    public void setPlanCoverageDescription(java.lang.String planCoverageDescription) {
        this.planCoverageDescription = planCoverageDescription;
    }


    /**
     * Gets the basisOfPaymentURL value for this EligibilityInformation.
     * 
     * @return basisOfPaymentURL
     */
    public java.lang.String getBasisOfPaymentURL() {
        return basisOfPaymentURL;
    }


    /**
     * Sets the basisOfPaymentURL value for this EligibilityInformation.
     * 
     * @param basisOfPaymentURL
     */
    public void setBasisOfPaymentURL(java.lang.String basisOfPaymentURL) {
        this.basisOfPaymentURL = basisOfPaymentURL;
    }


    /**
     * Gets the customerSvcTelephone value for this EligibilityInformation.
     * 
     * @return customerSvcTelephone
     */
    public java.lang.String getCustomerSvcTelephone() {
        return customerSvcTelephone;
    }


    /**
     * Sets the customerSvcTelephone value for this EligibilityInformation.
     * 
     * @param customerSvcTelephone
     */
    public void setCustomerSvcTelephone(java.lang.String customerSvcTelephone) {
        this.customerSvcTelephone = customerSvcTelephone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EligibilityInformation)) return false;
        EligibilityInformation other = (EligibilityInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coverageStartDate==null && other.getCoverageStartDate()==null) || 
             (this.coverageStartDate!=null &&
              this.coverageStartDate.equals(other.getCoverageStartDate()))) &&
            ((this.coverageEndDate==null && other.getCoverageEndDate()==null) || 
             (this.coverageEndDate!=null &&
              this.coverageEndDate.equals(other.getCoverageEndDate()))) &&
            ((this.benefitCoverageLevelCode==null && other.getBenefitCoverageLevelCode()==null) || 
             (this.benefitCoverageLevelCode!=null &&
              this.benefitCoverageLevelCode.equals(other.getBenefitCoverageLevelCode()))) &&
            ((this.enrollee==null && other.getEnrollee()==null) || 
             (this.enrollee!=null &&
              this.enrollee.equals(other.getEnrollee()))) &&
            ((this.groupList==null && other.getGroupList()==null) || 
             (this.groupList!=null &&
              java.util.Arrays.equals(this.groupList, other.getGroupList()))) &&
            ((this.coverageDetail==null && other.getCoverageDetail()==null) || 
             (this.coverageDetail!=null &&
              this.coverageDetail.equals(other.getCoverageDetail()))) &&
            ((this.planCoverageDescription==null && other.getPlanCoverageDescription()==null) || 
             (this.planCoverageDescription!=null &&
              this.planCoverageDescription.equals(other.getPlanCoverageDescription()))) &&
            ((this.basisOfPaymentURL==null && other.getBasisOfPaymentURL()==null) || 
             (this.basisOfPaymentURL!=null &&
              this.basisOfPaymentURL.equals(other.getBasisOfPaymentURL()))) &&
            ((this.customerSvcTelephone==null && other.getCustomerSvcTelephone()==null) || 
             (this.customerSvcTelephone!=null &&
              this.customerSvcTelephone.equals(other.getCustomerSvcTelephone())));
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
        if (getCoverageStartDate() != null) {
            _hashCode += getCoverageStartDate().hashCode();
        }
        if (getCoverageEndDate() != null) {
            _hashCode += getCoverageEndDate().hashCode();
        }
        if (getBenefitCoverageLevelCode() != null) {
            _hashCode += getBenefitCoverageLevelCode().hashCode();
        }
        if (getEnrollee() != null) {
            _hashCode += getEnrollee().hashCode();
        }
        if (getGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCoverageDetail() != null) {
            _hashCode += getCoverageDetail().hashCode();
        }
        if (getPlanCoverageDescription() != null) {
            _hashCode += getPlanCoverageDescription().hashCode();
        }
        if (getBasisOfPaymentURL() != null) {
            _hashCode += getBasisOfPaymentURL().hashCode();
        }
        if (getCustomerSvcTelephone() != null) {
            _hashCode += getCustomerSvcTelephone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EligibilityInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", ">EligibilityInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "CoverageStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "CoverageEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitCoverageLevelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "BenefitCoverageLevelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "enrollee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tEnrollee"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "GroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tGroup"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "Group"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "CoverageDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tCoverageDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planCoverageDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "PlanCoverageDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basisOfPaymentURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "BasisOfPaymentURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSvcTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "CustomerSvcTelephone"));
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
