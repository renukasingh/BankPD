package com.bean;

import java.sql.Date;

public class Account {

	private String customerId;
	private int accountId;
	private String accountType;
	private String status;
	private double balance;
	private String message;
	private Date lastTransaction;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getLastTransaction() {
		return lastTransaction;
	}

	public void setLastTransaction(Date lastTransaction) {
		this.lastTransaction = lastTransaction;
	}

}
