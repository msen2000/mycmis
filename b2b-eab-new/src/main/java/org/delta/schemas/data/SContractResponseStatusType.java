/**
 * SContractResponseStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class SContractResponseStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SContractResponseStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OK = "OK";
    public static final java.lang.String _NO_MATCHING_ENROLLEE = "NO_MATCHING_ENROLLEE";
    public static final java.lang.String _MULTI_MATCHING_ENROLLEE = "MULTI_MATCHING_ENROLLEE";
    public static final java.lang.String _DOB_MISMATCH = "DOB_MISMATCH";
    public static final java.lang.String _MORE_THAN_2 = "MORE_THAN_2";
    public static final java.lang.String _DOB_FILTERED = "DOB_FILTERED";
    public static final java.lang.String _CONTRACT_FILTERED = "CONTRACT_FILTERED";
    public static final java.lang.String _CONTRACT_TERMINATED = "CONTRACT_TERMINATED";
    public static final SContractResponseStatusType OK = new SContractResponseStatusType(_OK);
    public static final SContractResponseStatusType NO_MATCHING_ENROLLEE = new SContractResponseStatusType(_NO_MATCHING_ENROLLEE);
    public static final SContractResponseStatusType MULTI_MATCHING_ENROLLEE = new SContractResponseStatusType(_MULTI_MATCHING_ENROLLEE);
    public static final SContractResponseStatusType DOB_MISMATCH = new SContractResponseStatusType(_DOB_MISMATCH);
    public static final SContractResponseStatusType MORE_THAN_2 = new SContractResponseStatusType(_MORE_THAN_2);
    public static final SContractResponseStatusType DOB_FILTERED = new SContractResponseStatusType(_DOB_FILTERED);
    public static final SContractResponseStatusType CONTRACT_FILTERED = new SContractResponseStatusType(_CONTRACT_FILTERED);
    public static final SContractResponseStatusType CONTRACT_TERMINATED = new SContractResponseStatusType(_CONTRACT_TERMINATED);
    public java.lang.String getValue() { return _value_;}
    public static SContractResponseStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SContractResponseStatusType enumeration = (SContractResponseStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SContractResponseStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SContractResponseStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sContractResponseStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
