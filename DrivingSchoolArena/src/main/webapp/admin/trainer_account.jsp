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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script>
	

	$(document).ready(function(){
	    $("#id").change(function(){
	        //alert("hello")
	        console.log($(this).val());
	        var username = $(this).val();//it will fetch the value from input text
	        $.ajax({
	            url: "/DrivingSchoolArena/TrainerRegistration",
	            type : "GET",
	            data:{
	                'id': username
	            },
	            //dataType: 'json',
	            success: function(response_data){
	              //alert(response_data)
	              if(response_data!="")
					{
						
						//$("#ajaxmsg").text(response_data)
						alert(response_data)
						$("#id").val("")
						
					}
	             /*  else{
	            	  $("#ajaxmsg").text("")
	              }  */
	                }
	            

	            
	                });
	    });
	})
	
	
	</script>


</head>
<body>
	<%@include file="/admin/adminheader.html"%>
	<%
        String msg=(String) request.getAttribute("Message");

if(msg!=null){

%>





<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %>
	
	
	<div class="container mt-4">
		<div class="row text-info">
			<div class="col-3"></div>
			<div class="col-5 mt-4">
				<h1 class="text-center">Trainer Registration</h1>
				<form class="needs-validation" novalidate method="post" action="/DrivingSchoolArena/TrainerRegistration" onsubmit="return checkLen()">
					<div class="input-group mt-3">
						<label for="Id" class="input-group-text">ID</label> <input
							type="text" placeholder="please enter your Id"
							required="required" class="form-control" name="ID" id="id">
							<span id="ajaxmsg" style="color: red"></span>
						<div class="invalid-feedback">Please provide your Id</div>
					</div>
					<div class="input-group mt-3">
						<label for="Password" class="input-group-text">Password</label> <input
							type="password" placeholder="please enter your password"
							required="required" class="form-control" name="Password">
						<div class="invalid-feedback">Please provide your password</div>
					</div>
					<div class="input-group mt-3">
						<label for="Name" class="input-group-text">Name</label> <input
							type="text" placeholder="please enter your name"
							required="required" class="form-control" name="name" oninput="checkInput(event)">
						<div class="invalid-feedback">Please provide your name</div>
					</div>
					<div class="input-group mt-3">
						<label for="Id" class="input-group-text">Email</label> <input
							type="Email" placeholder="please enter your Email"
							required="required" class="form-control" name="email">
						<div class="invalid-feedback">Please provide your email</div>
					</div>
					<div class="input-group mt-3">
						<label for="phone" class="input-group-text">Phone</label> <input
							type="text" placeholder="please enter your number"
							required="required" class="form-control" name="phone" id="phone">
						<div class="invalid-feedback">Please provide your phone</div>
					</div>
					
					<div class="input-group mt-3">
						<label for="Experince" class="input-group-text">Experience</label>

						<input type="text"
							placeholder="please enter your working experince"
							required="required" class="form-control" name="experince">


						<div class="invalid-feedback">Please provide your Experince
						</div>
					</div>
					<div class="input-group mt-3">
						<label for="Discription" class="input-group-text">Discription</label>
						<input type="text" placeholder="please enter your discription"
							required="required" class="form-control" name="discription">
						<div class="invalid-feedback">Please provide your
							Discription</div>
					</div>
					<div class="input-group mt-2">
						<label for="address" class="input-group-text">Address</label>

						<textarea class="form-control "
							placeholder="please enter your Address" required="required"
							class="form-control" name="address"></textarea>
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



</body>
</html>