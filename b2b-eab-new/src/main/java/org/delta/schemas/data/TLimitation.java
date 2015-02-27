/**
 * TLimitation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a limitation object
 */
public class TLimitation  implements java.io.Serializable {
    /* The overall limitation quantity */
    private java.lang.Integer quantity;

    /* The time period quantity */
    private java.lang.Integer timePeriodQuantity;

    /* The overall time period associated with the limitation */
    private org.delta.schemas.data.STimeUnitType timePeriodUnit;

    /* Additional qualification of time limit */
    private org.delta.schemas.data.SLimitationQualifier limitationQualifier;

    public TLimitation() {
    }

    public TLimitation(
           java.lang.Integer quantity,
           java.lang.Integer timePeriodQuantity,
           org.delta.schemas.data.STimeUnitType timePeriodUnit,
           org.delta.schemas.data.SLimitationQualifier limitationQualifier) {
           this.quantity = quantity;
           this.timePeriodQuantity = timePeriodQuantity;
           this.timePeriodUnit = timePeriodUnit;
           this.limitationQualifier = limitationQualifier;
    }


    /**
     * Gets the quantity value for this TLimitation.
     * 
     * @return quantity   * The overall limitation quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TLimitation.
     * 
     * @param quantity   * The overall limitation quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the timePeriodQuantity value for this TLimitation.
     * 
     * @return timePeriodQuantity   * The time period quantity
     */
    public java.lang.Integer getTimePeriodQuantity() {
        return timePeriodQuantity;
    }


    /**
     * Sets the timePeriodQuantity value for this TLimitation.
     * 
     * @param timePeriodQuantity   * The time period quantity
     */
    public void setTimePeriodQuantity(java.lang.Integer timePeriodQuantity) {
        this.timePeriodQuantity = timePeriodQuantity;
    }


    /**
     * Gets the timePeriodUnit value for this TLimitation.
     * 
     * @return timePeriodUnit   * The overall time period associated with the limitation
     */
    public org.delta.schemas.data.STimeUnitType getTimePeriodUnit() {
        return timePeriodUnit;
    }


    /**
     * Sets the timePeriodUnit value for this TLimitation.
     * 
     * @param timePeriodUnit   * The overall time period associated with the limitation
     */
    public void setTimePeriodUnit(org.delta.schemas.data.STimeUnitType timePeriodUnit) {
        this.timePeriodUnit = timePeriodUnit;
    }


    /**
     * Gets the limitationQualifier value for this TLimitation.
     * 
     * @return limitationQualifier   * Additional qualification of time limit
     */
    public org.delta.schemas.data.SLimitationQualifier getLimitationQualifier() {
        return limitationQualifier;
    }


    /**
     * Sets the limitationQualifier value for this TLimitation.
     * 
     * @param limitationQualifier   * Additional qualification of time limit
     */
    public void setLimitationQualifier(org.delta.schemas.data.SLimitationQualifier limitationQualifier) {
        this.limitationQualifier = limitationQualifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TLimitation)) return false;
        TLimitation other = (TLimitation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.timePeriodQuantity==null && other.getTimePeriodQuantity()==null) || 
             (this.timePeriodQuantity!=null &&
              this.timePeriodQuantity.equals(other.getTimePeriodQuantity()))) &&
            ((this.timePeriodUnit==null && other.getTimePeriodUnit()==null) || 
             (this.timePeriodUnit!=null &&
              this.timePeriodUnit.equals(other.getTimePeriodUnit()))) &&
            ((this.limitationQualifier==null && other.getLimitationQualifier()==null) || 
             (this.limitationQualifier!=null &&
              this.limitationQualifier.equals(other.getLimitationQualifier())));
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
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getTimePeriodQuantity() != null) {
            _hashCode += getTimePeriodQuantity().hashCode();
        }
        if (getTimePeriodUnit() != null) {
            _hashCode += getTimePeriodUnit().hashCode();
        }
        if (getLimitationQualifier() != null) {
            _hashCode += getLimitationQualifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TLimitation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tLimitation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriodQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "timePeriodQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriodUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "timePeriodUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sTimeUnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitationQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "limitationQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sLimitationQualifier"));
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
