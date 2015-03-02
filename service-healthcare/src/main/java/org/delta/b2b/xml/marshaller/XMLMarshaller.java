package org.sen.b2b.xml.marshaller;

public interface XMLMarshaller {

	public String marshall(Object dObject) throws Exception;
	public Object unmarshall(String xml) throws Exception;
	
}
