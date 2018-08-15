package com.luongung.spring.peepx.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luongung.spring.peepx.dao.UserDetailsDao;
import com.luongung.spring.peepx.model.User;

@Repository
public class UserDetailDaoImpl implements UserDetailsDao {

	@Autowired
	SessionFactory sessionFactory;
		
	public User findUserByUserName(String userName) {
		return sessionFactory.getCurrentSession().get(User.class, userName);
	}

}
