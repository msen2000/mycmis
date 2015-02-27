//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 07:43:57 PM PDT 
//


package org.delta.b2b.edi.t271;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate that the next segment begins a loop
 * 
 * <p>Java class for L-LS_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L-LS_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S-LS-Loop_Header" type="{http://www.delta.org/b2b/edi/t271}S-LS-Loop_Header"/>
 *         &lt;element name="L-2120D" type="{http://www.delta.org/b2b/edi/t271}L-2120D" maxOccurs="23" minOccurs="0"/>
 *         &lt;element name="S-LE-Loop_Trailer" type="{http://www.delta.org/b2b/edi/t271}S-LE-Loop_Trailer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="LS" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop Header" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L-LS_1", propOrder = {
    "slsLoopHeader",
    "l2120D",
    "sleLoopTrailer"
})
public class LLS1 {

    @XmlElement(name = "S-LS-Loop_Header", required = true)
    protected SLSLoopHeader slsLoopHeader;
    @XmlElement(name = "L-2120D", nillable = true)
    protected List<L2120D> l2120D;
    @XmlElement(name = "S-LE-Loop_Trailer", required = true)
    protected SLELoopTrailer sleLoopTrailer;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the slsLoopHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SLSLoopHeader }
     *     
     */
    public SLSLoopHeader getSLSLoopHeader() {
        return slsLoopHeader;
    }

    /**
     * Sets the value of the slsLoopHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLSLoopHeader }
     *     
     */
    public void setSLSLoopHeader(SLSLoopHeader value) {
        this.slsLoopHeader = value;
    }

    /**
     * Gets the value of the l2120D property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l2120D property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL2120D().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L2120D }
     * 
     * 
     */
    public List<L2120D> getL2120D() {
        if (l2120D == null) {
            l2120D = new ArrayList<L2120D>();
        }
        return this.l2120D;
    }

    /**
     * Gets the value of the sleLoopTrailer property.
     * 
     * @return
     *     possible object is
     *     {@link SLELoopTrailer }
     *     
     */
    public SLELoopTrailer getSLELoopTrailer() {
        return sleLoopTrailer;
    }

    /**
     * Sets the value of the sleLoopTrailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLELoopTrailer }
     *     
     */
    public void setSLELoopTrailer(SLELoopTrailer value) {
        this.sleLoopTrailer = value;
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
            return "LS";
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
            return "Loop Header";
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
