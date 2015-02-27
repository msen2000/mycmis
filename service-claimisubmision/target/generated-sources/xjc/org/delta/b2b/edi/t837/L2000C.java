//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 02:23:02 PM PDT 
//


package org.delta.b2b.edi.t837;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify dependencies among and the content of hierarchically related groups of data segments
 * 
 * <p>Java class for L-2000C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2000C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-HL-Patient_Hierarchical_Level" type="{http://www.delta.org/b2b/edi/t837}S-HL-Patient_Hierarchical_Level"/>
 *         &lt;element name="S-PAT-Patient_Information" type="{http://www.delta.org/b2b/edi/t837}S-PAT-Patient_Information"/>
 *         &lt;element name="L-2010CA" type="{http://www.delta.org/b2b/edi/t837}L-2010CA"/>
 *         &lt;element name="L-2300" type="{http://www.delta.org/b2b/edi/t837}L-2300" maxOccurs="100"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2000C" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Patient Hierarchical Level" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2000C", propOrder = {
    "shlPatientHierarchicalLevel",
    "spatPatientInformation",
    "l2010CA",
    "l2300"
})
public class L2000C {

    @XmlElement(name = "S-HL-Patient_Hierarchical_Level", required = true)
    protected SHLPatientHierarchicalLevel shlPatientHierarchicalLevel;
    @XmlElement(name = "S-PAT-Patient_Information", required = true)
    protected SPATPatientInformation spatPatientInformation;
    @XmlElement(name = "L-2010CA", required = true)
    protected L2010CA l2010CA;
    @XmlElement(name = "L-2300", required = true)
    protected List<L2300> l2300;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the shlPatientHierarchicalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SHLPatientHierarchicalLevel }
     *     
     */
    public SHLPatientHierarchicalLevel getSHLPatientHierarchicalLevel() {
        return shlPatientHierarchicalLevel;
    }

    /**
     * Sets the value of the shlPatientHierarchicalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHLPatientHierarchicalLevel }
     *     
     */
    public void setSHLPatientHierarchicalLevel(SHLPatientHierarchicalLevel value) {
        this.shlPatientHierarchicalLevel = value;
    }

    /**
     * Gets the value of the spatPatientInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SPATPatientInformation }
     *     
     */
    public SPATPatientInformation getSPATPatientInformation() {
        return spatPatientInformation;
    }

    /**
     * Sets the value of the spatPatientInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPATPatientInformation }
     *     
     */
    public void setSPATPatientInformation(SPATPatientInformation value) {
        this.spatPatientInformation = value;
    }

    /**
     * Gets the value of the l2010CA property.
     * 
     * @return
     *     possible object is
     *     {@link L2010CA }
     *     
     */
    public L2010CA getL2010CA() {
        return l2010CA;
    }

    /**
     * Sets the value of the l2010CA property.
     * 
     * @param value
     *     allowed object is
     *     {@link L2010CA }
     *     
     */
    public void setL2010CA(L2010CA value) {
        this.l2010CA = value;
    }

    /**
     * Gets the value of the l2300 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2300 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2300().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2300 }
     * 
     * 
     */
    public List<L2300> getL2300() {
        if (l2300 == null) {
            l2300 = new ArrayList<L2300>();
        }
        return this.l2300;
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
            return "2000C";
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
            return "Patient Hierarchical Level";
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
            return "Loop";
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
