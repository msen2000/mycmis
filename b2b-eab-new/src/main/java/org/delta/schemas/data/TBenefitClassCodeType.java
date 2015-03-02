/**
 * TBenefitClassCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class TBenefitClassCodeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TBenefitClassCodeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Diagnostic = "Diagnostic";
    public static final java.lang.String _Crowns = "Crowns";
    public static final java.lang.String _Prosthodontics = "Prosthodontics";
    public static final java.lang.String _Orthodontic = "Orthodontic";
    public static final java.lang.String _Basic = "Basic";
    public static final TBenefitClassCodeType Diagnostic = new TBenefitClassCodeType(_Diagnostic);
    public static final TBenefitClassCodeType Crowns = new TBenefitClassCodeType(_Crowns);
    public static final TBenefitClassCodeType Prosthodontics = new TBenefitClassCodeType(_Prosthodontics);
    public static final TBenefitClassCodeType Orthodontic = new TBenefitClassCodeType(_Orthodontic);
    public static final TBenefitClassCodeType Basic = new TBenefitClassCodeType(_Basic);
    public java.lang.String getValue() { return _value_;}
    public static TBenefitClassCodeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TBenefitClassCodeType enumeration = (TBenefitClassCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TBenefitClassCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TBenefitClassCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBenefitClassCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
