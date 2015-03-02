package org.sen.b2b.edi.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.sen.b2b.edi.generator.T270EDIGenerator;
import org.sen.b2b.edi.handler.element.HLHandler;
import org.sen.b2b.edi.handler.header.GSHandler;
import org.sen.b2b.edi.handler.header.ISAHandler;
import org.sen.b2b.edi.handler.header.STHandler;
import org.sen.b2b.edi.handler.loop.L2000AHandler;
import org.sen.b2b.edi.handler.loop.L2000BHandler;
import org.sen.b2b.edi.handler.loop.L2000CHandler;
import org.sen.b2b.edi.handler.loop.L2000DHandler;
import org.sen.b2b.edi.handler.segment.BHTHandler;
import org.sen.b2b.edi.handler.trailer.GEHandler;
import org.sen.b2b.edi.handler.trailer.IEAHandler;
import org.sen.b2b.edi.handler.trailer.SEHandler;
import org.sen.b2b.edi.t270.L2000A;
import org.sen.b2b.edi.t270.L2000B;
import org.sen.b2b.edi.t270.L2000C;
import org.sen.b2b.edi.t270.L2000D;
import org.sen.b2b.edi.t270.ObjectFactory;
import org.sen.b2b.edi.t270.T270;
import org.xml.sax.SAXException;

public class T270EDIParser extends EDIAbstractParser implements EDIParser {

	private T270 t270 = null;
	private ObjectFactory fac = new ObjectFactory(); 
	private String currentLoopName = "";
	
	public T270EDIParser(String trxType) {		
		super(trxType);
	}
	
	@Override
	public Object convertEDI2Object(String ediFileLoc) throws Exception {
		ObjectFactory fac = new ObjectFactory();
		t270 = fac.createT270();
		
		Reader fileReader = new FileReader(ediFileLoc);
		BufferedReader buffReader = new BufferedReader(fileReader);
		String str = null;
		while ((str = buffReader.readLine()) != null) {
			EDIRow row = this.parseEDIRow(str);
			t270 = this.getProxyObject(row);				
		}
		buffReader.close();
		return t270;
	}
	
	@Override
	public String convertObject2EDI(Object tObj) throws Exception {
		T270EDIGenerator ediGen = new T270EDIGenerator((T270)tObj);			
		String  str270EDI = ediGen.generateEDI();
		return str270EDI;
	}
	
	/*
	public Object convertXML2Object(String xml) throws Exception {
		XML270Marshaller m = new XML270Marshaller(trxType);
		T270 t270 = (T270)m.unmarshall(xml);
		return t270;
	}
	
	public String convertObject2XML(Object tObj) throws Exception {
		XML270Marshaller m = new XML270Marshaller(trxType);
		String xmlRes = m.marshall(t270Obj);
		return xmlRes;
	}
	
	public String convertEDI2XML(String ediFileName) throws Exception {
		String xmlRes = "";
		try {
			Reader fileReader = new FileReader(ediFileName);
			BufferedReader buffReader = new BufferedReader(fileReader);			
			String str = null;
			while ((str = buffReader.readLine()) != null) {
				EDIRow row = this.parseEDIRow(str);
				t270 = this.getProxyObject(row);				
			}
			XML270Marshaller m = new XML270Marshaller(trxType);
			xmlRes = m.marshall(t270);
			buffReader.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		return xmlRes;
	}
	
	public String convertEDI2XML () throws Exception {
		String xmlRes = "";
		try{
			String ediFileLoc = "C:\\Temp\\edi270_2.dat";
			Reader fileReader = new FileReader(ediFileLoc);
			BufferedReader buffReader = new BufferedReader(fileReader);			
			String str = null;
			while ((str = buffReader.readLine()) != null) {
				EDIRow row = this.parseEDIRow(str);
				t270 = this.getProxyObject(row);				
			}
			XML270Marshaller m = new XML270Marshaller(trxType);
			xmlRes = m.marshall(t270);
			buffReader.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		return xmlRes;
	}
	*/
		
	
	private T270 getProxyObject(EDIRow row) {
		String segCode = row.getSegName();			
		
		//Header / trailer
		if(segCode.equalsIgnoreCase("ISA"))	{		
			t270.setSISAInterchangeControlHeader(fac.createSISAInterchangeControlHeader());
			ISAHandler ish = new ISAHandler(t270,row);
		}
		if(segCode.equalsIgnoreCase("IEA")) {
			t270.setSIEAInterchangeControlTrailer(fac.createSIEAInterchangeControlTrailer());
			IEAHandler ieah = new IEAHandler(t270,row);
		}
		if(segCode.equalsIgnoreCase("GE")) {
			t270.setSGEFunctionalGroupTrailer(fac.createSGEFunctionalGroupTrailer());
			GEHandler geh = new GEHandler(t270, row);
		}
		if(segCode.equalsIgnoreCase("GS")) {
			t270.setSGSFunctionalGroupHeader(fac.createSGSFunctionalGroupHeader());
			GSHandler gsh = new GSHandler(t270, row);
		}
		if(segCode.equalsIgnoreCase("ST")) {
			t270.setSSTTransactionSetHeader(fac.createSSTTransactionSetHeader());
			STHandler sth = new STHandler(t270, row);
		}
		if(segCode.equalsIgnoreCase("SE")) {
			t270.setSSETransactionSetTrailer(fac.createSSETransactionSetTrailer());
			SEHandler seh = new SEHandler(t270, row);
		}
		if(segCode.equalsIgnoreCase("BHT")) {
			t270.setSBHTBeginningOfHierarchicalTransaction(fac.createSBHTBeginningOfHierarchicalTransaction());
			BHTHandler bhh = new BHTHandler(t270, row);
		}
		
		//-----loop
		if(segCode.equalsIgnoreCase("HL")) {
			HLHandler hlh = new HLHandler(t270, row);
			currentLoopName = hlh.getLoopName(row);
			System.out.println("currentLoopName->"+currentLoopName);		
			
		}
		if(segCode.equalsIgnoreCase("NM1") || segCode.equalsIgnoreCase("REF") || segCode.equalsIgnoreCase("N3") || 
				segCode.equalsIgnoreCase("N4") || segCode.equalsIgnoreCase("PRV") || segCode.equalsIgnoreCase("DMG") || segCode.equalsIgnoreCase("EQ")) {
			List<Object> list = t270.getL2000AOrL2000BOrL2000C();
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
		return t270;
	}
	

	
	
	public static void main(String arg[]) {	
		String str = "NM1*PR*2*Sen Den District of Columbia*****PI*DC~";
		//T270EDIParser par = new T270EDIParser();
		//EDIRow row = par.tokenizeEDIRow(str);
		//System.out.println(row.toString());
	}


}