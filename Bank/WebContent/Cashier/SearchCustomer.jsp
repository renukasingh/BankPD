<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Customer Search</title>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">

<script type="text/javascript">
	
	//To check that only one ID is entered
	
	function validate(){
		var ssnId=document.f2.ssnid.value;	//Read SSN ID from form
		var custId=document.f2.custid.value;	//Read Customer ID from form
		if(ssnId=="" && !custId=="" || !ssnId=="" && custId==""){
			return true;
		}
		else{
			alert("Enter any one ID !");
			return false;
		}
		
	}
	
	//To disable one Input field if other field is filled by user
	
	function toggle(){
		var ssnid=document.getElementById("id_ssnid").value;
		var cust_id=document.getElementById("id_custID").value;
		//If SSN ID is entered, disable Customer Id field
		if(ssnid.length>0){
			document.getElementById("id_custID").disabled=true;
			document.getElementById("id_ssnid").disabled=false;
			return;
		}
		//If Customer Id is generated, disable SSN ID field
		if(cust_id.length>0){
			document.getElementById("id_custID").disabled=false;
			document.getElementById("id_ssnid").disabled=true;
			return;
		}
		//If No Id is enterd, enable both fields
		document.getElementById("id_custID").disabled=false;
		document.getElementById("id_ssnid").disabled=false;
	}

</script>

<body>

	<div class="css-container css-content css-margin-top css-padding-128">
		<div class="css-panel css-red css-center">
			<p>Customer Search</p>
		</div>
		<form class=" css-container css-card-4 css-center css-padding-jumbo"
		name="f2" action="/Bank/SearchCustomerController" method="post" onsubmit="return validate()">
			<p>
				<input class="css-input css-border" type="text" style="width: 100%"
					id="id_custID" name="custid" oninput="return toggle()" > <label class="css-label ">Customer
					ID</label>
			</p>
			<br>
			<p>
				<font color="red">OR</font>
			</p>
			<br>
			<p>
				<input class="css-input css-border" type="text" style="width: 100%"
					id="id_ssnid" name="ssnid" oninput="return toggle()" > <label class="css-label ">SSN
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