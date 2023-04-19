package com.testsdfsdfsd.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.testsdfsdfsd.repository.SalesforceRepository;

import java.time.LocalDateTime;
import java.util.List;

import com.testsdfsdfsd.model.Opportunity;

@Service
@Transactional
public class SalesforceService {

    private SalesforceRepository salesforceRepository;

    public SalesforceService(SalesforceRepository salesforceRepository) {
        this.salesforceRepository = salesforceRepository;
    }

    public List<Opportunity> findOpportunitiesByAccountId(Long accountId) {
        return salesforceRepository.findOpportunitiesByAccountId(accountId);
    }

    public List<Opportunity> findOpportunitiesCreatedMoreThan30DaysAgo(LocalDateTime thirtyDaysAgo) {
        return salesforceRepository.findOpportunitiesCreatedMoreThan30DaysAgo(thirtyDaysAgo);
    }

    public int updateOpportunityStageToCloseLost(LocalDateTime thirtyDaysAgo) {
        return salesforceRepository.updateOpportunityStageToCloseLost(thirtyDaysAgo);
    }

}