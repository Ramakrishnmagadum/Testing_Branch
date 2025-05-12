<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!-- This is Form Tag Lib  -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up Page</title>

<!-- Client Side Validation -->
<script type="text/javascript">
	function clientsidevalidation() {
		var name = document.getElementById("myname").value;
		if (name.length < 3) {
			alert("Name should be more than 3 characters.");
			return false;
		}
		return true;
	}
</script>

<style type="text/css">
td {
	padding-bottom: 20px;
	padding-left: 20px;
}
</style>
</head>
<body>

	<form:form action="signup_details" method="get" modelAttribute="signup">

<!-- 		<h1 align="center">Love Calculator</h1> -->
		<hr>
		<div style="margin-left: 42%; padding-bottom: 15px; color: red;">
			<form:errors path="name"></form:errors>
			<br>
			<form:errors path="username"></form:errors>
			<br>
			<form:errors path="password"></form:errors> <br>
			<form:errors path="age"></form:errors><br>
			<form:errors path="country"></form:errors>
		</div>
		<div align="center">
			<table>
				<tr>
					<td><form:label path="Name">Name :</form:label></td>
					<td><form:input path="name" id="myname" /></td>
				</tr>
				<tr>
					<td><form:label path="username">Username : </form:label></td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password :</form:label></td>
					<td><form:password path="password" /></td>
				</tr>

				<tr>
					<td><form:label path="country">Country : </form:label></td>
					<td><form:select path="country">
							<form:option value="India">India</form:option>
							<form:option value="USA">USA</form:option>
							<form:option value="Canada">Canada</form:option>
						</form:select></td>
				</tr>

				<tr>
					<td><form:label path="hobbies">Hobby :</form:label></td>
					<td>Cricket <form:checkbox path="hobbies" value="cricket" />
						Reading <form:checkbox path="hobbies" value="reading" /> Travel <form:checkbox
							path="hobbies" value="travel" /> Programming <form:checkbox
							path="hobbies" value="programming" /></td>
				</tr>
				<tr>
					<td><form:label path="gender">Gender :</form:label></td>
					<td>Male <form:radiobutton path="gender" value="male" />
						Female <form:radiobutton path="gender" value="female" /></td>
				</tr>
				
				<tr>
					<td><form:label path="age">Age :</form:label></td>
					<td> <form:input path="age"/>
					</td>
				</tr>

				<tr>
					<td>
						<h1>Communication:</h1>
					</td>
				</tr>

				<tr>

					<td><form:label path="communicationdto.email">Email :</form:label></td>
					<td><form:input path="communicationdto.email" /></td>
				</tr>
				<tr>
				
<!-- 				here we are passing only in one input Field --But we are passing the Country code and Phonenumber  -->
<!-- 				so Its does not know which value for which varible to map in this case we will use formatter to format this and guide to that  --> 
<!-- 				which value should place in this varible -->
					<td><form:label path="communicationdto.phone">Phone :</form:label></td>
					<td><form:input path="communicationdto.phone" /></td>
				</tr>
			</table>
			<input style="width: 125px; height: 45px;" type="submit"
				onclick="return clientsidevalidation();">

		</div>
	</form:form>

</body>
</html>