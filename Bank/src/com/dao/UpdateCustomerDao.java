package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bean.Customer;
import com.util.DbTransaction;

public class UpdateCustomerDao {
	
	public static Customer searchCustomer(String custId){
		//Statement st=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Connection con=null;
		Customer tempCust=new Customer();
		try{
			con=DbTransaction.getConnection();
			
			//Using prepared statement
			pstm=con.prepareStatement("select * from CUSTOMER_STATUS where CUST_ID=?");
			pstm.setString(1, custId);
			rs=pstm.executeQuery();
			
			//Using Statement
			//st=con.createStatement();
			//String query="select * from CUSTOMER_STATUS where CUST_ID='"+custId+"'";
			//rs=st.executeQuery(query);
			
			if(rs.next()){
				
				tempCust.setCustomerId(rs.getString(1));
				tempCust.setCustomerSSNId(rs.getInt(2));
				tempCust.setCustomerName(rs.getString(3));
				tempCust.setAge(rs.getInt(4));
				tempCust.setAddress(rs.getString(5));
				tempCust.setCity(rs.getString(6));
				tempCust.setState(rs.getString(7));
				
			}
			else
			{
				tempCust=null;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				rs.close();
				pstm.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			DbTransaction.closeConnection(con);
		}
		return tempCust;
	}
	
	
	public static int updateCustomer(Customer cust){
		//Statement st=null;
		PreparedStatement pstm=null;
		Connection con=null;
		int i=0;
		try{
			con=DbTransaction.getConnection();
			
			//Using Prepared Statement
			
			pstm=con.prepareStatement("update CUSTOMER_STATUS set CUSTOMER_NAME=?,AGE=?,ADDRESS=?,CITY=?,STATE=?,MESSAGE='Last updated on '||to_char(CURRENT_TIMESTAMP),LAST_UPDATE=CURRENT_TIMESTAMP where CUST_ID=?");
			pstm.setString(1, cust.getCustomerName());
			pstm.setInt(2, cust.getAge());
			pstm.setString(3, cust.getAddress());
			pstm.setString(4, cust.getCity());
			pstm.setString(5, cust.getState());
			pstm.setString(6, cust.getCustomerId());
			i=pstm.executeUpdate();
			
			//Using Statement
			//st=con.createStatement();
			//String query="update CUSTOMER_STATUS set CUSTOMER_NAME='"+cust.getCustomerName()+"',AGE="+cust.getAge()+",ADDRESS='"+cust.getAddress()+"',CITY='"+cust.getCity()+"',STATE='"+cust.getState()+"',"+"LAST_UPDATE=CURRENT_TIMESTAMP where CUST_ID='"+cust.getCustomerId()+"'";
			//System.out.println(query);
			//i=st.executeUpdate(query);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				pstm.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			DbTransaction.closeConnection(con);
		}
		return i;
	}
	
	
	public static Customer searchCustomer(int ssnId){
		//Statement st=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Connection con=null;
		Customer tempCust=new Customer();
		try{
			con=DbTransaction.getConnection();
			
			//Using prepared statement
			pstm=con.prepareStatement("select * from CUSTOMER_STATUS where SSN_ID=?");
			pstm.setInt(1, ssnId);
			rs=pstm.executeQuery();
			
			//Using Statement
			//st=con.createStatement();
			//String query="select * from CUSTOMER_STATUS where CUST_ID='"+custId+"'";
			//rs=st.executeQuery(query);
			
			if(rs.next()){
				
				tempCust.setCustomerId(rs.getString(1));
				tempCust.setCustomerSSNId(rs.getInt(2));
				tempCust.setCustomerName(rs.getString(3));
				tempCust.setAge(rs.getInt(4));
				tempCust.setAddress(rs.getString(5));
				tempCust.setCity(rs.getString(6));
				tempCust.setState(rs.getString(7));
				
			}
			else
			{
				tempCust=null;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				rs.close();
				pstm.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			DbTransaction.closeConnection(con);
		}
		return tempCust;
	}

}
