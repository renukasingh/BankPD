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
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<body>
<div class="css-top">
		<div class="css-row css-amber css-padding ">
			<div class="css-half " style="margin: 4px 0 6px 0">
				<h2>FedChoice Bank</h2>
			</div>
		</div>

	<form class=" css-container css-card-4 css-center css-padding-jumbo" method="post" action="/Bank/DepositController" name="Depositform">
	<input type = "hidden" name ="action" value ="fetch"/>
		<center>
		<p>
			<input class="css-input css-border" type="text" style="width: 100%" type="text" name="account_id"
				onblur="return chkinput()" required /> <label class="css-label ">Account ID:</label>
				</p> 
				
				<p>
					<button type="submit" class="css-btn css-section css-amber css-ripple">
						<h6>&nbsp;&nbsp;&nbsp; SUBMIT &nbsp;&nbsp;&nbsp;</h6>
					</button>
				</p>
		</center>
	</form>
	</body>
</html>