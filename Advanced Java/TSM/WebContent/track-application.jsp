<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tracking</title>
</head>
<body>

<h1>Track Your Application</h1>
<form action="/TSM/HandleTrackApplication" method="post">
	<label>Email : </label><input type="text" name="email"> <br><br>
	<label>Role : </label>
	<select name="role">
		<option value="Teacher">Teacher</option>
		<option value="Student">Student</option>
	</select>
	<br><br>
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
<a href="student-apply.jsp">Student SignUp</a>
<br>
<a href="s-login.jsp">Student SignIn</a>

</body>
</html>