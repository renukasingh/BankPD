package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import com.dao.AccountSearchDao;

public class AccountSearchService 
{
	//US0010--> Search method in Service Class  and call here Dao class method search_AccountById(String id,int flag) 
	public ArrayList<Object> search_AccountByIdService(String id,int flag) throws ClassNotFoundException, SQLException{
		 
		AccountSearchDao accountSearchDao=new AccountSearchDao();
	    ArrayList<Object> a=accountSearchDao.search_AccountById(id,flag);
	    return a;// returning arraylist with data
   }
 }
