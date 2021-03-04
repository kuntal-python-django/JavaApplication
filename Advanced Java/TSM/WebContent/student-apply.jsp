<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Apply</title>
</head>
<body>

<h1>Student Apply</h1>

<form action="/TSM/HandleStudentApply" method="post">
	<label>Firstname :</label><input type="text" name="firstname">
	<br>
	<label>Lastname :</label><input type="text" name="lastname">
	<br>
	<label>Email :</label><input type="text" name="email">
	<br>
	<label>Phone :</label><input type="text" name="phone">
	<br>
	<label>Course :</label><input type="text" name="course">
	<br>
	<label>Address :</label><input type="text" name="address">
	<br>
	<label>DOB :</label><input type="text" name="dob">
	<br>
	<label>Education :</label><input type="text" name="education">
	<br>
	<label>Password :</label><input type="password" name="password">
	<br>
	
	<button type="submit">Submit</button>
</form>


<br>
<hr>
<a href="home.html">Home</a>
<br>
<a href="adminlogin.jsp">Admin Login</a>
<br>
<a href="teacher-apply.jsp">Teacher SignUp</a>
<br>
<a href="t-login.jsp">Teacher Login</a>
<br>
<a href="s-login.jsp">Student SignIn</a>
<br>
<a href="track-application.jsp">Track Application</a>

</body>
</html>