<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second Example</title>
</head>
<body>

<hr><br>
First Name : ${username} <br>
Second Name : ${surname}<br>

Fetching Firstname from  requestScope : ${requestScope.username}<br>
Fetching Firstname from  Session Scope : ${sessionScope.username}
<br>
<a href="/Love-calculator-SessionAttributes/${next}"> next${next}</a>

</body>
</html>