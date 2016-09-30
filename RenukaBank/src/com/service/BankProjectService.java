package com.service;

import java.sql.SQLException;

import com.bean.Account;
import com.bean.Customer;
import com.dao.BankProjectDao;

public class BankProjectService {

	public static Account fetchAccountData(int aid)
	{
		Account acc =  new Account();
		try {
			acc = BankProjectDao.fetchAccountData(aid);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return acc;
	}
	
	public static Account deposit(int aid, double amount)
	{
		Account acc =  new Account();
		try {
			acc = BankProjectDao.deposit(aid, amount);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return acc;
	}
	
	public static Account withdraw(int aid, double amount)
	{
		Account acc =  new Account();
		try {
			acc = BankProjectDao.withdraw(aid, amount);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return acc;
	}
}
