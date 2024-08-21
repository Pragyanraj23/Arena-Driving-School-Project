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
<title>Insert title here</title>
</head>
<body>
<%@include file='/trainer/trainerheader.html' %>


<% 
String id=(String)session.getAttribute("Trainerkey");

TrainerDao dao=new TrainerDao();

 Trainer_registration t=dao.viewProfile(id);


%>
<%-- <%=t.getName() %>
<%=t.getEmail() %>
<%=t.getExperince()%>
<%=t.getDiscription()%>
<%=t.getAddress()%> --%>

<%-- <table class="table">
<tbody>
<tr>
<th>Name</th>
<th>Email</th>
<th>Experince</th>
<th>Discription</th>
<th>Address</th>

</tr>
<tr>
<td><%=t.getName() %></td>
<td><%=t.getEmail() %></td>
<td><%=t.getExperince() %></td>
<td><%=t.getDiscription() %></td>
<td><%=t.getAddress()%></td>

</tr>

</tbody>

</table> --%>
<!-- style="width: 25rem; margin-top: 40%;margin-left: 0px; -->

<div style="margin-left: 33%;width:500px;margin-top:20px; border-style: solid;
  border-color: coral;">
<div class="card mt-5" >
  <ul class="list-group list-group-flush">
    <li class="list-group-item boxst " > Name:<%=t.getName() %></li>
    <li class="list-group-item boxst">Email:<%=t.getEmail() %></li>
    <li class="list-group-item boxst">Experince:<%=t.getExperince() %></li>
    <li class="list-group-item boxst">Discripton:<%=t.getDiscription() %></li>
    <li class="list-group-item boxst">Address:<%=t.getAddress()%></li>
  </ul>
</div>
</div>

<div style="height: 200px">

</div>


<%@include file="/Common/Common_Footer.html" %>

<%@include file="/Common/Common_Js.html" %>
</body>
</html>