/**
 * TContractListResponses.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sen.schemas.data;


/**
 * The response of the eligibility requests
 */
public class TContractListResponses  implements java.io.Serializable {
    private org.sen.schemas.data.TContract[] contractList;

    private org.sen.schemas.data.SContractResponseStatusType contractResponseStatus;

    private org.sen.schemas.data.TBenefitPackageInquiryResponse benefitPackage;

    public TContractListResponses() {
    }

    public TContractListResponses(
           org.sen.schemas.data.TContract[] contractList,
           org.sen.schemas.data.SContractResponseStatusType contractResponseStatus,
           org.sen.schemas.data.TBenefitPackageInquiryResponse benefitPackage) {
           this.contractList = contractList;
           this.contractResponseStatus = contractResponseStatus;
           this.benefitPackage = benefitPackage;
    }


    /**
     * Gets the contractList value for this TContractListResponses.
     * 
     * @return contractList
     */
    public org.sen.schemas.data.TContract[] getContractList() {
        return contractList;
    }


    /**
     * Sets the contractList value for this TContractListResponses.
     * 
     * @param contractList
     */
    public void setContractList(org.sen.schemas.data.TContract[] contractList) {
        this.contractList = contractList;
    }


    /**
     * Gets the contractResponseStatus value for this TContractListResponses.
     * 
     * @return contractResponseStatus
     */
    public org.sen.schemas.data.SContractResponseStatusType getContractResponseStatus() {
        return contractResponseStatus;
    }


    /**
     * Sets the contractResponseStatus value for this TContractListResponses.
     * 
     * @param contractResponseStatus
     */
    public void setContractResponseStatus(org.sen.schemas.data.SContractResponseStatusType contractResponseStatus) {
        this.contractResponseStatus = contractResponseStatus;
    }


    /**
     * Gets the benefitPackage value for this TContractListResponses.
     * 
     * @return benefitPackage
     */
    public org.sen.schemas.data.TBenefitPackageInquiryResponse getBenefitPackage() {
        return benefitPackage;
    }


    /**
     * Sets the benefitPackage value for this TContractListResponses.
     * 
     * @param benefitPackage
     */
    public void setBenefitPackage(org.sen.schemas.data.TBenefitPackageInquiryResponse benefitPackage) {
        this.benefitPackage = benefitPackage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TContractListResponses)) return false;
        TContractListResponses other = (TContractListResponses) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contractList==null && other.getContractList()==null) || 
             (this.contractList!=null &&
              java.util.Arrays.equals(this.contractList, other.getContractList()))) &&
            ((this.contractResponseStatus==null && other.getContractResponseStatus()==null) || 
             (this.contractResponseStatus!=null &&
              this.contractResponseStatus.equals(other.getContractResponseStatus()))) &&
            ((this.benefitPackage==null && other.getBenefitPackage()==null) || 
             (this.benefitPackage!=null &&
              this.benefitPackage.equals(other.getBenefitPackage())));
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
        if (getContractList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContractList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContractList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContractResponseStatus() != null) {
            _hashCode += getContractResponseStatus().hashCode();
        }
        if (getBenefitPackage() != null) {
            _hashCode += getBenefitPackage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TContractListResponses.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContractListResponses"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "contractList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tContract"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "contract"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractResponseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "contractResponseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "sContractResponseStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.sen.org/data", "benefitPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.sen.org/data", "tBenefitPackageInquiryResponse"));
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
