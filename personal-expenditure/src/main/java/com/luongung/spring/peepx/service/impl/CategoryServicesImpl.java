package com.luongung.spring.peepx.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luongung.spring.peepx.dao.CategoryDao;
import com.luongung.spring.peepx.model.Category;
import com.luongung.spring.peepx.service.CategoryServices;

/**
 * defining a bean of type {@link CategoryServices}
 * @author luong.ung
 *
 */
@Service
public class CategoryServicesImpl implements CategoryServices {
	
	@Autowired
	private CategoryDao categoryRepository;

	@Override
	public Iterable<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> search(String q) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Category> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	
}
