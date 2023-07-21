<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Service Page</title>
</head>
<body>
		<h1>Service Handle </h1>

		<!-- First import List by using Ctr+<spaceBar> -->
		<% 
		List<String> contacts =(List<String>) request.getAttribute("con"); 
		%>
		
		<% 
			for(String c: contacts) {
		%>
			<h2>-by <%=c %></h2>
		<%
			}
		%>
</body>
</html>