package com.controller;

import java.io.IOException;

//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Customer;
import com.service.Ahmed;

/**
 * Servlet implementation class SearchCustomerController
 */
@WebServlet("/SearchCustomerController")
public class SearchCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Read SSN ID from request object and Check for null
		
		String stringSSNID=request.getParameter("ssnid");
		int ssnId=0;
		if(stringSSNID!=null){
			ssnId=Integer.parseInt(stringSSNID);
		}
		
		//Read customer ID from request object
		
		String custId=request.getParameter("custid");
		
		//Create Customer object to store result
		
		Customer customer=new Customer();
		
		//Call overloaded searchCustomer method of service class alternatively
		
		if(stringSSNID==null){
			customer=Ahmed.searchCustomer(custId);
		}
		if(custId==null){
			customer=Ahmed.searchCustomer(ssnId);
		}
		
		//Redirect to Error page if Valid Customer not found else to Display page to display Customer details
		
		if(customer==null){
			request.setAttribute("message", "No Customer Found");
			RequestDispatcher rd=request.getRequestDispatcher("Cashier/Failed.jsp");
			rd.forward(request, response);
		}
		else{
			request.setAttribute("s1", customer);
			RequestDispatcher rd=request.getRequestDispatcher("Cashier/SearchCustomerView.jsp");
			rd.forward(request, response);
		}
	}

}
