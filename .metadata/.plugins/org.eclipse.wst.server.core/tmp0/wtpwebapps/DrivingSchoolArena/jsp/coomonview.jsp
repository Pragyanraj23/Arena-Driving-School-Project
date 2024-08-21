<%@page import="dsa.beans.Program"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dsa.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view program</title>
<%@include file="/Common/Common_Css.html" %>

</head>
<body>
	<%@include file="/Common/Common_header.html"%>

<%

AdminDao dao=new AdminDao();
    ArrayList<Program> programview =  dao.viewprogram();

%>
<% 
for(Program p:programview)
{
	%>


<%} %>

<table class="table">
<tbody>
<tr>
<th> Program name  </th>
<th> Fees</th>
<th> Discription </th>
</tr>
<% 
for(Program p:programview)
{
%>
<tr>
<td><%=p.getPname() %></td>
<td><%=p.getFees()%></td>
<td><%=p.getDiscription()%></td>





</tr>



<%} %>
</tbody>
</table>


<%@include file="/Common/Common_Footer.html" %>
<%@include file="/Common/Common_Js.html" %>
</body>
</html>