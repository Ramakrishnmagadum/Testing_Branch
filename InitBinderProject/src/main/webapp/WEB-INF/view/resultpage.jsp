<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!-- This is Form Tag Lib  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
<h1>Result Page</h1>
<hr>
<form:form modelAttribute="details">
Name is :- ${details.name}
Surname is :- ${details.surname}
Email is :- ${details.email}
Bill against the credit card number  ${details.creditcard}
towards amount  ${details.amount} ${details.currency} generated dated (on) 
 ${details.date}  
</form:form>
</body>
</html>