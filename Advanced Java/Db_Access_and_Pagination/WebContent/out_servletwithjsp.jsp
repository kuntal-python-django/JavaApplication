<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import="java.util.*" %>
<%@ page import="orl.*" %>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OUTPUT</title>
</head>
<body>

<h1>Welcome To Servlet --- > JSP</h1>


<%
	ArrayList<Emp> list = (ArrayList<Emp>)request.getAttribute("List");
%>


<table border='1' cellpadding='4' width='60%'>

<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Salary</th>
</tr>

<%
for(Emp e : list) 
{
%>

<tr>
	<td><%= e.getId() %></td>
	<td><%= e.getName() %></td>
	<td><%= e.getSalary() %></td>
</tr>

<% 
}
%>

</table>


</body>
</html>