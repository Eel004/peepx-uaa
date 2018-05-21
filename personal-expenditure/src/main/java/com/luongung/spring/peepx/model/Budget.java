package com.luongung.spring.peepx.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "budget")
public class Budget implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "on_month")
	private int onMonth;
	
	@Column(name = "currency")
	private String currency;
	
	@ManyToMany(mappedBy = "budgets")
	private Set<Category> categories = new HashSet<>();
	
	public Budget () {
	}
	
	public Budget(double amount, int onMonth, String currency, Set<Category> categories) {
		this.amount = amount;
		this.onMonth = onMonth;
		this.currency = currency;
		this.categories = categories;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getOnMonth() {
		return onMonth;
	}

	public void setOnMonth(int onMonth) {
		this.onMonth = onMonth;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
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
		Budget other = (Budget) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Budget [id=" + id + ", amount=" + amount + ", onMonth=" + onMonth + ", currency=" + currency + ", categories=" + categories + "]";
	}

}
