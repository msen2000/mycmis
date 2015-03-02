package org.sen.b2b.edi.parser;

public class EDIParserFactory {
	
	private EDIParser ediParser = null;
	
	public EDIParser getEDIParser(String trxType) {
		if("V270".equalsIgnoreCase(trxType)) {
			ediParser = new T270EDIParser(trxType);
		} else if("V271".equalsIgnoreCase(trxType)) {
			ediParser = new T271EDIParser(trxType);
		}
		return ediParser;
	}
}
