<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Account Statement</title>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<body onload = "disableall()">

	<div class="css-container css-content css-margin-top css-padding-128">
		<div class="css-panel css-red css-center">
			<p>Account Statement</p>
		</div>
		<form class=" css-container css-card-4 css-center css-padding-jumbo">
			<p>
				<input class="css-input " type="text" style="width: 100%" readonly>
				<label class="css-label ">Account ID</label>
			</p>
			<br>
			<p>
				<input class="css-radio" type="radio" name="gender" id="radio_trans" onclick="radiotrans();"> 
				<label class="css-validate">Last Number of Transactions</label>
			
				<input class="css-radio" type="radio" name="gender" id="radio_date" onclick="radiodate();">
				<label class="css-validate">Start-End Dates</label>
			</p><br>
			<p>
				<select class="css-select css-center css-border" width="100%" id="trans">
					<option value="" disabled selected>Number of Transactions</option>
					<option value="1">1</option>
					<option value="2">2</option>
				</select>
			</p>
			<br>
			<p>
				<input class="css-input css-border" type="date" style="width: 100%" id="date1"
					required> <label class="css-label ">Start Date</label>
			</p>
			<p>
				<input class="css-input css-border" type="date" style="width: 100%" id="date2"
					required> <label class="css-label ">End Date</label>
			</p>
			<br>
			<button type="submit" class="css-btn css-section css-amber css-ripple">
				<h6>&nbsp;&nbsp;&nbsp; Transfer &nbsp;&nbsp;&nbsp;</h6>
			</button>

		</form>
	</div>

<script>
function disableall(){
	document.getElementById("date1").disabled=true;
	document.getElementById("date2").disabled=true;
	document.getElementById("trans").disabled=true;
}
function radiotrans()
{
	document.getElementById("trans").disabled=false;
	document.getElementById("date1").disabled=true;
	document.getElementById("date2").disabled=true;
}
function radiodate()
{
document.getElementById("trans").disabled=true;
document.getElementById("date1").disabled=false;
document.getElementById("date2").disabled=false;
}
</script>

</body>
</html>