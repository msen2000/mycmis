/**
 * STimeUnitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class STimeUnitType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected STimeUnitType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _D = "D";
    public static final java.lang.String _M = "M";
    public static final java.lang.String _Y = "Y";
    public static final java.lang.String _L = "L";
    public static final java.lang.String _C = "C";
    public static final java.lang.String _S = "S";
    public static final STimeUnitType D = new STimeUnitType(_D);
    public static final STimeUnitType M = new STimeUnitType(_M);
    public static final STimeUnitType Y = new STimeUnitType(_Y);
    public static final STimeUnitType L = new STimeUnitType(_L);
    public static final STimeUnitType C = new STimeUnitType(_C);
    public static final STimeUnitType S = new STimeUnitType(_S);
    public java.lang.String getValue() { return _value_;}
    public static STimeUnitType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        STimeUnitType enumeration = (STimeUnitType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static STimeUnitType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(STimeUnitType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sTimeUnitType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
