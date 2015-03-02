package org.sen.services;

public class OperationException extends IVRServiceException  {
	private static final long serialVersionUID = 8736012345L;
	
	public OperationException(String message) {
		super(message);
	}
	
	public OperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public OperationException(Throwable cause) {
		super(cause);
	}
}
