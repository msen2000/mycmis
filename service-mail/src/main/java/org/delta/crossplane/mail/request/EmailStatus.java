package org.sen.crossplane.mail.request;

import java.io.Serializable;

//import org.apache.commons.lang.builder.ToStringBuilder;

public class EmailStatus implements Serializable {

	private static final long serialVersionUID = 2392845501520549219L;

	private String exceptionMessage;

	private Exception exception;

	private String[] invalidAddress;

	private String[] validUnsentAddress;

	private String[] validSentAddress;

	public String[] getInvalidAddress() {
		return invalidAddress;
	}

	public void setInvalidAddress(String[] invalidAddress) {
		this.invalidAddress = invalidAddress;
	}

	public String[] getValidUnsentAddress() {
		return validUnsentAddress;
	}

	public void setValidUnsentAddress(String[] validUnsentAddress) {
		this.validUnsentAddress = validUnsentAddress;
	}

	public String[] getValidSentAddress() {
		return validSentAddress;
	}

	public void setValidSentAddress(String[] validSentAddress) {
		this.validSentAddress = validSentAddress;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	@Override
	public String toString() {

//		return new ToStringBuilder(this).
//			append("exceptionMessage").append(getExceptionMessage()).
//			append("exception").append(getException()).
//			append("invalidAddress").append(getInvalidAddress()).
//			append("validUnsentAddress").append(getValidUnsentAddress()).
//			append("validSentAddress").append(getValidSentAddress()).
//			toString();
		
		return "";
	}
}
