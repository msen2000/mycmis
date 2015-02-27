package org.delta.b2b.edi.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.delta.b2b.edi.generator.T270EDIGenerator;
import org.delta.b2b.edi.handler.element.HLHandler;
import org.delta.b2b.edi.handler.header.GSHandler;
import org.delta.b2b.edi.handler.header.ISAHandler;
import org.delta.b2b.edi.handler.header.STHandler;
import org.delta.b2b.edi.handler.loop.L2000AHandler;
import org.delta.b2b.edi.handler.loop.L2000BHandler;
import org.delta.b2b.edi.handler.loop.L2000CHandler;
import org.delta.b2b.edi.handler.loop.L2000DHandler;
import org.delta.b2b.edi.handler.segment.BHTHandler;
import org.delta.b2b.edi.handler.trailer.GEHandler;
import org.delta.b2b.edi.handler.trailer.IEAHandler;
import org.delta.b2b.edi.handler.trailer.SEHandler;
import org.delta.b2b.edi.t271.*;
import org.delta.b2b.edi.t271.T271;
import org.xml.sax.SAXException;

public class T271EDIParser extends EDIAbstractParser implements EDIParser {
	
	private T271 t271 = null;
	private ObjectFactory fac = new ObjectFactory(); 
	private String currentLoopName = "";
	
	public T271EDIParser(String trxType) {		
		super(trxType);
	}
	
	@Override
	public Object convertEDI2Object(String ediFileLoc) throws Exception {
		ObjectFactory fac = new ObjectFactory();
		t271 = fac.createT271();
		
		Reader fileReader = new FileReader(ediFileLoc);
		BufferedReader buffReader = new BufferedReader(fileReader);
		String str = null;
		while ((str = buffReader.readLine()) != null) {
			EDIRow row = this.parseEDIRow(str);
			t271 = this.getProxyObject(row);				
		}
		buffReader.close();
		return t271;
	}
	
	@Override
	public String convertObject2EDI(Object tObj) throws Exception {
		T270EDIGenerator ediGen = new T270EDIGenerator((T270)tObj);			
		String  str270EDI = ediGen.generateEDI();
		return str270EDI;
	}

	private T271 getProxyObject(EDIRow row) {
		String segCode = row.getSegName();			
		
		if(segCode.equalsIgnoreCase("ISA"))	{		
			t271.setSISAInterchangeControlHeader(fac.createSISAInterchangeControlHeader());
			SISAInterchangeControlHeader isah = t270.getSISAInterchangeControlHeader();			
			ISAHandler ish = new ISAHandler(isah, row);
		}
		if(segCode.equalsIgnoreCase("IEA")) {
			t271.setSIEAInterchangeControlTrailer(fac.createSIEAInterchangeControlTrailer());
			IEAHandler ieah = new IEAHandler(t271,row);
		}
		if(segCode.equalsIgnoreCase("GE")) {
			t271.setSGEFunctionalGroupTrailer(fac.createSGEFunctionalGroupTrailer());
			GEHandler geh = new GEHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("GS")) {
			t271.setSGSFunctionalGroupHeader(fac.createSGSFunctionalGroupHeader());
			GSHandler gsh = new GSHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("ST")) {
			t271.setSSTTransactionSetHeader(fac.createSSTTransactionSetHeader());
			STHandler sth = new STHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("SE")) {
			t271.setSSETransactionSetTrailer(fac.createSSETransactionSetTrailer());
			SEHandler seh = new SEHandler(t271, row);
		}
		if(segCode.equalsIgnoreCase("BHT")) {
			t271.setSBHTBeginningOfHierarchicalTransaction(fac.createSBHTBeginningOfHierarchicalTransaction());
			BHTHandler bhh = new BHTHandler(t271, row);
		}
		//-----loop
		if(segCode.equalsIgnoreCase("HL")) {
			HLHandler hlh = new HLHandler(t271, row);
			currentLoopName = hlh.getLoopName(row);
			System.out.println(currentLoopName);		
			
		}
		if(segCode.equalsIgnoreCase("NM1")) {
			List<Object> list = t271.getL2000AOrL2000BOrL2000C();
			for(Object ob : list) {
				if(ob instanceof L2000A && "L2000A".equalsIgnoreCase(currentLoopName)) {
					L2000A l2000a = (L2000A)ob;
					L2000AHandler lh = new L2000AHandler(l2000a, row);
				} else if(ob instanceof L2000B && "L2000B".equalsIgnoreCase(currentLoopName)) {
					L2000B l2000b = (L2000B)ob;
					L2000BHandler lh = new L2000BHandler(l2000b, row);
				} else if(ob instanceof L2000C && "L2000C".equalsIgnoreCase(currentLoopName)) {
					L2000C l2000c = (L2000C)ob;
					L2000CHandler lh = new L2000CHandler(l2000c, row);
				} else if(ob instanceof L2000D && "L2000D".equalsIgnoreCase(currentLoopName)) {
					L2000D l2000d = (L2000D)ob;
					L2000DHandler lh = new L2000DHandler(l2000d, row);
				}
			}			
		}		
		return t271;
	}
	
	public EDIRow process (String s) throws SAXException {
		System.out.println(s);	
		EDIRow row = tokenize(s);
		System.out.println(row.toString());
		return row;
	}

	public EDIRow tokenize(String str) {
		EDIRow row = new EDIRow();
		StringTokenizer strTok = new StringTokenizer(str, eleSeperator);
		String seg = strTok.nextToken();
		int count = strTok.countTokens();
		
		
		List<String> eles = new ArrayList<String>();
		while (strTok.hasMoreTokens()) {
			String tok = strTok.nextToken();
			eles.add(tok);
		}
		row.setSegName(seg);
		row.setNumElements(count);
		row.setElements(eles);
		
		return row;
	}
}
