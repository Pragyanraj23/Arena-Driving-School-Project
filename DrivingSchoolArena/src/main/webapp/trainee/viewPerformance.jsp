<%@page import="dsa.dao.TraineeDao"%>
<%@page import="dsa.beans.RideLog"%>
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
String id=(String)session.getAttribute("traineekey");

TraineeDao dao=new TraineeDao();
    ArrayList<RideLog> list =  dao.viewPerformance(id);


    if(list.size()==0)
    {
    	
    out.println("There is no ride log that's why It's not showing any performance");
    }



    else{

%>

<table class="table">
<tbody>
<tr>
<th> Source  </th>
<th> Destination </th>
<th> Duration  </th>
<th> Performance</th>
<th> VehicleNo </th>
</tr>
<% 
for(RideLog c:list)
{
%>

<tr>
<td><%=c.getSource() %></td>
<td><%=c.getDestination()%></td>
<td><%=c.getDuration()%></td>
<td><%=c.getPerformance()%></td>
<td><%=c.getVechileno()%></td>

</tr>

<%} }%>

</tbody>
</table>

<%@include file="/Common/Common_Footer.html" %>
<%@include file="/Common/Common_Js.html" %>

</body>
</html>