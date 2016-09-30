package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Account;
import com.service.BankProjectService;

@WebServlet("/WithdrawController")
public class WithdrawController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawController() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		{
			//value fetch			
			    Account acc = new Account();
				int aid =(Integer.parseInt(request.getParameter("account_id")));
				System.out.println(aid);
			
			    //request.setAttribute("account_id", aid);
				
			    
		/*=====================Calling service to fetch account details before any transaction============ */
			    if (request.getParameter("action").equals("fetch"))
			    {
				try{
					acc = BankProjectService.fetchAccountData(aid);
					if(acc != null)
					{ 
						request.setAttribute("account", acc);
						RequestDispatcher rd = request.getRequestDispatcher("Cashier/Withdraw.jsp");
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
				
				/*=====================Calling service to withdraw money============ */  
			    if (request.getParameter("action").equals("withdraw"))
				try
				{
				
				double amount = Double.parseDouble(request.getParameter("amount"));
				System.out.println("amount is------------------ " + amount);
					//request.setAttribute("amount", amount);
					
					acc = BankProjectService.withdraw(aid, amount);
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}



			
	}

}
}
