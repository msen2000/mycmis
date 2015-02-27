/**
 * SProviderParticipationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;

public class SProviderParticipationStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SProviderParticipationStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "01";
    public static final java.lang.String _value2 = "20";
    public static final java.lang.String _value3 = "22";
    public static final java.lang.String _value4 = "50";
    public static final java.lang.String _value5 = "A1";
    public static final java.lang.String _value6 = "A2";
    public static final java.lang.String _value7 = "CP";
    public static final java.lang.String _value8 = "NP";
    public static final java.lang.String _value9 = "OO";
    public static final java.lang.String _value10 = "R1";
    public static final java.lang.String _value11 = "TP";
    public static final SProviderParticipationStatus Premier = new SProviderParticipationStatus(_value1);
    public static final SProviderParticipationStatus PPO = new SProviderParticipationStatus(_value2);
    public static final SProviderParticipationStatus Boeing = new SProviderParticipationStatus(_value3);
    public static final SProviderParticipationStatus PPOFlex = new SProviderParticipationStatus(_value4);
    public static final SProviderParticipationStatus A1 = new SProviderParticipationStatus(_value5);
    public static final SProviderParticipationStatus A2 = new SProviderParticipationStatus(_value6);
    public static final SProviderParticipationStatus CP = new SProviderParticipationStatus(_value7);
    public static final SProviderParticipationStatus NP = new SProviderParticipationStatus(_value8);
    public static final SProviderParticipationStatus OO = new SProviderParticipationStatus(_value9);
    public static final SProviderParticipationStatus R1 = new SProviderParticipationStatus(_value10);
    public static final SProviderParticipationStatus TP = new SProviderParticipationStatus(_value11);
    public java.lang.String getValue() { return _value_;}
    public static SProviderParticipationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SProviderParticipationStatus enumeration = (SProviderParticipationStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SProviderParticipationStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SProviderParticipationStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "sProviderParticipationStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
