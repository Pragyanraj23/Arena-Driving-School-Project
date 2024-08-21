<%@page import="dsa.beans.Program"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dsa.dao.AdminDao"%>
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
	<%@include file="/Common/Common_header.html"%>
	
	<%
        String msg=(String) request.getAttribute("Message");

if(msg!=null){

%>





<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %>
	
	
	
	<!-- view program code start -->
	<%

AdminDao dao=new AdminDao();
    ArrayList<Program> programview =  dao.viewprogram();

%>
<% 
for(Program p:programview)
{
	
	System.out.println(p.getPname());

	%>


<%} %>

<!-- end view profile code -->

	<div class="container mt-4">
		<div class="row text-danger">
			<div class="col-3"></div>
			<div class="col-5 mt-4">
				<h1 class="text-center bg-light">Trainee Registration</h1>
				<form class="needs-validation" novalidate method="post"
					action="/DrivingSchoolArena/AdmissionForm" onsubmit=" return checkLen()">


					<div class="input-group mt-2">
						<label for="Name" class="input-group-text">Name</label> <input
							type="text" placeholder="please enter your name"
							required="required" class="form-control" name="name" oninput="vaidateInput(event)">
						<div class="invalid-feedback">Please provide your name</div>
					</div>
					<div class="input-group mt-2">
						<label for="Id" class="input-group-text">Email</label> <input
							type="Email" placeholder="please enter your Email"
							required="required" class="form-control" name="email">
						<div class="invalid-feedback">Please provide your email</div>
					</div>
					<div class="input-group mt-2">
						<label for="phone" class="input-group-text">Phone</label> <input
							type="text" placeholder="please enter your number"
							required="required" class="form-control" name="phone" id="phone" maxlength="10">
						<div class="invalid-feedback">Please provide your phone</div>
					</div>
					<div class=" input-group mt-2 bg">
						<label for="gender" class="input-group-text me-4">Gender</label> <input
							type="radio" required" name="gender" value="male">Male <input
							type="radio" required" name="gender" value="female">Female
						<div class="invalid-feedback">Please provide your Gender</div>
					</div>
					<div class="input-group mt-2">
						<label for="Experince" class="input-group-text">Age</label> <input
							type="text" placeholder="please enter your age"
							required="required" class="form-control" name="age" id="age" maxlength="2">
						<div class="invalid-feedback">Please provide your Age</div>

					</div>
					<div class="mt-2">
						<select class="form-select" name="program">
							<option value=""selected disabled>Choose Program</option>
							<%for(Program p:programview)
							{
								%>
							<option value="<%=p.getPname()%>"><%=p.getPname() %></option>
						
						<%} %>
						</select>
					</div>
					<div class="invalid-feedback">Please Choose your Program</div>


					<div class="input-group mt-2">
						<label for="address" class="input-group-text">Address</label>

						<textarea class="form-control "
							placeholder="please enter your Address" required="required"
							class="form-control" name="address"></textarea>
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

	<script src="/DrivingSchoolArena/Common/validation.js"></script>

	<%@include file="/Common/Common_Footer.html"%>
	<%@include file="/Common/Common_Js.html"%>

<script>
function validateInput(event) {
const input = event.target.value;
const regex = /^[a-zA-Z ]*$/; // Regular expression to match only characters
if (!regex.test(input)) {
// If input contains anything other than characters, remove them
event.target.value = input.replace(/[^a-zA-Z]/g, '');
alert("only aplhabets are allowed")
}
}
</script>

<script>
document.getElementById('phone').addEventListener('keydown', function(event) {
// Allow only digits and backspace/delete keys
if (!(event.key === 'Backspace' || event.key === 'Delete' || /\d/.test(event.key))) {
alert("only 10 digits are allowed")
event.preventDefault();
}

});



document.getElementById('age').addEventListener('keydown', function(event) {
	// Allow only digits and backspace/delete keys
	if (!(event.key === 'Backspace' || event.key === 'Delete' || /\d/.test(event.key))) {
	alert("only 2 digits are allowed")
	event.preventDefault();
	}

	});






function checkLen()
{
	
	var ph=document.getElementById("phone").value

	
	if(ph.length<10)
		{
		
		alert("Phone Number must be of 10 digits")
		return false
		}
	else
		return true
	}


</script>



</script>

</body>
</html>