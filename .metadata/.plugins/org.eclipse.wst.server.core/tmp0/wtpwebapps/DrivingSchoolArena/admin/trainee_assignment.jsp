<%@page import="dsa.beans.Trainer_registration"%>
<%@page import="dsa.beans.Admission_Form"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dsa.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.button {
  color: #ecf0f1;
  width:250px;
  margin-top:5px;
  font-size: 17px;
  background-color: #e67e22;
  border: 1px solid #f39c12;
  border-radius: 5px;
  cursor: pointer;
  padding: 10px;
  box-shadow: 0px 6px 0px #d35400;
  transition: all 0.1s;
}

.button:active {
  box-shadow: 0px 2px 0px #d35400;
  position: relative;
  top: 2px;
}


</style>
<meta charset="ISO-8859-1">
<title>Trainee Assignment</title>
<%@include file="/Common/Common_Css.html" %>
</head>
<body>
<%@include file="/admin/adminheader.html" %>
<form action="/DrivingSchoolArena/Assign_Trainee"  method="post">
<%
        String msg=(String) request.getAttribute("Message");

if(msg!=null){

%> 

<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %> 

<%

AdminDao dao=new AdminDao();

    ArrayList<Admission_Form> traineeview =  dao.viewtrainee();
    ArrayList<Trainer_registration>list=dao.viewtrainerdetails();

%>
 

<table class="table">
<tbody>
<tr>
<th> Trainee id</th>
<th> Name</th>
<th> Email</th>
<th> Program name  </th>
<th> phone</th>
</tr>

<% 
for( Admission_Form af:traineeview)
{
	%>

<tr>
<td ><input type="checkbox"  name="id" value="<%=af.getId()%>"></td>
<td><%=af.getName() %></td>
<td><%=af.getEmail()%></td>
<td><%=af.getProgram()%></td>
<td><%=af.getPhoneno()%></td>
</tr>



<%} %>

	

</table>
</tbody>

<div class="container">
<div class="row">
<div class="col-4"></div>
<div class="col-4">
<select class="form-control  text-center" name="trainerid">
							<option value="default">Choose Trainer</option>
							<%for(Trainer_registration tr:list) 
{
%>
							<option value="<%=tr.getUserid()%>"><%=tr.getName() %></option>
						
						<%} %>
						</select>
						</div>
						</div>
						</div>
						
                      <div class="text-center">
						<button type="submit"
							class=" button">Submit</button>
                   </div>

 </form>
 
 
					

 <%@include file="/Common/Common_Footer.html" %>
 <%@include file="/Common/Common_Js.html" %>
</body>
</html>