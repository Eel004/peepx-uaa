package com.luongung.spring.peepx.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luongung.spring.peepx.model.Category;
import com.luongung.spring.peepx.repositories.CategoryRepository;
import com.luongung.spring.peepx.services.CategoryServices;

@Service
public class CategoryServicesImpl implements CategoryServices {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public List<Category> search(String q) {
		return categoryRepository.findByNameContaining(q);
	}

	@Override
	public Optional<Category> findById(long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteById(long id) {
		categoryRepository.deleteById(id);
	}

}
