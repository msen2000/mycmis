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
 * To specify any or all of a date, a time, or a time period
 * 
 * <p>Java class for S-DTP-Subscriber_Eligibility_Benefit_Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-DTP-Subscriber_Eligibility_Benefit_Date">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-DTP01-Date_Time_Qualifier" type="{http://www.delta.org/b2b/edi/t270}E-DTP01-Date_Time_Qualifier_1"/>
 *         &lt;element name="E-DTP02-Date_Time_Period_Format_Qualifier" type="{http://www.delta.org/b2b/edi/t270}E-DTP02-Date_Time_Period_Format_Qualifier"/>
 *         &lt;element name="E-DTP03-Date_Time_Period" type="{http://www.delta.org/b2b/edi/t270}E-DTP03-Date_Time_Period"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="DTP" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Subscriber Eligibility/Benefit Date" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-DTP-Subscriber_Eligibility_Benefit_Date", propOrder = {
    "edtp01DateTimeQualifier",
    "edtp02DateTimePeriodFormatQualifier",
    "edtp03DateTimePeriod"
})
public class SDTPSubscriberEligibilityBenefitDate {

    @XmlElement(name = "E-DTP01-Date_Time_Qualifier", required = true)
    protected EDTP01DateTimeQualifier1 edtp01DateTimeQualifier;
    @XmlElement(name = "E-DTP02-Date_Time_Period_Format_Qualifier", required = true)
    protected EDTP02DateTimePeriodFormatQualifier edtp02DateTimePeriodFormatQualifier;
    @XmlElement(name = "E-DTP03-Date_Time_Period", required = true)
    protected EDTP03DateTimePeriod edtp03DateTimePeriod;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the edtp01DateTimeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EDTP01DateTimeQualifier1 }
     *     
     */
    public EDTP01DateTimeQualifier1 getEDTP01DateTimeQualifier() {
        return edtp01DateTimeQualifier;
    }

    /**
     * Sets the value of the edtp01DateTimeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDTP01DateTimeQualifier1 }
     *     
     */
    public void setEDTP01DateTimeQualifier(EDTP01DateTimeQualifier1 value) {
        this.edtp01DateTimeQualifier = value;
    }

    /**
     * Gets the value of the edtp02DateTimePeriodFormatQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EDTP02DateTimePeriodFormatQualifier }
     *     
     */
    public EDTP02DateTimePeriodFormatQualifier getEDTP02DateTimePeriodFormatQualifier() {
        return edtp02DateTimePeriodFormatQualifier;
    }

    /**
     * Sets the value of the edtp02DateTimePeriodFormatQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDTP02DateTimePeriodFormatQualifier }
     *     
     */
    public void setEDTP02DateTimePeriodFormatQualifier(EDTP02DateTimePeriodFormatQualifier value) {
        this.edtp02DateTimePeriodFormatQualifier = value;
    }

    /**
     * Gets the value of the edtp03DateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EDTP03DateTimePeriod }
     *     
     */
    public EDTP03DateTimePeriod getEDTP03DateTimePeriod() {
        return edtp03DateTimePeriod;
    }

    /**
     * Sets the value of the edtp03DateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDTP03DateTimePeriod }
     *     
     */
    public void setEDTP03DateTimePeriod(EDTP03DateTimePeriod value) {
        this.edtp03DateTimePeriod = value;
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
            return "DTP";
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
            return "Subscriber Eligibility/Benefit Date";
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
            return "Segment";
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
