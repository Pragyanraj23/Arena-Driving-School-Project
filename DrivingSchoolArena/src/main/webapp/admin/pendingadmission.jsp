<%@page import="dsa.beans.Admission_Form"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dsa.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/Common/Common_Css.html" %>
</head>
<body>
<%@include file="/admin/adminheader.html" %>
<form action="/DrivingSchoolArena/Admission"  method="post">
<%

AdminDao dao=new AdminDao();
    ArrayList<Admission_Form> programview =  dao.viewAdmission();

%>


<table class="table">
<tbody>
<tr>
<th> Admission id</th>
<th> Program name  </th>
<th> Name</th>
<th> Email</th>
<th> Address</th>
<th> Age</th>
</tr>

<% 
for( Admission_Form af:programview)
{
	%>

<tr>
<td ><input type="radio" readonly="readonly"  name="admid" value="<%=af.getAdmissionid()%>"></td>
<td><input type="text" readonly="readonly" name="program<%=af.getAdmissionid()%>"  value="<%=af.getProgram()%>"></td>
<td><%=af.getName()%></td>
<td><%=af.getEmail()%></td>
<td><%=af.getAddress()%></td>
<td><%=af.getAge()%></td>
</tr>



<%} %>

	

</table>
</tbody>
<div class="text-center">
						<button type="submit"
							class=" btn btn-secondary w-25 mt-4 mb-4 form-control">Submit</button>
                   </div>

 </form>
 
 
					

 <%@include file="/Common/Common_Footer.html" %>
 <%@include file="/Common/Common_Js.html" %>
</body>
</html>