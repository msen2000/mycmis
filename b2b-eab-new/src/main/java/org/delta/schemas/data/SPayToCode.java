/**
 * SPayToCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class SPayToCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SPayToCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _A = "A";
    public static final java.lang.String _P = "P";
    public static final java.lang.String _G = "G";
    public static final java.lang.String _S = "S";
    public static final java.lang.String _O = "O";
    public static final java.lang.String _M = "M";
    public static final java.lang.String _I = "I";
    public static final SPayToCode A = new SPayToCode(_A);
    public static final SPayToCode P = new SPayToCode(_P);
    public static final SPayToCode G = new SPayToCode(_G);
    public static final SPayToCode S = new SPayToCode(_S);
    public static final SPayToCode O = new SPayToCode(_O);
    public static final SPayToCode M = new SPayToCode(_M);
    public static final SPayToCode I = new SPayToCode(_I);
    public java.lang.String getValue() { return _value_;}
    public static SPayToCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SPayToCode enumeration = (SPayToCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SPayToCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SPayToCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sPayToCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
