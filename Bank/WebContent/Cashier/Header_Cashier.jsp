<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<body>

	<div class="css-top">
		<div class="css-row css-amber css-padding ">
			<div class="css-half " style="margin: 4px 0 6px 0">
				<h2>FedChoice Bank</h2>
			</div>
			<div
				class="css-half css-margin-top css-wide css-hide-medium css-hide-small">
				<div class="css-right"><%= session.getAttribute("username") %></div>
			</div>
		</div>
		<ul class="css-navbar css-light-grey ">
		
			<li><a href="Cashier/LoginCashier.jsp">Home</a></li>
			
			<li><a href="Cashier/SearchAccount.jsp">Account Details</a></li>
			
			<li class="css-dropdown-hover"><a href="#">Transactions</a>
				<div class="css-dropdown-content css-white css-card-4">
					<a href="#">Deposit</a> <a
						href="#">Withdraw</a> <a
						href="#">Transfer</a>
				</div></li>
				
			<li><a href="Cashier/Statement.jsp">Account Statement</a></li>
			
			<li class="css-right"><a href="#">Logout</a></li>
		</ul>
	</div>

</body>