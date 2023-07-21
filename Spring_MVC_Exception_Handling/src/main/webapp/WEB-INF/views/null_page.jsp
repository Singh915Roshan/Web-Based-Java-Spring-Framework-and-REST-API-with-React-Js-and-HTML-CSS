<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Error!</title>
	
	<style type="text/css">
		body{
			/* background-image : url(data-image/png : ----) */
		}
		
		.error-template{
			padding : 40px 15px;
			text-align: center;
		}
		
		.error-action{
			margin-top: 15px;
			margin-bottom: 15px;
		}
		
		.error-action .btn{
			margin-right: 10px;
		}
	</style>
	
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="error-template">
					<!-- <h1>Something went wrong !!</h1> -->
					<h1>${msg} !!</h1>
					
					<div class="error-details">Sorry, an error has occured, Requested page not found!</div>
					
					<div class="error-action">
						<a href="#!"><span></span>Take me Home</a>
						<a href="#!" class="byn btn-default btn-lg"><span class="glyphicon glyphicon-envelope"></span>Contact Support</a>
					</div>
					
				</div>
			</div>
		</div>
	</div>
</body>
</html>