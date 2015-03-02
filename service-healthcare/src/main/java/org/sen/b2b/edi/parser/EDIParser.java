package org.sen.b2b.edi.parser;


public interface EDIParser {

	public Object convertEDI2Object(String ediFileLoc) throws Exception;
	public String convertObject2EDI(Object tObj) throws Exception;

	
	//public T270 convertEDI2Object(String ediFileLoc) throws Exception;
	//public String convertObject2EDI(T270 t270Obj) throws Exception;
	
	/*
	public T270 convertXML2Object(String xml) throws Exception ;
	public String convertObject2XML(T270 t270Obj) throws Exception;
	
	public String convertEDI2XML(String ediFileName) throws Exception;
	public String convertEDI2XML () throws Exception;
	
	public String convertXML2EDI (String xmlFileName) throws Exception;
	public String convertXML2EDI () throws Exception;
	*/
}
