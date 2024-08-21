<%@page import="dsa.beans.Admin_edit"%>
<%@page import="dsa.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html" %>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file='/trainer/trainerheader.html' %>


<!-- include java file -->
<% 
String id=(String)session.getAttribute("adminkey");

AdminDao dao=new AdminDao();

 /* Admin_edit t=dao.admin_edit(id); *///ask about its functions

%>


<%
        String msg=(String) request.getAttribute("message");

if(msg!=null){

%>
<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %>


<!-- end java file -->




<h1>
Admin edit profile
</h1>
<form action=" " method="post" class="form-control ">
<div >
<label for="id"> User Id</label>
<input type="text" name="id" placeholder="Enter your name">
</div>

<div>
<label for="id"> Password</label>
<input type="password" name="password" placeholder="Enter your name">
</div>

<div>
<label for="id"> Number</label>
<input type="text" name="number" placeholder="Enter your name">
</div>

<div>
<label for="id"> Email</label>
<input type="text" name="email" placeholder="Enter your name">
</div>
<button type="submit">Submit</button>


</form>







<%@include file="/Common/Common_Footer.html" %>

<%@include file="/Common/Common_Js.html" %>
</body>
</html>