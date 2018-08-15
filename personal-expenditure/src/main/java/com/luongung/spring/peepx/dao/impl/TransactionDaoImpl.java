package com.luongung.spring.peepx.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luongung.spring.peepx.dao.TransactionDao;

@Repository
public class TransactionDaoImpl implements TransactionDao {

	@Autowired
	SessionFactory sessionFactory;
	

}
