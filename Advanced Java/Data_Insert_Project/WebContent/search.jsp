<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search JSP</title>
</head>
<body>

<form action="/Data_Insert_Project/SearchServlet" method="post">
	<label>Search : </label><input type="text" name="query"><br />
	<label>Hidden : </label><input type="text" name="hid" hidden value="12345"><br />
	<br />
	<button type="submit">Submit</button>
</form>

</body>
</html>