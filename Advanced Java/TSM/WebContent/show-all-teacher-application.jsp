<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    <%@ page import="org.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Teacher Application</title>
</head>
<body>

<h1>All Application</h1>

<%
LinkedList<TeacherPOJO> list = (LinkedList<TeacherPOJO>)request.getAttribute("List");
%>


<div style="color: blue, padding: 1px,letter-spacing: 3px;">
<table border="1">
<tr>
	<th>Firstname</th>
	<th>Lastname</th>
	<th>Phone</th>
	<th>Email</th>
	<th>Subject</th>
	<th>Qualification</th>
	<th>Address</th>
	<th>DOB</th>
	<th>Experience</th>
	<th>Hobby</th>
	<th>Additional Qualification</th>
	<th>Approved</th>
	<th>Delete</th>
</tr>

<%
for(TeacherPOJO t:list)	{
%>

<% if(t.getApproved() == 0) { %>
	<tr>
	<td><%= t.getFirstname() %></td>
	<td><%= t.getLastname() %></td>
	<td><%= t.getPhone() %></td>
	<td><%= t.getEmail() %></td>
	<td><%= t.getSubject() %></td>
	<td><%= t.getQualification() %></td>
	<td><%= t.getAddress() %></td>
	<td><%= t.getDob() %></td>
	<td><%= t.getExperience() %></td>
	<td><%= t.getHobby() %></td>
	<td><%= t.getAdditional_qualification() %></td>
	<td>
		<form action="/TSM/ApprovedTeacherServlet" method="get">
			<input type="text" hidden name="id" value="<%= t.getId() %>">
			<button type="submit">Approved</button>
		</form>
	</td>
	<td>
		<form action="/TSM/DeleteStudentServlet" method="get">
			<input type="text" hidden name="id" value="<%= t.getId() %>">
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