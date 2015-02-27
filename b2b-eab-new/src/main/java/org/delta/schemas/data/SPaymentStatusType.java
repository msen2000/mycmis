/**
 * SPaymentStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class SPaymentStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SPaymentStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _I = "I";
    public static final java.lang.String _C = "C";
    public static final java.lang.String _O = "O";
    public static final java.lang.String _R = "R";
    public static final java.lang.String _V = "V";
    public static final java.lang.String _P = "P";
    public static final java.lang.String _S = "S";
    public static final java.lang.String _X = "X";
    public static final java.lang.String _T = "T";
    public static final java.lang.String _Z = "Z";
    public static final java.lang.String _E = "E";
    public static final SPaymentStatusType I = new SPaymentStatusType(_I);
    public static final SPaymentStatusType C = new SPaymentStatusType(_C);
    public static final SPaymentStatusType O = new SPaymentStatusType(_O);
    public static final SPaymentStatusType R = new SPaymentStatusType(_R);
    public static final SPaymentStatusType V = new SPaymentStatusType(_V);
    public static final SPaymentStatusType P = new SPaymentStatusType(_P);
    public static final SPaymentStatusType S = new SPaymentStatusType(_S);
    public static final SPaymentStatusType X = new SPaymentStatusType(_X);
    public static final SPaymentStatusType T = new SPaymentStatusType(_T);
    public static final SPaymentStatusType Z = new SPaymentStatusType(_Z);
    public static final SPaymentStatusType E = new SPaymentStatusType(_E);
    public java.lang.String getValue() { return _value_;}
    public static SPaymentStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SPaymentStatusType enumeration = (SPaymentStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SPaymentStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SPaymentStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sPaymentStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
