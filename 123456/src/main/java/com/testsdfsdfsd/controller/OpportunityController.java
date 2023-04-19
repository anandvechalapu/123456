package com.testsdfsdfsd.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testsdfsdfsd.model.Opportunity;
import com.testsdfsdfsd.service.SalesforceService;

@RestController
@RequestMapping("/opportunities")
public class OpportunityController {

    @Autowired
    private SalesforceService salesforceService;

    @GetMapping
    public List<Opportunity> findAllOpenOpportunities() {
        return salesforceService.findAllOpenOpportunities();
    }

    @GetMapping("/ownerName")
    public List<Opportunity> findOpportunitiesByOwnerName(@RequestParam(value = "ownerName") String ownerName) {
        return salesforceService.findOpportunitiesByOwnerName(ownerName);
    }

    @GetMapping("/stage")
    public List<Opportunity> findOpportunitiesByStage(@RequestParam(value = "stage") String stage) {
        return salesforceService.findOpportunitiesByStage(stage);
    }

    @GetMapping("/amount")
    public List<Opportunity> findOpportunitiesByAmount(@RequestParam(value = "amount") String amount) {
        return salesforceService.findOpportunitiesByAmount(amount);
    }

    @GetMapping("/closingDate")
    public List<Opportunity> findOpportunitiesByClosingDate(@RequestParam(value = "closingDate") String closingDate) {
        return salesforceService.findOpportunitiesByClosingDate(closingDate);
    }

    @GetMapping("/accountId")
    public List<Opportunity> findOpportunitiesByAccountId(@RequestParam(value = "accountId") Long accountId) {
        return salesforceService.findOpportunitiesByAccountId(accountId);
    }

    @GetMapping("/thirtyDaysAgo")
    public List<Opportunity> findOpportunitiesCreatedMoreThan30DaysAgo(@RequestParam(value = "thirtyDaysAgo") LocalDateTime thirtyDaysAgo) {
        return salesforceService.findOpportunitiesCreatedMoreThan30DaysAgo(thirtyDaysAgo);
    }

    @GetMapping("/updateStage")
    public int updateOpportunityStageToCloseLost(@RequestParam(value = "thirtyDaysAgo") LocalDateTime thirtyDaysAgo) {
        return salesforceService.updateOpportunityStageToCloseLost(thirtyDaysAgo);
    }
}