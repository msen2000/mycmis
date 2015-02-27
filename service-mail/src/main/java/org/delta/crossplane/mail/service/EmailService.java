package org.delta.crossplane.mail.service;

import java.io.File;

import org.delta.crossplane.mail.request.EmailStatus;
import org.springframework.mail.MailException;

public interface EmailService {
	/**
	 * @param strTo
	 *            receiver email
	 * @param strCc
	 *            receiver email
	 * @param strBcc
	 *            receiver email
	 * @param objArgs
	 *            Mail Template Arguments
	 * @param strTemplateId
	 *            Mail Template Id
	 * @throws MailException
	 *             in case of message, authentication, or send errors
	 */
	public EmailStatus send(String strTo, String strCc, String strBcc,
			Object[] objArgs, String strTemplateId) throws MailException;

	/**
	 * @param strTo
	 *            receiver emails
	 * @param strCc
	 *            receiver emails
	 * @param strBcc
	 *            receiver emails
	 * @param objArgs
	 *            Mail Template Arguments
	 * @param strTemplateId
	 *            Mail Template Id
	 * @throws MailException
	 *             in case of message, authentication, or send errors
	 */
	public EmailStatus send(String[] strTo, String[] strCc, String[] strBcc,
			Object[] objArgs, String strTemplateId) throws MailException;
	
	/**
	 * @param strTo
	 *            receiver emails
	 * @param strCc
	 *            receiver emails
	 * @param strBcc
	 *            receiver emails
	 * @param objArgs
	 *            Mail Template Arguments
	 * @param strTemplateId
	 *            Mail Template Id
	 * @throws MailException
	 *             in case of message, authentication, or send errors
	 */
	public EmailStatus send(String[] strTo, String[] strCc, String[] strBcc,
			Object[] objArgs, String strTemplateId, String fileName, File file, String from, String source) throws MailException;

}
