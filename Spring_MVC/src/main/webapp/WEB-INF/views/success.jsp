<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 class="text-center">${Header}</h3>
	<p class="text-center">${Desc}</p>

	<%-- <h1>Welcome, ${name}</h1>
	<h2>Your email address is ${email}</h2>
	<h2>Your password is ${password} try to secure the password</h2> --%>
	
	<h1 style="color:green">${msg}</h1>
	
<!-- For user object -->
	<h1>Welcome, ${user.userName}</h1>
	<h2>Your email address is ${user.email}</h2>
	<h2>Your password is ${user.password} try to secure the password</h2>
	<h3>${user}</h3>
</body>
</html>