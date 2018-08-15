package com.luongung.spring.peepx.dao;

import com.luongung.spring.peepx.model.User;

public interface UserDetailsDao {
	
	User findUserByUserName(String userName);
	
}
