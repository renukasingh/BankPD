<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Account ID</title>
<script>
function chkinput()
{
var account_id = document.DepositForm.account_id.value;
var letters = /^[0-9]+$/;
if(account_id != null && account_id.length > 0)
	{
	 if(!letters.test(account_id))
		 {
		 alert("Account ID can only be numberic! Please enter only numbers.");
		 document.DepositForm.account_id.focus();
		 return false;
		 }
	}
else {
	alert("Please enter the Account ID");
	document.DepositForm.account_id.focus();
	 return false;
}
}

</script>
</head>
<body>
	<form method="post" action="DepositController" name="Depositform">
	<input type = "hidden" name ="action" value ="fetch"/>
		<center>
		
			Enter Account ID:<input type="text" name="account_id"
				onblur="return chkinput()" required /> &nbsp<input type="submit"
				name="submit" id="submit" value="DEPOSIT" />
		</center>
	</form>
	</body>
</html>