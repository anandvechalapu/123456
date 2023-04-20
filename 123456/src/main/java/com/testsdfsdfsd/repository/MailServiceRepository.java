package com.testsdfsdfsd.repository;

import com.testsdfsdfsd.dto.MailMasterDto;

public interface MailServiceRepository {

	/**
	 * Receives a MailMasterDto object and creates an email using the information provided by the object. 
	 * @param mailMasterDto MailMasterDto object containing the mail information
	 * @return boolean true if email created successfully
	 */
	boolean createEmail(MailMasterDto mailMasterDto);
	
	/**
	 * Sends the created email to the intended recipients
	 * @return boolean true if email sent successfully
	 */
	boolean sendEmail();
	
	/**
	 * Returns a string message indicating the success if email is successfully sent
	 * @return String success message
	 */
	String getSuccessMessage();
}