<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<title>JSP forward action tag example</title>
</head>
<body> 
<p align="center">My main JSP page</p>

<jsp:forward page="display.jsp" />

<jsp:include page="display.jsp" />  

</body> 
</html>
