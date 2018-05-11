package com.luongung.spring.peepx.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.luongung.spring.peepx.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	 List<Category> findByNameContaining(String q);
	 
}
