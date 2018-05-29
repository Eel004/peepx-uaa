package com.luongung.spring.peepx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luongung.spring.peepx.model.Transaction;
import com.luongung.spring.peepx.services.TransactionServices;

/*
 * Controller using for transaction model
 */
@RestController
@RequestMapping(path = "/api/transactions")
public class TransactionController {
	
	private static Logger LOG = LoggerFactory.getLogger(TransactionController.class);
	
	@Autowired
	private TransactionServices transactionServices;
	
	@RequestMapping(path = "/hello")
	public String hello() {
		return "Welcome to transaction controller";
	}
	
	@PostMapping(path = "/create")
	public Transaction create(@RequestBody Transaction transaction) {
		LOG.info("Posting transaction...");
		return transactionServices.save(transaction);
	}
	

}
