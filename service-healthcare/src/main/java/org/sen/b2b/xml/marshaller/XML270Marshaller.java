/**
 * 
 */
package org.sen.b2b.xml.marshaller;

import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

import org.sen.b2b.edi.generator.T270EDIGenerator;
import org.sen.b2b.edi.t270.T270;
import org.sen.b2b.edi.util.FileUtil;

import com.sun.xml.bind.StringInputStream;

/**
 * @author sen
 *
 */
public class XML270Marshaller implements XMLMarshaller {
	
	private JAXBContext jc;
	private String v270CtxPath = "org.sen.b2b.edi.t270";
	private String v271CtxPath = "org.sen.b2b.edi.t271";	
	private String transType = null;
	
	public XML270Marshaller(String transType) {
		this.transType = transType;
	}

	public String marshall(Object dObject) throws Exception {
		String outboundXML = "";
		try {			
			StringWriter strWriter = new StringWriter(2000);
			Marshaller mar = this.getMarshaller();				
			mar.marshal(dObject, strWriter);
			outboundXML = strWriter.getBuffer().toString();
		} catch (Exception e) {
			throw new Exception("Received JAXB exception while marshaling.", e);
		}
		return outboundXML;
	}
	
	public Object unmarshall(String xml) throws Exception {
		Object jaxbObject = null;
		StringInputStream xmlTextString = null;		
		try {
			Unmarshaller u = this.getUnmarshaller();			
			xmlTextString = new StringInputStream(xml);
			jaxbObject = u.unmarshal(xmlTextString);
		} catch (Exception ex) {
			throw new Exception("Received a JAXB exception when unmarshaling.",ex);
		}
		return jaxbObject;
	}
	
	public Object unmarshall(InputStream xmlInStream) throws Exception {
		Object jaxbObject = null;
		try {
			Unmarshaller u = this.getUnmarshaller();
			jaxbObject = u.unmarshal(xmlInStream);
		} catch (Exception ex) {
			throw new Exception("Received a JAXB exception when unmarshaling.",ex);
		}
		return jaxbObject;
	}
	
	public T270 unmarshall() throws Exception {
		T270 t270 = null;
		try {
			String fileName = "C:\\Temp\\t1.xml";
			InputStream ins = FileUtil.getInputStream(fileName);
			
			Unmarshaller u = this.getUnmarshaller();			
			t270 = (T270)u.unmarshal(ins);			
			System.out.println(t270.getName());
			System.out.println(t270.getStandard());
			
			T270EDIGenerator gen = new T270EDIGenerator(t270);			
			String str270 = gen.generateEDI();
			System.out.println("EDI is "+str270);
			
		} catch (UnmarshalException umex) {
			throw new Exception("Received a general exception when unmarshaling the message.",umex);
		} catch (JAXBException jex) {
			throw new Exception("Received a JAXB exception while unmarshalling the message.",jex);
		}
		return t270;
	}

	protected Marshaller getMarshaller() throws JAXBException {
		return createContext().createMarshaller();
	}

	protected Unmarshaller getUnmarshaller() throws JAXBException {
		return createContext().createUnmarshaller();
	}

	protected JAXBContext createContext() throws JAXBException {
		if (jc == null) {
			if("V270".equalsIgnoreCase(this.transType)) {
				jc = JAXBContext.newInstance(v270CtxPath);
			} else if("V271".equalsIgnoreCase(this.transType)) {
				jc = JAXBContext.newInstance(v271CtxPath);
			}
		}
		return jc;
	}
	
	/*	
	public String marshall(T270 dObject) throws Exception {
		String outboundXML = "";
		try {
			if (null == dObject) {
				throw new Exception("Cound not generate the xml from nll object");
			}
			StringWriter strWriter = new StringWriter(2000);
			Marshaller mar = this.getMarshaller();				
			mar.marshal(dObject, strWriter);
			outboundXML = strWriter.getBuffer().toString();
		} catch (Exception e) {
			throw new Exception("Received JAXB exception while marshaling.", e);
		}
		return outboundXML;
	}
*/
}
