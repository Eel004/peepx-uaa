package com.luongung.spring.peepx.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luongung.spring.peepx.dao.CategoryDao;
import com.luongung.spring.peepx.dao.UserDetailsDao;
import com.luongung.spring.peepx.model.Category;
import com.luongung.spring.peepx.model.User;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Category> findByNameContaining(String q) {
		// TODO Auto-generated method stub
		return null;
	}

}
