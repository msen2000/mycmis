/**
 * 
 */
package org.sen.b2b.edi.translator;

import org.sen.b2b.edi.parser.EDIParser;
import org.sen.b2b.edi.parser.EDIParserFactory;
import org.sen.b2b.xml.marshaller.XMLMarshaller;
import org.sen.b2b.xml.marshaller.XMLMarshallerFactory;

/**
 * @author ca31085
 *
 */
public abstract class EDIAbstractTranslator {

	private EDIParserFactory ediParserFac = new EDIParserFactory();
	private XMLMarshallerFactory xmlMarshFac = new XMLMarshallerFactory();
	private String transactionType;
	
	public EDIAbstractTranslator(String trxType) {
		this.transactionType = trxType;
	}
	
	public EDIParser getEDIParser() {
		return ediParserFac.getEDIParser(transactionType);
	}

	public XMLMarshaller getXMLMarshaller() {
		return xmlMarshFac.getXMLMarshaller(transactionType);
	}
	
	public String getTransactionType() {
		return transactionType;
	}
}
