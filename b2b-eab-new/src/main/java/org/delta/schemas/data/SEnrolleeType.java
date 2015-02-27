/**
 * SEnrolleeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class SEnrolleeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SEnrolleeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Self";
    public static final java.lang.String _value2 = "Subscriber";
    public static final java.lang.String _value3 = "Spouse";
    public static final java.lang.String _value4 = "Domestic Partner";
    public static final java.lang.String _value5 = "Dependent";
    public static final SEnrolleeType value1 = new SEnrolleeType(_value1);
    public static final SEnrolleeType value2 = new SEnrolleeType(_value2);
    public static final SEnrolleeType value3 = new SEnrolleeType(_value3);
    public static final SEnrolleeType value4 = new SEnrolleeType(_value4);
    public static final SEnrolleeType value5 = new SEnrolleeType(_value5);
    public java.lang.String getValue() { return _value_;}
    public static SEnrolleeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SEnrolleeType enumeration = (SEnrolleeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SEnrolleeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SEnrolleeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sEnrolleeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}