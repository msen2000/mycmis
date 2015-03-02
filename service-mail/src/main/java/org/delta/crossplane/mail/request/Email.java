package org.sen.crossplane.mail.request;


public class Email {
	private String emailType;
	private String emailAddress;
	private boolean primaryEmail;	
	private boolean voidIndicator = false;
	
		
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Email == false) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Email rhs = (Email) obj;
		
//		return new EqualsBuilder()
//		.append(this.emailType, rhs.emailType)
//		.append(this.emailAddress, rhs.emailAddress)
//		.append(primaryEmail, rhs.primaryEmail)
//		.isEquals();
		
		return true;
	}
	
	public boolean compare(Object obj) {
		if (obj instanceof Email == false) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Email rhs = (Email) obj;
//		return new EqualsBuilder()
//		.append(this.emailAddress, rhs.emailAddress)
//		.isEquals();
		return true;
	}
	
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public boolean isPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(boolean primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public boolean isVoidIndicator() {
		return voidIndicator;
	}

	public void setVoidIndicator(boolean voidIndicator) {
		this.voidIndicator = voidIndicator;
	}

}
