package org.sen.b2b.edi.transaction;

public interface EDIProcessor {

	public void convertEDI2XML () throws Exception;
	public void convertXML2EDI () throws Exception;
}
