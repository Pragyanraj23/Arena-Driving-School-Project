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
<%@include file="/Common/Common_Css.html"%>

<meta charset="ISO-8859-1">
<title>About us page</title>
<style type="text/css">
body {
	background-image: url(" /DrivingSchoolArena/images/bg9.jpeg" );
	background-size: cover;
	background-position: center;
}

img {
	border-radius: 50%;
}

p {
	font-family: sans-serif;
	font-size: medium;
	color: dark;
	font-size: medium;
}
</style>
</head>
<body>
<%@include file="/Common/Common_header.html"%>

	
		
		<div class="container mt-4 me-4 " style="margin-bottom: 10%">
			<div class="row vh-5">
				<div class="col-3" style="margin-left: 130px;">
					<img alt="" src="/DrivingSchoolArena/images/red.jpeg"
						style="width: 120px;">
					<h1 style="color: red;">Red light</h1>
					<p>The color 'RED' on the signal light indicates to stop well
						before the stop line and not to crowd the intersection. Turn left
						in a red signal only when there is a sign to do so. While turning,
						yield the right of way to pedestrians and vehicles coming from
						other directions.</p>
				</div>

				<div class="col-3 ">
					<img alt="" src="/DrivingSchoolArena/images/green.jpeg"
						style="width: 120px;">
					<h1 style="color: green;">Green light</h1>
					<p>A Green signal at the intersection means to drive ahead.
						When a green traffic signal is displayed, oncoming traffic has
						been stopped and it is safe to drive forward. Even so, maintain
						caution while driving through a green signal as there may be
						pedestrians or cars jumping a red light.</p>
				</div>

				<div class="col-3 ">
					<img alt="" src="/DrivingSchoolArena/images/orange a.jpeg"
						style="width: 120px;">
					<h1 style="color: orange;">Orange light</h1>
					<p>The AMBER (or YELLOW) light indicates to clear the road when
						the signal is changing from green to red. If, by mistake, caught
						in the amber signal in the middle of a large road crossing,
						continue with care and do not accelerate in panic. The signal
						light "GREEN" set you to go but be careful while on the start of
						move.</p>
				</div>



			</div>
			<hr style="border-width: 10px; color: red;">
			<div class="row mt-4">
				<div class="col-3">

					<img alt="" src="/DrivingSchoolArena/images/stop.png"
						style="width: 140px; float: left;">
					<p>A stop sign means you must come to a full stop and wait
						until crossing vehicles and pedestrians have cleared before
						proceeding. Stop at the stop line if one is present. If necessary,
						you may then pull forward to the stop sign or the edge of the
						intersection and then proceed when it is safe to do so</p>
				</div>

				<div class="col-3">

					<img alt="" src="/DrivingSchoolArena/images/nouturn.png"
						style="width: 120px; border-radius: 18%;">
					<p>They are square with a black arrow that's crossed out in
						red. No U-turn signs are posted at intersections or along roads
						where the driver can't legally make a 180 degree turn. The sign is
						white with a black arrow that's crossed out in red.</p>

				</div>

				<div class="col-3">

					<img alt="" src="/DrivingSchoolArena/images/no parking.png"
						style="width: 180px; border-radius: 50%;">
					<p>This sign is used where parking and stopping is prohibited.
						Usually shown as a red cross inside a blue circle with a red ring
						in Europe and parts of Asia, and a 'E' in a red circle with a X
						through in South America.</p>

				</div>
				<div class="col-3">

					<img alt="" src="/DrivingSchoolArena/images/donotenter.png"
						style="width: 180px; border-radius: 50%;">
					<p>The do not enter sign is a regulatory sign. Drivers
						encountering a do not enter sign must not enter the road,
						off-ramp, exit ramp, or crossover where the sign is posted. Do not
						enter signs usually indicate opposing traffic, meaning that the
						traffic will be coming towards the driver.</p>

				</div>

			</div>
			<hr style="border-width: 10px; color: black;">
			<div class="row mt-5">
				<div class="col-2"></div>
				<div class="col-6 text-center ">
					<h1>Road Signals</h1>
					<img alt="" src="/DrivingSchoolArena/images/road images.png"
						style="border-radius: 20px; width: 100%">
				</div>




			</div>


		</div>
		<div style="clear: both"></div>

		<!--Main Navigation-->
		<%@include file="/Common/Common_Footer.html"%>
		<%@include file="/Common/Common_Js.html"%>
</body>
</html>