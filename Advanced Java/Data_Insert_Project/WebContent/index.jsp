<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Emp Creation Form</title>
</head>
<body>

<h1>My Emp Creation Form</h1>

<form action="/Data_Insert_Project/InsertServlet" method="post">
	<label>Id : </label><input type="text" name="id"><br />
	<label>Name : </label><input type="text" name="name"><br />
	<label>Salary : </label><input type="text" name="salary"><br />
	<br />
	<button type="submit">Submit</button>
</form>


</body>
</html>