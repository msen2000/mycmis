package org.delta.b2b.edi.translator;

public interface EDITranslator {
	public String convertEDI2XML (String ediFileName) throws Exception;
	public String convertXML2EDI(String xmlFileName) throws Exception;
}
