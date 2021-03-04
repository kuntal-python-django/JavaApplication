<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@ directive attribute="value" %>  

1) Page Dir
<%@ page attribute="value" %>
<%@ page import="java.util.Date" %>  
Today is: <%= new Date() %>

<%@ page errorPage="myerrorpage.jsp" %>

===================================================================
List Of Page Directive Attribute
===================================================================
import
contentType
extends
info
buffer
language
isELIgnored
isThreadSafe
autoFlush
session
pageEncoding
errorPage
isErrorPage



</body>
</html>