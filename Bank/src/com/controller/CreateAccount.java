package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Account;
import com.dao.CreateAccountDao;
import com.service.CreateAccountService;
import com.util.DbTransaction;
@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateAccount() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
		PrintWriter pw=response.getWriter();
		String customer_Id=request.getParameter("Customer_Id");
		String acc_type=request.getParameter("AccountType");
		String start_deposit=request.getParameter("start_deposit");
		CreateAccountService bs=new CreateAccountService(); 
		System.out.println("hello1");
		Account a1=new Account();
		String acc_id="";
		 int i=-1;
			i = bs.searchAccountService(customer_Id,acc_type);
			System.out.println("hello2");
		if(i==1){
		 
				bs.insertAccountSerivce(customer_Id, acc_type, Integer.parseInt(start_deposit));
				acc_id=bs.accountIdGeneratedService(customer_Id);
		         
				System.out.println("hello3");
            String message="Account Creation initiated successfully"+acc_id;
            request.setAttribute("message",message);
            RequestDispatcher rd=getServletContext().getRequestDispatcher("/ShowView.jsp");
            rd.forward(request, response);
		
		}
		if(i==2){
			//create link with jsp page
            String message="Unable to create account.Account is already present";
            request.setAttribute("message",message);
            RequestDispatcher rd=getServletContext().getRequestDispatcher("/ShowView.jsp");
            rd.forward(request, response);
		
			System.out.println("hello4");

		}
	   if(i==0){
		   //create link with jsp page
		   String message="Customer id is not present";
           request.setAttribute("message",message);
           RequestDispatcher rd=getServletContext().getRequestDispatcher("/ShowView.jsp");
           rd.forward(request, response);
		
			System.out.println("hello5");
	   }
	   if(i==3){
           String message="Your account is here but it is in inactive state.Do you want to activate it";
           request.setAttribute("message",message);
           RequestDispatcher rd=getServletContext().getRequestDispatcher("/ShowView.jsp");
           rd.forward(request, response);
		
			System.out.println("hello6");
	   }

}
}