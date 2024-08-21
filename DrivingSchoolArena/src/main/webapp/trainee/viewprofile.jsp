<%@page import="dsa.beans.Admission_Form"%>
<%@page import="dsa.dao.TraineeDao"%>
<%@page import="dsa.beans.Trainer_registration"%>
<%@page import="dsa.dao.TrainerDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html" %>
<style type="text/css">
.boxst:hover
{
color:yellow;
background-color: red;

}


</style>

<meta charset="ISO-8859-1">
<title>Trainee view Profile</title>
</head>
<body>
<%@include file="/trainee/trainee._header.html"%>


<% 
String ide1=(String)session.getAttribute("traineekey");

TraineeDao dao=new TraineeDao();

 Admission_Form af=dao.viewProfile1(ide1);


%>

<!-- style="width: 25rem; margin-top: 40%;margin-left: 0px; -->


<div class="card mx-auto w-50 mt-5" style="border-style: solid;border-color: green" >
  <ul class="list-group list-group-flush">
    <li class="list-group-item boxst " >Name:<%=af.getName() %> </li>
    <li class="list-group-item boxst">Email:<%=af.getEmail() %> </li>
    <li class="list-group-item boxst">Phone number:<%=af.getPhoneno() %> </li>
    <li class="list-group-item boxst">Gender:<%=af.getGender() %> </li>
    <li class="list-group-item boxst">Address:<%=af.getAddress() %> </li>
    
  </ul>
</div>







</div>
<div style="height: 200px"></div>

<%@include file="/Common/Common_Footer.html" %>

<%@include file="/Common/Common_Js.html" %>
</body>
</html>