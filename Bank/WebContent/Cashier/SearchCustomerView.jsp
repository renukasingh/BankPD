<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.Customer" %>
<!DOCTYPE html>
<html>
<title>Customer Details</title>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<body>

<%//Create customer object and assign recieved object to it with type casting %>
<%Customer cust=(Customer)request.getAttribute("s1");%>

	<div
		class="css-container css-content css-margin-top css-padding-128 css-center">

		<div class="css-panel css-red css-center">
			<p>Customer Details</p>
		</div>

		<table
			class="css-table css-striped css-bordered css-border css-centered">
			<thead>
				<tr class="css-light-grey">
					<th>Customer SSN ID</th>
					<th>Customer ID</th>
					<th>Customer Name</th>
					<th>Age</th>
					<th>Address</th>
					<th>City</th>
					<th>State</th>
				</tr>
			</thead>
			<tr>
				<th><%=cust.getCustomerSSNId() %></th>
				<th><%=cust.getCustomerId() %></th>
				<th><%=cust.getCustomerName() %></th>
				<th><%=cust.getAge() %></th>
				<th><%=cust.getAddress() %></th>
				<th><%=cust.getCity() %></th>
				<th><%=cust.getState() %></th>
			</tr>
		</table>
		
		<p>
			<button class="css-btn css-section css-amber css-ripple"
				onClick="window.location.reload();">
				<h6>&nbsp;&nbsp;&nbsp; Refresh &nbsp;&nbsp;&nbsp;</h6>
			</button>
		</p>

	</div>
</body>
</html>