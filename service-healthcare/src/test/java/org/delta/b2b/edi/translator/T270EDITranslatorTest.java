package org.delta.b2b.edi.translator;

import org.delta.b2b.edi.translator.EDITranslator;
import org.delta.b2b.edi.translator.T270EDITranslator;

import junit.framework.TestCase;

public class T270EDITranslatorTest   extends TestCase {
	//
	private EDITranslator ediPro = new T270EDITranslator("V270"); 
	
	public void atestConvertXML2EDI() throws Exception {
		String xmlFileName = "C:\\Temp\\edi_data_2.xml";
		String strEDI = ediPro.convertXML2EDI(xmlFileName);
		System.out.println(" EDI -> "+strEDI);
	}
	
	public void testConvertEDI2XML() throws Exception {		
		String ediFileName = "C:\\Temp\\edi270_2.dat";
		String strEDI = ediPro.convertEDI2XML(ediFileName);
		System.out.println(" XML -> "+strEDI);
	}
}
