package org.delta.services;

import org.delta.crossplane.exception.CrossPlaneRuntimeException;

public class IVRServiceException extends CrossPlaneRuntimeException {

	private static final long serialVersionUID = -23423491L;

	public IVRServiceException(String message) {
		super(message);
	}

	public IVRServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public IVRServiceException(Throwable cause) {
		super(cause);
	}
}
