<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Login</title>
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


		<div class="css-container css-content css-margin-top css-padding-jumbo">
			<div class="css-panel css-red css-center">
			${message}
			</div>
			<form class=" css-container css-card-4 css-center css-padding-jumbo" action="Login" method="post">


				<p>
					<input class="css-input css-border" type="text" style="width: 100%" name="Username"
						required> <label class="css-label ">Name</label>
				</p>
				<br>
				<p>
					<input class="css-input css-border" type="password" name="Password"
						style="width: 100%" required> <label class="css-label ">Password</label>
				</p>
				<p>
					<button type="submit" class="css-btn css-section css-amber css-ripple">
						<h6>&nbsp;&nbsp;&nbsp; Log In &nbsp;&nbsp;&nbsp;</h6>
					</button>
				</p>
			</form>
		</div>
	</div>
	
</body>
</html>

