/**
 * TException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;

public class TException  implements java.io.Serializable {
    private org.sen.schemas.data.TExceptionType exception;

    private java.lang.String exceptionDescription;

    public TException() {
    }

    public TException(
           org.sen.schemas.data.TExceptionType exception,
           java.lang.String exceptionDescription) {
           this.exception = exception;
           this.exceptionDescription = exceptionDescription;
    }


    /**
     * Gets the exception value for this TException.
     * 
     * @return exception
     */
    public org.sen.schemas.data.TExceptionType getException() {
        return exception;
    }


    /**
     * Sets the exception value for this TException.
     * 
     * @param exception
     */
    public void setException(org.sen.schemas.data.TExceptionType exception) {
        this.exception = exception;
    }


    /**
     * Gets the exceptionDescription value for this TException.
     * 
     * @return exceptionDescription
     */
    public java.lang.String getExceptionDescription() {
        return exceptionDescription;
    }


    /**
     * Sets the exceptionDescription value for this TException.
     * 
     * @param exceptionDescription
     */
    public void setExceptionDescription(java.lang.String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TException)) return false;
        TException other = (TException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exception==null && other.getException()==null) || 
             (this.exception!=null &&
              this.exception.equals(other.getException()))) &&
            ((this.exceptionDescription==null && other.getExceptionDescription()==null) || 
             (this.exceptionDescription!=null &&
              this.exceptionDescription.equals(other.getExceptionDescription())));
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
        if (getException() != null) {
            _hashCode += getException().hashCode();
        }
        if (getExceptionDescription() != null) {
            _hashCode += getExceptionDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exception");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "Exception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tExceptionType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "ExceptionDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
