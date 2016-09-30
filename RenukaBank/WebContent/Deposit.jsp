<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="com.bean.Account"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DEPOSIT PAGE</title>
<script>
function chkamount()//improve validation to allow decimal numbers
{
var amount = document.amountform.amount.value;
var letters = /^[0-9]+$/;
if(amount != null && amount.length > 0)
	{
	 if(!letters.test(amount))
		 {
		 alert("Amount can only be numeric! Please enter only numbers.");
		 document.amountform.amount.focus();
		 return false;
		 }
	}
else {
	alert("Please enter the amount");
	document.amountform.amount.focus();
	 return false;
}
}

</script>
</head>
<body>
	<% Account a = (Account)request.getAttribute("account"); %>
	<form method="post" action="DepositController" name="amountform">
	<input type = "hidden" name ="action" value ="deposit"/>
		<center>
			Customer ID:<input type="text" name="cust_id" id="cust_id"
				value="<%= a.getCustomerId() %>" /><br><br> Account ID:<input type="text"
				name="account_id" id="account_id" value="<%= a.getAccountId() %>" /><br><br>
			Account Type:<input type="text" name="acc_type" id="acc_type"
				value="<%= a.getAccountType() %>" /> <br><br>Amount:<input type="text"
				name="amount" id="amount" onblur="return chkamount()" required /> &nbsp <input type="submit"
				name="submit" id="submit" value="DEPOSIT" />
		</center>
	</form>


</body>
</html>