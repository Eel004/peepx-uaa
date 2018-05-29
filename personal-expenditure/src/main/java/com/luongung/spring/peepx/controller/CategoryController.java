package com.luongung.spring.peepx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luongung.spring.peepx.model.Category;
import com.luongung.spring.peepx.services.CategoryServices;

@RestController
@RequestMapping(path="/api/categories")
public class CategoryController {
	
	private static final Logger LOG = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryServices categoryServices;
	
	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit personal expenditure app";
	}
	
	@PostMapping(path = "/create")
	public Category create(@RequestBody Category category) {
		LOG.info("Create category...");
		return categoryServices.save(category);
	}
	
	@RequestMapping(path = "/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		LOG.info("Delete category with Id = " + id);
		categoryServices.deleteById(id);
		LOG.info("Deleted");
	}
	
	@GetMapping(path = "/list")
	public Iterable<Category> listAll() {
		return categoryServices.findAll();
	}
	

}
