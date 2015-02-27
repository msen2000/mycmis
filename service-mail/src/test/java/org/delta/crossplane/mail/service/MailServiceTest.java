package org.delta.crossplane.mail.service;

import org.delta.crossplane.common.test.AbstractSpringContextTests;
import org.delta.crossplane.common.test.AbstractSpringContextTestsInjectionByName;
import org.delta.crossplane.domain.AbstractDomain.Status;
import org.delta.crossplane.domain.email.EmailStatus;
import org.delta.crossplane.mail.service.impl.EmailServiceImpl;
import org.delta.crossplane.mail.template.EmailTemplate;

public class MailServiceTest extends AbstractSpringContextTests {
	
	private EmailServiceImpl emailService;

	String[] strTo = { "pramswami@delta.org" };
	
	String[] strCc = { "grifflew@hotmail.com" };

	String[] strBcc = { "ddc_svc_ema5@hotmail.com", "ddc_svc_ema5@gmail.com" };

	String strFrom = "ddc_svc_ema5@delta.org";

	String[] strReplacementValues = new String[4];

	public EmailServiceImpl getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailServiceImpl emailService) {
		this.emailService = emailService;
	}

	public void atestEMailService_ctx_xml() {
		assertNotNull(emailService);
	}

	public void atestOE_EN_APPROVAL_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		EmailStatus emailStatus = emailService.send("pramswami@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.OE_EN_APPROVAL_TEMPLATE.getValue());
		assertNotNull(emailStatus);
	}

	public void atestOE_EN_REJECTED_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		EmailStatus emailStatus = emailService.send("pramswami@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.OE_EN_REJECTED_TEMPLATE.getValue());
		assertNotNull(emailStatus);
	}

	public void atestOE_EN_MASS_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		EmailStatus emailStatus = emailService.send("ddc_svc_ema5@delta.org",
				"", "", strReplacementValues, EmailTemplate.OE_EN_MASS_TEMPLATE
						.getValue());
		assertNotNull(emailStatus);
	}

	public void atestJOB_FAILURE_TEMPLATE() {
		/*CrossPlaneRuntimeException a = new CrossPlaneRuntimeException("this is a test message");
		String strTo = "ddc_svc_ema5@delta.org";
		strReplacementValues[0] = strFrom;
		strReplacementValues[1] = "Sample Job";
		strReplacementValues[2] = "(1)";
		strReplacementValues[3] = "<U>Reason of failure:</U><br>"
			+ a.getMessage() + "<br><U>Detailed Error:</U><br>"
			+ a + "<br>";
		EmailStatus emailStatus = emailService.send(strTo,
				"", "", strReplacementValues,
				EmailTemplate.JOB_FAILURE_TEMPLATE.getValue());
		assertNotNull(emailStatus);*/
	}

	public void atestOE_BA_REMAINDER_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		EmailStatus emailStatus = emailService.send("pramswami@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.OE_BA_REMAINDER_TEMPLATE.getValue());
		assertNotNull(emailStatus);
	}

	public void testNOE_EN_PENDING_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		EmailStatus emailStatus = emailService.send("pramswami@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.NOE_EN_PENDING_TEMPLATE.getValue());
		assertNotNull(emailStatus);
	}

	public void atestNOE_EN_APPROVAL_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		EmailStatus emailStatus = emailService.send("pramswami@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.NOE_EN_APPROVAL_TEMPLATE.getValue());
		assertNotNull(emailStatus);
	}

	public void atestNOE_EN_REJECTED_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		EmailStatus emailStatus = emailService.send("pramswami@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.NOE_EN_REJECTED_TEMPLATE.getValue());
		assertNotNull(emailStatus);
	}

	public void atestNOE_BA_PENDING_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		EmailStatus emailStatus = emailService.send("pramswami@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.NOE_BA_PENDING_TEMPLATE.getValue());
		assertNotNull(emailStatus);
	}

	public void atestNOE_BA_REMAINDER_TEMPLATE() {
		strReplacementValues[0] = strFrom;
		strReplacementValues[1] = "XX";
		EmailStatus emailStatus = emailService.send("ddc_svc_ema5@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.NOE_BA_REMAINDER_TEMPLATE.getValue());
		assertNotNull(emailStatus);
	}

	public void atestEMailService_plain_send() {
		strReplacementValues[0] = strFrom;
		strReplacementValues[1] = Status.APPROVED.getDescription();
		strReplacementValues[2] = "807968686";
		strReplacementValues[3] = "<html><head></head><body><b><font color='#FF0000'>"
				+ "<font face='Calisto MT, Comic Sans MS'>Sample HTML Template</font></font>"
				+ "</b><p><font><font face='Calisto MT, Comic Sans MS'>"
				+ "Here is the main content of the template............</font></font>"
				+ "</b></p><p><font><font face='Calisto MT, Comic Sans MS'>First Line</font>"
				+ "</font></b></p><p><font><font face='Calisto MT, Comic Sans MS'><U>Second Line</U></font>"
				+ "</font></b></p><p><font><font face='Calisto MT, Comic Sans MS'><i>Third Line</i></font>"
				+ "</font></b></p><p><font><font face='Calisto MT, Comic Sans MS'><b>Fourth Line</b></font>"
				+ "</font></b></p></body></html>";
		EmailStatus emailStatus = emailService.send("ddc_svc_ema5@delta.org",
				"", "", strReplacementValues,
				EmailTemplate.OE_EN_APPROVAL_TEMPLATE.getValue());
		assertNotNull(emailStatus);
		assertNotNull("Invalid Address", emailStatus.getInvalidAddress());
		assertNotNull("Valid Address", emailStatus.getValidSentAddress());
		assertNotNull("Valid Unsent Address", emailStatus.getValidSentAddress());
	}

	public void atestEMailService_plain_multiple_send() {
		strReplacementValues[0] = strFrom;
		strReplacementValues[1] = Status.REJECTED.getDescription();
		strReplacementValues[2] = "11010133331";
		strReplacementValues[3] = "<html><head></head><body><b><font color='#FF0000'>"
				+ "<font face='Calisto MT, Comic Sans MS'>Sample HTML Template</font></font>"
				+ "</b><p><font><font face='Calisto MT, Comic Sans MS'>"
				+ "Here is the main content of the template............</font></font>"
				+ "</b></p><p><font><font face='Calisto MT, Comic Sans MS'>First Line</font>"
				+ "</font></b></p><p><font><font face='Calisto MT, Comic Sans MS'><U>Second Line</U></font>"
				+ "</font></b></p><p><font><font face='Calisto MT, Comic Sans MS'><i>Third Line</i></font>"
				+ "</font></b></p><p><font><font face='Calisto MT, Comic Sans MS'><b>Fourth Line</b></font>"
				+ "</font></b></p></body></html>";
		emailService.setTesting(false);
		EmailStatus emailStatus = emailService.send(strTo, strCc, strBcc,
				strReplacementValues, EmailTemplate.OE_EN_REJECTED_TEMPLATE
						.getValue());
		assertNotNull(emailStatus);
		assertNotNull("Invalid Address: " + emailStatus.toString(), 
				emailStatus.getInvalidAddress());
		assertNotNull("Valid Address", emailStatus.getValidSentAddress());
		assertNotNull("Valid Unsent Address", emailStatus.getValidSentAddress());

	}
	@Override
	protected String[] getConfigLocations() {
		return new String[] { "applicationContextTest.xml" };
	}

}
