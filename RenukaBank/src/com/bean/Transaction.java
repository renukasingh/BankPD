package com.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class Transaction {
	
	private String customerId;
	private int accountId;
	private String transactionId;
	private String transactionType;
	private double amount;
	private String targetAccountId;
	private  Timestamp transactionDate;
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
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTargetAccountId() {
		return targetAccountId;
	}
	public void setTargetAccountId(String targetAccountId) {
		this.targetAccountId = targetAccountId;
	}
	public  Timestamp getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate( Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	

}
