<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/Common/Common_Css.html"%>

<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
<%@include file="/admin/adminheader.html" %>
<%
        String msg=(String) request.getAttribute("message");

if(msg!=null){

%>
<div class="alert alert-warning alert-dismissible fade show mt-5" role="alert" >
  <strong Style="margin-left: 45%; "><%=msg %></strong> 
  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<%} %>

<div style="height: 300px"></div>
<%@include file="/Common/Common_Footer.html"%> 

	<%@include file="/Common/Common_Js.html"%>
</body>
</html>