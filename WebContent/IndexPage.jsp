<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>LOGIN FORM</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script>
function LoginForm() {
   var x = document.forms["myform"]["uname"].value.trim();
   var y = document.forms["myform"]["pwd"].value.trim();
   if ( x == null || x == "" && y == null || y=="" ) {
      alert("Username and Password must be filled out");
      return false;
   }
}
</script>
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
	background-color:black;
	
 }
.dropdown-menu{
     margin-top: 0;
  }
</style>

<script>
  javascript:window.history.forward(1);
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
    <ul class="nav navbar-nav">
     <li class="nav-item">
        <a class="nav-link" href="HomePage.html">Home<span class="sr-only"></span></a>
    </li>
    </ul>
	    <ul class="nav navbar-nav navbar-right">
      <li class="nav-item">
	  <a class="nav-link" href="RegisterPage.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
	  </li>
      <li class="nav-item active">
	  <a class="nav-link" style="color:red" href="IndexPage.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	   
    </ul>
    </div>
  </div>
</nav>

<h2 style="text-align:center;color:green"><b>LOGIN </b></h2><hr style="width:20%; height:2px;background-color:red">
<form name="myform" action="IndexPage" method="post"  onSubmit="return LoginForm()">
<table  align="center" style="text-align:center">

<tr>
<td>
  <label style="color:white" >USERNAME:</label>
  <input type="text" name="uname" ><br><br>
</td>
</tr>

<tr>
<td>  
    <label style="color:white" for="pwd">PASSWORD:</label>
  <input type="password" name="pwd" ><br><br>
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