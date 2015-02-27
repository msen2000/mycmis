//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.24 at 03:57:26 PM PDT 
//


package org.delta.b2b.edi.t276;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify dependencies among and the content of hierarchically related groups of data segments
 * 
 * <p>Java class for L-2000A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-2000A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-HL-Information_Source_Level" type="{http://www.delta.org/b2b/edi/t276}S-HL-Information_Source_Level"/>
 *         &lt;element name="L-2100A" type="{http://www.delta.org/b2b/edi/t276}L-2100A"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="2000A" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Information Source Level" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-2000A", propOrder = {
    "shlInformationSourceLevel",
    "l2100A"
})
public class L2000A {

    @XmlElement(name = "S-HL-Information_Source_Level", required = true)
    protected SHLInformationSourceLevel shlInformationSourceLevel;
    @XmlElement(name = "L-2100A", required = true)
    protected L2100A l2100A;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the shlInformationSourceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SHLInformationSourceLevel }
     *     
     */
    public SHLInformationSourceLevel getSHLInformationSourceLevel() {
        return shlInformationSourceLevel;
    }

    /**
     * Sets the value of the shlInformationSourceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHLInformationSourceLevel }
     *     
     */
    public void setSHLInformationSourceLevel(SHLInformationSourceLevel value) {
        this.shlInformationSourceLevel = value;
    }

    /**
     * Gets the value of the l2100A property.
     * 
     * @return
     *     possible object is
     *     {@link L2100A }
     *     
     */
    public L2100A getL2100A() {
        return l2100A;
    }

    /**
     * Sets the value of the l2100A property.
     * 
     * @param value
     *     allowed object is
     *     {@link L2100A }
     *     
     */
    public void setL2100A(L2100A value) {
        this.l2100A = value;
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
            return "2000A";
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
            return "Information Source Level";
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
