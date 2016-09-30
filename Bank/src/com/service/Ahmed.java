package com.service;

import com.bean.Customer;
import com.dao.UpdateCustomerDao;

public class Ahmed {
	
	public static Customer searchCustomer(String custId){
		Customer customer=new Customer();
		customer=UpdateCustomerDao.searchCustomer(custId);
		return customer;
	}
	
	public static int updateCustomer(Customer cust){
		int i=UpdateCustomerDao.updateCustomer(cust);
		return i;
	}
	
	public static Customer searchCustomer(int ssnId){
		Customer customer=new Customer();
		customer=UpdateCustomerDao.searchCustomer(ssnId);
		return customer;
	}

}
