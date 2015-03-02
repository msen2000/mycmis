package org.sen.b2b.edi.translator;

import org.sen.b2b.edi.t270.T270;
import org.sen.b2b.edi.util.FileUtil;

public class T270EDITranslator extends EDIAbstractTranslator implements EDITranslator {
	
	public T270EDITranslator(String trxType) {
		super(trxType);
	}
	
	public String convertEDI2XML (String ediFileName) throws Exception {
		T270 t270 = (T270)this.getEDIParser().convertEDI2Object(ediFileName);
		String ediXML = this.getXMLMarshaller().marshall(t270);
		return ediXML;
	}
	
	public String convertXML2EDI(String xmlFileName) throws Exception {		
		String strXML = FileUtil.readXMLFile(xmlFileName);
		T270 t270 = (T270)this.getXMLMarshaller().unmarshall(strXML);
		String strEDI = this.getEDIParser().convertObject2EDI(t270);
		return strEDI;
	}
	
}
