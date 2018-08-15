package com.luongung.spring.peepx.dao;

import java.util.List;

import com.luongung.spring.peepx.model.Category;

public interface CategoryDao{
	
	 List<Category> findByNameContaining(String q);
	 
}
