package com.luongung.spring.peepx.services;

import java.util.List;
import java.util.Optional;

import com.luongung.spring.peepx.model.Transaction;

public interface TransactionServices {

    Iterable<Transaction> findAll();

    Optional<Transaction> findById(long id);

    Transaction save(Transaction transaction);

    void deleteById(long id);
}
