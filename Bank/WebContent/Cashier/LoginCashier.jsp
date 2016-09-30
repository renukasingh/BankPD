<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.css.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cashier</title>
<jsp:include page="Header_Cashier.jsp"></jsp:include>
<jsp:include page="Footer.jsp"></jsp:include>
</head>
<body>
<%
if(session.getAttribute("username")==null){
	String msg = "Please login first";
	request.setAttribute("message", msg);
	request.getRequestDispatcher("/Login.jsp").forward(request, response);
}
%>
</body>
</html>