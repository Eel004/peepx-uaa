package com.luongung.spring.peepx.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CATEGORY")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6509357102751397550L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CATEGORY_ID", nullable = false)
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ICON")
	private String icon;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private Set<Transaction> transactions = new HashSet<>();
	
	public Category() {
	}

	public Category(long id, String name, String icon, String description, Set<Transaction> transactions) {
		this.id = id;
		this.name = name;
		this.icon = icon;
		this.description = description;
		this.transactions = transactions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", icon=" + icon + ", description=" + description
				+ ", transactions=" + transactions + "]";
	}
	
}
