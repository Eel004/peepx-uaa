package com.luongung.spring.peepx.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "transaction")
public class Transaction implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2925403597087008961L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name = "amount", nullable = false)
	private double amount;
	
	@Basic
	@Column(name = "spend_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date spendDate;
	
	@Column(name = "currency", nullable = true)
	private String currency;
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable = false)
	private Category category;
	
	public Transaction () {
	}
	
	public Transaction(double amount, Date spendDate, String currency, Category category) {
		this.amount = amount;
		this.spendDate = spendDate;
		this.currency = currency;
		this.category = category;
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

	public Date getSpendDate() {
		return spendDate;
	}

	public void setSpendDate(Date spendDate) {
		this.spendDate = spendDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Category getCategories() {
		return category;
	}

	public void setCategories(Category category) {
		this.category = category;
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
		Transaction other = (Transaction) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", spendDate=" + spendDate + ", currency=" + currency
				+ ", categories=" + category + "]";
	}

}
