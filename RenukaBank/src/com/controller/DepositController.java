package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Account;
import com.service.BankProjectService;


public class DepositController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public DepositController() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 

	{
		//value fetch			
		    Account acc = new Account();
			int aid =(Integer.parseInt(request.getParameter("account_id")));
			System.out.println(aid);
		
			double amount=0;
		    request.setAttribute("account_id", aid);
			
		    
	/*=====================Calling service to fetch account details before any transaction============ */
		    if (request.getParameter("action").equals("fetch"))
		    {
			try{
				acc = BankProjectService.fetchAccountData(aid);
				if(acc != null)
				{ 
					request.setAttribute("account", acc);
					RequestDispatcher rd = request.getRequestDispatcher("Deposit.jsp");
					rd.forward(request, response);
				}
				else 
				{   
					response.sendRedirect("Error.jsp");
					
				}
				
			}

			catch(ServletException | IOException e)
			{
				e.printStackTrace();
			}
		    }
			
			/*=====================Calling service to deposit money============ */  
		    if (request.getParameter("action").equals("deposit"))
			try
			{
			
			amount = Double.parseDouble(request.getParameter("amount"));
		 aid = Integer.parseInt(request.getParameter("account_id"));
				request.setAttribute("amount", amount);
				acc = BankProjectService.deposit(aid, amount);
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}



		}
	
}
