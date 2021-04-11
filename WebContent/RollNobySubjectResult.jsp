 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@page import="javax.*" %>
   <%@page import="com.StudentAttendence.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RollNo By Subject</title>

<script language="JavaScript">
  javascript:window.history.forward(1);
</script>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="javascript/StudentStyle.css"></link>
<script type="text/javascript" src="javascript/StudentSubject.js"></script>
  <script type="text/javascript" src="javascript/StudentRollNo.js"></script>
<style>

 body {
	 background-color: 	 #29293d;
}

a:link {
  color: green;
  background-color: transparent;
  text-decoration: none;
}

a:hover {
  color: red;
  background-color: transparent;
  text-decoration: underline;
}
a:active {
  color: yellow;
  background-color: transparent;
  text-decoration: underline;
}
.dropdown:hover .dropdown-menu{
    display: block;
	background-color:black;
	
 }
.dropdown-menu{
     margin-top: 0;
  }
</style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
<a class="navbar-brand"><div class="text-danger"> STUDENT MANAGEMENT SYSTEM </div></a>
    </div>
	 <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav ">
   	 
         <li class="nav-item active">
		 <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#" class="nav-link" style="color:red" >Search<span class="caret"></span></a>
		
          <ul class="dropdown-menu">
            <li><a style="color:#9999ff" href="SearchbyRollNo.jsp">RollNo</a></li>
            <li><a style="color:#9999ff" href="RollNobySubject.jsp">RollNoBySubject</a></li>
            <li><a style="color:#9999ff" href="CountbyPerSubject.jsp">CountBySubject</a></li>
          </ul>
        </li>
		</li>

		
		
		<li class="nav-item">
		<li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#" class="nav-link">Percentage<span class="caret"></span></a>
		 <ul class="dropdown-menu">
            <li><a style="color:#9999ff" href="StudentPercentageList.jsp">List</a></li>
            <li><a style="color:#9999ff" href="PercentagebyPerSubject.jsp">ListBySubject</a></li>
            <li><a style="color:#9999ff" href="DetainList.jsp">DetainList</a></li>
          </ul>
        </li>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="StudentRegister.jsp">Enterdata</a>
    </li>

</ul>
	<ul class="nav navbar-nav navbar-right">
       	  <li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#"> <span class="glyphicon glyphicon-user" class="caret"></span><b style="color:#990066">
			 <%
 
				 StudentAttendence val = (StudentAttendence)session.getAttribute("value1");
 					out.println(val.getUsername());
			 %>
			</b></a>
			 <ul class="dropdown-menu">
				<li><a class="nav-link" style="color:#9999ff"  href="Dashboard.jsp">Dashboard</a></li>
			 
				<li><a class="nav-link" style="color:#9999ff" href="Logout1.jsp?id=logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</ul>
    
		</li>
	</ul>
  </div>
  </div>
</nav>

<p style="color:white">No.Of Classes Absent to Subject <strong style="color:red" >${Subject}</strong> by RollNo <strong style="color:red">${RollNo}</strong> is <strong  style="color:red">${count}</strong></p>
</body>
</html>