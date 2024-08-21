<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html"%>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.div1 {
	margin-left: 4px !important;
}

body {
	background-image: url(" /DrivingSchoolArena/images/bg1.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
<body>
	<%@include file="/Common/Common_header.html"%>
	<%
        String msg=(String) request.getAttribute("message");

if(msg!=null){

%>





<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %>
	<div class="container mt-5" style="margin-bottom: 200px">
		<div class="row text-light">
			<div class="col-3 "></div>
			<div class="col-5  mt-4">
				<div>
					<h1 class="text-center  ">Admin Login Frame</h1>
				</div>
				<form class="needs-validation" novalidate method="post" action="/DrivingSchoolArena/AdminLogin">
					<div class="input-group">
						<label for="id" class="input-group-text"> <i
							class='fas fa-user-alt' style='font-size: 24px'></i></label> <input
							type="text" placeholder="Enter your Id" required="required"
							name="Id" class="form-control">
						<div class="invalid-feedback ">Please provide your Id</div>
					</div>
					<div class="input-group mt-4">
						<label for="password" class="input-group-text"><i
							class='fas fa-lock' style='font-size: 24px'></i></label> <input
							type="password" placeholder="Enter your password" name="password"
							required="required" class="form-control">
						<div class="invalid-feedback ">Please provide your Password
						</div>
					</div>
					<div class="text-center  ">
						<button type="submit"
							class="btn btn-danger w-25 mt-4 mb-4  form-control ">Submit</button>


						<button type="reset" class="btn btn-danger w-25  ">Reset</button>
					</div>
				</form>
			</div>
		</div>
	</div>


	<script src="/DrivingSchoolArena/Common/validation.js"></script>
	<%@include file="/Common/Common_Footer.html"%>

	<%@include file="/Common/Common_Js.html"%>

</body>
</html>