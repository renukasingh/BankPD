package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.LoginBean;
import com.service.LoginService;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		HttpSession session=request.getSession();

		String n = request.getParameter("Username");
		String p = request.getParameter("Password");

		LoginBean loginbean = new LoginBean();
		LoginService loginservice = new LoginService();

		loginbean.setUsername(n);
		loginbean.setPassword(p);
		String name = loginservice.validate(loginbean).getName();
		String role = loginservice.validate(loginbean).getRole();

		System.out.println(name);
		System.out.println(role);

		if (role != null) {
			if (role.equalsIgnoreCase("CUSTOMER_EXECUTIVE")) {
				session.setAttribute("username",name); 
				RequestDispatcher rd = request
						.getRequestDispatcher("Executive/LoginExecutive.jsp");
				rd.forward(request, response);
			} else if (role.equalsIgnoreCase("CASHIER/TELLER")) {
				session.setAttribute("username",name); 
				RequestDispatcher rd = request
						.getRequestDispatcher("Cashier/LoginCashier.jsp");
				rd.forward(request, response);
			}
		} else {
			String failure = "\nIncorrect Username or Password\n";
			request.setAttribute("message", failure);
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}

	}
}
