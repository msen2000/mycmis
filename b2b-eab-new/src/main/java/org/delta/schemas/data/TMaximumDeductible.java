/**
 * TMaximumDeductible.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The base type for maximums or deductibles
 */
public class TMaximumDeductible  implements java.io.Serializable {
    private java.lang.String tierType;

    private java.lang.String description;

    private java.lang.String level;

    private java.lang.String appliesTo;

    private java.lang.String timeUnit;

    private java.lang.Integer intervalNumber;

    private java.lang.String intervalUnitDescription;

    private java.lang.Double amount;

    private java.util.Date accumulationBeginDate;

    private java.util.Date accumulationEndDate;

    private java.lang.Double remaining;

    public TMaximumDeductible() {
    }

    public TMaximumDeductible(
           java.lang.String tierType,
           java.lang.String description,
           java.lang.String level,
           java.lang.String appliesTo,
           java.lang.String timeUnit,
           java.lang.Integer intervalNumber,
           java.lang.String intervalUnitDescription,
           java.lang.Double amount,
           java.util.Date accumulationBeginDate,
           java.util.Date accumulationEndDate,
           java.lang.Double remaining) {
           this.tierType = tierType;
           this.description = description;
           this.level = level;
           this.appliesTo = appliesTo;
           this.timeUnit = timeUnit;
           this.intervalNumber = intervalNumber;
           this.intervalUnitDescription = intervalUnitDescription;
           this.amount = amount;
           this.accumulationBeginDate = accumulationBeginDate;
           this.accumulationEndDate = accumulationEndDate;
           this.remaining = remaining;
    }


    /**
     * Gets the tierType value for this TMaximumDeductible.
     * 
     * @return tierType
     */
    public java.lang.String getTierType() {
        return tierType;
    }


    /**
     * Sets the tierType value for this TMaximumDeductible.
     * 
     * @param tierType
     */
    public void setTierType(java.lang.String tierType) {
        this.tierType = tierType;
    }


    /**
     * Gets the description value for this TMaximumDeductible.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TMaximumDeductible.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the level value for this TMaximumDeductible.
     * 
     * @return level
     */
    public java.lang.String getLevel() {
        return level;
    }


    /**
     * Sets the level value for this TMaximumDeductible.
     * 
     * @param level
     */
    public void setLevel(java.lang.String level) {
        this.level = level;
    }


    /**
     * Gets the appliesTo value for this TMaximumDeductible.
     * 
     * @return appliesTo
     */
    public java.lang.String getAppliesTo() {
        return appliesTo;
    }


    /**
     * Sets the appliesTo value for this TMaximumDeductible.
     * 
     * @param appliesTo
     */
    public void setAppliesTo(java.lang.String appliesTo) {
        this.appliesTo = appliesTo;
    }


    /**
     * Gets the timeUnit value for this TMaximumDeductible.
     * 
     * @return timeUnit
     */
    public java.lang.String getTimeUnit() {
        return timeUnit;
    }


    /**
     * Sets the timeUnit value for this TMaximumDeductible.
     * 
     * @param timeUnit
     */
    public void setTimeUnit(java.lang.String timeUnit) {
        this.timeUnit = timeUnit;
    }


    /**
     * Gets the intervalNumber value for this TMaximumDeductible.
     * 
     * @return intervalNumber
     */
    public java.lang.Integer getIntervalNumber() {
        return intervalNumber;
    }


    /**
     * Sets the intervalNumber value for this TMaximumDeductible.
     * 
     * @param intervalNumber
     */
    public void setIntervalNumber(java.lang.Integer intervalNumber) {
        this.intervalNumber = intervalNumber;
    }


    /**
     * Gets the intervalUnitDescription value for this TMaximumDeductible.
     * 
     * @return intervalUnitDescription
     */
    public java.lang.String getIntervalUnitDescription() {
        return intervalUnitDescription;
    }


    /**
     * Sets the intervalUnitDescription value for this TMaximumDeductible.
     * 
     * @param intervalUnitDescription
     */
    public void setIntervalUnitDescription(java.lang.String intervalUnitDescription) {
        this.intervalUnitDescription = intervalUnitDescription;
    }


    /**
     * Gets the amount value for this TMaximumDeductible.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TMaximumDeductible.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the accumulationBeginDate value for this TMaximumDeductible.
     * 
     * @return accumulationBeginDate
     */
    public java.util.Date getAccumulationBeginDate() {
        return accumulationBeginDate;
    }


    /**
     * Sets the accumulationBeginDate value for this TMaximumDeductible.
     * 
     * @param accumulationBeginDate
     */
    public void setAccumulationBeginDate(java.util.Date accumulationBeginDate) {
        this.accumulationBeginDate = accumulationBeginDate;
    }


    /**
     * Gets the accumulationEndDate value for this TMaximumDeductible.
     * 
     * @return accumulationEndDate
     */
    public java.util.Date getAccumulationEndDate() {
        return accumulationEndDate;
    }


    /**
     * Sets the accumulationEndDate value for this TMaximumDeductible.
     * 
     * @param accumulationEndDate
     */
    public void setAccumulationEndDate(java.util.Date accumulationEndDate) {
        this.accumulationEndDate = accumulationEndDate;
    }


    /**
     * Gets the remaining value for this TMaximumDeductible.
     * 
     * @return remaining
     */
    public java.lang.Double getRemaining() {
        return remaining;
    }


    /**
     * Sets the remaining value for this TMaximumDeductible.
     * 
     * @param remaining
     */
    public void setRemaining(java.lang.Double remaining) {
        this.remaining = remaining;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TMaximumDeductible)) return false;
        TMaximumDeductible other = (TMaximumDeductible) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tierType==null && other.getTierType()==null) || 
             (this.tierType!=null &&
              this.tierType.equals(other.getTierType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.appliesTo==null && other.getAppliesTo()==null) || 
             (this.appliesTo!=null &&
              this.appliesTo.equals(other.getAppliesTo()))) &&
            ((this.timeUnit==null && other.getTimeUnit()==null) || 
             (this.timeUnit!=null &&
              this.timeUnit.equals(other.getTimeUnit()))) &&
            ((this.intervalNumber==null && other.getIntervalNumber()==null) || 
             (this.intervalNumber!=null &&
              this.intervalNumber.equals(other.getIntervalNumber()))) &&
            ((this.intervalUnitDescription==null && other.getIntervalUnitDescription()==null) || 
             (this.intervalUnitDescription!=null &&
              this.intervalUnitDescription.equals(other.getIntervalUnitDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.accumulationBeginDate==null && other.getAccumulationBeginDate()==null) || 
             (this.accumulationBeginDate!=null &&
              this.accumulationBeginDate.equals(other.getAccumulationBeginDate()))) &&
            ((this.accumulationEndDate==null && other.getAccumulationEndDate()==null) || 
             (this.accumulationEndDate!=null &&
              this.accumulationEndDate.equals(other.getAccumulationEndDate()))) &&
            ((this.remaining==null && other.getRemaining()==null) || 
             (this.remaining!=null &&
              this.remaining.equals(other.getRemaining())));
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
        if (getTierType() != null) {
            _hashCode += getTierType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getAppliesTo() != null) {
            _hashCode += getAppliesTo().hashCode();
        }
        if (getTimeUnit() != null) {
            _hashCode += getTimeUnit().hashCode();
        }
        if (getIntervalNumber() != null) {
            _hashCode += getIntervalNumber().hashCode();
        }
        if (getIntervalUnitDescription() != null) {
            _hashCode += getIntervalUnitDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAccumulationBeginDate() != null) {
            _hashCode += getAccumulationBeginDate().hashCode();
        }
        if (getAccumulationEndDate() != null) {
            _hashCode += getAccumulationEndDate().hashCode();
        }
        if (getRemaining() != null) {
            _hashCode += getRemaining().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TMaximumDeductible.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tMaximumDeductible"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tierType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliesTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "appliesTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "timeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intervalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "intervalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intervalUnitDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "intervalUnitDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulationBeginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "accumulationBeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulationEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "accumulationEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remaining");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "remaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
