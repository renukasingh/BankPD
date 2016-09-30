package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.AccountSearchService;

@WebServlet("/AccountSearch")
public class AccountSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AccountSearch() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name1=request.getParameter("name1");
		String name2=request.getParameter("name2");
        int flag=0;
		
		
		AccountSearchService s=new AccountSearchService();
		
	        if(!name1.isEmpty()){
			    try {
				       flag=1;
				       ArrayList<Object> rs=s.search_AccountByIdService(name1,flag);//used to get data in form of arraylist
				       if(!rs.isEmpty()){
				    	   //passing control to the jsp page by using requestDispatcher
					      request.setAttribute("rs",rs);
					      RequestDispatcher reqDisp = getServletContext().getRequestDispatcher("Cashier/SearchAccountView.jsp");
					      reqDisp.forward(request, response);
					     
				       }
				      else{
					         String message="Invalid value Please re-enter your id";
						      request.setAttribute("rs",message);
						      RequestDispatcher reqDisp = getServletContext().getRequestDispatcher("Cashier/Failed.jsp");
						      reqDisp.forward(request, response);
					         
				      }} catch (ClassNotFoundException | SQLException e) {				
		            		e.printStackTrace();
			        }
		    }
    		else if(!name2.isEmpty()){
		         	flag=2;
			        try {
				           ArrayList<Object> rs=s.search_AccountByIdService(name2,flag);//used to get data in form of arraylist
				           if(!rs.isEmpty()){
				        	 //passing control to the jsp page by using requestDispatcher
					                request.setAttribute("rs",rs);
					                RequestDispatcher reqDisp = request.getRequestDispatcher("Cashier/SearchAccountView.jsp");
					                reqDisp.forward(request, response);
     				                
				           }
				           else{
				        	   String message="Invalid value Please re-enter your id";
							      request.setAttribute("rs",message);
							      RequestDispatcher reqDisp = getServletContext().getRequestDispatcher("Cashier/Failed.jsp");
							      reqDisp.forward(request, response);

				           }} catch (ClassNotFoundException | SQLException e) {
				             e.printStackTrace();
			             }
		}
		
		
	}

}
