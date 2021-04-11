<!DOCTYPE html>
<html lang="en">
<head>
  <title></title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
  <script>
// Disable form submissions if there are invalid fields
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Get the forms we want to add validation styles to
    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();
</script>

<style>
.table {
   margin: auto;
   width: auto !important; 
}
</style>
</head>
<body class="bg-secondary text-white">

<nav class="navbar navbar-expand-md navbar-dark bg-dark">

         <a class="navbar-brand" ><div class="text-danger">Student Attendence Management</div></a>

  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
     
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Search
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="SearchbyRollNo.jsp">RollNo</a>
		  <a class="dropdown-item" href="RollNobySubject.jsp">RollNo By Subject</a>
          <a class="dropdown-item" href="CountbyPerSubject.jsp">Count By Subject</a>
          </div>
        </li>
		
		
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Percentage
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="StudentPercentageList.jsp">list</a>
		  <a class="dropdown-item" href="PercentagebyPerSubject.jsp">list By Subject</a>
          <a class="dropdown-item" href="DetainList.jsp">Detain List</a>
          </div>
        </li>
		
		 <li class="nav-item">
        <a class="nav-link" href="StudentRegister.jsp">Enter Data</a>
      </li>
      
      		 <li class="nav-item">
        <a class="nav-link" href="Dashboard.jsp">Dashboard</a>
      </li>
    </ul>
		
        <ul class="navbar-nav">
          
            <li class="nav-item">
                   <a class="nav-link" href="Logout1.jsp?id=logout"><span style='font-size:18px' class='fas'>&#xf2f5;</span>Logout</a>
            </li>
        </ul>
    </div>
</nav>


</body>
</html>
