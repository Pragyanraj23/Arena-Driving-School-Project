<%@page import="java.util.ArrayList"%>
<%@page import="dsa.dao.AdminDao"%>
<%@page import="dsa.beans.Feedback"%>

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
<%@include file="/admin/adminheader.html" %>

<%

AdminDao dao=new AdminDao();
    ArrayList<Feedback> feedbackview =  dao.viewfeedback();



%>
<% 
for(Feedback c:feedbackview )
{
	%>

<%-- <h1>Serial no is:<%=c.getSrno() %></h1>
<h1>Name is is:<%=c.getName()%></h1>
<h1>Email  is:<%=c.getEmail()%></h1>
<h1>Rating is:<%=c.getRating()%></h1>
<h1>Review is:<%=c.getReview()%></h1> --%>

<%} %>
<table class="table">
<tbody>
<tr>
<th> Serial No  </th>
<th> Name </th>
<th> Email  </th>
<th> Rating</th>
<th> Review</th>
</tr>
<% 
for(Feedback c:feedbackview)
{
%>

<tr>
<td><%=c.getSrno() %></td>
<td><%=c.getName()%></td>
<td><%=c.getEmail()%></td>
<td><%=c.getRating()%></td>
<td><%=c.getReview()%></td>

</tr>

<%} %>

</tbody>
</table>

<%@include file="/Common/Common_Footer.html" %>
<%@include file="/Common/Common_Js.html" %>

</body>
</html>