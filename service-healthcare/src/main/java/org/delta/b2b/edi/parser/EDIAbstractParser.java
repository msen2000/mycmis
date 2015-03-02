/**
 * 
 */
package org.sen.b2b.edi.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.xml.sax.SAXException;

/**
 * @author ca31085
 *
 */
public class EDIAbstractParser {

	private String transactionType;

	private EDIFormat ediFormat = new EDIFormat();
	
	public EDIAbstractParser(String trxType) {
		this.transactionType = trxType;
	}

	public EDIFormat getEdiFormat() {
		return ediFormat;
	}
	
	public String getTransactionType() {
		return transactionType;
	}	
	
	protected String scrubEDILine(String line) {		
		String scrubLine = line.substring(0, line.length()-1);
		
		return scrubLine;
	}
	
	protected EDIRow parseEDIRow (String sLine) throws SAXException {
		System.out.println("Row : "+sLine);	
		sLine = this.scrubEDILine(sLine);
		EDIRow row = this.tokenizeEDIRow(sLine);
		System.out.println(row.toString());
		return row;
	}
	
	protected EDIRow tokenizeEDIRow(String str) {
		EDIRow row = new EDIRow();
		
		String eleSeperator = this.getEdiFormat().getEleSeperator();
		
		StringTokenizer strTok = new StringTokenizer(str, eleSeperator);
		String seg = strTok.nextToken();
				
		List<String> eles = new ArrayList<String>();
		
		int lineLength = str.length();		
		int beginIndex = 0;
		int endIndex = 0;
		boolean firstNode = true;
		while (lineLength >= 0 && endIndex != -1 ) {
			endIndex = str.indexOf(eleSeperator);
			String ele = "";
			if(endIndex != -1) {
				ele = str.substring(beginIndex, endIndex);
				str = str.substring(endIndex+1,lineLength);
			} else {
				ele = str;
			}
			if(firstNode == false) {
				eles.add(ele);				
			}
			firstNode = false;			
			beginIndex = 0;
			lineLength = str.length();
		}
		/*while (strTok.hasMoreTokens()) {
			String tok = strTok.nextToken();
			eles.add(tok);
		}*/
		row.setSegName(seg);
		row.setNumElements(eles.size());
		row.setElements(eles);
		
		return row;
	}

}
