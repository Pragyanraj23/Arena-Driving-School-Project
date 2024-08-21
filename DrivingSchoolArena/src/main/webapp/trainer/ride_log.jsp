<%@page import="dsa.beans.Admission_Form"%>
<%@page import="dsa.dao.TrainerDao"%>
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
<title>Ride Log</title>
</head>
<body>
	<%@include file="/trainer/trainerheader.html"%>
	
<%
String trainerid=(String)session.getAttribute("Trainerkey");
TrainerDao dao=new TrainerDao();
//System.out.println("trainerid")
ArrayList<Admission_Form>list=dao.viewtraineeid(trainerid);
%>
	
	
	
	
	

<!-- end view profile code -->

	<div class="container mt-4">
		<div class="row text-light">
			<div class="col-3"></div>
			<div class="col-5 mt-4">
				<h1 class="text-center ">Ride Log</h1>
				<form class="needs-validation" novalidate method="post"
					action=" /DrivingSchoolArena/Ride_Log">


					<div class="input-group mt-2">
						<label for="trainer id" class="input-group-text">Trainer_id</label> <input
							type="text" value="<%=trainerid %>"   readonly="readonly"
							required="required" class="form-control" name="trainerid">
						
					</div>
					<div class="input-group mt-2">
						<select class="form-control  text-center" name="traineeid">
							<option value="default">Choose Trainee</option>
							<%for(Admission_Form tr:list) 
                                {
                                          %>
							<option value="<%=tr.getId()%>"><%=tr.getId()%></option>
						
						           <%} %>
						</select>
						
					</div>
					<div class="input-group mt-2">
						<label for="source" class="input-group-text">Source</label> <input
							type="text" placeholder="please enter your source"
							required="required" class="form-control" name="source">
						<div class="invalid-feedback">Please enter source</div>
					</div>
					<div class=" input-group mt-2 ">
						<label for="destination" class="input-group-text ">Destination</label> <input
							type="text"  name="destination" value="" class="form-control">
						<div class="invalid-feedback">Please enter your destination</div>
					</div>
					<div class=" input-group mt-2 ">
						<label for="duration" class="input-group-text ">Duration</label> <input
							type="text"  name="duration" value="" class="form-control">
						<div class="invalid-feedback">Please enter your duration</div>
					</div>
					<div class="input-group mt-2">
						<label for="performance" class="input-group-text">Performance</label> <input
							type="text" placeholder="please enter the performance"
							required="required" class="form-control" name="performance">
						<div class="invalid-feedback">Please enter the Performance</div>

					</div>
					<div class="input-group mt-2">
						<label for="Device No" class="input-group-text">DeviceNo</label> <input
							type="text" placeholder="please enter the Device_No"
							required="required" class="form-control" name="deviceno">
						<div class="invalid-feedback">Please enter the deviceno</div>

					</div>
					<div class="input-group mt-2">
						<label for="Vechile No" class="input-group-text">VehicleNo</label> <input
							type="text" placeholder="please enter the vehicle No"
							required="required" class="form-control" name="vno">
						<div class="invalid-feedback">Please enter the Vechile No</div>

					</div>
					<div class="input-group mt-2">
						<label for="Date" class="input-group-text">Date</label> <input
							type="Date" placeholder="please enter the performance"
							required="required" class="form-control" name="date">
						<div class="invalid-feedback">Please enter the Date</div>

					</div>
					
					


					
					<div class="text-center">
						<button type="submit"
							class=" btn btn-secondary w-25 mt-4 mb-4 form-control">Submit</button>
						

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