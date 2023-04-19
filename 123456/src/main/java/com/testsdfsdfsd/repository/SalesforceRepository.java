package com.testsdfsdfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesforceRepository extends JpaRepository<Opportunity, Long> {

    // Method to identify all opportunities related to an account when the account is updated
    @Query("SELECT o FROM Opportunity o WHERE o.accountId = ?1")
    List<Opportunity> findOpportunitiesByAccountId(Long accountId);

    // Method to check if an opportunity's created date is greater than 30 days from today
    @Query("SELECT o FROM Opportunity o WHERE o.createdDate > ?1")
    List<Opportunity> findOpportunitiesCreatedMoreThan30DaysAgo(LocalDateTime thirtyDaysAgo);

    // Method to update the opportunity's stage to Close Lost if its created date is greater than 30 days from today and its stage is not Close Won
    @Modifying
    @Query("UPDATE Opportunity o SET o.stage = 'CloseLost' WHERE o.createdDate > ?1 AND o.stage != 'Close Won'")
    int updateOpportunityStageToCloseLost(LocalDateTime thirtyDaysAgo);

}