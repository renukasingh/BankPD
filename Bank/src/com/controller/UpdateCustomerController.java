package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Customer;
import com.service.Ahmed;

/**
 * Servlet implementation class UpdateCustomerController
 */
@WebServlet("/UpdateCustomerController")
public class UpdateCustomerController extends HttpServlet {
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
		PrintWriter out=response.getWriter();
		
		//Create customer object and store details got from update customer web page
		
		Customer customer=new Customer();
		customer.setCustomerId(request.getParameter("custId"));
		customer.setCustomerName(request.getParameter("newName"));
		customer.setAge(Integer.parseInt(request.getParameter("newAge")));
		customer.setAddress(request.getParameter("newAddress"));
		customer.setCity(request.getParameter("newCity"));
		customer.setState(request.getParameter("newState"));
		
		//Call updateCustomer method of service class and pass the customer object as parameter
		
		int i=Ahmed.updateCustomer(customer);
		if(i==1){
			request.setAttribute("message", "Update Successful!");
			RequestDispatcher rd=request.getRequestDispatcher("Executive/Success.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message", "Update Failed!");
			RequestDispatcher rd=request.getRequestDispatcher("Executive/Failed.jsp");
			rd.forward(request, response);
		}
	}

}
