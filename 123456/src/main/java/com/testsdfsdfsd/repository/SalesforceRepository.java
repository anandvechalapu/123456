package com.testsdfsdfsd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testsdfsdfsd.model.Opportunity;

@Repository
public interface SalesforceRepository extends CrudRepository<Opportunity, Long> {

    List<Opportunity> findAllByStatus(String status);

    List<Opportunity> findAllByNameOrOwnerNameOrStageOrAmountOrClosingDate(String name, String ownerName, String stage, Double amount, Date closingDate);

    List<Opportunity> findAllByOrderByAmountAsc();

    List<Opportunity> findAllByOrderByAmountDesc();

    List<Opportunity> findAllByOrderByStageAsc();

    List<Opportunity> findAllByOrderByStageDesc();

    List<Opportunity> findAllByOrderByClosingDateAsc();

    List<Opportunity> findAllByOrderByClosingDateDesc();

    Page<Opportunity> findAll(Pageable pageable);

}