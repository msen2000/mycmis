/**
 * TContract.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The definition of a contract object
 */
public class TContract  implements java.io.Serializable {
    /* The date coverage began */
    private java.util.Date coverageStartDate;

    /* The date coverage will end (Term date). */
    private java.util.Date coverageEndDate;

    /* The Contract ID */
    private java.lang.String contractIdentifier;

    private org.sen.schemas.data.TEnrollee[] enrolleeList;

    /* The group/contract holder associated with the contract/member */
    private org.sen.schemas.data.TGroup group;

    /* The Sen Den Business Unit */
    private org.sen.schemas.data.TBusinessUnit businessUnit;

    /* The status of this contract */
    private org.sen.schemas.data.SStatusType coverageStatus;

    public TContract() {
    }

    public TContract(
           java.util.Date coverageStartDate,
           java.util.Date coverageEndDate,
           java.lang.String contractIdentifier,
           org.sen.schemas.data.TEnrollee[] enrolleeList,
           org.sen.schemas.data.TGroup group,
           org.sen.schemas.data.TBusinessUnit businessUnit,
           org.sen.schemas.data.SStatusType coverageStatus) {
           this.coverageStartDate = coverageStartDate;
           this.coverageEndDate = coverageEndDate;
           this.contractIdentifier = contractIdentifier;
           this.enrolleeList = enrolleeList;
           this.group = group;
           this.businessUnit = businessUnit;
           this.coverageStatus = coverageStatus;
    }


    /**
     * Gets the coverageStartDate value for this TContract.
     * 
     * @return coverageStartDate   * The date coverage began
     */
    public java.util.Date getCoverageStartDate() {
        return coverageStartDate;
    }


    /**
     * Sets the coverageStartDate value for this TContract.
     * 
     * @param coverageStartDate   * The date coverage began
     */
    public void setCoverageStartDate(java.util.Date coverageStartDate) {
        this.coverageStartDate = coverageStartDate;
    }


    /**
     * Gets the coverageEndDate value for this TContract.
     * 
     * @return coverageEndDate   * The date coverage will end (Term date).
     */
    public java.util.Date getCoverageEndDate() {
        return coverageEndDate;
    }


    /**
     * Sets the coverageEndDate value for this TContract.
     * 
     * @param coverageEndDate   * The date coverage will end (Term date).
     */
    public void setCoverageEndDate(java.util.Date coverageEndDate) {
        this.coverageEndDate = coverageEndDate;
    }


    /**
     * Gets the contractIdentifier value for this TContract.
     * 
     * @return contractIdentifier   * The Contract ID
     */
    public java.lang.String getContractIdentifier() {
        return contractIdentifier;
    }


    /**
     * Sets the contractIdentifier value for this TContract.
     * 
     * @param contractIdentifier   * The Contract ID
     */
    public void setContractIdentifier(java.lang.String contractIdentifier) {
        this.contractIdentifier = contractIdentifier;
    }


    /**
     * Gets the enrolleeList value for this TContract.
     * 
     * @return enrolleeList
     */
    public org.sen.schemas.data.TEnrollee[] getEnrolleeList() {
        return enrolleeList;
    }


    /**
     * Sets the enrolleeList value for this TContract.
     * 
     * @param enrolleeList
     */
    public void setEnrolleeList(org.sen.schemas.data.TEnrollee[] enrolleeList) {
        this.enrolleeList = enrolleeList;
    }


    /**
     * Gets the group value for this TContract.
     * 
     * @return group   * The group/contract holder associated with the contract/member
     */
    public org.sen.schemas.data.TGroup getGroup() {
        return group;
    }


    /**
     * Sets the group value for this TContract.
     * 
     * @param group   * The group/contract holder associated with the contract/member
     */
    public void setGroup(org.sen.schemas.data.TGroup group) {
        this.group = group;
    }


    /**
     * Gets the businessUnit value for this TContract.
     * 
     * @return businessUnit   * The Sen Den Business Unit
     */
    public org.sen.schemas.data.TBusinessUnit getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this TContract.
     * 
     * @param businessUnit   * The Sen Den Business Unit
     */
    public void setBusinessUnit(org.sen.schemas.data.TBusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the coverageStatus value for this TContract.
     * 
     * @return coverageStatus   * The status of this contract
     */
    public org.sen.schemas.data.SStatusType getCoverageStatus() {
        return coverageStatus;
    }


    /**
     * Sets the coverageStatus value for this TContract.
     * 
     * @param coverageStatus   * The status of this contract
     */
    public void setCoverageStatus(org.sen.schemas.data.SStatusType coverageStatus) {
        this.coverageStatus = coverageStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TContract)) return false;
        TContract other = (TContract) obj;
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
            ((this.contractIdentifier==null && other.getContractIdentifier()==null) || 
             (this.contractIdentifier!=null &&
              this.contractIdentifier.equals(other.getContractIdentifier()))) &&
            ((this.enrolleeList==null && other.getEnrolleeList()==null) || 
             (this.enrolleeList!=null &&
              java.util.Arrays.equals(this.enrolleeList, other.getEnrolleeList()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.coverageStatus==null && other.getCoverageStatus()==null) || 
             (this.coverageStatus!=null &&
              this.coverageStatus.equals(other.getCoverageStatus())));
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
        if (getContractIdentifier() != null) {
            _hashCode += getContractIdentifier().hashCode();
        }
        if (getEnrolleeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnrolleeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnrolleeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCoverageStatus() != null) {
            _hashCode += getCoverageStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TContract.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContract"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "coverageStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "coverageEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "contractIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrolleeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "enrolleeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tEnrollee"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "enrollee"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tGroup"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBusinessUnit"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "coverageStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sStatusType"));
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
