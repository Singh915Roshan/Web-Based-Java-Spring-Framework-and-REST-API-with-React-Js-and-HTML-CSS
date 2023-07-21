<%@ page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
		<h1>For Help...</h1>
		
		<%-- <% 
		String name =(String) request.getAttribute("name");
		Integer rollNumber =(Integer) request.getAttribute("rollNumber");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
		%>
		
		<h1>My Name : <%=name%></h1>
		<h1>My Roll number : <%=rollNumber%></h1>
		<h1>Date and Time : <%=time.toString() %></h1> --%>
		
	<!-- JSP Expression Language -->
	<!-- Now we are use JSTL for Traversing => Compulsary add isELIgnored = "false" library -->
		<h1>My Name : ${name} </h1>s
		<h1>My Roll number : ${rollNumber} </h1>
		<h1>Date and Time : ${time.toString()}</h1> 
		
		<h2>List : ${marks}</h2>         <!-- Here no option to traverse list -->
		
	<!-- for travesing list we are using JSTL => JSTL uri taglib attached above -->
		<c:forEach var="item" items="${marks}">
			<h1>${item}</h1>       <!-- or we can use <c:out value="${item}" />  -->
		</c:forEach>
		
	
		
</body>
</html>