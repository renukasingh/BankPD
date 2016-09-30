package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTransaction {
	
	public static Connection getConnection(){
		Connection con = null;
		try {
			//closeConnection();
			Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@172.25.192.82:1521:javaaodb","HJA40ORAUSER3D","tcshyd");
			if(con==null)
				System.out.println("point 3");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
}
