<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html" %>

<meta charset="ISO-8859-1">
<title>Forgot password</title>
</head>
<body>
<%@include file='/trainer/trainerheader.html' %>

<%
        String msg=(String) request.getAttribute("message");

if(msg!=null){

%>





<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %>


<form action=" /DrivingSchoolArena/Trainer_forgotpass" method="post">
<div class="container mt-5">
<div class="row">
<div class="col-3"></div>
<div class="col-4">
<div class="input-group">
						<label for="id" class="input-group-text"><i
							class='fas fa-user-alt' style='font-size: 24px'></i></label> <input
							type="text" placeholder="Enter your Id" name="Id"
							required="required" class="form-control">
						<div class="invalid-feedback ">Please provide your Id</div>
					</div>
					<div class="input-group mt-4">
						<label for="password" class="input-group-text"><i
							class='fas fa-lock' style='font-size: 24px'></i></label> <input
							type="text" placeholder="Enter your email" name="email"
							required="required" class="form-control">
						<div class="invalid-feedback ">Please provide your email
						</div>
					</div>
					<div class="text-center  ">
						<button type="submit"
							class="btn btn-danger w-25 mt-4 mb-4  form-control ">Submit</button>

</div>
</div>
</div>
</div>


</form>

<%@include file="/Common/Common_Footer.html" %>

<%@include file="/Common/Common_Js.html" %>
</body>
</html>