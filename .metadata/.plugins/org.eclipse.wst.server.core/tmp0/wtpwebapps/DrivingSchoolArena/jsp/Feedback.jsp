<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html"%>
<meta charset="ISO-8859-1">
<title>Feedback</title>
<style>
body {
	background-image: url(" /DrivingSchoolArena/images/pixel.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>


	
	<%@include file="/trainee/trainee._header.html"%>
	
	<%
        String msg=(String) request.getAttribute("Message");

if(msg!=null){

%>

<span><%=msg %></span>

<%} %>
	<div class="container mt-5" style="margin-bottom: 110px">
		<div class="row text-white">

			<div class="col-3"></div>
			<div class="col-6 ">
				<h1 class="text-center">Feedback Form</h1>
				<form method="post" action=" /DrivingSchoolArena/Feedback"
					class="needs-validation" novalidate>
					<div class="input-group">
						<label for="name" class="input-group-text"><i
							class='fas fa-user-alt' style='font-size: 24px'></i></label> <input
							type="text" placeholder="enter your name" required="required"
							class="form-control" name="name" oninput="validateInput(event)">
						<div class="invalid-feedback">please provide your name</div>
					</div>
					<div class="input-group mt-4">
						<label for="name" class="input-group-text"><i
							class='fas fa-at' style='font-size: 24px'></i></label> <input
							type="email" placeholder="enter your Email" required="required"
							class="form-control" name="email">
						<div class="invalid-feedback">please provide your Email</div>
					</div>
					<div class="input-group mt-4">
						<label for="name" class="input-group-text"><i
							class='far fa-comment' style='font-size: 24px'></i></label> <input
							type="text" placeholder="enter your Review" required="required"
							class="form-control" name="review">
						<div class="invalid-feedback ">please provide your Review</div>
					</div>
					<div class="mt-4">
						<select class="form-control" name="rating">
							<option value="default">Choose rating</option>
							<option value="1">*</option>
							<option value="2">**</option>
							<option value="3">***</option>
							<option value="4">****</option>
							<option value="5">*****</option>
						</select>
						<div class="invalid-feedback">please choose your rating</div>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-warning w-50 mt-4 mb-4">Submit</button>
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





</script>

</body>
</html>