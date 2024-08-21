<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
	integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="icon" href="/DrivingSchoolArena/images/favicon.png">
<meta charset="ISO-8859-1">
<title>Contact us</title>

<style>
body {
	background-image: url(" /DrivingSchoolArena/images/bg1.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
<%@include file="/Common/Common_Css.html"%>

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
	<div class="container mt-5">
		<div class="row text-white">
			<div class="col-3 "></div>
			<div class="col-6  mt-4">
				<h1 class="text-center ">
					<a href=" /DrivingSchoolArena/jsp/index.jsp"></a> Contact us Form
				</h1>
				<form method="post" action=" /DrivingSchoolArena/Contact_Us"
					class="needs-validation" novalidate onsubmit="return checkLen()">
					<div class="input-group">
						<label class="input-group-text"><i class='fas fa-user-alt'
							style='font-size: 24px'></i></label> <input type="text"
							placeholder="Enter your name" required="required"
							class="form-control" name="name" oninput="validateInput(event)">
						<div class="invalid-feedback">Please provide your name</div>
					</div>
					<div class="input-group mt-4">
						<label class="input-group-text "><i class='fas fa-at'
							style='font-size: 24px'></i></label> <input type="email"
							placeholder="Enter your Email" required="required"
							class="form-control" name="email">
						<div class="invalid-feedback">Please provide your Email</div>
					</div>
					<div class="input-group mt-4">
						<label class="input-group-text"><i
							class='fas fa-address-book' style='font-size: 24px'></i></label> <input
							type="text" placeholder="Enter your number" required="required"
							class="form-control" name="number" id="phone" maxlength="10">
						<div class="invalid-feedback">Please provide your number</div>
					</div>
					<div class="input-group mt-4">
						<label class="input-group-text"><i class='far fa-comment'
							style='font-size: 24px'></i></label>
						<textarea class="form-control" required name="query"></textarea>
						<div class="invalid-feedback">Please provide your Query</div>
					</div>

					<div class="text-center">

						<button type="submit" class="btn btn-warning w-50 mt-4 mb-5">Submit</button>
					</div>
				</form>




			</div>



		</div>


	</div>
	<div style="height: 100px"></div>
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