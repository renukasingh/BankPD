package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.LoginBean;
import com.util.DbTransaction;


public class LoginDao {

	public LoginBean validate(LoginBean loginbean) {

		try {
			PreparedStatement ps = DbTransaction
					.getConnection()
					.prepareStatement("select name, role from LOGINCRED where USER_NAME=? and PASSWORD=?");
			ps.setString(1, loginbean.getUsername());
			ps.setString(2, loginbean.getPassword());

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				loginbean.setName(rs.getString(1));
				loginbean.setRole(rs.getString(2));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginbean;

	}

}
