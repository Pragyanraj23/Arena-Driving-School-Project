<%@page import="dsa.beans.Admission_Form"%>
<%@page import="dsa.dao.TraineeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body {
	background-image: url("/DrivingSchoolArena/images/pixel.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
<%@include file="/Common/Common_Css.html"%>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/trainee/trainee._header.html"%>
	
	<%
	
	String id=(String)session.getAttribute("traineekey");
	
	TraineeDao dao=new TraineeDao();
	Admission_Form af=dao.viewProfile1(id);
	
	
	
        String msg=(String) request.getAttribute("Message");

if(msg!=null){

%>





<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %>
	
	
	




	<div class="container mt-4">
		<div class="row text-danger">
			<div class="col-3"></div>
			<div class="col-5 mt-4">
				<h1 class="text-center bg-light">Trainee EditProfile</h1>
				<form class="needs-validation" novalidate method="post"
					action="/DrivingSchoolArena/TraineeEditProfile" onsubmit=" return checkLen()">


					<div class="input-group mt-2">
						<label for="Name" class="input-group-text">Name</label> <input
							type="text" placeholder="please enter your name" value="<%=af.getName() %>"
							required="required" class="form-control" name="name" oninput="vaidateInput(event)">
						<div class="invalid-feedback">Please provide your name</div>
					</div>
					<div class="input-group mt-2">
						<label for="Id" class="input-group-text">Email</label> <input
							type="Email" placeholder="please enter your Email"
							required="required" class="form-control" name="email" value="<%=af.getEmail() %>"> 
						<div class="invalid-feedback">Please provide your email</div>
					</div>
					<div class="input-group mt-2">
						<label for="phone" class="input-group-text">Phone</label> <input
							type="text" placeholder="please enter your number"
							required="required" class="form-control" value="<%=af.getPhoneno() %>" name="phone" id="phone" maxlength="10">
						<div class="invalid-feedback">Please provide your phone</div>
					</div>
					
					
					
					


					<div class="input-group mt-2">
						<label for="address" class="input-group-text">Address</label>

						<textarea class="form-control "
							placeholder="please enter your Address" required="required"
							class="form-control" name="address"><%=af.getAddress() %></textarea>
						<div class="invalid-feedback">Please provide your Address</div>
					</div>
					<div class="text-center">
						<button type="submit"
							class=" btn btn-secondary w-25 mt-4 mb-4 form-control">Submit</button>
						<button type="reset" class=" btn btn-secondary w-25">Reset</button>

					</div>
				</form>




			</div>

		</div>


	</div>

<div style="height: 150px"></div>
	<script src="/DrivingSchoolArena/Common/validation.js"></script>

	<%@include file="/Common/Common_Footer.html"%>
	<%@include file="/Common/Common_Js.html"%>
