package com.luongung.spring.peepx.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.luongung.spring.peepx.model.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long>{
		
}
