/**
 * 
 */
package org.sen.b2b.edi.parser;

/**
 * @author sen
 *
 */
public class EDIFormat {

	private String segSeperator = "~";
	private String eleSeperator = "*";
	
	public String getSegSeperator() {
		return segSeperator;
	}
	public void setSegSeperator(String segSeperator) {
		segSeperator = segSeperator;
	}
	public String getEleSeperator() {
		return eleSeperator;
	}
	public void setEleSeperator(String eleSeperator) {
		eleSeperator = eleSeperator;
	}
}
