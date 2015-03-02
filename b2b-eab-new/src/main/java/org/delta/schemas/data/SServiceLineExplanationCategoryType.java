/**
 * SServiceLineExplanationCategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class SServiceLineExplanationCategoryType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SServiceLineExplanationCategoryType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SERVICELINE = "SERVICELINE";
    public static final java.lang.String _DENIED = "DENIED";
    public static final java.lang.String _DISCOUNT = "DISCOUNT";
    public static final java.lang.String _ALLOWED = "ALLOWED";
    public static final java.lang.String _RISK = "RISK";
    public static final java.lang.String _DEDUCTIBLE = "DEDUCTIBLE";
    public static final java.lang.String _COPAY = "COPAY";
    public static final java.lang.String _COINSURANCE = "COINSURANCE";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _PAID = "PAID";
    public static final java.lang.String _OUTLIER = "OUTLIER";
    public static final java.lang.String _OTHERCARRIERLIABILITY = "OTHERCARRIERLIABILITY";
    public static final java.lang.String _PRICINGPENALTY = "PRICINGPENALTY";
    public static final java.lang.String _BENEFITSPENALTY = "BENEFITSPENALTY";
    public static final SServiceLineExplanationCategoryType SERVICELINE = new SServiceLineExplanationCategoryType(_SERVICELINE);
    public static final SServiceLineExplanationCategoryType DENIED = new SServiceLineExplanationCategoryType(_DENIED);
    public static final SServiceLineExplanationCategoryType DISCOUNT = new SServiceLineExplanationCategoryType(_DISCOUNT);
    public static final SServiceLineExplanationCategoryType ALLOWED = new SServiceLineExplanationCategoryType(_ALLOWED);
    public static final SServiceLineExplanationCategoryType RISK = new SServiceLineExplanationCategoryType(_RISK);
    public static final SServiceLineExplanationCategoryType DEDUCTIBLE = new SServiceLineExplanationCategoryType(_DEDUCTIBLE);
    public static final SServiceLineExplanationCategoryType COPAY = new SServiceLineExplanationCategoryType(_COPAY);
    public static final SServiceLineExplanationCategoryType COINSURANCE = new SServiceLineExplanationCategoryType(_COINSURANCE);
    public static final SServiceLineExplanationCategoryType APPROVED = new SServiceLineExplanationCategoryType(_APPROVED);
    public static final SServiceLineExplanationCategoryType PAID = new SServiceLineExplanationCategoryType(_PAID);
    public static final SServiceLineExplanationCategoryType OUTLIER = new SServiceLineExplanationCategoryType(_OUTLIER);
    public static final SServiceLineExplanationCategoryType OTHERCARRIERLIABILITY = new SServiceLineExplanationCategoryType(_OTHERCARRIERLIABILITY);
    public static final SServiceLineExplanationCategoryType PRICINGPENALTY = new SServiceLineExplanationCategoryType(_PRICINGPENALTY);
    public static final SServiceLineExplanationCategoryType BENEFITSPENALTY = new SServiceLineExplanationCategoryType(_BENEFITSPENALTY);
    public java.lang.String getValue() { return _value_;}
    public static SServiceLineExplanationCategoryType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SServiceLineExplanationCategoryType enumeration = (SServiceLineExplanationCategoryType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SServiceLineExplanationCategoryType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SServiceLineExplanationCategoryType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sServiceLineExplanationCategoryType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
