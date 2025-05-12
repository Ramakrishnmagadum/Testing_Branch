<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!-- This is Form Tag Lib  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<style>
table{
 margin-left:42%; 
}
td{
padding-bottom : 15px;
}
</style>
</head>
<body>
	<center>
		<h1>Welcome To Bill Pay Page</h1>
	</center>
	<hr>
	<form:form align="center" modelAttribute="details" action="resultpage">
	<div>
	<form:errors path="creditcard"> </form:errors>
	<form:errors path="email"> </form:errors> <br>
	<form:errors path="name"> </form:errors>
	<form:errors path="amount"> </form:errors>
	<form:errors path="currency"> </form:errors>
	<form:errors path="date"> </form:errors>
	<br><br>
	</div>
		<table>
		<tr>
				<td><form:label path="name">Name :</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="surname">Surname :</form:label></td>
				<td><form:input path="surname" /></td>
			</tr>
				<tr>
				<td><form:label path="email">Email :</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="creditcard">Credit Card :</form:label></td>
				<td><form:input path="creditcard" /></td>
			</tr>
			<tr>
				<td><form:label path="amount">Amount :</form:label></td>
				<td><form:input path="amount" /></td>
			</tr>
			<tr>
				<td><form:label path="currency">Currency :</form:label></td>
				<td><form:input path="currency" /></td>
			</tr>
			<tr>
				<td><form:label path="date">Date :</form:label></td>
				<td><form:input path="date" /></td>
			</tr>
			
			
			<tr>
				<td ><input style="margin-left:130px;" type="submit" value="Pay Bill"></td>
				<td></td>
			</tr>
		</table>
	</form:form>
</body>
</html>