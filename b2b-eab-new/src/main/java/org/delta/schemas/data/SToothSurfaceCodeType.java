/**
 * SToothSurfaceCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class SToothSurfaceCodeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SToothSurfaceCodeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _M = "M";
    public static final java.lang.String _D = "D";
    public static final java.lang.String _L = "L";
    public static final java.lang.String _B = "B";
    public static final java.lang.String _F = "F";
    public static final java.lang.String _I = "I";
    public static final java.lang.String _O = "O";
    public static final SToothSurfaceCodeType M = new SToothSurfaceCodeType(_M);
    public static final SToothSurfaceCodeType D = new SToothSurfaceCodeType(_D);
    public static final SToothSurfaceCodeType L = new SToothSurfaceCodeType(_L);
    public static final SToothSurfaceCodeType B = new SToothSurfaceCodeType(_B);
    public static final SToothSurfaceCodeType F = new SToothSurfaceCodeType(_F);
    public static final SToothSurfaceCodeType I = new SToothSurfaceCodeType(_I);
    public static final SToothSurfaceCodeType O = new SToothSurfaceCodeType(_O);
    public java.lang.String getValue() { return _value_;}
    public static SToothSurfaceCodeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SToothSurfaceCodeType enumeration = (SToothSurfaceCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SToothSurfaceCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SToothSurfaceCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sToothSurfaceCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
