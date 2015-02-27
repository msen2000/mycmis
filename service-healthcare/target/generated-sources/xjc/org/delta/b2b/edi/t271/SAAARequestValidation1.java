//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t271;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the validity of the request and indicate follow-up action authorized
 * 
 * <p>Java class for S-AAA-Request_Validation_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S-AAA-Request_Validation_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E-AAA01-Yes_No_Condition_or_Response_Code" type="{http://www.delta.org/b2b/edi/t271}E-AAA01-Yes_No_Condition_or_Response_Code"/>
 *         &lt;element name="E-AAA02-Agency_Qualifier_Code" type="{http://www.delta.org/b2b/edi/t271}E-AAA02-Agency_Qualifier_Code" minOccurs="0"/>
 *         &lt;element name="E-AAA03-Reject_Reason_Code" type="{http://www.delta.org/b2b/edi/t271}E-AAA03-Reject_Reason_Code_1"/>
 *         &lt;element name="E-AAA04-Follow-up_Action_Code" type="{http://www.delta.org/b2b/edi/t271}E-AAA04-Follow-up_Action_Code_1"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="AAA" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Request Validation" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S-AAA-Request_Validation_1", propOrder = {
    "eaaa01YesNoConditionOrResponseCode",
    "eaaa02AgencyQualifierCode",
    "eaaa03RejectReasonCode",
    "eaaa04FollowUpActionCode"
})
public class SAAARequestValidation1 {

    @XmlElement(name = "E-AAA01-Yes_No_Condition_or_Response_Code", required = true)
    protected EAAA01YesNoConditionOrResponseCode eaaa01YesNoConditionOrResponseCode;
    @XmlElementRef(name = "E-AAA02-Agency_Qualifier_Code", namespace = "http://www.delta.org/b2b/edi/t271", type = JAXBElement.class)
    protected JAXBElement<EAAA02AgencyQualifierCode> eaaa02AgencyQualifierCode;
    @XmlElement(name = "E-AAA03-Reject_Reason_Code", required = true)
    protected EAAA03RejectReasonCode1 eaaa03RejectReasonCode;
    @XmlElement(name = "E-AAA04-Follow-up_Action_Code", required = true)
    protected EAAA04FollowUpActionCode1 eaaa04FollowUpActionCode;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the eaaa01YesNoConditionOrResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link EAAA01YesNoConditionOrResponseCode }
     *     
     */
    public EAAA01YesNoConditionOrResponseCode getEAAA01YesNoConditionOrResponseCode() {
        return eaaa01YesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the eaaa01YesNoConditionOrResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAAA01YesNoConditionOrResponseCode }
     *     
     */
    public void setEAAA01YesNoConditionOrResponseCode(EAAA01YesNoConditionOrResponseCode value) {
        this.eaaa01YesNoConditionOrResponseCode = value;
    }

    /**
     * Gets the value of the eaaa02AgencyQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EAAA02AgencyQualifierCode }{@code >}
     *     
     */
    public JAXBElement<EAAA02AgencyQualifierCode> getEAAA02AgencyQualifierCode() {
        return eaaa02AgencyQualifierCode;
    }

    /**
     * Sets the value of the eaaa02AgencyQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EAAA02AgencyQualifierCode }{@code >}
     *     
     */
    public void setEAAA02AgencyQualifierCode(JAXBElement<EAAA02AgencyQualifierCode> value) {
        this.eaaa02AgencyQualifierCode = ((JAXBElement<EAAA02AgencyQualifierCode> ) value);
    }

    /**
     * Gets the value of the eaaa03RejectReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link EAAA03RejectReasonCode1 }
     *     
     */
    public EAAA03RejectReasonCode1 getEAAA03RejectReasonCode() {
        return eaaa03RejectReasonCode;
    }

    /**
     * Sets the value of the eaaa03RejectReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAAA03RejectReasonCode1 }
     *     
     */
    public void setEAAA03RejectReasonCode(EAAA03RejectReasonCode1 value) {
        this.eaaa03RejectReasonCode = value;
    }

    /**
     * Gets the value of the eaaa04FollowUpActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link EAAA04FollowUpActionCode1 }
     *     
     */
    public EAAA04FollowUpActionCode1 getEAAA04FollowUpActionCode() {
        return eaaa04FollowUpActionCode;
    }

    /**
     * Sets the value of the eaaa04FollowUpActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAAA04FollowUpActionCode1 }
     *     
     */
    public void setEAAA04FollowUpActionCode(EAAA04FollowUpActionCode1 value) {
        this.eaaa04FollowUpActionCode = value;
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
            return "AAA";
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
            return "Request Validation";
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
