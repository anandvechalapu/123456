package com.testsdfsdfsd.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.testsdfsdfsd.model.Opportunity;
import com.testsdfsdfsd.repository.SalesforceRepository;

@Service
public class SalesforceService {

	@Autowired
	private SalesforceRepository salesforceRepository;
	
	public List<Opportunity> findAllByStatus(String status) {
		return salesforceRepository.findAllByStatus(status);
	}
	
	public List<Opportunity> findAllByNameOrOwnerNameOrStageOrAmountOrClosingDate(String name, String ownerName, String stage, Double amount, Date closingDate) {
		return salesforceRepository.findAllByNameOrOwnerNameOrStageOrAmountOrClosingDate(name, ownerName, stage, amount, closingDate);
	}
	
	public List<Opportunity> findAllByOrderByAmountAsc() {
		return salesforceRepository.findAllByOrderByAmountAsc();
	}
	
	public List<Opportunity> findAllByOrderByAmountDesc() {
		return salesforceRepository.findAllByOrderByAmountDesc();
	}
	
	public List<Opportunity> findAllByOrderByStageAsc() {
		return salesforceRepository.findAllByOrderByStageAsc();
	}
	
	public List<Opportunity> findAllByOrderByStageDesc() {
		return salesforceRepository.findAllByOrderByStageDesc();
	}
	
	public List<Opportunity> findAllByOrderByClosingDateAsc() {
		return salesforceRepository.findAllByOrderByClosingDateAsc();
	}
	
	public List<Opportunity> findAllByOrderByClosingDateDesc() {
		return salesforceRepository.findAllByOrderByClosingDateDesc();
	}
	
	public Page<Opportunity> findAll(Pageable pageable) {
		return salesforceRepository.findAll(pageable);
	}
}