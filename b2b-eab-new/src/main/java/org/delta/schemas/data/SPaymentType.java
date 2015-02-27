/**
 * SPaymentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class SPaymentType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SPaymentType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CHK = "CHK";
    public static final java.lang.String _ACH = "ACH";
    public static final java.lang.String _REM = "REM";
    public static final java.lang.String _EOB = "EOB";
    public static final java.lang.String _MAN = "MAN";
    public static final java.lang.String _PDT = "PDT";
    public static final java.lang.String _RFC = "RFC";
    public static final java.lang.String _RFA = "RFA";
    public static final SPaymentType CHK = new SPaymentType(_CHK);
    public static final SPaymentType ACH = new SPaymentType(_ACH);
    public static final SPaymentType REM = new SPaymentType(_REM);
    public static final SPaymentType EOB = new SPaymentType(_EOB);
    public static final SPaymentType MAN = new SPaymentType(_MAN);
    public static final SPaymentType PDT = new SPaymentType(_PDT);
    public static final SPaymentType RFC = new SPaymentType(_RFC);
    public static final SPaymentType RFA = new SPaymentType(_RFA);
    public java.lang.String getValue() { return _value_;}
    public static SPaymentType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SPaymentType enumeration = (SPaymentType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SPaymentType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SPaymentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sPaymentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
