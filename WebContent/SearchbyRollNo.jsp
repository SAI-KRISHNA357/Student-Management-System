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
<title>Search By Roll No</title>
<script>
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
</head>
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


<h2 style="text-align:center;color:yellow"><b>RollNo </b></h2><hr style="width:20%; height:2px;background-color:gray">
<table align="center" style="text-align:center" border="1">
  <form id = "form" action="SearchbyRollNo" method="post">
<tr>
<td>
<input id='uname' type='hidden' 
  value="<%= val.getUsername() %>" placeholder="USERNAME" name='Lname' required>
</td>
</tr>
<tr>
<td>
<label style="color:white" for="branch">BRANCH:</label><br/>
 <select name="branch" id="branch" onClick ="Subject(this.value);" required>	
 	<option value="" disabled selected>Select an option</option>
    <option  class="CSE" value="CSE">CSE</option>
    <option class="MECH" value="MECH">MECH</o9ption>
    <option class="CIVIL" value="CIVIL">CIVIL</option>
    <option class="EEE" value="EEE">EEE</option>
     <option class="ECE" value="ECE">ECE</option>
      <option class="IT" value="IT">IT</option>
  </select>
</td>
</tr>

<tr>
<td>
<label style="color:white" for="year">YEAR:</label><br/>
 <select name="year" id="year" onClick="Subject(this.value);" required>
 	<option value="" disabled selected>Select an option</option>
    <option value="I">I</option>
    <option value="II">II</option>
    <option value="III">III</option>
    <option value="IV">IV</option>
  </select>
</td>
</tr>

<tr>
<td>
<label style="color:white" for="section">SECTION:</label><br/>
<select name="section" id="section" onclick="ROllNo(this.value);" required>
	<option value="" disabled selected>Select an option</option>
    <option value="A">A</option>
    <option value="B">B</option>
  </select>
</td>
</tr>

<tr>
<td>
<label style="color:white" for="rollno">ROLLNO:</label>
<div class="multiselect">
  <div class="selectBox"  onclick="showCheckboxes()">
   <select id="wrapper" name="RollNo"  id="rollno">
      <option id="defaultCategory" >Select an option</option>
    </select>	
    <div  multiple class="overSelect"></div>
  </div>
  <div class="example">
  <div id="checkboxes"></div>
</div>
</div>
</td>
</tr>

<tr>
<td style="text-align:center">
<INPUT TYPE="button" onClick="history.go(0)" VALUE="Reset">
<input type='submit' value='Submit'/>
</td>
</tr>

</form>
</table>


</body>
</html>