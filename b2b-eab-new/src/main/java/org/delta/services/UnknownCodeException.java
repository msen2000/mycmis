package org.delta.services;

public class UnknownCodeException extends IVRServiceException  {
	private static final long serialVersionUID = 226012345L;
	private String elementName;
	private String unknownCode;
	
	public UnknownCodeException(String message, String elementName, String unknownCode) {
		super(message+": elementName="+elementName+", unknownCode="+unknownCode);
		this.elementName = elementName;
		this.unknownCode = unknownCode;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getUnknownCode() {
		return unknownCode;
	}

	public void setUnknownCode(String unknownCode) {
		this.unknownCode = unknownCode;
	}

}
