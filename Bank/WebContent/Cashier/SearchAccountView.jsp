<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.sql.*,java.util.*"%>  
<!DOCTYPE html>
<html>
<title>Account Status</title>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<body>
<%
System.out.println("held");
  ArrayList<Object> rs = (ArrayList<Object>) request.getAttribute("rs");
System.out.println(rs.get(1));
Iterator<Object> i=rs.iterator();
  while(i.hasNext()){ 
%>

	<div
		class="css-container css-content css-margin-top css-padding-128 css-center">

		<div class="css-panel css-red css-center">
			<p>Account Status</p>
		</div>

		<table
			class="css-table css-striped css-bordered css-border css-centered">
			<thead>
				<tr class="css-light-grey">
					<th>Customer ID</th>
					<th>Account ID</th>
					<th>Account Type</th>
					<th>Balance</th>
				</tr>
			</thead>
			<tr>
				<td><%=i.next()%></td>
				<td><%=i.next()%></td>
				<td><%=i.next()%></td>
				<td><%=i.next()%><% }%></td>
			</tr>
			<tr>
				<td>Eve</td>
				<td>Jackson</td>
				<td>94</td>
			</tr>
			<tr>
				<td>Adam</td>
				<td>Johnson</td>
				<td>67</td>
			</tr>
		</table>

		<p>
			<button type="submit"
				class="css-btn css-section css-amber css-ripple">
				<h6>&nbsp;&nbsp;&nbsp; Deposit &nbsp;&nbsp;&nbsp;</h6>
			</button>
			&nbsp;&nbsp;
			<button type="submit"
				class="css-btn css-section css-amber css-ripple">
				<h6>&nbsp;&nbsp;&nbsp; Withdraw &nbsp;&nbsp;&nbsp;</h6>
			</button>
			&nbsp;&nbsp;
			<button type="submit"
				class="css-btn css-section css-amber css-ripple">
				<h6>&nbsp;&nbsp;&nbsp; Transfer &nbsp;&nbsp;&nbsp;</h6>
			</button>

		</p>

	</div>
</body>
</html>