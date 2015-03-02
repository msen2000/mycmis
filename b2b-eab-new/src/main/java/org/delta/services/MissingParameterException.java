package org.sen.services;

public class MissingParameterException extends IVRServiceException  {
	private static final long serialVersionUID = 65236012345L;
	
	public MissingParameterException(String message) {
		super(message);
	}
	
}
