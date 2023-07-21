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
	<h1>This is About Page</h1>
	<h2>show by</h2>
	
	<%-- <% 
	String name =(String) request.getAttribute("name");
	Integer id =(Integer) request.getAttribute("id");
	%>
	
	<h1>Name : <%=name%></h1>
	<h1>Id : <%=id%></h1> --%>
	
<!-- Day-57 : JSP Expression Language -->
<!-- Now we are use JSTL for Traversing => Compulsary add isELIgnored = "false" library -->
	<h1>Name : ${name}</h1>
	<h1>Id : ${id}</h1>

</body>
</html>