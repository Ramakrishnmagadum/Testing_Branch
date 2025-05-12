
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!-- This is Form Tag Lib  -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<div
		style="border: 2px dotted red; padding: 5px; width: 40%; margin-left: 30%; background-color: aqua; margin-top: 30px">
		<h1 align="center">Love Calculator</h1>
		<form:form action="process-page" modelAttribute="student">
		
		<div style="margin-left: 42%; padding-bottom: 15px; color: red;">
			<form:errors path="username"></form:errors>
			<br>
			<form:errors path="crushname"></form:errors>
			<br>
			<form:errors path="condition"></form:errors>
		</div>
		<%-- 		<form action="process-page"> --%>
		<!-- 		<div align="center"> -->

		<!-- 		<label for="nam" >Your Name: </label> -->
		<!-- 		<input id="nam" name="username" placeholder="Enter Your Name" type="text"><br> -->
		<!-- 		<br> -->
		<!-- 		<label for="crush" >Crush Name: </label> -->
		<!-- 		<input id="crush" name="crushname" placeholder="Enter Your Crush Name" type="text"><br><br> -->

		<!-- 		<input type="submit" value="Calculate"></div> -->
		<%-- 		</form> --%>

		<!-- ---------  to add default values to the home-page will are using Spring MVC Form Tag------ -->
		
			<div align="center">
				<label for="nam">Your Name: </label>
				<form:input id="nam" path="username" placeholder="Enter Your Name" />
				<br> <br> <label for="crush">Crush Name: </label>
				<form:input id="crush" path="crushname"
					placeholder="Enter Your Crush Name" />
				<br>
				<br>
				<form:checkbox path="condition" id="cond" />
				<label> Agree Terms and Condtion this for fun </label> <br> <br>
				<input type="submit" value="Calculate">
			</div>
		</form:form>
	</div>
</body>
</html>