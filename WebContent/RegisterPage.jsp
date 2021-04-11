<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

 
<style>
.table {
   margin: auto;
   width: auto !important; 
}
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
	background-color: black;
	
 }
.dropdown-menu{
     margin-top: 0;
  }
</style>

<script>
function RegisterForm() {
   var fname = document.forms["myform"]["fname"].value.trim();
   var lname = document.forms["myform"]["lname"].value.trim();
   var uname = document.forms["myform"]["uname"].value.trim();
   var pwd = document.forms["myform"]["pwd"].value.trim();
   if ( fname == null || fname == "" && lname == null || lname=="" && uname == null || uname == "" && pwd == null || pwd == "") {
      alert("Feilds must be filled out");
      return false;
   }
}
</script>

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
    <li class="nav-item">
        <a class="nav-link" href="HomePage.html">Home</a>
    </li>
   	

</ul>
	    <ul class="nav navbar-nav navbar-right">
      <li class="nav-item active">
	  <a class="nav-link" style="color:red" href="RegisterPage.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
	  </li>
      <li class="nav-item">
	  <a class="nav-link"  href="IndexPage.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
  </div>
</nav>


<h2 style="text-align:center;color:yellow"><b>REGISTER </b></h2><hr style="width:20%; height:2px;background-color:gray">

<form name="myform"action="RegisterPage" method="post"  onSubmit="return RegisterForm()">
<table  align="center" style="text-align:center">


<tr>
<td>
  <label style="color:white" for="fname">FIRSTNAME:</label>
  <input type="text" name="fname"><br><br>
</td>
</tr>

<tr>
<td>
  <label style="color:white" for="lname">LASTNAME:</label>
  <input type="text" name="lname"><br><br>
</td>
</tr>

<tr>
<td>
  <label style="color:white" for="uname">USERNAME:</label>
  <input type="text" name="uname"><br><br>
</td>
</tr>

<tr>
<td>  
    <label style="color:white" for="pwd">PASSWORD:</label>
  <input type="password" name="pwd"><br><br>
</td>
</tr>

<tr>
<td>
  <input type="submit" value="Submit">
</td>
</tr>


</table>
</form> 

</body>
</html>