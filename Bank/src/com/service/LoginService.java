package com.service;

import com.bean.LoginBean;
import com.dao.LoginDao;


public class LoginService {

	public LoginBean validate(LoginBean loginbean) {
		LoginDao logindao = new LoginDao();
		return logindao.validate(loginbean);
	}

}
