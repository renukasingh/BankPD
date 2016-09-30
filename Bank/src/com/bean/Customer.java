package com.bean;

import java.sql.Date;

import com.bean.Account;

public class Customer {
	private String customerId;
	private int customerSSNId;
	private String customerName;
	private int age;
	private String address;
	private String state;
	private String city;
	private String status;
	private String message;
	private Account savingAccount;
	private Account currentAccount;
	private Date lastUpdate;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getCustomerSSNId() {
		return customerSSNId;
	}

	public void setCustomerSSNId(int customerSSNId) {
		this.customerSSNId = customerSSNId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Account getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(Account savingAccount) {
		this.savingAccount = savingAccount;
	}

	public Account getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(Account currentAccount) {
		this.currentAccount = currentAccount;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}