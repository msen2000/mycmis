package org.sen.b2b.edi.parser;

public class EDIParserFactory {
	
	private EDIParser ediParser = null;
	
	public EDIParser getEDIParser(String parserType) {
		if("V276".equalsIgnoreCase(parserType)) {
			ediParser = new T276EDIParser();
		}
		return ediParser;
	}
}
