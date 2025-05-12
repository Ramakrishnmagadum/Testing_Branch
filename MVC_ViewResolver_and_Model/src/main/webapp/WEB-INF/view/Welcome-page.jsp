<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input{
margin-bottom: 8px;
}

</style>
</head>
<body>
	<h1>
		<center>Welcome To Cafe</center>
	</h1>
	<hr>
	<form action="ordercontroller">
	<div>
		<center>
			Name : <input name="name" placeholder="Enter Name"><br>
			Food : <input name="food" placeholder="Enter Food U Want"><br>
			<input type="submit" value="order now">
		</center>
	</div>
	</form>
</body>
</html>