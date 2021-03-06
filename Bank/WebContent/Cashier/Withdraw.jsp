<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="com.bean.*"%>
<html>
<title>Withdraw Amount</title>
<script>
	function chkamount()//improve validation to allow decimal numbers
	{
		var amount = document.amountform.amount.value;
		var letters = /^[0-9]+$/;
		if (amount != null && amount.length > 0) {
			if (!letters.test(amount)) {
				alert("Amount can only be numeric! Please enter only numbers.");
				document.amountform.amount.focus();
				return false;
			}
		} else {
			alert("Please enter the amount");
			document.amountform.amount.focus();
			return false;
		}
	}
</script>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<body>
	<%
		Account a = (Account) request.getAttribute("account");
	%>
	<div class="css-container css-content css-margin-top css-padding-128">
		<div class="css-panel css-red css-center">
			<p>Withdraw Amount</p>
		</div>
		<form class=" css-container css-card-4 css-center css-padding-jumbo"
			method="post" action="/Bank/WithdrawController" name="amountform">
			<input type="hidden" name="action" value="withdraw" />
			<p>
				<input class="css-input " type="text" style="width: 100%"
					name="cust_id" id="cust_id" value="<%=a.getCustomerId()%>"
					readonly> <label class="css-label ">Customer ID</label>
			</p>
			<br>
			<p>
				<input class="css-input " type="text" style="width: 100%"
					name="account_id" id="account_id" value="<%=a.getAccountId()%>"
					readonly> <label class="css-label ">Account ID</label>
			</p>
			<br>
			<p>
				<input class="css-input " type="text" style="width: 100%"
					name="acc_type" id="acc_type" value="<%=a.getAccountType()%>"
					readonly> <label class="css-label ">Account Type</label>
			</p>
			<br>
			<p>
				<input class="css-input " style="width: 100%" type="text"
					name="balance" id="balance" value="<%=a.getBalance()%>" readonly>
				<label class="css-label ">Balance</label>
			</p>
			<br>
			<p>
				<input class="css-input css-border" type="text" style="width: 100%"
					name="amount" id="amount" required />
				<label class="css-label ">Withdraw Amount</label>
			</p>
			<br>
			<button type="submit"
				class="css-btn css-section css-amber css-ripple">
				<h6>&nbsp;&nbsp;&nbsp; Withdraw &nbsp;&nbsp;&nbsp;</h6>
			</button>

		</form>
	</div>

</body>
</html>