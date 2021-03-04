<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Execute Your Java Code Here</title>
</head>
<body>

<h1>Welcome to JSP</h1>
<br />

<%@ page errorPage="error.jsp" %>
<%  
	int a=10;  
	int b=3;  
	int c=a/b;  
	out.print("Result is : " + c);  
%> 

<br />
<br />

<%!   
int inc(int n)
{  
	return n+5;
}  
%>  
<%= "Result is : " + inc(3) %>

</body>
</html>