/**
 * TExCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The explanation code associated with the line item
 */
public class TExCode  implements java.io.Serializable {
    /* The explanation Category */
    private org.delta.schemas.data.SServiceLineExplanationCategoryType explanationCategory;

    /* The explanation code */
    private java.lang.String explanationCode;

    /* The explanation code Description */
    private java.lang.String explanationCodeDescription;

    public TExCode() {
    }

    public TExCode(
           org.delta.schemas.data.SServiceLineExplanationCategoryType explanationCategory,
           java.lang.String explanationCode,
           java.lang.String explanationCodeDescription) {
           this.explanationCategory = explanationCategory;
           this.explanationCode = explanationCode;
           this.explanationCodeDescription = explanationCodeDescription;
    }


    /**
     * Gets the explanationCategory value for this TExCode.
     * 
     * @return explanationCategory   * The explanation Category
     */
    public org.delta.schemas.data.SServiceLineExplanationCategoryType getExplanationCategory() {
        return explanationCategory;
    }


    /**
     * Sets the explanationCategory value for this TExCode.
     * 
     * @param explanationCategory   * The explanation Category
     */
    public void setExplanationCategory(org.delta.schemas.data.SServiceLineExplanationCategoryType explanationCategory) {
        this.explanationCategory = explanationCategory;
    }


    /**
     * Gets the explanationCode value for this TExCode.
     * 
     * @return explanationCode   * The explanation code
     */
    public java.lang.String getExplanationCode() {
        return explanationCode;
    }


    /**
     * Sets the explanationCode value for this TExCode.
     * 
     * @param explanationCode   * The explanation code
     */
    public void setExplanationCode(java.lang.String explanationCode) {
        this.explanationCode = explanationCode;
    }


    /**
     * Gets the explanationCodeDescription value for this TExCode.
     * 
     * @return explanationCodeDescription   * The explanation code Description
     */
    public java.lang.String getExplanationCodeDescription() {
        return explanationCodeDescription;
    }


    /**
     * Sets the explanationCodeDescription value for this TExCode.
     * 
     * @param explanationCodeDescription   * The explanation code Description
     */
    public void setExplanationCodeDescription(java.lang.String explanationCodeDescription) {
        this.explanationCodeDescription = explanationCodeDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TExCode)) return false;
        TExCode other = (TExCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.explanationCategory==null && other.getExplanationCategory()==null) || 
             (this.explanationCategory!=null &&
              this.explanationCategory.equals(other.getExplanationCategory()))) &&
            ((this.explanationCode==null && other.getExplanationCode()==null) || 
             (this.explanationCode!=null &&
              this.explanationCode.equals(other.getExplanationCode()))) &&
            ((this.explanationCodeDescription==null && other.getExplanationCodeDescription()==null) || 
             (this.explanationCodeDescription!=null &&
              this.explanationCodeDescription.equals(other.getExplanationCodeDescription())));
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
        if (getExplanationCategory() != null) {
            _hashCode += getExplanationCategory().hashCode();
        }
        if (getExplanationCode() != null) {
            _hashCode += getExplanationCode().hashCode();
        }
        if (getExplanationCodeDescription() != null) {
            _hashCode += getExplanationCodeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TExCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tExCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explanationCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "explanationCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sServiceLineExplanationCategoryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explanationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "explanationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explanationCodeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "explanationCodeDescription"));
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
