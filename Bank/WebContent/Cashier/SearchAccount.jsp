<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Account Search</title>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<script type="text/javascript">
	function myFunction() {
		if (document.getElementById("ssnid").value != ""
				&& document.getElementById("customerid").value != "") {
			alert("Enter any one value!");
		}
	}
</script>
<body>

	<div class="css-container css-content css-margin-top css-padding-128">
		<div class="css-panel css-red css-center">
			<p>Account Search</p>
		</div>
		<form class=" css-container css-card-4 css-center css-padding-jumbo"
		form action='/Bank/AccountSearch' name='form' onsubmit='return validate()' method='post'>
			<p>
				<input class="css-input css-border" type="text" style="width: 100%"
					name='name2' id="customerid" > <label class="css-label ">Customer
					ID</label>
			</p>
			<br>
			<p>
				<font color="red">OR</font>
			</p>
			<br>
			<p>
				<input class="css-input css-border" type="text" style="width: 100%"
					name='name1' id="ssnid" > <label class="css-label ">Account
					ID</label>
			</p>
			<br>

			<p>
				<button type="submit" class="css-btn css-section css-amber css-ripple"
					onclick="myFunction();">
					<h6>&nbsp;&nbsp;&nbsp; Search &nbsp;&nbsp;&nbsp;</h6>
				</button>
			</p>
		</form>
	</div>



</body>
</html>