package com.luongung.spring.peepx.services;

import java.util.List;
import java.util.Optional;

import com.luongung.spring.peepx.model.Category;

public interface CategoryServices {
	
    Iterable<Category> findAll();

    List<Category> search(String q);

    Optional<Category> findById(long id);

    Category save(Category category);

    void deleteById(long id);
}
