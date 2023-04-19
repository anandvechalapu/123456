package com.testsdfsdfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.testsdfsdfsd.model.Opportunity;

public interface SalesforceRepository extends JpaRepository<Opportunity, Long> {

    @Query("SELECT o FROM Opportunity o WHERE o.status = 'Open'")
    List<Opportunity> findAllOpenOpportunities();

    @Query("SELECT o FROM Opportunity o WHERE o.ownerName LIKE %?1")
    List<Opportunity> findOpportunitiesByOwnerName(String ownerName);

    @Query("SELECT o FROM Opportunity o WHERE o.stage LIKE %?1")
    List<Opportunity> findOpportunitiesByStage(String stage);

    @Query("SELECT o FROM Opportunity o WHERE o.amount LIKE %?1")
    List<Opportunity> findOpportunitiesByAmount(String amount);

    @Query("SELECT o FROM Opportunity o WHERE o.closingDate LIKE %?1")
    List<Opportunity> findOpportunitiesByClosingDate(String closingDate);

}