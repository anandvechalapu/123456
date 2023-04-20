package com.testsdfsdfsd.service;

import com.testsdfsdfsd.dto.MailMasterDto;
import com.testsdfsdfsd.repository.MailServiceRepository;

public class MailService {

	private MailServiceRepository mailServiceRepository;

	public MailService(MailServiceRepository mailServiceRepository) {
		this.mailServiceRepository = mailServiceRepository;
	}
	
	public boolean createAndSendEmail(MailMasterDto mailMasterDto) {
		if(mailServiceRepository.createEmail(mailMasterDto) && mailServiceRepository.sendEmail()) {
			return true;
		}
		return false;
	}
	
	public String getSuccessMessage() {
		return mailServiceRepository.getSuccessMessage();
	}
}