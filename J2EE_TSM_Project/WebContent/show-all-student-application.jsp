<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    <%@ page import="org.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Student Application</title>
</head>
<body>

<h1>All Application</h1>

<%
LinkedList<StudentPOJO> list = (LinkedList<StudentPOJO>)request.getAttribute("List");
%>

<div style="color: blue, padding: 5px,letter-spacing: 1px;">
<table border="1">
<tr>
	<th>Firstname</th>
	<th>Lastname</th>
	<th>Email</th>
	<th>Phone</th>
	<th>Course</th>
	<th>Address</th>
	<th>DOB</th>
	<th>Education</th>
	<th>Approved</th>
	<th>Delete</th>
</tr>

<%
for(StudentPOJO s:list) {
%>

<% if(s.getApproved() == 0) { %>
	
	<tr>
	<td><%= s.getFirstname() %></td>
	<td><%= s.getLastname() %></td>
	<td><%= s.getEmail() %></td>
	<td><%= s.getPhone() %></td>
	<td><%= s.getCourse() %></td>
	<td><%= s.getAddress() %></td>
	<td><%= s.getDob() %></td>
	<td><%= s.getEducation() %></td>
	<td>
		<form action="/TSM/ApprovedStudentServlet" method="get">
			<input type="text" hidden name="id" value="<%= s.getId() %>">
			<button type="submit">Approved</button>
		</form>
	</td>
	<td>
		<form action="/TSM/DeleteStudentServlet" method="get">
			<input type="text" hidden name="id" value="<%= s.getId() %>">
			<button type="submit">Delete</button>
		</form>
	</td>
</tr>
	
<% } %>

<% }%>

</table>
</div>

</body>
</html>