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
						RequestDispatcher rd = request.getRequestDispatcher("Cashier/Withdraw.jsp");
						rd.forward(request, response);
					}
					else 
					{   
						request.setAttribute("message", "Sorry, the account is either inactive or the account does not exist.");
						RequestDispatcher rd = request.getRequestDispatcher("Cashier/Failed.jsp");
						rd.forward(request, response);
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
					acc = BankProjectService.withdraw(aid, amount);
					System.out.println("acc is: "+acc.getBalance());
					if(acc.getBalance() != 0.0)
					{
				amount = Double.parseDouble(request.getParameter("amount"));
			 aid = Integer.parseInt(request.getParameter("account_id"));
					request.setAttribute("amount", amount);
			
				}
					else{
						request.setAttribute("message", "Sorry, the account doesn't have enough funds to make this withdrawal.");
						RequestDispatcher rd = request.getRequestDispatcher("Cashier/Failed.jsp");
						rd.forward(request, response);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}



			
	}

}
}
