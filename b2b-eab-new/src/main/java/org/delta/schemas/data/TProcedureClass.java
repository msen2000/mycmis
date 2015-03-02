/**
 * TProcedureClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The definition of a procedure class object
 */
public class TProcedureClass  implements java.io.Serializable {
    private java.lang.String procedureClassificationCode;

    private java.lang.String procedureClassificationDescription;

    private org.sen.schemas.data.TProcedureCode[] procedureCodeList;

    public TProcedureClass() {
    }

    public TProcedureClass(
           java.lang.String procedureClassificationCode,
           java.lang.String procedureClassificationDescription,
           org.sen.schemas.data.TProcedureCode[] procedureCodeList) {
           this.procedureClassificationCode = procedureClassificationCode;
           this.procedureClassificationDescription = procedureClassificationDescription;
           this.procedureCodeList = procedureCodeList;
    }


    /**
     * Gets the procedureClassificationCode value for this TProcedureClass.
     * 
     * @return procedureClassificationCode
     */
    public java.lang.String getProcedureClassificationCode() {
        return procedureClassificationCode;
    }


    /**
     * Sets the procedureClassificationCode value for this TProcedureClass.
     * 
     * @param procedureClassificationCode
     */
    public void setProcedureClassificationCode(java.lang.String procedureClassificationCode) {
        this.procedureClassificationCode = procedureClassificationCode;
    }


    /**
     * Gets the procedureClassificationDescription value for this TProcedureClass.
     * 
     * @return procedureClassificationDescription
     */
    public java.lang.String getProcedureClassificationDescription() {
        return procedureClassificationDescription;
    }


    /**
     * Sets the procedureClassificationDescription value for this TProcedureClass.
     * 
     * @param procedureClassificationDescription
     */
    public void setProcedureClassificationDescription(java.lang.String procedureClassificationDescription) {
        this.procedureClassificationDescription = procedureClassificationDescription;
    }


    /**
     * Gets the procedureCodeList value for this TProcedureClass.
     * 
     * @return procedureCodeList
     */
    public org.sen.schemas.data.TProcedureCode[] getProcedureCodeList() {
        return procedureCodeList;
    }


    /**
     * Sets the procedureCodeList value for this TProcedureClass.
     * 
     * @param procedureCodeList
     */
    public void setProcedureCodeList(org.sen.schemas.data.TProcedureCode[] procedureCodeList) {
        this.procedureCodeList = procedureCodeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TProcedureClass)) return false;
        TProcedureClass other = (TProcedureClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.procedureClassificationCode==null && other.getProcedureClassificationCode()==null) || 
             (this.procedureClassificationCode!=null &&
              this.procedureClassificationCode.equals(other.getProcedureClassificationCode()))) &&
            ((this.procedureClassificationDescription==null && other.getProcedureClassificationDescription()==null) || 
             (this.procedureClassificationDescription!=null &&
              this.procedureClassificationDescription.equals(other.getProcedureClassificationDescription()))) &&
            ((this.procedureCodeList==null && other.getProcedureCodeList()==null) || 
             (this.procedureCodeList!=null &&
              java.util.Arrays.equals(this.procedureCodeList, other.getProcedureCodeList())));
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
        if (getProcedureClassificationCode() != null) {
            _hashCode += getProcedureClassificationCode().hashCode();
        }
        if (getProcedureClassificationDescription() != null) {
            _hashCode += getProcedureClassificationDescription().hashCode();
        }
        if (getProcedureCodeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcedureCodeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcedureCodeList(), i);
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
        new org.apache.axis.description.TypeDesc(TProcedureClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedureClassificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureClassificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedureClassificationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureClassificationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedureCodeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureCodeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tProcedureCode"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "procedureCode"));
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
