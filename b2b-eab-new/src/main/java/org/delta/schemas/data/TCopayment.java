/**
 * TCopayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a copayment object
 */
public class TCopayment  implements java.io.Serializable {
    /* The minimum copay amount or percentage. Zero indicates no copay */
    private double minimum;

    /* The maximum copay amount or percentage. Zero indicates no copay */
    private double maximum;

    private org.delta.schemas.data.SCopaymentType copaymentType;  // attribute

    public TCopayment() {
    }

    public TCopayment(
           double minimum,
           double maximum,
           org.delta.schemas.data.SCopaymentType copaymentType) {
           this.minimum = minimum;
           this.maximum = maximum;
           this.copaymentType = copaymentType;
    }


    /**
     * Gets the minimum value for this TCopayment.
     * 
     * @return minimum   * The minimum copay amount or percentage. Zero indicates no copay
     */
    public double getMinimum() {
        return minimum;
    }


    /**
     * Sets the minimum value for this TCopayment.
     * 
     * @param minimum   * The minimum copay amount or percentage. Zero indicates no copay
     */
    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }


    /**
     * Gets the maximum value for this TCopayment.
     * 
     * @return maximum   * The maximum copay amount or percentage. Zero indicates no copay
     */
    public double getMaximum() {
        return maximum;
    }


    /**
     * Sets the maximum value for this TCopayment.
     * 
     * @param maximum   * The maximum copay amount or percentage. Zero indicates no copay
     */
    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }


    /**
     * Gets the copaymentType value for this TCopayment.
     * 
     * @return copaymentType
     */
    public org.delta.schemas.data.SCopaymentType getCopaymentType() {
        return copaymentType;
    }


    /**
     * Sets the copaymentType value for this TCopayment.
     * 
     * @param copaymentType
     */
    public void setCopaymentType(org.delta.schemas.data.SCopaymentType copaymentType) {
        this.copaymentType = copaymentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCopayment)) return false;
        TCopayment other = (TCopayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.minimum == other.getMinimum() &&
            this.maximum == other.getMaximum() &&
            ((this.copaymentType==null && other.getCopaymentType()==null) || 
             (this.copaymentType!=null &&
              this.copaymentType.equals(other.getCopaymentType())));
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
        _hashCode += new Double(getMinimum()).hashCode();
        _hashCode += new Double(getMaximum()).hashCode();
        if (getCopaymentType() != null) {
            _hashCode += getCopaymentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCopayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tCopayment"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("copaymentType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "copaymentType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sCopaymentType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "minimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "maximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
