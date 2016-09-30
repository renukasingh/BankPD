<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
System.out.println("held");
  ArrayList<Object> rs = (ArrayList<Object>) request.getAttribute("rs");
System.out.println(rs.get(1));
Iterator<Object> i=rs.iterator();
  while(i.hasNext()){ 
%>
<table border=1 style='margin-left: 200px'>
<tr>
<td>Customer_ID</td>
<td>Account_Id</td>
<td>Account_Type</td>
<td>Account_Balance</td>
</tr>
<tr>
<td><%=i.next()%></td>
<td><%=i.next()%></td>
<td><%=i.next()%></td>
<td><%=i.next()%><% }%></td>
</tr>
</table>
<table style='margin-left: 250px;margin-top: 50px;'>
<tr><td><form action='Deposit.html'><input type='submit' name='submit1' value='Deposit'></form></td>
<td><form action='Transfer.html'><input type='submit' name='submit2' value='Transfer'></form></td>
<td><form action='Withdraw.html'><input type='submit' name='submit3' value='Withdraw'></form></td>
</tr>
</table>
</body>
</html>