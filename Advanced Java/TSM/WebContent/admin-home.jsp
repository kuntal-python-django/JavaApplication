<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    <%@ page import="org.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<body>


<h1>
	Welcome Admin, <% if(request.getAttribute("admin") != null) { %> <%= request.getAttribute("admin") %>
	 <% } else { %>
	 	  <%= (String) session.getAttribute("email") %>
	 <% } %>
</h1>

<a href="/TSM/GetAllStudentServlet">Student Application</a>
<br><br>
<a href="/TSM/GetAllTeacherServlet">Teacher Application</a>
<br><br>
<a href="/TSM/LogoutServet">Logout</a>
</body>
</html>