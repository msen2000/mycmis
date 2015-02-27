//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t270;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a composite unit of measure (See Figures Appendix for examples of use) 
 * 
 * <p>Java class for C-C001-Composite_Unit_of_Measure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C-C001-Composite_Unit_of_Measure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-III01-Unit_or_Basis_for_Measurement_Code" type="{http://www.delta.org/b2b/edi/t270}E-III01-Unit_or_Basis_for_Measurement_Code"/>
 *         &lt;element name="E-III02-Exponent" type="{http://www.delta.org/b2b/edi/t270}E-III02-Exponent"/>
 *         &lt;element name="E-III03-Multiplier" type="{http://www.delta.org/b2b/edi/t270}E-III03-Multiplier"/>
 *         &lt;element name="E-III04-Unit_or_Basis_for_Measurement_Code" type="{http://www.delta.org/b2b/edi/t270}E-III04-Unit_or_Basis_for_Measurement_Code"/>
 *         &lt;element name="E-III05-Exponent" type="{http://www.delta.org/b2b/edi/t270}E-III05-Exponent"/>
 *         &lt;element name="E-III06-Multiplier" type="{http://www.delta.org/b2b/edi/t270}E-III06-Multiplier"/>
 *         &lt;element name="E-III07-Unit_or_Basis_for_Measurement_Code" type="{http://www.delta.org/b2b/edi/t270}E-III07-Unit_or_Basis_for_Measurement_Code"/>
 *         &lt;element name="E-III08-Exponent" type="{http://www.delta.org/b2b/edi/t270}E-III08-Exponent"/>
 *         &lt;element name="E-III09-Multiplier" type="{http://www.delta.org/b2b/edi/t270}E-III09-Multiplier"/>
 *         &lt;element name="E-III10-Unit_or_Basis_for_Measurement_Code" type="{http://www.delta.org/b2b/edi/t270}E-III10-Unit_or_Basis_for_Measurement_Code"/>
 *         &lt;element name="E-III11-Exponent" type="{http://www.delta.org/b2b/edi/t270}E-III11-Exponent"/>
 *         &lt;element name="E-III12-Multiplier" type="{http://www.delta.org/b2b/edi/t270}E-III12-Multiplier"/>
 *         &lt;element name="E-III13-Unit_or_Basis_for_Measurement_Code" type="{http://www.delta.org/b2b/edi/t270}E-III13-Unit_or_Basis_for_Measurement_Code"/>
 *         &lt;element name="E-III14-Exponent" type="{http://www.delta.org/b2b/edi/t270}E-III14-Exponent"/>
 *         &lt;element name="E-III15-Multiplier" type="{http://www.delta.org/b2b/edi/t270}E-III15-Multiplier"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C001" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite Unit of Measure" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C-C001-Composite_Unit_of_Measure", propOrder = {
    "eiii01UnitOrBasisForMeasurementCode",
    "eiii02Exponent",
    "eiii03Multiplier",
    "eiii04UnitOrBasisForMeasurementCode",
    "eiii05Exponent",
    "eiii06Multiplier",
    "eiii07UnitOrBasisForMeasurementCode",
    "eiii08Exponent",
    "eiii09Multiplier",
    "eiii10UnitOrBasisForMeasurementCode",
    "eiii11Exponent",
    "eiii12Multiplier",
    "eiii13UnitOrBasisForMeasurementCode",
    "eiii14Exponent",
    "eiii15Multiplier"
})
public class CC001CompositeUnitOfMeasure {

    @XmlElement(name = "E-III01-Unit_or_Basis_for_Measurement_Code", required = true)
    protected EIII01UnitOrBasisForMeasurementCode eiii01UnitOrBasisForMeasurementCode;
    @XmlElement(name = "E-III02-Exponent", required = true)
    protected EIII02Exponent eiii02Exponent;
    @XmlElement(name = "E-III03-Multiplier", required = true)
    protected EIII03Multiplier eiii03Multiplier;
    @XmlElement(name = "E-III04-Unit_or_Basis_for_Measurement_Code", required = true)
    protected EIII04UnitOrBasisForMeasurementCode eiii04UnitOrBasisForMeasurementCode;
    @XmlElement(name = "E-III05-Exponent", required = true)
    protected EIII05Exponent eiii05Exponent;
    @XmlElement(name = "E-III06-Multiplier", required = true)
    protected EIII06Multiplier eiii06Multiplier;
    @XmlElement(name = "E-III07-Unit_or_Basis_for_Measurement_Code", required = true)
    protected EIII07UnitOrBasisForMeasurementCode eiii07UnitOrBasisForMeasurementCode;
    @XmlElement(name = "E-III08-Exponent", required = true)
    protected EIII08Exponent eiii08Exponent;
    @XmlElement(name = "E-III09-Multiplier", required = true)
    protected EIII09Multiplier eiii09Multiplier;
    @XmlElement(name = "E-III10-Unit_or_Basis_for_Measurement_Code", required = true)
    protected EIII10UnitOrBasisForMeasurementCode eiii10UnitOrBasisForMeasurementCode;
    @XmlElement(name = "E-III11-Exponent", required = true)
    protected EIII11Exponent eiii11Exponent;
    @XmlElement(name = "E-III12-Multiplier", required = true)
    protected EIII12Multiplier eiii12Multiplier;
    @XmlElement(name = "E-III13-Unit_or_Basis_for_Measurement_Code", required = true)
    protected EIII13UnitOrBasisForMeasurementCode eiii13UnitOrBasisForMeasurementCode;
    @XmlElement(name = "E-III14-Exponent", required = true)
    protected EIII14Exponent eiii14Exponent;
    @XmlElement(name = "E-III15-Multiplier", required = true)
    protected EIII15Multiplier eiii15Multiplier;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eiii01UnitOrBasisForMeasurementCode property.
     * 
     * @return
     *     possible object is
     *     {@link EIII01UnitOrBasisForMeasurementCode }
     *     
     */
    public EIII01UnitOrBasisForMeasurementCode getEIII01UnitOrBasisForMeasurementCode() {
        return eiii01UnitOrBasisForMeasurementCode;
    }

    /**
     * Sets the value of the eiii01UnitOrBasisForMeasurementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII01UnitOrBasisForMeasurementCode }
     *     
     */
    public void setEIII01UnitOrBasisForMeasurementCode(EIII01UnitOrBasisForMeasurementCode value) {
        this.eiii01UnitOrBasisForMeasurementCode = value;
    }

    /**
     * Gets the value of the eiii02Exponent property.
     * 
     * @return
     *     possible object is
     *     {@link EIII02Exponent }
     *     
     */
    public EIII02Exponent getEIII02Exponent() {
        return eiii02Exponent;
    }

    /**
     * Sets the value of the eiii02Exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII02Exponent }
     *     
     */
    public void setEIII02Exponent(EIII02Exponent value) {
        this.eiii02Exponent = value;
    }

    /**
     * Gets the value of the eiii03Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link EIII03Multiplier }
     *     
     */
    public EIII03Multiplier getEIII03Multiplier() {
        return eiii03Multiplier;
    }

    /**
     * Sets the value of the eiii03Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII03Multiplier }
     *     
     */
    public void setEIII03Multiplier(EIII03Multiplier value) {
        this.eiii03Multiplier = value;
    }

    /**
     * Gets the value of the eiii04UnitOrBasisForMeasurementCode property.
     * 
     * @return
     *     possible object is
     *     {@link EIII04UnitOrBasisForMeasurementCode }
     *     
     */
    public EIII04UnitOrBasisForMeasurementCode getEIII04UnitOrBasisForMeasurementCode() {
        return eiii04UnitOrBasisForMeasurementCode;
    }

    /**
     * Sets the value of the eiii04UnitOrBasisForMeasurementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII04UnitOrBasisForMeasurementCode }
     *     
     */
    public void setEIII04UnitOrBasisForMeasurementCode(EIII04UnitOrBasisForMeasurementCode value) {
        this.eiii04UnitOrBasisForMeasurementCode = value;
    }

    /**
     * Gets the value of the eiii05Exponent property.
     * 
     * @return
     *     possible object is
     *     {@link EIII05Exponent }
     *     
     */
    public EIII05Exponent getEIII05Exponent() {
        return eiii05Exponent;
    }

    /**
     * Sets the value of the eiii05Exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII05Exponent }
     *     
     */
    public void setEIII05Exponent(EIII05Exponent value) {
        this.eiii05Exponent = value;
    }

    /**
     * Gets the value of the eiii06Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link EIII06Multiplier }
     *     
     */
    public EIII06Multiplier getEIII06Multiplier() {
        return eiii06Multiplier;
    }

    /**
     * Sets the value of the eiii06Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII06Multiplier }
     *     
     */
    public void setEIII06Multiplier(EIII06Multiplier value) {
        this.eiii06Multiplier = value;
    }

    /**
     * Gets the value of the eiii07UnitOrBasisForMeasurementCode property.
     * 
     * @return
     *     possible object is
     *     {@link EIII07UnitOrBasisForMeasurementCode }
     *     
     */
    public EIII07UnitOrBasisForMeasurementCode getEIII07UnitOrBasisForMeasurementCode() {
        return eiii07UnitOrBasisForMeasurementCode;
    }

    /**
     * Sets the value of the eiii07UnitOrBasisForMeasurementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII07UnitOrBasisForMeasurementCode }
     *     
     */
    public void setEIII07UnitOrBasisForMeasurementCode(EIII07UnitOrBasisForMeasurementCode value) {
        this.eiii07UnitOrBasisForMeasurementCode = value;
    }

    /**
     * Gets the value of the eiii08Exponent property.
     * 
     * @return
     *     possible object is
     *     {@link EIII08Exponent }
     *     
     */
    public EIII08Exponent getEIII08Exponent() {
        return eiii08Exponent;
    }

    /**
     * Sets the value of the eiii08Exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII08Exponent }
     *     
     */
    public void setEIII08Exponent(EIII08Exponent value) {
        this.eiii08Exponent = value;
    }

    /**
     * Gets the value of the eiii09Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link EIII09Multiplier }
     *     
     */
    public EIII09Multiplier getEIII09Multiplier() {
        return eiii09Multiplier;
    }

    /**
     * Sets the value of the eiii09Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII09Multiplier }
     *     
     */
    public void setEIII09Multiplier(EIII09Multiplier value) {
        this.eiii09Multiplier = value;
    }

    /**
     * Gets the value of the eiii10UnitOrBasisForMeasurementCode property.
     * 
     * @return
     *     possible object is
     *     {@link EIII10UnitOrBasisForMeasurementCode }
     *     
     */
    public EIII10UnitOrBasisForMeasurementCode getEIII10UnitOrBasisForMeasurementCode() {
        return eiii10UnitOrBasisForMeasurementCode;
    }

    /**
     * Sets the value of the eiii10UnitOrBasisForMeasurementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII10UnitOrBasisForMeasurementCode }
     *     
     */
    public void setEIII10UnitOrBasisForMeasurementCode(EIII10UnitOrBasisForMeasurementCode value) {
        this.eiii10UnitOrBasisForMeasurementCode = value;
    }

    /**
     * Gets the value of the eiii11Exponent property.
     * 
     * @return
     *     possible object is
     *     {@link EIII11Exponent }
     *     
     */
    public EIII11Exponent getEIII11Exponent() {
        return eiii11Exponent;
    }

    /**
     * Sets the value of the eiii11Exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII11Exponent }
     *     
     */
    public void setEIII11Exponent(EIII11Exponent value) {
        this.eiii11Exponent = value;
    }

    /**
     * Gets the value of the eiii12Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link EIII12Multiplier }
     *     
     */
    public EIII12Multiplier getEIII12Multiplier() {
        return eiii12Multiplier;
    }

    /**
     * Sets the value of the eiii12Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII12Multiplier }
     *     
     */
    public void setEIII12Multiplier(EIII12Multiplier value) {
        this.eiii12Multiplier = value;
    }

    /**
     * Gets the value of the eiii13UnitOrBasisForMeasurementCode property.
     * 
     * @return
     *     possible object is
     *     {@link EIII13UnitOrBasisForMeasurementCode }
     *     
     */
    public EIII13UnitOrBasisForMeasurementCode getEIII13UnitOrBasisForMeasurementCode() {
        return eiii13UnitOrBasisForMeasurementCode;
    }

    /**
     * Sets the value of the eiii13UnitOrBasisForMeasurementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII13UnitOrBasisForMeasurementCode }
     *     
     */
    public void setEIII13UnitOrBasisForMeasurementCode(EIII13UnitOrBasisForMeasurementCode value) {
        this.eiii13UnitOrBasisForMeasurementCode = value;
    }

    /**
     * Gets the value of the eiii14Exponent property.
     * 
     * @return
     *     possible object is
     *     {@link EIII14Exponent }
     *     
     */
    public EIII14Exponent getEIII14Exponent() {
        return eiii14Exponent;
    }

    /**
     * Sets the value of the eiii14Exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII14Exponent }
     *     
     */
    public void setEIII14Exponent(EIII14Exponent value) {
        this.eiii14Exponent = value;
    }

    /**
     * Gets the value of the eiii15Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link EIII15Multiplier }
     *     
     */
    public EIII15Multiplier getEIII15Multiplier() {
        return eiii15Multiplier;
    }

    /**
     * Sets the value of the eiii15Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIII15Multiplier }
     *     
     */
    public void setEIII15Multiplier(EIII15Multiplier value) {
        this.eiii15Multiplier = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        if (id == null) {
            return "C001";
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "Composite Unit of Measure";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Composite";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
