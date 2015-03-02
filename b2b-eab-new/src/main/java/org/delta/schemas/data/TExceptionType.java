/**
 * TExceptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class TExceptionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TExceptionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PRIVACY_RESTRICTION = "PRIVACY_RESTRICTION";
    public static final java.lang.String _NO_ACTIVE_COVERAGE_FOUND = "NO_ACTIVE_COVERAGE_FOUND";
    public static final java.lang.String _REQUEST_GD_NOT_FOUND = "REQUEST_GD_NOT_FOUND";
    public static final java.lang.String _NO_GD_FOUND = "NO_GD_FOUND";
    public static final java.lang.String _GROUP_ACTIVE_PATIENT_INACTIVE = "GROUP_ACTIVE_PATIENT_INACTIVE";
    public static final java.lang.String _MISSING_REQUIRED_ELEMENT = "MISSING_REQUIRED_ELEMENT";
    public static final java.lang.String _SUBSCRIBER_NOT_FOUND = "SUBSCRIBER_NOT_FOUND";
    public static final java.lang.String _DEPENDENT_NOT_FOUND = "DEPENDENT_NOT_FOUND";
    public static final java.lang.String _GROUP_EXCEPTION = "GROUP_EXCEPTION";
    public static final TExceptionType PRIVACY_RESTRICTION = new TExceptionType(_PRIVACY_RESTRICTION);
    public static final TExceptionType NO_ACTIVE_COVERAGE_FOUND = new TExceptionType(_NO_ACTIVE_COVERAGE_FOUND);
    public static final TExceptionType REQUEST_GD_NOT_FOUND = new TExceptionType(_REQUEST_GD_NOT_FOUND);
    public static final TExceptionType NO_GD_FOUND = new TExceptionType(_NO_GD_FOUND);
    public static final TExceptionType GROUP_ACTIVE_PATIENT_INACTIVE = new TExceptionType(_GROUP_ACTIVE_PATIENT_INACTIVE);
    public static final TExceptionType MISSING_REQUIRED_ELEMENT = new TExceptionType(_MISSING_REQUIRED_ELEMENT);
    public static final TExceptionType SUBSCRIBER_NOT_FOUND = new TExceptionType(_SUBSCRIBER_NOT_FOUND);
    public static final TExceptionType DEPENDENT_NOT_FOUND = new TExceptionType(_DEPENDENT_NOT_FOUND);
    public static final TExceptionType GROUP_EXCEPTION = new TExceptionType(_GROUP_EXCEPTION);
    public java.lang.String getValue() { return _value_;}
    public static TExceptionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TExceptionType enumeration = (TExceptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TExceptionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TExceptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tExceptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
