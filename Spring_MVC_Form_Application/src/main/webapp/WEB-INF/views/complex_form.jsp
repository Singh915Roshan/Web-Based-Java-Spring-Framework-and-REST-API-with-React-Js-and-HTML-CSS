<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>          <!-- //Handling Error in form by using BindingResult -->

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body class="" style="background : #e2e2e2">                                       <!-- Handling Complex form -->

    
    <div class="container mt-4">
    	<div class="row">
    		<div class="col-md-6 offset-md-3">
    			<div class="card">
    				<div class="card-body">
    					<h3 class="text-center">Complex Form</h3>
    					<div class="alert alert-danger" role="alert">				<!-- //Handling Error in form by using BindingResult -->
						  	<!-- A simple danger alert check it out! -->
						  	<form:errors path="student.*" />                       <!-- @ModelAttribute("student") pass this student -->
						</div>
    					
    					<form action="handleform" method="post">
    						<div class="form-group">
    							<label>Your Name</label>
    							<input name="name" type="text" class="form-control" placeholder="Enter Name">
    						</div>
    						
    						<div class="form-group">
    							<label>Your Id</label>
    							<input name="id" type="text" class="form-control" placeholder="Enter Id">
    						</div>
    						
    						<div class="form-group">
    							<label>Your DOB</label>
    							<input name="date" type="text" class="form-control" placeholder="Enter Date of Birth">
    						</div>
    						
    						<div class="form-group">
    							<label>Select Courses</label>
    							<select name="courses" class="form-control">
    								<option>Java</option>
    								<option>Python</option>
    								<option>C++</option>
    								<option>Django</option>
    							</select>
    						</div>
    						
    						<div class="form-group">
    							<span class="mr-3">Select Gender</span>
    							<div class="form-check form-check-inline">
    								<input name="gender" type="radio" class="form-check-input" placeholder="Enter Date of Birth" id="inlineRedio1" value="Male">
    								<label class="form-check-lable" for="inlineRedio1">Male</label>
    							</div>
    							<div class="form-check form-check-inline">
    								<input name="gender" type="radio" class="form-check-input" placeholder="Enter Date of Birth" id="inlineRedio2" value="female">
    								<label class="form-check-lable" for="inlineRedio2">Female</label>
    							</div>
    						</div>
    						
    						<div class="form-group">
    							<label>Select Type</label>
    							<select name="type" class="form-control">
    								<option value="oldStudent">Old Student</option>
    								<option value="normalStudent">New Student</option>
    							</select>
    						</div>
    						
    						<div class="card">								<!-- More Complex Handling form /Auto Binding with custome type -->
    							<div class="card-body">
    								<p>Your Address</p>
    								
    								<div class="form-group">
    									<input name="address.street" type="text" class="form-control" placeholder="Enter Street" />
    								</div>
    								<div class="form-group">
    									<input name="address.city" type="text" class="form-control" placeholder="Enter City" />
    								</div>
    							</div>
    						</div>
    						
    						<div class="container text-center">
    							<button type="submit" class="btn btn-primary">Submit</button>
    						</div>
    						
    					</form>
    				</div>
    			</div>
    		</div>
    	</div>
    </div>
    
    						<!-- <div class="form-group">
    							<label>Your Name</label>
    							<input name="name" type="text" class="form-control" id="exampleInputEmail1" area-describedby="Enter Name">
    						</div> -->

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>