/**
 * TBusinessUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a Delta Dental Business Unit
 */
public class TBusinessUnit  implements java.io.Serializable {
    /* Specifies the plan such as DDC, DDIC, PMI, etc (business Level
     * 5) */
    private java.lang.String healthCareContractHolderIdentifier;

    /* PPO, Premier, HMO (Business Level 7) */
    private java.lang.String productIdentifier;

    /* (Business Level 4) */
    private java.lang.String groupTypeIdentifier;

    /* The state the business is operating on. (Business Level 6) */
    private java.lang.String financialReportingStateIdentifier;

    /* Do not use this element; it is added to get around a weird
     * problem in code generation */
    private java.lang.Object holderToAvoidCodeGenerationError;

    public TBusinessUnit() {
    }

    public TBusinessUnit(
           java.lang.String healthCareContractHolderIdentifier,
           java.lang.String productIdentifier,
           java.lang.String groupTypeIdentifier,
           java.lang.String financialReportingStateIdentifier,
           java.lang.Object holderToAvoidCodeGenerationError) {
           this.healthCareContractHolderIdentifier = healthCareContractHolderIdentifier;
           this.productIdentifier = productIdentifier;
           this.groupTypeIdentifier = groupTypeIdentifier;
           this.financialReportingStateIdentifier = financialReportingStateIdentifier;
           this.holderToAvoidCodeGenerationError = holderToAvoidCodeGenerationError;
    }


    /**
     * Gets the healthCareContractHolderIdentifier value for this TBusinessUnit.
     * 
     * @return healthCareContractHolderIdentifier   * Specifies the plan such as DDC, DDIC, PMI, etc (business Level
     * 5)
     */
    public java.lang.String getHealthCareContractHolderIdentifier() {
        return healthCareContractHolderIdentifier;
    }


    /**
     * Sets the healthCareContractHolderIdentifier value for this TBusinessUnit.
     * 
     * @param healthCareContractHolderIdentifier   * Specifies the plan such as DDC, DDIC, PMI, etc (business Level
     * 5)
     */
    public void setHealthCareContractHolderIdentifier(java.lang.String healthCareContractHolderIdentifier) {
        this.healthCareContractHolderIdentifier = healthCareContractHolderIdentifier;
    }


    /**
     * Gets the productIdentifier value for this TBusinessUnit.
     * 
     * @return productIdentifier   * PPO, Premier, HMO (Business Level 7)
     */
    public java.lang.String getProductIdentifier() {
        return productIdentifier;
    }


    /**
     * Sets the productIdentifier value for this TBusinessUnit.
     * 
     * @param productIdentifier   * PPO, Premier, HMO (Business Level 7)
     */
    public void setProductIdentifier(java.lang.String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }


    /**
     * Gets the groupTypeIdentifier value for this TBusinessUnit.
     * 
     * @return groupTypeIdentifier   * (Business Level 4)
     */
    public java.lang.String getGroupTypeIdentifier() {
        return groupTypeIdentifier;
    }


    /**
     * Sets the groupTypeIdentifier value for this TBusinessUnit.
     * 
     * @param groupTypeIdentifier   * (Business Level 4)
     */
    public void setGroupTypeIdentifier(java.lang.String groupTypeIdentifier) {
        this.groupTypeIdentifier = groupTypeIdentifier;
    }


    /**
     * Gets the financialReportingStateIdentifier value for this TBusinessUnit.
     * 
     * @return financialReportingStateIdentifier   * The state the business is operating on. (Business Level 6)
     */
    public java.lang.String getFinancialReportingStateIdentifier() {
        return financialReportingStateIdentifier;
    }


    /**
     * Sets the financialReportingStateIdentifier value for this TBusinessUnit.
     * 
     * @param financialReportingStateIdentifier   * The state the business is operating on. (Business Level 6)
     */
    public void setFinancialReportingStateIdentifier(java.lang.String financialReportingStateIdentifier) {
        this.financialReportingStateIdentifier = financialReportingStateIdentifier;
    }


    /**
     * Gets the holderToAvoidCodeGenerationError value for this TBusinessUnit.
     * 
     * @return holderToAvoidCodeGenerationError   * Do not use this element; it is added to get around a weird
     * problem in code generation
     */
    public java.lang.Object getHolderToAvoidCodeGenerationError() {
        return holderToAvoidCodeGenerationError;
    }


    /**
     * Sets the holderToAvoidCodeGenerationError value for this TBusinessUnit.
     * 
     * @param holderToAvoidCodeGenerationError   * Do not use this element; it is added to get around a weird
     * problem in code generation
     */
    public void setHolderToAvoidCodeGenerationError(java.lang.Object holderToAvoidCodeGenerationError) {
        this.holderToAvoidCodeGenerationError = holderToAvoidCodeGenerationError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBusinessUnit)) return false;
        TBusinessUnit other = (TBusinessUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.healthCareContractHolderIdentifier==null && other.getHealthCareContractHolderIdentifier()==null) || 
             (this.healthCareContractHolderIdentifier!=null &&
              this.healthCareContractHolderIdentifier.equals(other.getHealthCareContractHolderIdentifier()))) &&
            ((this.productIdentifier==null && other.getProductIdentifier()==null) || 
             (this.productIdentifier!=null &&
              this.productIdentifier.equals(other.getProductIdentifier()))) &&
            ((this.groupTypeIdentifier==null && other.getGroupTypeIdentifier()==null) || 
             (this.groupTypeIdentifier!=null &&
              this.groupTypeIdentifier.equals(other.getGroupTypeIdentifier()))) &&
            ((this.financialReportingStateIdentifier==null && other.getFinancialReportingStateIdentifier()==null) || 
             (this.financialReportingStateIdentifier!=null &&
              this.financialReportingStateIdentifier.equals(other.getFinancialReportingStateIdentifier()))) &&
            ((this.holderToAvoidCodeGenerationError==null && other.getHolderToAvoidCodeGenerationError()==null) || 
             (this.holderToAvoidCodeGenerationError!=null &&
              this.holderToAvoidCodeGenerationError.equals(other.getHolderToAvoidCodeGenerationError())));
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
        if (getHealthCareContractHolderIdentifier() != null) {
            _hashCode += getHealthCareContractHolderIdentifier().hashCode();
        }
        if (getProductIdentifier() != null) {
            _hashCode += getProductIdentifier().hashCode();
        }
        if (getGroupTypeIdentifier() != null) {
            _hashCode += getGroupTypeIdentifier().hashCode();
        }
        if (getFinancialReportingStateIdentifier() != null) {
            _hashCode += getFinancialReportingStateIdentifier().hashCode();
        }
        if (getHolderToAvoidCodeGenerationError() != null) {
            _hashCode += getHolderToAvoidCodeGenerationError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBusinessUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tBusinessUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthCareContractHolderIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "healthCareContractHolderIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "productIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupTypeIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "groupTypeIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financialReportingStateIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "financialReportingStateIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holderToAvoidCodeGenerationError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "holderToAvoidCodeGenerationError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
