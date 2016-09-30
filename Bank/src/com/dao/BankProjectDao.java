package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;

import com.util.DbTransaction;
import com.bean.Account;
import com.bean.Customer;
import com.bean.Transaction;

public class BankProjectDao{


	/*==========================DISPLAY ACCOUNT DETAILS BEFORE ANY TRANSACTION======================================*/


	//Fetch data to be displayed on deposit/withdraw page
	public static Account fetchAccountData(int aid) throws ClassNotFoundException, SQLException
	{   
		Account acc =  new Account();
		Connection con = DbTransaction.getConnection();
		PreparedStatement ps = null;
		String query = null;
		System.out.println(aid);

		query = "Select cust_id, account_id, account_type, balance, status from account_status where account_id =? AND status= 'ACTIVE'";
		ps = con.prepareStatement(query);
		ps.setInt(1, aid);
		ResultSet rs = ps.executeQuery();
		if(!rs.next())
		{return null;}//add later
		else { 
			acc.setStatus(rs.getString("status"));
			if(acc.getStatus().equalsIgnoreCase("ACTIVE"))
			{

				do{

					acc.setCustomerId(rs.getString("cust_id"));
					acc.setAccountId(rs.getInt("account_id"));
					acc.setAccountType(rs.getString("account_type"));
					acc.setBalance(rs.getDouble("balance"));

					//testing
					System.out.println("Customer Id: " + acc.getCustomerId());
					System.out.println("Account Id: " + acc.getAccountId());
					System.out.println("Account type: " + acc.getAccountType() );
					System.out.println("Balance: " + acc.getBalance());
				}while(rs.next());
				
			}
			}
		return acc;
		}

	
	



	/*======================================DEPOSIT MONEY===================================================*/


	//calculate balance after depositing money
	public static Account deposit(int aid, double amount) throws ClassNotFoundException, SQLException
	{ 

		//updating balance in the ACCOUNT TABLE
		Transaction t = new Transaction();
		Account acc = new Account();
		double balance = 0;
		Connection con = DbTransaction.getConnection();
		PreparedStatement ps = null;
		String query = null;
		ResultSet rs =null;
		query = "select balance from account_status where account_id =?";
		ps = con.prepareStatement(query);
		ps.setInt(1, aid);
		rs = ps.executeQuery();
		while(rs.next())
		{
			acc.setBalance(rs.getDouble("balance"));
			balance = acc.getBalance() + amount;
			acc.setBalance(balance);
			System.out.println("new balance: " + balance);

		}

		query = "update account_status set balance = ? where account_id = ?";
		ps = con.prepareStatement(query);
		ps.setDouble(1, acc.getBalance());
		ps.setInt(2, aid);
		rs = ps.executeQuery();

		/*=================================UPDATING TRANSACTION TABLE ===============================*/

		query = "insert into transaction values ('TRXN' || to_char(transaction_seq.nextval,'FM000000'),?,?,?,?,?,?)";
		ps = con.prepareStatement(query);
		ps.setInt(1, acc.getAccountId());
		ps.setString(2, "DEPOSIT");
		ps.setDouble(3, amount);
		ps.setString(4, acc.getCustomerId());
		ps.setInt(5, aid);
		ps.setTimestamp(6,new Timestamp(System.currentTimeMillis()));
		ps.executeQuery();
		//testing data
		query = "select * from transaction";
		ps = con.prepareStatement(query);
		rs = ps.executeQuery();
		while (rs.next())
		{
			t.setAccountId(rs.getInt("account_id"));
			t.setTransactionId(rs.getString("trxn_id"));
			t.setCustomerId(rs.getString("cust_id"));
			t.setAmount(rs.getDouble("amount"));
			t.setTargetAccountId(rs.getString("account_id"));
			t.setTransactionDate(rs.getTimestamp("transaction"));
			t.setTransactionType(rs.getString("trxn_type"));




			System.out.println("\n \n \nTransaction Id: " + t.getTransactionId());
			System.out.println("Account Id: " + t.getAccountId());
			System.out.println("Transaciton type: " + t.getTransactionType());
			System.out.println("Transaction amount: " + t.getAmount());
			System.out.println("Customer Id :" +t.getCustomerId());
			System.out.println("Target Account Id: " +aid);
			System.out.println("Transation time: " +t.getTransactionDate());
		}

		return acc;
	}




	/*======================================WITHDRAW MONEY===================================================*/


	//calculate balance after withdrawing money
	//updating balance in the ACCOUNT TABLE
	public static Account withdraw(int aid, double amount) throws ClassNotFoundException, SQLException
	{ 

		//updating balance in the ACCOUNT TABLE
		Transaction t = new Transaction();
		Account acc = new Account();
		double balance = 0;
		Connection con = DbTransaction.getConnection();
		PreparedStatement ps = null;
		String query = null;
		ResultSet rs =null;
		query = "select balance from account_status where account_id = ?";
		ps = con.prepareStatement(query);
		ps.setInt(1, aid);
		rs = ps.executeQuery();
		while(rs.next())
		{ acc.setBalance(rs.getDouble("balance"));
			if(acc.getBalance() <= 0 || acc.getBalance() <= amount)
			{
				balance = acc.getBalance() - amount;
				acc.setBalance(balance);
				System.out.println("new balance: " + balance);
			}
			else 
			{
				acc = null;
				return acc;
			}
		}

		query = "update account_status set balance = ? where account_id = ?";
		ps = con.prepareStatement(query);
		ps.setDouble(1, acc.getBalance());
		ps.setInt(2, aid);
		rs = ps.executeQuery();



		/*=================================UPDATING TRANSACTION TABLE ===============================*/

		query = "insert into transaction values ('TRXN' || to_char(transaction_seq.nextval,'FM000000'),?,?,?,?,?,?)";
		ps = con.prepareStatement(query);
		ps.setInt(1, aid);
		ps.setString(2, "WITHDRAW");
		ps.setDouble(3, amount);
		ps.setString(4, acc.getCustomerId());
		ps.setInt(5, aid);
		ps.setTimestamp(6,new Timestamp(System.currentTimeMillis()));
		ps.executeQuery();
		//testing data
		query = "select * from transaction";
		ps = con.prepareStatement(query);
		rs = ps.executeQuery();
		while (rs.next())
		{
			t.setAccountId(rs.getInt("account_id"));
			t.setTransactionId(rs.getString("trxn_id"));
			t.setCustomerId(rs.getString("cust_id"));
			t.setAmount(rs.getDouble("amount"));
			t.setTargetAccountId(rs.getString("account_id"));
			t.setTransactionDate(rs.getTimestamp("transaction"));
			t.setTransactionType(rs.getString("trxn_type"));



			System.out.println("\n \n \nTransaction Id: " + t.getTransactionId());
			System.out.println("Account Id: " + t.getAccountId());
			System.out.println("Transaction type: " + t.getTransactionType());
			System.out.println("Transaction amount: " + t.getAmount());
			System.out.println("Customer Id :" +t.getCustomerId());
			System.out.println("Target Account Id: " +aid);
			System.out.println("Transation time: " +t.getTransactionDate());
		}

		return acc;
	}
}
