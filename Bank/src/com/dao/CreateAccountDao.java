package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.DbTransaction;

public class CreateAccountDao {

	static Connection con=null;	
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	//static String status;
	public  int search_Account(String Customer_id,String type){
		try{
		con=DbTransaction.getConnection();
		String query="select * from Customer_status where CUST_ID=?";
		 ps=con.prepareStatement(query);
		 ps.setString(1, Customer_id);
		rs=ps.executeQuery();
		boolean i=rs.next();
		if(i){
			String query1="select STATUS from ACCOUNT_STATUS where CUST_ID=? AND ACCOUNT_TYPE=?";
			    
               ps=con.prepareStatement(query1);
			   ps.setString(1,Customer_id);
			   ps.setString(2,type);
			   
               rs=ps.executeQuery();
			   if(rs.next()){
			   if(rs.getString(1).equals("ACTIVE")){DbTransaction.closeConnection(con);return 2;}
			   if(rs.getString(1).equals("INACTIVE")){DbTransaction.closeConnection(con);return 3;}
			   }
			  // status=rs.getString(5);
			   //Account is already present u are unable to create account and if its inactive state then make it active
			    
			 //Account initiated successfully
			   else
			    DbTransaction.closeConnection(con);return 1;
		}
		else {
			   //cannot create account entered customerid isnot present
			DbTransaction.closeConnection(con);
	    }}catch(SQLException e){e.printStackTrace();}
		return 0;
	}
	
	
	
	public  int account_insert(String Customer_id,String type,double start_deposit){
		int i=0;
		try{
		con=DbTransaction.getConnection();
		String 	query1="insert into ACCOUNT_STATUS VALUES(?,ACCOUNT_SEQ.nextval,?,?,?,Current_Timestamp,?)";
        ps=con.prepareStatement(query1);	
        ps.setString(1,Customer_id);
	    ps.setString(2, type);
		ps.setString(3,"account created");
		ps.setString(4,"ACTIVE");
		ps.setDouble(5,start_deposit);
		i=ps.executeUpdate();
		DbTransaction.closeConnection(con);
		}catch(SQLException e){e.printStackTrace();}
		return i;
		
	}
	public  String accountIdGenerated(String Customer_id){
		String id="";
		try{
		con=DbTransaction.getConnection();
		  
		  String query1="select ACCOUNT_ID FROM ACCOUNT_STATUS WHERE CUST_ID=?";
		  
          ps=con.prepareStatement(query1);
    	  ps.setString(1,Customer_id);
          rs=ps.executeQuery();
    	  if(rs.next()){
    		  id=rs.getString(1);
    	  }
    	  DbTransaction.closeConnection(con);
		}catch(SQLException e){e.printStackTrace();}
    	  return id;		
	}
}


 
