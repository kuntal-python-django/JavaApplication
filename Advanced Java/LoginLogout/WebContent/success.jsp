<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>


<%
//allow access only if session exists
String email = null;
if(session.getAttribute("is_login") == null)
{
	response.sendRedirect("index.jsp");
}
%>


<h1>
	Hi, <% if(request.getAttribute("admin_name") != null) { %> <%= request.getAttribute("admin_name") %>
	 <% }  %>
</h1>

<h1>Welcome To Home Page</h1>

<br />

<a href="/LoginLogout/SeeCookies">See Cookie Value</a>

<a href="/LoginLogout/Logout">Logout</a>

</body>
</html>