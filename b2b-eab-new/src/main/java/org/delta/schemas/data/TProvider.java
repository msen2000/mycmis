/**
 * TProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.delta.schemas.data;


/**
 * The definition of a provider object
 */
public class TProvider  extends org.delta.schemas.data.TPerson  implements java.io.Serializable {
    /* Maps to the Provider Category, either M or I for Multiple and
     * Individual, respectively. */
    private java.lang.String providerType;

    /* The MetaVance Provider Identifier */
    private java.lang.String providerIdentifier;

    /* The secondary identifiers */
    private org.delta.schemas.data.TSecondaryProviderIdentifier[] secondaryIdentifiers;

    /* The practice location/facilities the provider works at */
    private org.delta.schemas.data.TPracticeLocation[] practiceLocations;

    /* The contracts this provider has */
    private org.delta.schemas.data.TProviderContract[] contracts;

    /* The affiliated providers */
    private org.delta.schemas.data.TProvider[] affiliatedProviders;

    public TProvider() {
    }

    public TProvider(
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String providerType,
           java.lang.String providerIdentifier,
           org.delta.schemas.data.TSecondaryProviderIdentifier[] secondaryIdentifiers,
           org.delta.schemas.data.TPracticeLocation[] practiceLocations,
           org.delta.schemas.data.TProviderContract[] contracts,
           org.delta.schemas.data.TProvider[] affiliatedProviders) {
        super(
            firstName,
            lastName);
        this.providerType = providerType;
        this.providerIdentifier = providerIdentifier;
        this.secondaryIdentifiers = secondaryIdentifiers;
        this.practiceLocations = practiceLocations;
        this.contracts = contracts;
        this.affiliatedProviders = affiliatedProviders;
    }


    /**
     * Gets the providerType value for this TProvider.
     * 
     * @return providerType   * Maps to the Provider Category, either M or I for Multiple and
     * Individual, respectively.
     */
    public java.lang.String getProviderType() {
        return providerType;
    }


    /**
     * Sets the providerType value for this TProvider.
     * 
     * @param providerType   * Maps to the Provider Category, either M or I for Multiple and
     * Individual, respectively.
     */
    public void setProviderType(java.lang.String providerType) {
        this.providerType = providerType;
    }


    /**
     * Gets the providerIdentifier value for this TProvider.
     * 
     * @return providerIdentifier   * The MetaVance Provider Identifier
     */
    public java.lang.String getProviderIdentifier() {
        return providerIdentifier;
    }


    /**
     * Sets the providerIdentifier value for this TProvider.
     * 
     * @param providerIdentifier   * The MetaVance Provider Identifier
     */
    public void setProviderIdentifier(java.lang.String providerIdentifier) {
        this.providerIdentifier = providerIdentifier;
    }


    /**
     * Gets the secondaryIdentifiers value for this TProvider.
     * 
     * @return secondaryIdentifiers   * The secondary identifiers
     */
    public org.delta.schemas.data.TSecondaryProviderIdentifier[] getSecondaryIdentifiers() {
        return secondaryIdentifiers;
    }


    /**
     * Sets the secondaryIdentifiers value for this TProvider.
     * 
     * @param secondaryIdentifiers   * The secondary identifiers
     */
    public void setSecondaryIdentifiers(org.delta.schemas.data.TSecondaryProviderIdentifier[] secondaryIdentifiers) {
        this.secondaryIdentifiers = secondaryIdentifiers;
    }

    public org.delta.schemas.data.TSecondaryProviderIdentifier getSecondaryIdentifiers(int i) {
        return this.secondaryIdentifiers[i];
    }

    public void setSecondaryIdentifiers(int i, org.delta.schemas.data.TSecondaryProviderIdentifier _value) {
        this.secondaryIdentifiers[i] = _value;
    }


    /**
     * Gets the practiceLocations value for this TProvider.
     * 
     * @return practiceLocations   * The practice location/facilities the provider works at
     */
    public org.delta.schemas.data.TPracticeLocation[] getPracticeLocations() {
        return practiceLocations;
    }


    /**
     * Sets the practiceLocations value for this TProvider.
     * 
     * @param practiceLocations   * The practice location/facilities the provider works at
     */
    public void setPracticeLocations(org.delta.schemas.data.TPracticeLocation[] practiceLocations) {
        this.practiceLocations = practiceLocations;
    }

    public org.delta.schemas.data.TPracticeLocation getPracticeLocations(int i) {
        return this.practiceLocations[i];
    }

    public void setPracticeLocations(int i, org.delta.schemas.data.TPracticeLocation _value) {
        this.practiceLocations[i] = _value;
    }


    /**
     * Gets the contracts value for this TProvider.
     * 
     * @return contracts   * The contracts this provider has
     */
    public org.delta.schemas.data.TProviderContract[] getContracts() {
        return contracts;
    }


    /**
     * Sets the contracts value for this TProvider.
     * 
     * @param contracts   * The contracts this provider has
     */
    public void setContracts(org.delta.schemas.data.TProviderContract[] contracts) {
        this.contracts = contracts;
    }

    public org.delta.schemas.data.TProviderContract getContracts(int i) {
        return this.contracts[i];
    }

    public void setContracts(int i, org.delta.schemas.data.TProviderContract _value) {
        this.contracts[i] = _value;
    }


    /**
     * Gets the affiliatedProviders value for this TProvider.
     * 
     * @return affiliatedProviders   * The affiliated providers
     */
    public org.delta.schemas.data.TProvider[] getAffiliatedProviders() {
        return affiliatedProviders;
    }


    /**
     * Sets the affiliatedProviders value for this TProvider.
     * 
     * @param affiliatedProviders   * The affiliated providers
     */
    public void setAffiliatedProviders(org.delta.schemas.data.TProvider[] affiliatedProviders) {
        this.affiliatedProviders = affiliatedProviders;
    }

    public org.delta.schemas.data.TProvider getAffiliatedProviders(int i) {
        return this.affiliatedProviders[i];
    }

    public void setAffiliatedProviders(int i, org.delta.schemas.data.TProvider _value) {
        this.affiliatedProviders[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TProvider)) return false;
        TProvider other = (TProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.providerType==null && other.getProviderType()==null) || 
             (this.providerType!=null &&
              this.providerType.equals(other.getProviderType()))) &&
            ((this.providerIdentifier==null && other.getProviderIdentifier()==null) || 
             (this.providerIdentifier!=null &&
              this.providerIdentifier.equals(other.getProviderIdentifier()))) &&
            ((this.secondaryIdentifiers==null && other.getSecondaryIdentifiers()==null) || 
             (this.secondaryIdentifiers!=null &&
              java.util.Arrays.equals(this.secondaryIdentifiers, other.getSecondaryIdentifiers()))) &&
            ((this.practiceLocations==null && other.getPracticeLocations()==null) || 
             (this.practiceLocations!=null &&
              java.util.Arrays.equals(this.practiceLocations, other.getPracticeLocations()))) &&
            ((this.contracts==null && other.getContracts()==null) || 
             (this.contracts!=null &&
              java.util.Arrays.equals(this.contracts, other.getContracts()))) &&
            ((this.affiliatedProviders==null && other.getAffiliatedProviders()==null) || 
             (this.affiliatedProviders!=null &&
              java.util.Arrays.equals(this.affiliatedProviders, other.getAffiliatedProviders())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getProviderType() != null) {
            _hashCode += getProviderType().hashCode();
        }
        if (getProviderIdentifier() != null) {
            _hashCode += getProviderIdentifier().hashCode();
        }
        if (getSecondaryIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondaryIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondaryIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPracticeLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPracticeLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPracticeLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContracts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContracts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContracts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAffiliatedProviders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAffiliatedProviders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAffiliatedProviders(), i);
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
        new org.apache.axis.description.TypeDesc(TProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "providerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "providerIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "secondaryIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tSecondaryProviderIdentifier"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("practiceLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "practiceLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tPracticeLocation"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contracts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "contracts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tProviderContract"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affiliatedProviders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.delta.org/data", "affiliatedProviders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.delta.org/data", "tProvider"));
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
