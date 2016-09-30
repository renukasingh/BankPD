package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import com.util.DbTransaction;

public class AccountSearchDao {

	static Connection con=null;	
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	ArrayList<Object> data=new ArrayList<Object>();/*used to pass retrieved data*/
	//US0010->searching accountId or customerId for getting CUST_ID,ACCOUNT_ID,ACCOUNT_TYPE,BALANCE 
	public  ArrayList<Object> search_AccountById(String id,int flag)throws SQLException,ClassNotFoundException{
		    con=DbTransaction.getConnection();
		    String query=" ";
		    //retrieving data by using customer_id
		    if(flag==2)
		              query="select CUST_ID,ACCOUNT_ID,ACCOUNT_TYPE,BALANCE from ACCOUNT_STATUS where CUST_ID=?";
		    //retrieving data by using Account_id
		    if(flag==1)
			          query="select CUST_ID,ACCOUNT_ID,ACCOUNT_TYPE,BALANCE from ACCOUNT_STATUS where ACCOUNT_ID=?";
		   
		    ps=con.prepareStatement(query);
		    ps.setString(1,id);
		    rs=ps.executeQuery();

		    if(rs.next()){
			data.add(rs.getString(1));

			data.add(rs.getInt(2));
			data.add(rs.getString(3));
			data.add(rs.getDouble(4));
		}

		    DbTransaction.closeConnection(con);
		return data;// returning arraylist with data
	}
}

 
