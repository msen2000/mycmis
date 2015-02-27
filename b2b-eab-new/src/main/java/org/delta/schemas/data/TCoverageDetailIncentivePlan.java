/**
 * TCoverageDetailIncentivePlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class TCoverageDetailIncentivePlan  implements java.io.Serializable {
    private java.lang.String planCode;

    private java.lang.String planDescription;

    public TCoverageDetailIncentivePlan() {
    }

    public TCoverageDetailIncentivePlan(
           java.lang.String planCode,
           java.lang.String planDescription) {
           this.planCode = planCode;
           this.planDescription = planDescription;
    }


    /**
     * Gets the planCode value for this TCoverageDetailIncentivePlan.
     * 
     * @return planCode
     */
    public java.lang.String getPlanCode() {
        return planCode;
    }


    /**
     * Sets the planCode value for this TCoverageDetailIncentivePlan.
     * 
     * @param planCode
     */
    public void setPlanCode(java.lang.String planCode) {
        this.planCode = planCode;
    }


    /**
     * Gets the planDescription value for this TCoverageDetailIncentivePlan.
     * 
     * @return planDescription
     */
    public java.lang.String getPlanDescription() {
        return planDescription;
    }


    /**
     * Sets the planDescription value for this TCoverageDetailIncentivePlan.
     * 
     * @param planDescription
     */
    public void setPlanDescription(java.lang.String planDescription) {
        this.planDescription = planDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCoverageDetailIncentivePlan)) return false;
        TCoverageDetailIncentivePlan other = (TCoverageDetailIncentivePlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.planCode==null && other.getPlanCode()==null) || 
             (this.planCode!=null &&
              this.planCode.equals(other.getPlanCode()))) &&
            ((this.planDescription==null && other.getPlanDescription()==null) || 
             (this.planDescription!=null &&
              this.planDescription.equals(other.getPlanDescription())));
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
        if (getPlanCode() != null) {
            _hashCode += getPlanCode().hashCode();
        }
        if (getPlanDescription() != null) {
            _hashCode += getPlanDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCoverageDetailIncentivePlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", ">tCoverageDetail>incentivePlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "planCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "planDescription"));
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
