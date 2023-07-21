<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>																	<!-- Handling Complex form -->
	<h1 style="color:green">${register}</h1>
	<hr>
	<h2>Name is ${student.name}</h2>									<!-- More Complex Handling form /Auto Binding with custome type -->
	<h2>Id is ${student.id}</h2>
	<h2>DOB is ${student.date}</h2>
	<h2>Courses is ${student.courses}</h2>
	<h2>Gender is ${student.gender}</h2>
	<h2>Type is ${student.type}</h2>
	<hr>
	<h2>Address Street is ${student.address.street}</h2>
	<h2>Address City is ${student.address.city}</h2>
	<hr>
	<h3>${student}</h3>
</body>
</html>