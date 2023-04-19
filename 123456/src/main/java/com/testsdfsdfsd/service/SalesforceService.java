package com.testsdfsdfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsdfsdfsd.model.Opportunity;
import com.testsdfsdfsd.repository.SalesforceRepository;

@Service
public class SalesforceService {

    @Autowired
    private SalesforceRepository salesforceRepository;

    public List<Opportunity> findAllOpenOpportunities() {
        return salesforceRepository.findAllOpenOpportunities();
    }

    public List<Opportunity> findOpportunitiesByOwnerName(String ownerName) {
        return salesforceRepository.findOpportunitiesByOwnerName(ownerName);
    }

    public List<Opportunity> findOpportunitiesByStage(String stage) {
        return salesforceRepository.findOpportunitiesByStage(stage);
    }

    public List<Opportunity> findOpportunitiesByAmount(String amount) {
        return salesforceRepository.findOpportunitiesByAmount(amount);
    }

    public List<Opportunity> findOpportunitiesByClosingDate(String closingDate) {
        return salesforceRepository.findOpportunitiesByClosingDate(closingDate);
    }

}