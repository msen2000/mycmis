/**
 * TBenefitPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a benefit package object
 */
public class TBenefitPackage  implements java.io.Serializable {
    /* The benefit package identifier */
    private java.lang.String benefitPackageIdentifier;

    private org.delta.schemas.data.TTreatment[] treatmentList;

    private org.delta.schemas.data.TMaximumDeductible[] deductibles;

    private org.delta.schemas.data.TMaximumDeductible[] maximums;

    private org.delta.schemas.data.TCoverageDetail coverageDetail;

    public TBenefitPackage() {
    }

    public TBenefitPackage(
           java.lang.String benefitPackageIdentifier,
           org.delta.schemas.data.TTreatment[] treatmentList,
           org.delta.schemas.data.TMaximumDeductible[] deductibles,
           org.delta.schemas.data.TMaximumDeductible[] maximums,
           org.delta.schemas.data.TCoverageDetail coverageDetail) {
           this.benefitPackageIdentifier = benefitPackageIdentifier;
           this.treatmentList = treatmentList;
           this.deductibles = deductibles;
           this.maximums = maximums;
           this.coverageDetail = coverageDetail;
    }


    /**
     * Gets the benefitPackageIdentifier value for this TBenefitPackage.
     * 
     * @return benefitPackageIdentifier   * The benefit package identifier
     */
    public java.lang.String getBenefitPackageIdentifier() {
        return benefitPackageIdentifier;
    }


    /**
     * Sets the benefitPackageIdentifier value for this TBenefitPackage.
     * 
     * @param benefitPackageIdentifier   * The benefit package identifier
     */
    public void setBenefitPackageIdentifier(java.lang.String benefitPackageIdentifier) {
        this.benefitPackageIdentifier = benefitPackageIdentifier;
    }


    /**
     * Gets the treatmentList value for this TBenefitPackage.
     * 
     * @return treatmentList
     */
    public org.delta.schemas.data.TTreatment[] getTreatmentList() {
        return treatmentList;
    }


    /**
     * Sets the treatmentList value for this TBenefitPackage.
     * 
     * @param treatmentList
     */
    public void setTreatmentList(org.delta.schemas.data.TTreatment[] treatmentList) {
        this.treatmentList = treatmentList;
    }


    /**
     * Gets the deductibles value for this TBenefitPackage.
     * 
     * @return deductibles
     */
    public org.delta.schemas.data.TMaximumDeductible[] getDeductibles() {
        return deductibles;
    }


    /**
     * Sets the deductibles value for this TBenefitPackage.
     * 
     * @param deductibles
     */
    public void setDeductibles(org.delta.schemas.data.TMaximumDeductible[] deductibles) {
        this.deductibles = deductibles;
    }


    /**
     * Gets the maximums value for this TBenefitPackage.
     * 
     * @return maximums
     */
    public org.delta.schemas.data.TMaximumDeductible[] getMaximums() {
        return maximums;
    }


    /**
     * Sets the maximums value for this TBenefitPackage.
     * 
     * @param maximums
     */
    public void setMaximums(org.delta.schemas.data.TMaximumDeductible[] maximums) {
        this.maximums = maximums;
    }


    /**
     * Gets the coverageDetail value for this TBenefitPackage.
     * 
     * @return coverageDetail
     */
    public org.delta.schemas.data.TCoverageDetail getCoverageDetail() {
        return coverageDetail;
    }


    /**
     * Sets the coverageDetail value for this TBenefitPackage.
     * 
     * @param coverageDetail
     */
    public void setCoverageDetail(org.delta.schemas.data.TCoverageDetail coverageDetail) {
        this.coverageDetail = coverageDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBenefitPackage)) return false;
        TBenefitPackage other = (TBenefitPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.benefitPackageIdentifier==null && other.getBenefitPackageIdentifier()==null) || 
             (this.benefitPackageIdentifier!=null &&
              this.benefitPackageIdentifier.equals(other.getBenefitPackageIdentifier()))) &&
            ((this.treatmentList==null && other.getTreatmentList()==null) || 
             (this.treatmentList!=null &&
              java.util.Arrays.equals(this.treatmentList, other.getTreatmentList()))) &&
            ((this.deductibles==null && other.getDeductibles()==null) || 
             (this.deductibles!=null &&
              java.util.Arrays.equals(this.deductibles, other.getDeductibles()))) &&
            ((this.maximums==null && other.getMaximums()==null) || 
             (this.maximums!=null &&
              java.util.Arrays.equals(this.maximums, other.getMaximums()))) &&
            ((this.coverageDetail==null && other.getCoverageDetail()==null) || 
             (this.coverageDetail!=null &&
              this.coverageDetail.equals(other.getCoverageDetail())));
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
        if (getBenefitPackageIdentifier() != null) {
            _hashCode += getBenefitPackageIdentifier().hashCode();
        }
        if (getTreatmentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTreatmentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTreatmentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeductibles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeductibles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeductibles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaximums() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaximums());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaximums(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCoverageDetail() != null) {
            _hashCode += getCoverageDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBenefitPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tBenefitPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitPackageIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "benefitPackageIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "treatmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tTreatment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "treatment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductibles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "deductibles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tMaximumDeductible"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "deductible"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximums");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "maximums"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tMaximumDeductible"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "maximum"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "coverageDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tCoverageDetail"));
        elemField.setMinOccurs(0);
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
