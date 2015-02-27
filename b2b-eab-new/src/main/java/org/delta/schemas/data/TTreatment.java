/**
 * TTreatment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a treatment object
 */
public class TTreatment  implements java.io.Serializable {
    /* The treatment type code */
    private java.lang.String treatmentTypeCode;

    /* The description of the treatment Type. */
    private java.lang.String treatmentTypeDescription;

    private org.delta.schemas.data.TTreatmentSummary[] treatmentSummaries;

    private org.delta.schemas.data.TProcedureClass[] procedureClassList;

    public TTreatment() {
    }

    public TTreatment(
           java.lang.String treatmentTypeCode,
           java.lang.String treatmentTypeDescription,
           org.delta.schemas.data.TTreatmentSummary[] treatmentSummaries,
           org.delta.schemas.data.TProcedureClass[] procedureClassList) {
           this.treatmentTypeCode = treatmentTypeCode;
           this.treatmentTypeDescription = treatmentTypeDescription;
           this.treatmentSummaries = treatmentSummaries;
           this.procedureClassList = procedureClassList;
    }


    /**
     * Gets the treatmentTypeCode value for this TTreatment.
     * 
     * @return treatmentTypeCode   * The treatment type code
     */
    public java.lang.String getTreatmentTypeCode() {
        return treatmentTypeCode;
    }


    /**
     * Sets the treatmentTypeCode value for this TTreatment.
     * 
     * @param treatmentTypeCode   * The treatment type code
     */
    public void setTreatmentTypeCode(java.lang.String treatmentTypeCode) {
        this.treatmentTypeCode = treatmentTypeCode;
    }


    /**
     * Gets the treatmentTypeDescription value for this TTreatment.
     * 
     * @return treatmentTypeDescription   * The description of the treatment Type.
     */
    public java.lang.String getTreatmentTypeDescription() {
        return treatmentTypeDescription;
    }


    /**
     * Sets the treatmentTypeDescription value for this TTreatment.
     * 
     * @param treatmentTypeDescription   * The description of the treatment Type.
     */
    public void setTreatmentTypeDescription(java.lang.String treatmentTypeDescription) {
        this.treatmentTypeDescription = treatmentTypeDescription;
    }


    /**
     * Gets the treatmentSummaries value for this TTreatment.
     * 
     * @return treatmentSummaries
     */
    public org.delta.schemas.data.TTreatmentSummary[] getTreatmentSummaries() {
        return treatmentSummaries;
    }


    /**
     * Sets the treatmentSummaries value for this TTreatment.
     * 
     * @param treatmentSummaries
     */
    public void setTreatmentSummaries(org.delta.schemas.data.TTreatmentSummary[] treatmentSummaries) {
        this.treatmentSummaries = treatmentSummaries;
    }


    /**
     * Gets the procedureClassList value for this TTreatment.
     * 
     * @return procedureClassList
     */
    public org.delta.schemas.data.TProcedureClass[] getProcedureClassList() {
        return procedureClassList;
    }


    /**
     * Sets the procedureClassList value for this TTreatment.
     * 
     * @param procedureClassList
     */
    public void setProcedureClassList(org.delta.schemas.data.TProcedureClass[] procedureClassList) {
        this.procedureClassList = procedureClassList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TTreatment)) return false;
        TTreatment other = (TTreatment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.treatmentTypeCode==null && other.getTreatmentTypeCode()==null) || 
             (this.treatmentTypeCode!=null &&
              this.treatmentTypeCode.equals(other.getTreatmentTypeCode()))) &&
            ((this.treatmentTypeDescription==null && other.getTreatmentTypeDescription()==null) || 
             (this.treatmentTypeDescription!=null &&
              this.treatmentTypeDescription.equals(other.getTreatmentTypeDescription()))) &&
            ((this.treatmentSummaries==null && other.getTreatmentSummaries()==null) || 
             (this.treatmentSummaries!=null &&
              java.util.Arrays.equals(this.treatmentSummaries, other.getTreatmentSummaries()))) &&
            ((this.procedureClassList==null && other.getProcedureClassList()==null) || 
             (this.procedureClassList!=null &&
              java.util.Arrays.equals(this.procedureClassList, other.getProcedureClassList())));
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
        if (getTreatmentTypeCode() != null) {
            _hashCode += getTreatmentTypeCode().hashCode();
        }
        if (getTreatmentTypeDescription() != null) {
            _hashCode += getTreatmentTypeDescription().hashCode();
        }
        if (getTreatmentSummaries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTreatmentSummaries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTreatmentSummaries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcedureClassList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcedureClassList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcedureClassList(), i);
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
        new org.apache.axis.description.TypeDesc(TTreatment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tTreatment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "treatmentTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "treatmentTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentSummaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "treatmentSummaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tTreatmentSummary"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "treatmentSummary"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedureClassList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "procedureClassList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tProcedureClass"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "procedureClass"));
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
