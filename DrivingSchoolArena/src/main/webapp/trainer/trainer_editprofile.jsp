<%@page import="dsa.beans.Trainer_registration"%>
<%@page import="dsa.dao.TrainerDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html" %>

<meta charset="ISO-8859-1">
<title>Trainer Editprofile</title>
<style>
body {
	background-image: url('https://images.pexels.com/photos/956999/milky-way-starry-sky-night-sky-star-956999.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1');
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
<%@include file='/trainer/trainerheader.html' %>


<% 
String id=(String)session.getAttribute("Trainerkey");

TrainerDao dao=new TrainerDao();

 Trainer_registration t=dao.viewProfile(id);//ask about its functions

%>


<%
        String msg=(String) request.getAttribute("message");

if(msg!=null){

%>





<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %>




<%-- <h1>
Trainer edit profile
</h1>
<form action="/DrivingSchoolArena/Trainer_Editprofile " method="post">
Name:<input type="text" name="name" value="<%=t.getName()%>" readonly><br>
Email:<input type="text" name="email" value="<%=t.getEmail()%>"><br>
Phone:<input type="text" name="phone" value="<%=t.getPhone()%>" id="phone" maxlength="10"><br>
Experince:<input type="text" name="experince" value="<%=t.getExperince()%>"><br>
Discription:<input type="text" name="discription" value="<%=t.getDiscription()%>"><br>
Address:<textarea name="address" ><%=t.getAddress()%></textarea><br>
<button type="submit">Submit</button>


</form>
 --%>
 
 <div class="container mt-4">
		<div class="row text-info">
			<div class="col-3"></div>
			<div class="col-5 mt-4">
				<h1 class="text-center">Trainer EditProfile</h1>
				<form class="needs-validation" novalidate method="post" action="/DrivingSchoolArena/Trainer_Editprofile " onsubmit="return checkLen()">
					
					<div class="input-group mt-3">
						<label for="Name" class="input-group-text">Name</label> <input value="<%=t.getName()%>" readonly
							type="text" placeholder="please enter your name"
							required="required" class="form-control" name="name" oninput="checkInput(event)">
						<div class="invalid-feedback">Please provide your name</div>
					</div>
					<div class="input-group mt-3">
						<label for="Id" class="input-group-text">Email</label> <input
							type="Email" placeholder="please enter your Email" value="<%=t.getEmail()%>"
							required="required" class="form-control" name="email">
						<div class="invalid-feedback">Please provide your email</div>
					</div>
					<div class="input-group mt-3">
						<label for="phone" class="input-group-text">Phone</label> <input
							type="text" placeholder="please enter your number"
							required="required" class="form-control" value="<%=t.getPhone()%>" name="phone" id="phone">
						<div class="invalid-feedback">Please provide your phone</div>
					</div>
					
					<div class="input-group mt-3">
						<label for="Experince" class="input-group-text">Experience</label>

						<input type="text"
							placeholder="please enter your working experince"
							required="required" class="form-control" value="<%=t.getExperince()%>" name="experince">


						<div class="invalid-feedback">Please provide your Experince
						</div>
					</div>
					<div class="input-group mt-3">
						<label for="Discription" class="input-group-text">Discription</label>
						<input type="text" placeholder="please enter your discription" value="<%=t.getDiscription()%>"
							required="required" class="form-control" name="discription">
						<div class="invalid-feedback">Please provide your
							Discription</div>
					</div>
					<div class="input-group mt-2">
						<label for="address" class="input-group-text">Address</label>

						<textarea class="form-control "
							placeholder="please enter your Address" required="required"
							class="form-control" name="address"><%=t.getAddress()%></textarea>
						<div class="invalid-feedback">Please provide your Address</div>
					</div>
					<div class="text-center">
						<button type="submit"
							class=" btn btn-warning w-25 mt-4 mb-4 form-control">Submit</button>
						<button type="reset" class=" btn btn-warning w-25">Reset</button>

					</div>
				</form>




			</div>

		</div>


	</div>
 
 
 
 


<%@include file="/Common/Common_Footer.html" %>

<%@include file="/Common/Common_Js.html" %>




<script>
document.getElementById('phone').addEventListener('keydown', function(event) {
// Allow only digits and backspace/delete keys
if (!(event.key === 'Backspace' || event.key === 'Delete' || /\d/.test(event.key))) {
alert("only 10 digits are allowed")
event.preventDefault();
}

});





</script>
</body>
</html>