<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*" %>
<%@ page import="org.*" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


<%
//allow access only if session exists
String email = null;
if(session.getAttribute("is_login") != null)
{
	response.sendRedirect("success.jsp");
}
%>

<h1>Login Application</h1>

<form action="/LoginLogout/HandleAdminLogin" method="post">
	<label>Username : </label><input type="text" name="uname">
	<br>
	<label>Password : </label><input type="password" name="psw">
	<br>
	<button type="submit">Submit</button>
</form>


</body>
</html>