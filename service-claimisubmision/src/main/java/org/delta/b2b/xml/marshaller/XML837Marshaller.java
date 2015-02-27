/**
 * 
 */
package org.delta.b2b.xml.marshaller;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

import org.delta.b2b.edi.generator.T837EDIGenerator;
import org.delta.b2b.edi.t837.T837;

/**
 * @author ca31085
 *
 */
public class XML837Marshaller implements XMLMarshaller {
	
	private JAXBContext jc;
	String contextPath = "";

	public XML837Marshaller() {
		contextPath = "org.delta.b2b.edi.t837";
	}
	
	public String marshall(T837 dObject) throws Exception {
		String outboundXML = "";
		
		try {
			if (null == dObject) {
				throw new Exception("Cound not generate the xml from nll object");
			}
			StringWriter strWriter = new StringWriter(2000);
			Marshaller mar = this.getMarshaller();				
			mar.marshal(dObject, strWriter);
			outboundXML = strWriter.getBuffer().toString();
			//this.getMarshaller().marshal(p, System.out);			
		} catch (Exception e) {
			throw new Exception("Received JAXB exception while marshaling.", e);
		}
		return outboundXML;
	}

	public Object unmarshall(String xml) throws Exception {
		Object jaxbObject = null;
/*
		StringInputStream xmlTextString = null;		
		try {
			Unmarshaller u = this.getUnmarshaller();			
			xmlTextString = new StringInputStream(xml);
			jaxbObject = u.unmarshal(xmlTextString);
			
		} catch (Exception ex) {
			throw new Exception("Received a general exception when unmarshaling the message.",ex);
		}
		*/
		return jaxbObject;
	}
	
	public T837 unmarshall() throws Exception {
		T837 t837 = null;
		try {
			//String ROOT_DIR = "C:\\Temp\\v5010_270.xml";
			String ROOT_DIR = "C:\\Temp\\t1.xml";
			File f = new File(ROOT_DIR);
			FileInputStream ins = new FileInputStream(f);
			
			Unmarshaller u = this.getUnmarshaller();			
			t837 = (T837)u.unmarshal(ins);			
			System.out.println(t837.getName());
			System.out.println(t837.getStandard());
			
			T837EDIGenerator gen = new T837EDIGenerator(t837);			
			String str270 = gen.generateEDI();
			System.out.println("EDI is "+str270);
			
		} catch (UnmarshalException umex) {
			throw new Exception("Received a general exception when unmarshaling the message.",umex);
		} catch (JAXBException jex) {
			throw new Exception("Received a JAXB exception while unmarshalling the message.",jex);
		}
		return t837;
	}

	protected Marshaller getMarshaller() throws JAXBException {
		return createContext().createMarshaller();
	}

	protected Unmarshaller getUnmarshaller() throws JAXBException {
		return createContext().createUnmarshaller();
	}

	protected JAXBContext createContext() throws JAXBException {
		if (jc == null) {
			jc = JAXBContext.newInstance(contextPath);
		}
		return jc;
	}
}
