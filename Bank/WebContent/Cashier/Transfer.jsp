<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Transfer Amount</title>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<body>

	<div class="css-container css-content css-margin-top css-padding-128">
	<div class="css-panel css-red css-center">
				<p>Transfer Amount</p>
			</div>
		<form class=" css-container css-card-4 css-center css-padding-jumbo">
			<p>
				<input class="css-input " type="text" style="width: 100%" readonly>
				<label class="css-label ">Customer ID</label>
			</p><br>
			<p>
				<select class="css-select css-center css-border" width="100%">
					<option value="" disabled selected>Source Account Type</option>
					<option value="1">Savings</option>
					<option value="2">Current</option>
				</select>
			</p><br>
			<p>
				<select class="css-select css-center css-border" width="100%">
					<option value="" disabled selected>Target Account Type</option>
					<option value="1">Savings</option>
					<option value="2">Current</option>
				</select>
			</p><br>
			<p>
				<input class="css-input css-border" type="text" style="width: 100%" required>
				<label class="css-label ">Amount</label>
			</p><br>
				<button type="submit" class="css-btn css-section css-amber css-ripple">
					<h6>&nbsp;&nbsp;&nbsp; Transfer &nbsp;&nbsp;&nbsp;</h6>
				</button>
				
			</p>
		</form>
	</div>

</body>
</html>