package com.luongung.spring.peepx.model;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "TBL_BUDGET")
public class Budget implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5931152888186930286L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BUDGET_ID", nullable = false)
	private long id;
	
	@Column(name="AMOUNT", nullable = false)
	private double amount;
	
	@Column(name="SPENT_AMOUNT")
	private double spentAmount;
	
	@Column(name = "FROM_DATE", nullable = false)
	private Date fromDate;
	
	@Column(name = "TO_DATE", nullable = false)
	private Date toDate;
	
	@OneToMany(mappedBy="budget",fetch = FetchType.LAZY)
	private Set<Transaction> transactions = new HashSet<>();

	public Budget () {
	}

	public Budget(long id, double amount, double spentAmount, Date fromDate, Date toDate,
			Set<Transaction> transactions) {
		this.id = id;
		this.amount = amount;
		this.spentAmount = spentAmount;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.transactions = transactions;
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

	public double getSpentAmount() {
		return spentAmount;
	}

	public void setSpentAmount(double spentAmount) {
		this.spentAmount = spentAmount;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Budget [id=" + id + ", amount=" + amount + ", spentAmount=" + spentAmount + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", transactions=" + transactions + "]";
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
	

}
