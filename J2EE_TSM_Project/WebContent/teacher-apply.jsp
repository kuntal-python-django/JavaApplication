<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Apply</title>
</head>
<body>

<h1>Teacher Apply</h1>

<form action="/TSM/HandleTeacherApply" method="post">
	<label>Firstname :</label><input type="text" name="firstname">
	<br>
	<label>Lastname :</label><input type="text" name="lastname">
	<br>
	<label>Email :</label><input type="text" name="email">
	<br>
	<label>Phone :</label><input type="text" name="phone">
	<br>
	<label>Subject :</label><input type="text" name="subject">
	<br>
	<label>Address :</label><input type="text" name="address">
	<br>
	<label>DOB :</label><input type="text" name="dob">
	<br>
	<label>Qualification :</label><input type="text" name="qualification">
	<br>
	<label>Password :</label><input type="password" name="password">
	<br>
	<label>Experience :</label><input type="text" name="experience">
	<br>
	<label>Hobby :</label><input type="text" name="hobby">
	<br>
	<label>Additional Qualification :</label><input type="text" name="additional_qualification">
	<br>
	
	<button type="submit">Submit</button>
</form>


<br>
<hr>
<a href="home.html">Home</a>
<br>
<a href="adminlogin.jsp">Admin Login</a>
<br>
<a href="t-login.jsp">Teacher Login</a>
<br>
<a href="student-apply.jsp">Student SignUp</a>
<br>
<a href="s-login.jsp">Student SignIn</a>
<br>
<a href="track-application.jsp">Track Application</a>

</body>
</html>