<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Account Statement</title>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<body>

	<div
		class="css-container css-content css-margin-top css-padding-128 css-center">

		<div class="css-panel css-red css-center">
			<p>Account Statement</p>
		</div>

		<table class="css-table css-striped css-bordered css-border css-centered">
			<thead>
				<tr class="css-light-grey">
					<th>First Name</th>
					<th>Last Name</th>
					<th>Points</th>
				</tr>
			</thead>
			<tr>
				<td>Jill</td>
				<td>Smith</td>
				<td>50</td>
			</tr>
			<tr>
				<td>Eve</td>
				<td>Jackson</td>
				<td>94</td>
			</tr>
			<tr>
				<td>Adam</td>
				<td>Johnson</td>
				<td>67</td>
			</tr>
		</table>

		<p>
			<button type="submit" class="css-btn css-section css-amber css-ripple"
				onClick="window.print();">
				<h6>&nbsp;&nbsp;&nbsp; Print &nbsp;&nbsp;&nbsp;</h6>
			</button>

		</p>

	</div>
</body>
</html>