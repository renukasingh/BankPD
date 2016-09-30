package com.service;
import com.dao.CreateAccountDao;

public class CreateAccountService 
{
	  CreateAccountDao dao=new CreateAccountDao();
	public int searchAccountService(String Customer_id,String type)
   {
		int i=0;
	    i=dao.search_Account(Customer_id,type);
	    return i;
   }
  public int insertAccountSerivce(String Customer_id,String type,double start_deposit) 
  {
	   int i=0;
	   i=dao.account_insert(Customer_id,type,start_deposit);
	   return i;
  }
  public String accountIdGeneratedService(String Customer_id){
	 String i=dao.accountIdGenerated(Customer_id);
     return i;
  }
}
