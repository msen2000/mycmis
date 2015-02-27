/**
 * TNetworkTier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a Network tier package object
 */
public class TNetworkTier  implements java.io.Serializable {
    private java.lang.String networkDescription;

    private org.delta.schemas.data.TBenefitInfo[] benefitClass;

    public TNetworkTier() {
    }

    public TNetworkTier(
           java.lang.String networkDescription,
           org.delta.schemas.data.TBenefitInfo[] benefitClass) {
           this.networkDescription = networkDescription;
           this.benefitClass = benefitClass;
    }


    /**
     * Gets the networkDescription value for this TNetworkTier.
     * 
     * @return networkDescription
     */
    public java.lang.String getNetworkDescription() {
        return networkDescription;
    }


    /**
     * Sets the networkDescription value for this TNetworkTier.
     * 
     * @param networkDescription
     */
    public void setNetworkDescription(java.lang.String networkDescription) {
        this.networkDescription = networkDescription;
    }


    /**
     * Gets the benefitClass value for this TNetworkTier.
     * 
     * @return benefitClass
     */
    public org.delta.schemas.data.TBenefitInfo[] getBenefitClass() {
        return benefitClass;
    }


    /**
     * Sets the benefitClass value for this TNetworkTier.
     * 
     * @param benefitClass
     */
    public void setBenefitClass(org.delta.schemas.data.TBenefitInfo[] benefitClass) {
        this.benefitClass = benefitClass;
    }

    public org.delta.schemas.data.TBenefitInfo getBenefitClass(int i) {
        return this.benefitClass[i];
    }

    public void setBenefitClass(int i, org.delta.schemas.data.TBenefitInfo _value) {
        this.benefitClass[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TNetworkTier)) return false;
        TNetworkTier other = (TNetworkTier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkDescription==null && other.getNetworkDescription()==null) || 
             (this.networkDescription!=null &&
              this.networkDescription.equals(other.getNetworkDescription()))) &&
            ((this.benefitClass==null && other.getBenefitClass()==null) || 
             (this.benefitClass!=null &&
              java.util.Arrays.equals(this.benefitClass, other.getBenefitClass())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNetworkDescription() != null) {
            _hashCode += getNetworkDescription().hashCode();
        }
        if (getBenefitClass() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBenefitClass());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBenefitClass(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TNetworkTier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tNetworkTier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "NetworkDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "BenefitClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tBenefitInfo"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
