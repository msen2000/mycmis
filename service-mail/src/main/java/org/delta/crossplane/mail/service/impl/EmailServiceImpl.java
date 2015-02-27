package org.delta.crossplane.mail.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.MessageFormat;
import java.util.ListIterator;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.delta.crossplane.mail.request.EmailStatus;
import org.delta.crossplane.mail.service.EmailService;
import org.delta.crossplane.messages.mail.request.EmailServiceRequest;
import org.delta.crossplane.messages.mail.request.EmailServiceRequestType.EmailAttachmentType;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

@SuppressWarnings("unchecked")
public class EmailServiceImpl implements EmailService {

	private static final Log logger = LogFactory.getLog(EmailServiceImpl.class);

	private static final String RESQUEST_PREFIX = "org.delta.crossplane.messages.mail.request";

	private JavaMailSender emailSender;

	private String testToEmail;

	private boolean testing;
	
	public String getTestToEmail() {
		return testToEmail;
	}

	public void setTestToEmail(String testToEmail) {
		this.testToEmail = testToEmail;
	}

	public boolean isTesting() {
		return testing;
	}

	public void setTesting(boolean testing) {
		this.testing = testing;
	}

	public void setEmailSender(JavaMailSender emailSender) {
		this.emailSender = emailSender;
	}

	/**
	 * @param strTo
	 *            receiver email
	 * @param strCc
	 *            receiver email
	 * @param strBcc
	 *            receiver email
	 * @param strTemplateId
	 *            Mail Template Id
	 * @throws MailException
	 *             in case of message, authentication, or send errors
	 */
	@Override
	public EmailStatus send(String strTo, String strCc, String strBcc,Object[] objArgs, String strTemplateId) throws MailException {

		logger.debug("Mail Mime Test: String strTo, String strCc, String strBcc, Object[] objArgs, String strTemplateId");

		EmailServiceRequest emailServiceRequest = null;
		EmailAttachmentType emailAttachmentType = null;
		
		MimeMessage mimeMessage = this.emailSender.createMimeMessage();
		String[] strRecipient = null;
		MimeMessageHelper mimeMessageHelper = null;
		String strRequestXML = "";
		String strUpdatedSubject = "";
		String strUpdatedBody = "";

		if ((StringUtils.isBlank(strTo)) && (StringUtils.isBlank(strCc)) && (StringUtils.isBlank(strBcc))) {
			throw new IllegalArgumentException( "Receiver email id cannot be empty");
		}
		if (StringUtils.isBlank(strTemplateId)) {
			throw new IllegalArgumentException("Template id cannot be empty");
		}
		if (isTesting()) {
			logger.debug("Demo/Testing purposes :" + isTesting());
			strTo = testToEmail;
			
			StringTokenizer st = new StringTokenizer(testToEmail, ",");
//			strTo = new String[size];
			int i =0;
			if (st.hasMoreElements()) {
			 strTo  = st.nextToken(); 
			}
			
			strCc = null;
			strBcc = null;
			logger.debug("To Email :" + strTo);
			
		}

		try {
			strRequestXML = StreamUtil.read("email/data/" + strTemplateId+ ".xml");
			emailServiceRequest = getEmailRequestService(strRequestXML);
		} catch (IOException e) {
			logger.error("Unable to read the email template", e);
			throw new Exception(e);
		}

		try {

			if (emailServiceRequest.getEmailAttachment().isEmpty()) {
				logger.debug("No attachments...");
				mimeMessageHelper = new MimeMessageHelper(mimeMessage);
			} else {

				mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
				ListIterator listIterator = emailServiceRequest
						.getEmailAttachment().listIterator();
				while (listIterator.hasNext()) {
					emailAttachmentType = (EmailAttachmentType) listIterator
							.next();
					logger.debug("Name: "
							+ emailAttachmentType.getEmailAttachmentName());
					logger.debug("Path: "
							+ emailAttachmentType.getEmailAttachmentPath());
					mimeMessageHelper.addAttachment(emailAttachmentType
							.getEmailAttachmentName(), new File(
							emailAttachmentType.getEmailAttachmentPath()
									.toString()));
				}
			}
			if (StringUtils.isNotBlank(strTo))
				mimeMessageHelper.setTo(strTo);

			if (StringUtils.isNotBlank(strCc))
				mimeMessageHelper.setCc(strCc);

			if (StringUtils.isNotBlank(strBcc))
				mimeMessageHelper.setBcc(strBcc);
			try {
				strUpdatedSubject = MessageFormat.format(
						emailServiceRequest.getEmailSubject(), objArgs);
				strUpdatedBody = MessageFormat.format(
						emailServiceRequest.getEmailBody(), objArgs);
				mimeMessageHelper.setFrom(MessageFormat.format(
						emailServiceRequest.getEmailFrom(), objArgs));
			} catch (IllegalArgumentException e) {
				logger.error(e);
				throw new Exception(e);
			}
			mimeMessageHelper.setSubject(strUpdatedSubject);
			mimeMessageHelper.setText(strUpdatedBody, true);
		} catch (MessagingException e) {
			throw new Exception(e);
		}
		strRecipient = new String[1];
		strRecipient[0] = strTo;
		EmailStatus emailStatus = sendEmail(mimeMessage);
		return emailStatus;
	}

	public EmailStatus sendSENemail(String strTo, String strCc, String strBcc,Object[] objArgs, String strTemplateId) throws MailException {

		logger.debug("Mail Mime Test: String strTo, String strCc, String strBcc, Object[] objArgs, String strTemplateId");

		EmailServiceRequest emailServiceRequest = null;
		EmailAttachmentType emailAttachmentType = null;
		
		MimeMessage mimeMessage = this.emailSender.createMimeMessage();
		String[] strRecipient = null;
		MimeMessageHelper mimeMessageHelper = null;
		String strRequestXML = "";
		String strUpdatedSubject = "";
		String strUpdatedBody = "";

		if ((StringUtils.isBlank(strTo)) && (StringUtils.isBlank(strCc)) && (StringUtils.isBlank(strBcc))) {
			throw new IllegalArgumentException( "Receiver email id cannot be empty");
		}
		if (StringUtils.isBlank(strTemplateId)) {
			throw new IllegalArgumentException("Template id cannot be empty");
		}
		if (isTesting()) {
			logger.debug("Demo/Testing purposes :" + isTesting());
			strTo = testToEmail;
			
			StringTokenizer st = new StringTokenizer(testToEmail, ",");
//			strTo = new String[size];
			int i =0;
			if (st.hasMoreElements()) {
			 strTo  = st.nextToken(); 
			}
			
			strCc = null;
			strBcc = null;
			logger.debug("To Email :" + strTo);
			
		}

		try {
			strRequestXML = StreamUtil.read("email/data/" + strTemplateId+ ".xml");
			emailServiceRequest = getEmailRequestService(strRequestXML);
		} catch (IOException e) {
			logger.error("Unable to read the email template", e);
			throw new Exception(e);
		}

		try {

			if (emailServiceRequest.getEmailAttachment().isEmpty()) {
				logger.debug("No attachments...");
				mimeMessageHelper = new MimeMessageHelper(mimeMessage);
			} else {

				mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
				ListIterator listIterator = emailServiceRequest
						.getEmailAttachment().listIterator();
				while (listIterator.hasNext()) {
					emailAttachmentType = (EmailAttachmentType) listIterator
							.next();
					logger.debug("Name: "
							+ emailAttachmentType.getEmailAttachmentName());
					logger.debug("Path: "
							+ emailAttachmentType.getEmailAttachmentPath());
					mimeMessageHelper.addAttachment(emailAttachmentType
							.getEmailAttachmentName(), new File(
							emailAttachmentType.getEmailAttachmentPath()
									.toString()));
				}
			}
			if (StringUtils.isNotBlank(strTo))
				mimeMessageHelper.setTo(strTo);

			if (StringUtils.isNotBlank(strCc))
				mimeMessageHelper.setCc(strCc);

			if (StringUtils.isNotBlank(strBcc))
				mimeMessageHelper.setBcc(strBcc);
			try {
				strUpdatedSubject = MessageFormat.format(
						emailServiceRequest.getEmailSubject(), objArgs);
				strUpdatedBody = MessageFormat.format(
						emailServiceRequest.getEmailBody(), objArgs);
				mimeMessageHelper.setFrom(MessageFormat.format(
						emailServiceRequest.getEmailFrom(), objArgs));
			} catch (IllegalArgumentException e) {
				logger.error(e);
				throw new Exception(e);
			}
			mimeMessageHelper.setSubject(strUpdatedSubject);
			mimeMessageHelper.setText(strUpdatedBody, true);
		} catch (MessagingException e) {
			throw new Exception(e);
		}
		strRecipient = new String[1];
		strRecipient[0] = strTo;
		EmailStatus emailStatus = sendEmail(mimeMessage);
		return emailStatus;
	}
	
	/**
	 * @param strTo
	 *            receiver emails
	 * @param strCc
	 *            receiver emails
	 * @param strBcc
	 *            receiver emails
	 * @param strTemplateId
	 *            Mail Template Id
	 * @throws MailException
	 *             in case of message, authentication, or send errors
	 */
	@Override
	public EmailStatus send(String[] strTo, String[] strCc, String[] strBcc,Object[] objArgs, String strTemplateId) throws MailException {
		logger.debug("Calling send(String[] strTo, String[] strCc, String[] strBcc, Object[] objArgs, String strTemplateId");
		EmailServiceRequest emailServiceRequest = null;
		EmailAttachmentType emailAttachmentType = null;
		MimeMessage mimeMessage = this.emailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = null;
		String strRequestXML = "";
		String strUpdatedSubject = "";
		String strUpdatedBody = "";

		if ((strTo == null || strTo.length == 0)
				&& (strCc == null || strCc.length == 0)
				&& (strBcc == null || strBcc.length == 0)) {
			throw new IllegalArgumentException(
					"Receiver email id cannot be empty");
		}
		if (StringUtils.isBlank(strTemplateId)) {
			throw new IllegalArgumentException("Template id cannot be empty");
		}

		if (isTesting()) {
			logger.debug("Demo/Testing purposes :" + isTesting());
			
			StringTokenizer st = new StringTokenizer(testToEmail, ",");
			int size = st.countTokens();
			strTo = new String[size];
			int i =0;
			while (st.hasMoreElements()) {
			 strTo[i++]  = st.nextToken(); 
			}
			strCc = null;
			strBcc = null;
			logger.debug("To Email :" + testToEmail);
		}

		try {
			strRequestXML = StreamUtil.read("email/data/" + strTemplateId
					+ ".xml");
			emailServiceRequest = getEmailRequestService(strRequestXML);
		} catch (Exception e) {
			logger.error("Unable to read the email template", e);
			throw new Exception(e);
		}
		try {

			if (emailServiceRequest.getEmailAttachment().isEmpty()) {
				logger.debug("No attachments...");
				mimeMessageHelper = new MimeMessageHelper(mimeMessage);
			} else {

				mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
				ListIterator listIterator = emailServiceRequest
						.getEmailAttachment().listIterator();
				while (listIterator.hasNext()) {
					emailAttachmentType = (EmailAttachmentType) listIterator
							.next();
					logger.debug("Name: "
							+ emailAttachmentType.getEmailAttachmentName());
					logger.debug("Path: "
							+ emailAttachmentType.getEmailAttachmentPath());
					mimeMessageHelper.addAttachment(emailAttachmentType
							.getEmailAttachmentName(), new File(
							emailAttachmentType.getEmailAttachmentPath()
									.toString()));
				}
			}
			if (strTo != null && strTo.length > 0)
				mimeMessageHelper.setTo(strTo);

			if (strCc != null && strCc.length > 0)
				mimeMessageHelper.setCc(strCc);

			if (strBcc != null && strBcc.length > 0)
				mimeMessageHelper.setBcc(strBcc);
			try {
				strUpdatedSubject = MessageFormat.format(
						emailServiceRequest.getEmailSubject(), objArgs);
				strUpdatedBody = MessageFormat.format(
						emailServiceRequest.getEmailBody(), objArgs);
				mimeMessageHelper.setFrom(MessageFormat.format(
						emailServiceRequest.getEmailFrom(), objArgs));
			} catch (IllegalArgumentException e) {
				logger.error(e);
				throw new Exception(e);
			}
			mimeMessageHelper.setSubject(strUpdatedSubject);
			mimeMessageHelper.setText(strUpdatedBody, true);

		} catch (MessagingException e) {
			throw new Exception(e);
		}
		EmailStatus emailStatus = sendEmail(mimeMessage);
		return emailStatus;
	}

	private EmailStatus sendEmail(MimeMessage mimeMessage) {
		Transport transport = null;
		EmailStatus emailStatus = new EmailStatus();
		try {
			Properties props = new Properties();
			props.put("mail.smtp.host",((JavaMailSenderImpl) this.emailSender).getHost());
			props.put("mail.smtp.sendpartial", "true");
			// props.put("mail.smtp.reportsuccess", "true");
			props.put("mail.smtp.auth", "false");
			props.put("mail.smtp.port", "25");
//			props.put("mail.debug", "true");
			((JavaMailSenderImpl) this.emailSender).setSession(Session.getInstance(props));
			transport = ((JavaMailSenderImpl) this.emailSender).getSession().getTransport(mimeMessage.getAllRecipients()[0]);
			transport.connect();
			mimeMessage.saveChanges();
			transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
		} catch (MessagingException mex) {
			logger.error("------------MessagingException--------------", mex);
			emailStatus.setExceptionMessage(mex.getMessage());
			emailStatus.setException(mex);
			Exception ex = mex;
			do {
				if (ex instanceof SendFailedException) {
					SendFailedException sfex = (SendFailedException) ex;
					Address[] invalidAddrs = sfex.getInvalidAddresses();
					emailStatus.setException(sfex);
					if (invalidAddrs != null) {
						String[] invalidAddress = new String[invalidAddrs.length];
						for (int i = 0; i < invalidAddrs.length; i++) {
							invalidAddress[i] = invalidAddrs[i].toString();
						}
						emailStatus.setInvalidAddress(invalidAddress);
						emailStatus.setExceptionMessage(sfex.getMessage());
					}

					Address[] validUnsentAddrs = sfex.getValidUnsentAddresses();
					if (validUnsentAddrs != null) {
						String[] validUnsentAddress = new String[validUnsentAddrs.length];
						for (int i = 0; i < validUnsentAddrs.length; i++) {
							validUnsentAddress[i] = validUnsentAddrs[i]
									.toString();
						}
						emailStatus.setValidUnsentAddress(validUnsentAddress);
						emailStatus.setExceptionMessage(sfex.getMessage());
					}
					Address[] validSentAddrs = sfex.getValidSentAddresses();
					if (validSentAddrs != null) {
						String[] validSentAddress = new String[validSentAddrs.length];
						for (int i = 0; i < validSentAddrs.length; i++) {
							validSentAddress[i] = validSentAddrs[i].toString();
						}
						emailStatus.setValidSentAddress(validSentAddress);
					}
				}
				if (ex instanceof MessagingException)
					ex = ((MessagingException) ex).getNextException();
				else
					ex = null;
			} while (ex != null);
		} finally {
			try {
				if (transport != null) {
					transport.close();
				}
			} catch (MessagingException e) {
				logger.error("------------MessagingException--------------", e);
			}
		}
		return emailStatus;
	}

	private EmailServiceRequest getEmailRequestService(String requestXML) {
		if (StringUtils.isBlank(requestXML)) {
			throw new IllegalArgumentException("Invalid request XML");
		}
		try {
			// Unmarshal the response XML into objects.
			JAXBContext replyJc = JAXBContext.newInstance(RESQUEST_PREFIX,
					getClass().getClassLoader());
			Unmarshaller u = replyJc.createUnmarshaller();

			EmailServiceRequest emailServiceRequest = (EmailServiceRequest) u
					.unmarshal(new StreamSource(new StringReader(requestXML)));

			return emailServiceRequest;
		} catch (JAXBException e) {
			throw new Exception(e);
		}
	}
	
	public String printTo(String to[]){  
        try{  
            InternetAddress internetAddresses[] = new InternetAddress[to.length];  
            for(int i = 0; i < to.length; i++){  
                internetAddresses[i] = new InternetAddress("" + to[i]);  
                 System.out.println("Address # " + i + " : " + to[i]);  
            }  
            System.out.println("lenth email:"+to.length);
   
        }  
        catch(MessagingException e){  
            e.printStackTrace();  
        }  
        return "";
    }  

	@Override
	public EmailStatus send(String[] strTo, String[] strCc, String[] strBcc,
			Object[] objArgs, String strTemplateId, String fileName, File file, String from, String source)
			throws MailException {

		logger.debug("Calling send(String[] strTo, String[] strCc, String[] strBcc, Object[] objArgs, String strTemplateId");
		EmailServiceRequest emailServiceRequest = null;
		EmailAttachmentType emailAttachmentType = null;
		MimeMessage mimeMessage = this.emailSender.createMimeMessage();
		
		MimeMessageHelper mimeMessageHelper = null;
		String strRequestXML = "";
		String strUpdatedSubject = "";
		String strUpdatedBody = "";

		if ((strTo == null || strTo.length == 0)
				&& (strCc == null || strCc.length == 0)
				&& (strBcc == null || strBcc.length == 0)) {
			throw new IllegalArgumentException(
					"Receiver email id cannot be empty");
		}
		if (StringUtils.isBlank(strTemplateId)) {
			throw new IllegalArgumentException("Template id cannot be empty");
		}

		if (isTesting()) {
			logger.debug("Demo/Testing purposes :" + isTesting());
//			strTo = new String[1];
//			strTo[0] = testToEmail;
			if(source == null || source.equalsIgnoreCase("EBD")){
			StringTokenizer st = new StringTokenizer(testToEmail, ",");
			int size = st.countTokens();
			strTo = new String[size];
			int i =0;
			while (st.hasMoreElements()) {
			 strTo[i++]  = st.nextToken(); 
			} }
			
			strCc = null;
			strBcc = null;
			logger.debug("To Email :" + testToEmail);
		}

		try {
			strRequestXML = StreamUtil.read("email/data/" + strTemplateId
					+ ".xml");
			emailServiceRequest = getEmailRequestService(strRequestXML);
		} catch (Exception e) {
			logger.error("Unable to read the email template", e);
			throw new Exception(e);
		}
		try {

			if (file == null && emailServiceRequest != null && emailServiceRequest.getEmailAttachment() != null &&
					emailServiceRequest.getEmailAttachment().isEmpty()) {
				logger.debug("No attachments...");
				mimeMessageHelper = new MimeMessageHelper(mimeMessage);
			} else {

				mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			
					logger.debug("Name: "
							+ fileName);
					
					mimeMessageHelper.addAttachment(fileName, file);
			}
			System.out.println("Print email properties");
			System.out.println(("hosttting:  "+((JavaMailSenderImpl) this.emailSender).getHost()));
			System.out.println("To email: "+ printTo(strTo));
			if (strTo != null && strTo.length > 0)
				mimeMessageHelper.setTo(strTo);

			if (strCc != null && strCc.length > 0)
				mimeMessageHelper.setCc(strCc);

			if (strBcc != null && strBcc.length > 0)
				mimeMessageHelper.setBcc(strBcc);
			
			if(from != null){
				mimeMessageHelper.setFrom(from);
			}
			try {
				strUpdatedSubject = MessageFormat.format(
						emailServiceRequest.getEmailSubject(), objArgs);
				strUpdatedBody = MessageFormat.format(
						emailServiceRequest.getEmailBody(), objArgs);
				mimeMessageHelper.setFrom(MessageFormat.format(
						emailServiceRequest.getEmailFrom(), objArgs));
			} catch (IllegalArgumentException e) {
				logger.error(e);
				throw new Exception(e);
			}
			mimeMessageHelper.setSubject(strUpdatedSubject);
			mimeMessageHelper.setText(strUpdatedBody, true);

		} catch (MessagingException e) {
			throw new Exception(e);
		}
		EmailStatus emailStatus = sendEmail(mimeMessage);
		return emailStatus;
	}

}
