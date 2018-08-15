package com.luongung.spring.peepx.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luongung.spring.peepx.dao.TransactionDao;
import com.luongung.spring.peepx.model.Transaction;
import com.luongung.spring.peepx.service.TransactionServices;

/**
 * defining a bean of type {@link TransactionServices}
 * @author luong.ung
 *
 */
@Service
public class TransactionServicesImpl implements TransactionServices{

	@Autowired
	private TransactionDao transactionRepository;

	@Override
	public Iterable<Transaction> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Transaction> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction save(Transaction transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
