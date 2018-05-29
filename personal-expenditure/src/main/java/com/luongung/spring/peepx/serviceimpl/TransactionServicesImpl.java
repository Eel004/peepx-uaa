package com.luongung.spring.peepx.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luongung.spring.peepx.model.Transaction;
import com.luongung.spring.peepx.repositories.TransactionRepository;
import com.luongung.spring.peepx.services.TransactionServices;

/**
 * defining a bean of type {@link TransactionServices}
 * @author luong.ung
 *
 */
@Service
public class TransactionServicesImpl implements TransactionServices{

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public Iterable<Transaction> findAll() {
		return transactionRepository.findAll();
	}

	@Override
	public Optional<Transaction> findById(long id) {
		return transactionRepository.findById(id);
	}

	@Override
	public Transaction save(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public void deleteById(long id) {
		transactionRepository.deleteById(id);
	}

}
