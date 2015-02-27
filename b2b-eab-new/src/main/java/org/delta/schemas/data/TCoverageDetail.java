/**
 * TCoverageDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of coverage detail
 */
public class TCoverageDetail  implements java.io.Serializable {
    private org.delta.schemas.data.TCoverageDetailCoordinationOfBenefit coordinationOfBenefit;

    private java.lang.Integer childCoveredAge;

    private java.lang.Integer studentCoveredAge;

    private java.lang.Integer childOrthoCoveredAge;

    private java.lang.Integer studentOrthoCoveredAge;

    private java.lang.Integer adultOrthoCoveredAge;

    /* The incentive plan */
    private org.delta.schemas.data.TCoverageDetailIncentivePlan incentivePlan;

    private java.lang.String programType;

    public TCoverageDetail() {
    }

    public TCoverageDetail(
           org.delta.schemas.data.TCoverageDetailCoordinationOfBenefit coordinationOfBenefit,
           java.lang.Integer childCoveredAge,
           java.lang.Integer studentCoveredAge,
           java.lang.Integer childOrthoCoveredAge,
           java.lang.Integer studentOrthoCoveredAge,
           java.lang.Integer adultOrthoCoveredAge,
           org.delta.schemas.data.TCoverageDetailIncentivePlan incentivePlan,
           java.lang.String programType) {
           this.coordinationOfBenefit = coordinationOfBenefit;
           this.childCoveredAge = childCoveredAge;
           this.studentCoveredAge = studentCoveredAge;
           this.childOrthoCoveredAge = childOrthoCoveredAge;
           this.studentOrthoCoveredAge = studentOrthoCoveredAge;
           this.adultOrthoCoveredAge = adultOrthoCoveredAge;
           this.incentivePlan = incentivePlan;
           this.programType = programType;
    }


    /**
     * Gets the coordinationOfBenefit value for this TCoverageDetail.
     * 
     * @return coordinationOfBenefit
     */
    public org.delta.schemas.data.TCoverageDetailCoordinationOfBenefit getCoordinationOfBenefit() {
        return coordinationOfBenefit;
    }


    /**
     * Sets the coordinationOfBenefit value for this TCoverageDetail.
     * 
     * @param coordinationOfBenefit
     */
    public void setCoordinationOfBenefit(org.delta.schemas.data.TCoverageDetailCoordinationOfBenefit coordinationOfBenefit) {
        this.coordinationOfBenefit = coordinationOfBenefit;
    }


    /**
     * Gets the childCoveredAge value for this TCoverageDetail.
     * 
     * @return childCoveredAge
     */
    public java.lang.Integer getChildCoveredAge() {
        return childCoveredAge;
    }


    /**
     * Sets the childCoveredAge value for this TCoverageDetail.
     * 
     * @param childCoveredAge
     */
    public void setChildCoveredAge(java.lang.Integer childCoveredAge) {
        this.childCoveredAge = childCoveredAge;
    }


    /**
     * Gets the studentCoveredAge value for this TCoverageDetail.
     * 
     * @return studentCoveredAge
     */
    public java.lang.Integer getStudentCoveredAge() {
        return studentCoveredAge;
    }


    /**
     * Sets the studentCoveredAge value for this TCoverageDetail.
     * 
     * @param studentCoveredAge
     */
    public void setStudentCoveredAge(java.lang.Integer studentCoveredAge) {
        this.studentCoveredAge = studentCoveredAge;
    }


    /**
     * Gets the childOrthoCoveredAge value for this TCoverageDetail.
     * 
     * @return childOrthoCoveredAge
     */
    public java.lang.Integer getChildOrthoCoveredAge() {
        return childOrthoCoveredAge;
    }


    /**
     * Sets the childOrthoCoveredAge value for this TCoverageDetail.
     * 
     * @param childOrthoCoveredAge
     */
    public void setChildOrthoCoveredAge(java.lang.Integer childOrthoCoveredAge) {
        this.childOrthoCoveredAge = childOrthoCoveredAge;
    }


    /**
     * Gets the studentOrthoCoveredAge value for this TCoverageDetail.
     * 
     * @return studentOrthoCoveredAge
     */
    public java.lang.Integer getStudentOrthoCoveredAge() {
        return studentOrthoCoveredAge;
    }


    /**
     * Sets the studentOrthoCoveredAge value for this TCoverageDetail.
     * 
     * @param studentOrthoCoveredAge
     */
    public void setStudentOrthoCoveredAge(java.lang.Integer studentOrthoCoveredAge) {
        this.studentOrthoCoveredAge = studentOrthoCoveredAge;
    }


    /**
     * Gets the adultOrthoCoveredAge value for this TCoverageDetail.
     * 
     * @return adultOrthoCoveredAge
     */
    public java.lang.Integer getAdultOrthoCoveredAge() {
        return adultOrthoCoveredAge;
    }


    /**
     * Sets the adultOrthoCoveredAge value for this TCoverageDetail.
     * 
     * @param adultOrthoCoveredAge
     */
    public void setAdultOrthoCoveredAge(java.lang.Integer adultOrthoCoveredAge) {
        this.adultOrthoCoveredAge = adultOrthoCoveredAge;
    }


    /**
     * Gets the incentivePlan value for this TCoverageDetail.
     * 
     * @return incentivePlan   * The incentive plan
     */
    public org.delta.schemas.data.TCoverageDetailIncentivePlan getIncentivePlan() {
        return incentivePlan;
    }


    /**
     * Sets the incentivePlan value for this TCoverageDetail.
     * 
     * @param incentivePlan   * The incentive plan
     */
    public void setIncentivePlan(org.delta.schemas.data.TCoverageDetailIncentivePlan incentivePlan) {
        this.incentivePlan = incentivePlan;
    }


    /**
     * Gets the programType value for this TCoverageDetail.
     * 
     * @return programType
     */
    public java.lang.String getProgramType() {
        return programType;
    }


    /**
     * Sets the programType value for this TCoverageDetail.
     * 
     * @param programType
     */
    public void setProgramType(java.lang.String programType) {
        this.programType = programType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCoverageDetail)) return false;
        TCoverageDetail other = (TCoverageDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coordinationOfBenefit==null && other.getCoordinationOfBenefit()==null) || 
             (this.coordinationOfBenefit!=null &&
              this.coordinationOfBenefit.equals(other.getCoordinationOfBenefit()))) &&
            ((this.childCoveredAge==null && other.getChildCoveredAge()==null) || 
             (this.childCoveredAge!=null &&
              this.childCoveredAge.equals(other.getChildCoveredAge()))) &&
            ((this.studentCoveredAge==null && other.getStudentCoveredAge()==null) || 
             (this.studentCoveredAge!=null &&
              this.studentCoveredAge.equals(other.getStudentCoveredAge()))) &&
            ((this.childOrthoCoveredAge==null && other.getChildOrthoCoveredAge()==null) || 
             (this.childOrthoCoveredAge!=null &&
              this.childOrthoCoveredAge.equals(other.getChildOrthoCoveredAge()))) &&
            ((this.studentOrthoCoveredAge==null && other.getStudentOrthoCoveredAge()==null) || 
             (this.studentOrthoCoveredAge!=null &&
              this.studentOrthoCoveredAge.equals(other.getStudentOrthoCoveredAge()))) &&
            ((this.adultOrthoCoveredAge==null && other.getAdultOrthoCoveredAge()==null) || 
             (this.adultOrthoCoveredAge!=null &&
              this.adultOrthoCoveredAge.equals(other.getAdultOrthoCoveredAge()))) &&
            ((this.incentivePlan==null && other.getIncentivePlan()==null) || 
             (this.incentivePlan!=null &&
              this.incentivePlan.equals(other.getIncentivePlan()))) &&
            ((this.programType==null && other.getProgramType()==null) || 
             (this.programType!=null &&
              this.programType.equals(other.getProgramType())));
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
        if (getCoordinationOfBenefit() != null) {
            _hashCode += getCoordinationOfBenefit().hashCode();
        }
        if (getChildCoveredAge() != null) {
            _hashCode += getChildCoveredAge().hashCode();
        }
        if (getStudentCoveredAge() != null) {
            _hashCode += getStudentCoveredAge().hashCode();
        }
        if (getChildOrthoCoveredAge() != null) {
            _hashCode += getChildOrthoCoveredAge().hashCode();
        }
        if (getStudentOrthoCoveredAge() != null) {
            _hashCode += getStudentOrthoCoveredAge().hashCode();
        }
        if (getAdultOrthoCoveredAge() != null) {
            _hashCode += getAdultOrthoCoveredAge().hashCode();
        }
        if (getIncentivePlan() != null) {
            _hashCode += getIncentivePlan().hashCode();
        }
        if (getProgramType() != null) {
            _hashCode += getProgramType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCoverageDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tCoverageDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinationOfBenefit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "coordinationOfBenefit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", ">tCoverageDetail>coordinationOfBenefit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childCoveredAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "childCoveredAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentCoveredAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "studentCoveredAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childOrthoCoveredAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "childOrthoCoveredAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentOrthoCoveredAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "studentOrthoCoveredAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adultOrthoCoveredAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "adultOrthoCoveredAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentivePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "incentivePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", ">tCoverageDetail>incentivePlan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "programType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
