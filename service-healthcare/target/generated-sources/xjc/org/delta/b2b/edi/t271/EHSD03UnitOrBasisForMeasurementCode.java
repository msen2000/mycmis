//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.03 at 11:47:13 AM PDT 
//


package org.delta.b2b.edi.t271;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code specifying the units in which a value is being expressed, or manner in which a measurement has been taken 
 * 
 * <p>Java class for E-HSD03-Unit_or_Basis_for_Measurement_Code complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="E-HSD03-Unit_or_Basis_for_Measurement_Code">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.delta.org/b2b/edi/t271>EDI-Element-String-Type">
 *       &lt;attribute name="EDIDataType" type="{http://www.w3.org/2001/XMLSchema}string" fixed="ID" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" fixed="355" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Unit or Basis for Measurement Code" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E-HSD03-Unit_or_Basis_for_Measurement_Code")
public class EHSD03UnitOrBasisForMeasurementCode
    extends EDIElementStringType
{


}
