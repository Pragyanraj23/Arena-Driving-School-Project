<%@page import="dsa.beans.Admission_Form"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dsa.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html"%>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="/admin/adminheader.html" %>
<form  action="/DrivingSchoolArena/Admission"  method="post">

<%

AdminDao dao=new AdminDao();
    ArrayList<Admission_Form> confirmview =  dao.viewconfirmAdmission();

%>


<table class="table">

<tr>
<th> Id</th>
<th> Password  </th>
<th> Name</th>
<th> Address</th>
<th> program</th>
<th> phoneno</th>
<th> Fees</th>
</tr>

<%
for(Admission_Form af: confirmview)
{

%>
<tr>
<td><%=af.getId()%></td>
<td><%=af.getPassword() %></td>
<td><%=af.getName() %></td>
<td><%=af.getAddress() %></td>
<td><%=af.getProgram() %></td>
<td><%=af.getPhoneno() %></td>
<td><%=af.getFees() %></td>
</tr>




<%} %>



</table>

</form>





<div style="height: 300px"></div>
<%@include file="/Common/Common_Footer.html"%> 

	<%@include file="/Common/Common_Js.html"%>
</body>
</html>