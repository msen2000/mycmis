package org.sen.b2b.edi.translator;

import junit.framework.TestCase;

public class T271EDITranslatorTest   extends TestCase {
	//
	private EDITranslator ediPro = new T271EDITranslator("V271"); 
	
	public void testConvertXML2EDI() throws Exception {
		String xmlFileName = "C:\\Temp\\edi_data_2.xml";
		String strEDI = ediPro.convertXML2EDI(xmlFileName);
		System.out.println(" EDI -> "+strEDI);
	}
	
	public void atestConvertEDI2XML() throws Exception {		
		String ediFileName = "C:\\Temp\\edi270_2.dat";
		String strEDI = ediPro.convertEDI2XML(ediFileName);
		System.out.println(" XML -> "+strEDI);
	}
}
