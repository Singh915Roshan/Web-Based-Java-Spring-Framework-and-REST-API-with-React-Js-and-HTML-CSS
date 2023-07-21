<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<%@ include file="./base.jsp" %>				<!-- we use it in place of title to show title by JSTL -->
</head>
<body >
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Update Product details</h1>
				
				<form action="${pageContext.request.contextPath}/handle_product" method="post">
					<div class="form-group">
						<input type="text" class="form-control" value="${product.id}" name="id"/>
					</div>
					<div class="form-group">
						<label for="name">Product Name</label>
						<input type="text" class="form-control" id="name" value="${product.name}" area-describedby="emailHelp" name="name" placeholder="Enter the name here">
					</div>
					
					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" id="description" name="description" value="${product.description}" row="5" placeholder="Enter the Product description"></textarea>
					</div>
					
					<div class="form-group">
						<label for="price">Product Price</label>
						<input type="text" class="form-control" id="price" value="${product.price}" area-describedby="emailHelp" name="price" placeholder="Enter the Product price">
					</div>
					
					<div class="container text-center">
						<button class="btn "><a href="${pageContext.request.contextPath}" class="btn btn-outline-denger">Back</a></button>
						<button type="submit" class="btn btn-warning">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>