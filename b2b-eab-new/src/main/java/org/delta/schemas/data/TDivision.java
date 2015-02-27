/**
 * TDivision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a group-devision object (covered entity)
 */
public class TDivision  implements java.io.Serializable {
    private java.lang.String divisionNumber;

    private java.lang.String divisionName;

    private boolean divisionSelfFunded;

    public TDivision() {
    }

    public TDivision(
           java.lang.String divisionNumber,
           java.lang.String divisionName,
           boolean divisionSelfFunded) {
           this.divisionNumber = divisionNumber;
           this.divisionName = divisionName;
           this.divisionSelfFunded = divisionSelfFunded;
    }


    /**
     * Gets the divisionNumber value for this TDivision.
     * 
     * @return divisionNumber
     */
    public java.lang.String getDivisionNumber() {
        return divisionNumber;
    }


    /**
     * Sets the divisionNumber value for this TDivision.
     * 
     * @param divisionNumber
     */
    public void setDivisionNumber(java.lang.String divisionNumber) {
        this.divisionNumber = divisionNumber;
    }


    /**
     * Gets the divisionName value for this TDivision.
     * 
     * @return divisionName
     */
    public java.lang.String getDivisionName() {
        return divisionName;
    }


    /**
     * Sets the divisionName value for this TDivision.
     * 
     * @param divisionName
     */
    public void setDivisionName(java.lang.String divisionName) {
        this.divisionName = divisionName;
    }


    /**
     * Gets the divisionSelfFunded value for this TDivision.
     * 
     * @return divisionSelfFunded
     */
    public boolean isDivisionSelfFunded() {
        return divisionSelfFunded;
    }


    /**
     * Sets the divisionSelfFunded value for this TDivision.
     * 
     * @param divisionSelfFunded
     */
    public void setDivisionSelfFunded(boolean divisionSelfFunded) {
        this.divisionSelfFunded = divisionSelfFunded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDivision)) return false;
        TDivision other = (TDivision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.divisionNumber==null && other.getDivisionNumber()==null) || 
             (this.divisionNumber!=null &&
              this.divisionNumber.equals(other.getDivisionNumber()))) &&
            ((this.divisionName==null && other.getDivisionName()==null) || 
             (this.divisionName!=null &&
              this.divisionName.equals(other.getDivisionName()))) &&
            this.divisionSelfFunded == other.isDivisionSelfFunded();
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
        if (getDivisionNumber() != null) {
            _hashCode += getDivisionNumber().hashCode();
        }
        if (getDivisionName() != null) {
            _hashCode += getDivisionName().hashCode();
        }
        _hashCode += (isDivisionSelfFunded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TDivision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tDivision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "divisionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "divisionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divisionSelfFunded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "divisionSelfFunded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
