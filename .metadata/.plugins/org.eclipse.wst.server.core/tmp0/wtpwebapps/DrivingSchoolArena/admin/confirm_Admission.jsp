<%@page import="dsa.beans.Admission_Form"%>
<%@page import="dsa.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html"%>
<style type="text/css">
body
{
background-image: url("/DrivingSchoolArena/images/bg.gif");
background-size: cover;

}

</style>
<meta charset="ISO-8859-1">
<title>Confirm Admission</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

<script>
	

	$(document).ready(function(){
	    $("#id").change(function(){
	        //alert("hello")
	        console.log($(this).val());
	        var username = $(this).val();//it will fetch the value from input text
	        $.ajax({
	            url: "/DrivingSchoolArena/ConfirmAdmission",
	            type : "GET",
	            data:{
	                'id': username
	            },
	            //dataType: 'json',
	            success: function(response_data){
	              //alert(response_data)
	              if(response_data!="")
					{
						alert(response_data)
						//$("#ajaxmsg").text(response_data)
						$("#id").val("")
						
					}
	              else{
	            	  $("#ajaxmsg").text("")
	              } 
	                }
	            

	            
	                });
	    });
	})
	
	
	</script>
</head>
<body>
	<%@include file="/admin/adminheader.html"%>
	<%
	Admission_Form af=(Admission_Form)request.getAttribute("af");
	%>
<%-- if(af!=null){



<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %
 --%>
 
 


<form action=" /DrivingSchoolArena/ConfirmAdmission" method="post" >

<div class="container mt-4">
<div class="row">
<div class="col-4"></div>
<div class="col-4" style="border:4px solid cyan;border-radius: 4px;">
<h1 class="text-center  text-white" >Confirm Admission</h1>
<hr style="border:4px solid red;border-radius: 4px;">

<div class="input-group mt-2">
						<label for="address" class="input-group-text">Admission Id</label>

						<input class="form-control " type="text"
							placeholder="please enter ID" required="required"
							name="id"  value="<%=af.getAdmissionid()%>">
						<div class="invalid-feedback">Please provide ID</div>
					</div>
					<div class="input-group mt-2">
					 		<label for="address" class="input-group-text">ID</label>
					           <input class="form-control " type="text"
							placeholder="please enter ID" required="required"
							name="id1" id="id" >
							<span id="ajaxmsg" style="color: red"></span>
						<div class="invalid-feedback">Please provide  Enter The ID</div>
					</div>
					
					
					<div class="input-group mt-2">
						<label for="address" class="input-group-text">Password</label>

						<input class="form-control " type="password"
							placeholder="please enter your paaword" required="required"
							name="password" >
						<div class="invalid-feedback">Please provide Password</div>
					</div>
					
					<div class="input-group mt-2">
						<label for="address" class="input-group-text">Fees</label>

						<input class="form-control "
							placeholder="please enter fees" required="required" type="text"
							name="fees"  value="<%=af.getFees() %>">
						<div class="invalid-feedback">Please provide fees</div>
					</div>
					
					<div class="text-center">
						<button type="submit"
							class=" btn btn-secondary w-25 mt-4 mb-4 form-control">Submit</button>

</div>
</div></div></div>
</form>
<div style="height: 150px"></div>
<%@include file="/Common/Common_Footer.html"%> 

	<%@include file="/Common/Common_Js.html"%>
</body>
</html>