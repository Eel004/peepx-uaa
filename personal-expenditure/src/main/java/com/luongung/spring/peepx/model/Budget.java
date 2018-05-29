package com.luongung.spring.peepx.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "budget")
public class Budget implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5931152888186930286L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name="amount", nullable = false)
	private double amount;
	
	@Column(name="spent_amount")
	private double spentAmount;
	
	@Column(name = "from_date", nullable = false)
	private Date fromDate;
	
	@Column(name = "to_date", nullable = false)
	private Date toDate;

	public Budget () {
	}
	
	public Budget(long id, double amount, double spentAmount, Date fromDate, Date toDate) {
		this.id = id;
		this.amount = amount;
		this.spentAmount = spentAmount;
		this.fromDate = fromDate;
		this.toDate = toDate;
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

	@Override
	public String toString() {
		return "Budget [id=" + id + ", amount=" + amount + ", spentAmount=" + spentAmount + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + "]";
	}
	

}
