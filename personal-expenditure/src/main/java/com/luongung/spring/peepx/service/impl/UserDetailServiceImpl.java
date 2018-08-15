package com.luongung.spring.peepx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luongung.spring.peepx.dao.UserDetailsDao;
import com.luongung.spring.peepx.model.User;


@Service("userDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsDao userDetailsDao;
	
	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		User user = userDetailsDao.findUserByUserName(userName);
		UserBuilder userBuilder = null;
		if(user != null) {
			userBuilder = org.springframework.security.core.userdetails.User.withUsername(userName);
			userBuilder.disabled(!user.isEnabled());
			userBuilder.password(user.getPassword());
			String[] authorities = user.getAuthorities().stream()
					.map(a -> a.getAuthority()).toArray(String[]::new);
			userBuilder.authorities(authorities);
		} else {
			throw new UsernameNotFoundException("User not found");
		}
		
		return userBuilder.build();
	}

}
