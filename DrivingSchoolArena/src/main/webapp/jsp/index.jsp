<%@page import="java.util.ArrayList"%>
<%@page import="dsa.dao.AdminDao"%>
<%@page import="dsa.beans.Newsannouncement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
<%@include file="/Common/Common_Css.html"%>
<%@include file="/Common/commoncarsouel.html"%>
<style type="text/css">
.nav-Link {
	color: white;
}

img:hover {
	transform: scaleX(-1); /* Flips the image horizontally on hover */
}

p {
	font-weight: 700;
	font-style: italic;
	color: #808080;
}

/* body
{
background-image: url(" /DrivingSchoolArena/images/bg11.jpg");
background-size: cover;
} */
</style>
</head>
<body>

	<%@include file="/Common/Common_header.html"%>
	<%
	AdminDao dao=new AdminDao();
	
  ArrayList<Newsannouncement> newsview=dao.viewNewsannouncements();
	%>
	<% 
	
for(Newsannouncement ns:newsview)
{
	%>
<marquee style=" border:6px solid; direction ="up"; border-radius:7px ;><%=ns.getContent() %></marquee> 
 
<%} %>
	
	<div id="carouselExampleCaptions" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
					<!-- <button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="3" aria-label="Slide 4"></button> -->
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="/DrivingSchoolArena/images/bg1.jpg" class="d-block w-100"
					alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5>Start Journey</h5>
					<p>Everything in life is somewhere else, and you get there in a
						car.</p>
					<div class="slider-btn">
						
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<img src="/DrivingSchoolArena/images/forbg.jpg"
					class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5>Know More</h5>
					<p>Good cars get you from point A to point B.</p>
					<div class="slider-btn">
						<button class="btn btn1" ><a href="/DrivingSchoolArena/jsp/aboutus.jsp"> About Us</a></button>
						<button class="btn btn2"><a href="/DrivingSchoolArena/jsp/Contact_Us.jsp"> Contact Us</a></button>
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<img src="/DrivingSchoolArena/images/bg11.jpg"
					class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5>First Step</h5>
					<p>Fill The Form And Start Your Journey.</p>
					<div class="slider-btn">
						<button class="btn btn1"><a href="/DrivingSchoolArena/trainee/admission_form.jsp">Online Admission Form</a></button>
					</div>
				</div>
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<hr style="border-width: 10px; color: red; margin-top: 0px;">

	<div class="container-fluid">
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4 text-center"
				style="font-size: 40px; margin-top: 24px;">

				<strong style="text-decoration: underline;">SERVICES</strong>

			</div>

		</div>
		<div class="row mt-5 " style="margin-left: 150px;">
			<div class=" col-4 ">
				<img alt="" src=" /DrivingSchoolArena/images/sicons1.jpeg"
					style="width: 300px; height: 200px; border-radius: 70px;">
				<h1 style="margin-left: 60px; font-size: 30px; font-weight: 700">Car-Training</h1>
				<p>If you are interested in enrolling in a car training course,
					you can explore these options and choose one that suits your needs.
				</p>
			</div>
			<div class=" col-4">
				<img alt="" src=" /DrivingSchoolArena/images/sicons2.jpeg"
					style="width: 300px; height: 200px; border-radius: 70px">
				<h1 style="margin-left: 55px; font-size: 30px; font-weight: 700">Bike-Training</h1>
				<p>If you are interested in enrolling in a motor-bike training
					course, you can explore these options and choose one that suits
					your needs.</p>
			</div>
			<div class="col-4">
				<img alt="" src=" /DrivingSchoolArena/images/sicons3.jpeg"
					style="width: 300px; height: 200px; border-radius: 70px">
				<h1 style="margin-left: 35px; font-size: 30px; font-weight: 700">Vechile-Training</h1>
				<p>If you are interested in enrolling in a large vehicle
					training course, you can explore these options and choose one that
					suits your needs.</p>
			</div>
		</div>
		
		
		<div class="row mt-5">
		<div class="col-5 bg-">
		<h1></h1>
		</div>
		<!--
		<div class="col-2">
		<img alt="" src="/DrivingSchoolArena/images/boysad3.jpeg" style="width: 300px; height: 200px; border-radius: 100%;border-color:red;">
		
		</div>
		<div class="col-5 ">
		<p>A good administrative review often highlights the individuals organizational skills efficiency and ability to support management and staff effectively. Here's an example of a positive review for an admin.</p>
		</div>
		
		<div class="row mt-5">
		<div class="col-5 bg-warning">
		<h1>Trainer</h1>
		</div>
		<div class="col-2">
		<img alt="" src="/DrivingSchoolArena/images/boysad2.jpeg" style="width: 300px; height: 200px; border-radius: 100%;">
		
		</div>
		
		
		</div>
		
		
		</div>
-->
	










	<%@include file="/Common/Common_Footer.html"%>
	<%@include file="/Common/Common_Js.html"%>






</body>
</html>