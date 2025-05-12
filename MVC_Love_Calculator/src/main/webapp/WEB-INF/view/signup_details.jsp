<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- This  is JSTL Tag Lib  -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!-- This is Form Tag Lib  -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<h1 align="center">Registered Succesfully</h1>
	<hr>
	<div style="margin-left: 40%">
		<form:form method="get" modelAttribute="signup">
			<form:label path="name">Name is  : ${signup.name} </form:label>
			<br>
			<form:label path="name">UserName is  : ${signup.username} </form:label>
			<br>
			<form:label path="name">Country is  : ${signup.country} </form:label>
			<br>
			<form:label path="name">Password is  : 
			<c:forEach var="temp" items="${signup.password}">
			${temp}
			</c:forEach>
			</form:label>
			<br>
			<form:label path="name">Hobbies is  : 
<!-- 			This is for loop in jsp File with JSTL Help -->
				<c:forEach var="temp" items="${signup.hobbies}">
                ${temp}
            </c:forEach>
			</form:label>
			<br>
			<form:label path="name">Gender is  : ${signup.gender} </form:label><br>
			<form:label path="name">Email is  : ${signup.communicationdto.email} </form:label><br>
			
			
			<form:label path="name">Phone is  : ${signup.communicationdto.phone} </form:label>
		</form:form>
	</div>
</body>
</html>