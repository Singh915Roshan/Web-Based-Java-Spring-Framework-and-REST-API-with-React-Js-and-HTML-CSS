<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<%@ include file="./base.jsp" %>				<!-- we use it in place of title to show title by JSTL -->
	
	<style>
	body {
	  background-image: url('SSD_3810.JPG');
	}
	</style>
</head>
<body>
	<!-- <p style="background-image: url('D:\photos\SSD_3810.jpg');"> -->
	
	
	<div class="conatainer mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App</h1>
				
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					
					<tbody>
						<c:forEach items="${products}" var="p">
							<tr>
								<th scope="row">TECHNOLOGY${p.id}</th>
								<td>${p.name}</td>
								<td>${p.description}</td>
								<td class="font-weight-bold">&#x20B9;${p.price}</td>
								<td>
									<a href="delete/${p.id}"><i class="fas fa-trash text-danger" style="font-size :30px;"></i>Delete</a>
									<a href="update/${p.id}"><i class="fas fa-pen-nib text-primary" style="font-size :30px;"></i>Update</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
							
				<div class="container text-center">
					<a href="add_product" class="btn btn-outline-success">Add Product</a>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>