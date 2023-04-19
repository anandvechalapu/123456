package com.testsdfsdfsd.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testsdfsdfsd.model.Opportunity;
import com.testsdfsdfsd.model.User;
import com.testsdfsdfsd.service.SalesforceService;
import com.testsdfsdfsd.service.UserService;

@RestController
@RequestMapping("/api")
public class TestController {

	@Autowired
	UserService userService;
	
	@Autowired
	SalesforceService salesforceService;
	
	@GetMapping("/user/{username}")
	public User findByUsername(@PathVariable String username) {
		return userService.findByUsername(username);
	}
	
	@GetMapping("/user/email")
	public User findByEmail(@RequestParam(value = "email") String email) {
		return userService.findByEmail(email);
	}
	
	@PostMapping("/user/delete/{username}")
	public void deleteByUsername(@PathVariable String username) {
		userService.deleteByUsername(username);
	}
	
	@PostMapping("/user/delete/email")
	public void deleteByEmail(@RequestParam(value = "email") String email) {
		userService.deleteByEmail(email);
	}
	
	@GetMapping("/user/exists/{username}")
	public boolean existsByUsername(@PathVariable String username) {
		return userService.existsByUsername(username);
	}
	
	@GetMapping("/user/exists/email")
	public boolean existsByEmail(@RequestParam(value = "email") String email) {
		return userService.existsByEmail(email);
	}
	
	@GetMapping("/opportunities/status")
	public List<Opportunity> findAllByStatus(@RequestParam(value = "status") String status) {
		return salesforceService.findAllByStatus(status);
	}
	
	@PostMapping("/opportunities/search")
	public List<Opportunity> findAllByNameOrOwnerNameOrStageOrAmountOrClosingDate(@RequestBody Opportunity opportunity) {
		String name = opportunity.getName();
		String ownerName = opportunity.getOwnerName();
		String stage = opportunity.getStage();
		Double amount = opportunity.getAmount();
		Date closingDate = opportunity.getClosingDate();
		
		return salesforceService.findAllByNameOrOwnerNameOrStageOrAmountOrClosingDate(name, ownerName, stage, amount, closingDate);
	}
	
	@GetMapping("/opportunities/amount/asc")
	public List<Opportunity> findAllByOrderByAmountAsc() {
		return salesforceService.findAllByOrderByAmountAsc();
	}
	
	@GetMapping("/opportunities/amount/desc")
	public List<Opportunity> findAllByOrderByAmountDesc() {
		return salesforceService.findAllByOrderByAmountDesc();
	}
	
	@GetMapping("/opportunities/stage/asc")
	public List<Opportunity> findAllByOrderByStageAsc() {
		return salesforceService.findAllByOrderByStageAsc();
	}
	
	@GetMapping("/opportunities/stage/desc")
	public List<