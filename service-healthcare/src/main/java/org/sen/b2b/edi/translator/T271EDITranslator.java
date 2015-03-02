/**
 * 
 */
package org.sen.b2b.edi.translator;

import org.sen.b2b.edi.t271.T271;
import org.sen.b2b.edi.util.FileUtil;

/**
 * @author sen
 *
 */
public class T271EDITranslator extends EDIAbstractTranslator implements EDITranslator {

	public T271EDITranslator(String trxType) {
		super(trxType);
	}
	
	@Override
	public String convertEDI2XML(String ediFileName) throws Exception {
		T271 t271 = (T271)this.getEDIParser().convertEDI2Object(ediFileName);
		String ediXML = this.getXMLMarshaller().marshall(t271);
		return ediXML;
	}

	@Override
	public String convertXML2EDI(String xmlFileName) throws Exception {
		String strXML = FileUtil.readXMLFile(xmlFileName);
		T271 t271 = (T271)this.getXMLMarshaller().unmarshall(strXML);
		String strEDI = this.getEDIParser().convertObject2EDI(t271);
		return strEDI;
	}

}
