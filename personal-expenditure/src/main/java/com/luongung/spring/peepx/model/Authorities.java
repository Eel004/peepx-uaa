package com.luongung.spring.peepx.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AUTHORITIES")
public class Authorities implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4912473120819394289L;

	@Id
	@Column(name = "AUTHORITY")
	private String authority;
	
	@ManyToOne
	@JoinColumn(name = "USERNAME")
	private User user;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	} 
	
	
}
