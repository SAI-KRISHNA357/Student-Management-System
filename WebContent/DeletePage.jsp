<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.StudentAttendence.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String val1 = request.getParameter("id");
String val2 = request.getParameter("id1");
IndexPage.delete(request, response);
%>
</body>