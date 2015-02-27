/**
 * SSpecialtyCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class SSpecialtyCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SSpecialtyCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "00";
    public static final java.lang.String _value2 = "10";
    public static final java.lang.String _value3 = "15";
    public static final java.lang.String _value4 = "20";
    public static final java.lang.String _value5 = "30";
    public static final java.lang.String _value6 = "40";
    public static final java.lang.String _value7 = "50";
    public static final java.lang.String _value8 = "60";
    public static final java.lang.String _value9 = "70";
    public static final java.lang.String _value10 = "80";
    public static final java.lang.String _value11 = "DT";
    public static final java.lang.String _value12 = "HY";
    public static final SSpecialtyCode value1 = new SSpecialtyCode(_value1);
    public static final SSpecialtyCode value2 = new SSpecialtyCode(_value2);
    public static final SSpecialtyCode value3 = new SSpecialtyCode(_value3);
    public static final SSpecialtyCode value4 = new SSpecialtyCode(_value4);
    public static final SSpecialtyCode value5 = new SSpecialtyCode(_value5);
    public static final SSpecialtyCode value6 = new SSpecialtyCode(_value6);
    public static final SSpecialtyCode value7 = new SSpecialtyCode(_value7);
    public static final SSpecialtyCode value8 = new SSpecialtyCode(_value8);
    public static final SSpecialtyCode value9 = new SSpecialtyCode(_value9);
    public static final SSpecialtyCode value10 = new SSpecialtyCode(_value10);
    public static final SSpecialtyCode value11 = new SSpecialtyCode(_value11);
    public static final SSpecialtyCode value12 = new SSpecialtyCode(_value12);
    public java.lang.String getValue() { return _value_;}
    public static SSpecialtyCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SSpecialtyCode enumeration = (SSpecialtyCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SSpecialtyCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SSpecialtyCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sSpecialtyCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
