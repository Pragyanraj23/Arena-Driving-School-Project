<%@page import="dsa.beans.Contactus"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dsa.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html" %>
<style type="text/css">
td:hover
{
background-color: yellow;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="/admin/adminheader.html" %>

<%

AdminDao dao=new AdminDao();
    ArrayList<Contactus> contactview =  dao.viewcontact();

%>
<% 
for(Contactus c:contactview)
{
	%>

<%-- <h1>Serial no is:<%=c.getSerialno() %></h1>
<h1>Name is is:<%=c.getName()%></h1>
<h1>Email is:<%=c.getEmail()%></h1>

<h1>Number is:<%=c.getNumber()%></h1>
<h1>Query is:<%=c.getQuery()%></h1>
<h1>Date is:<%=c.getDate()%></h1> --%>

<%} %>

<table class="table">
<tbody>
<tr>
<th> Serial No  </th>
<th> Name </th>
<th> Email  </th>
<th> Number</th>
<th> Query</th>
<th> Date  </th>
</tr>
<% 
for(Contactus c:contactview)
{
%>
<tr>
<td><%=c.getSerialno() %></td>
<td><%=c.getName()%></td>
<td><%=c.getEmail()%></td>
<td><%=c.getNumber()%></td>
<td><%=c.getQuery()%></td>
<td><%=c.getDate()%></td>




</tr>



<%} %>
</tbody>
</table>



<%@include file="/Common/Common_Footer.html" %>
<%@include file="/Common/Common_Js.html" %>


</body>
</html>