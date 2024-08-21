<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="icon" href="/DrivingSchoolArena/images/favicon.png">
<meta charset="ISO-8859-1">
<title>Add program</title>

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
<%@include file="/admin/adminheader.html" %>


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
					<a href=" /DrivingSchoolArena/jsp/index.jsp"></a> Add program
				</h1>
				<form method="post" action=" /DrivingSchoolArena/Add_program"
					class="needs-validation" novalidate>
					<div class="input-group">
						<label class="input-group-text">Programe Name</label> <input type="text"
							placeholder="Enter your program name" required="required"
							class="form-control" name="pname" oninput="validateInput(event)">
						<div class="invalid-feedback">Please provide your program name</div>
					</div>
					<div class="input-group mt-4">
						<label class="input-group-text ">Fees</label> <input type="email"
							placeholder="Enter the fees" required="required"
							class="form-control" name="fees" id="fees" maxlength="6">
						<div class="invalid-feedback">Please provide your Fees Details</div>
					</div>
					<div class="input-group mt-4">
						<label class="input-group-text">Discription</label> <input
							type="text" placeholder="Enter your discription" required="required"
							class="form-control" name="discription">
						<div class="invalid-feedback">Please provide your discription</div>
					</div>
					

					<div class="text-center">

						<button type="submit" class="btn btn-warning w-50 mt-4 mb-5">Submit</button>
					</div>
				</form>




			</div>



		</div>

	</div>
	
	<div style="height:170px">
	
	
	</div>
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
document.getElementById('fees').addEventListener('keydown', function(event) {
// Allow only digits and backspace/delete keys
if (!(event.key === 'Backspace' || event.key === 'Delete' || /\d/.test(event.key))) {
alert("maximum 6 digits are allowed")
event.preventDefault();
}

});





</script>




</body>
</html>