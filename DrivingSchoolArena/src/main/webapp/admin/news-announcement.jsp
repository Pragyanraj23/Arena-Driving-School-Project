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
<title>News and announcement</title>
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

<form action=" /DrivingSchoolArena/News_Announcement" method="post" >

<div class="container mt-4">
<div class="row">
<div class="col-4"></div>
<div class="col-4" style="border:4px solid cyan;border-radius: 4px;">
<h1 class="text-center  text-white" >News-Announcement</h1>
<hr style="border:4px solid red;border-radius: 4px;">
<div class="input-group mt-2">
						<label for="address" class="input-group-text">Content</label>

						<textarea class="form-control "
							placeholder="please enter your Content" required="required"
							name="content" style="height:100px;"></textarea>
						<div class="invalid-feedback">Please provide your content</div>
					</div>
					<div class="text-center">
						<button type="submit"
							class=" btn btn-secondary w-25 mt-4 mb-4 form-control">Submit</button>

</div>
</div></div></div>
</form>
<div style="height: 250px"></div>
<%-- <%@include file="/Common/Common_Footer.html"%> --%>
<%@include file="/Common/Common_Footer.html"%>
	<%@include file="/Common/Common_Js.html"%>
</body>
</html>