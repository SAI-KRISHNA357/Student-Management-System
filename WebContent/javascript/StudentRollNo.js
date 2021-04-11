

$(document).ready(function() {
                $(".dropdown, .btn-group").hover(function() {
                    var dropdownMenu = 
                        $(this).children(".dropdown-menu");
                    if (dropdownMenu.is(":visible")) {
                        dropdownMenu.parent().toggleClass("open");
                    }
                });
            });
			
$(document).ready(function(){
  $("#home,#register,#login,#search,#percentage,#enterdata,#dashboard").mouseover(function(){
    $("#home,#register,#login,#search,#percentage,#enterdata,#dashboard").css("cursor", "not-allowed");
    $("#home,#register,#login,#search,#percentage,#enterdata,#dashboard").removeAttr('href');
  });
  });
/* ROllNo's List */

var CSEROllNo = {
  A: ["CSE01","CSE02","CSE03","CSE04","CSE05","CSE06","CSE07","CSE08","CSE09","CSE10","CSE11","CSE12","CSE13","CSE14","CSE15","CSE16","CSE17","CSE18","CSE19","CSE20","CSE21","CSE22","CSE23","CSE24","CSE25","CSE26","CSE27","CSE28","CSE29","CSE30","CSE31","CSE32","CSE33","CSE34","CSE35","CSE36","CSE37","CSE38","CSE39","CSE40","CSE41","CSE42","CSE43","CSE44","CSE45","CSE46","CSE47","CSE48","CSE49","CSE50","CSE51","CSE52"],
  
 
  B: ["CSE53","CSE54","CSE55","CSE56","CSE57","CSE58","CSE59","CSE60","CSE61","CSE62","CSE63","CSE64","CSE65","CSE66","CSE67","CSE68","CSE69","CSE70","CSE71","CSE72","CSE73","CSE74","CSE75","CSE76","CSE77","CSE78","CSE79","CSE80","CSE81","CSE82","CSE83","CSE84","CSE85","CSE86","CSE87","CSE88","CSE89","CSE90","CSE91","CSE92","CSE93","CSE94","CSE95","CSE96","CSE97","CSE98","CSE99"],
};

var MECHROllNo = {
  A: ["MECH01","MECH02","MECH03","MECH04","MECH05","MECH06","MECH07","MECH08","MECH09","MECH10","MECH11","MECH12","MECH13","MECH14","MECH15","MECH16","MECH17","MECH18","MECH19","MECH20","MECH21","MECH22","MECH23","MECH24","MECH25","MECH26","MECH27","MECH28","MECH29","MECH30","MECH31","MECH32","MECH33","MECH34","MECH35","MECH36","MECH37","MECH38","MECH39","MECH40","MECH41","MECH42","MECH43","MECH44","MECH45","MECH46","MECH47","MECH48","MECH49","MECH50","MECH51","MECH52"],
  
 
  B: ["MECH53","MECH54","MECH55","MECH56","MECH57","MECH58","MECH59","MECH60","MECH61","MECH62","MECH63","MECH64","MECH65","MECH66","MECH67","MECH68","MECH69","MECH70","MECH71","MECH72","MECH73","MECH74","MECH75","MECH76","MECH77","MECH78","MECH79","MECH80","MECH81","MECH82","MECH83","MECH84","MECH85","MECH86","MECH87","MECH88","MECH89","MECH90","MECH91","MECH92","MECH93","MECH94","MECH95","MECH96","MECH97","MECH98","MECH99"],
};

var CIVILROllNo = {
  A: ["CIVIL01","CIVIL02","CIVIL03","CIVIL04","CIVIL05","CIVIL06","CIVIL07","CIVIL08","CIVIL09","CIVIL10","CIVIL11","CIVIL12","CIVIL13","CIVIL14","CIVIL15","CIVIL16","CIVIL17","CIVIL18","CIVIL19","CIVIL20","CIVIL21","CIVIL22","CIVIL23","CIVIL24","CIVIL25","CIVIL26","CIVIL27","CIVIL28","CIVIL29","CIVIL30","CIVIL31","CIVIL32","CIVIL33","CIVIL34","CIVIL35","CIVIL36","CIVIL37","CIVIL38","CIVIL39","CIVIL40","CIVIL41","CIVIL42","CIVIL43","CIVIL44","CIVIL45","CIVIL46","CIVIL47","CIVIL48","CIVIL49","CIVIL50","CIVIL51","CIVIL52"],
  
 
  B: ["CIVIL53","CIVIL54","CIVIL55","CIVIL56","CIVIL57","CIVIL58","CIVIL59","CIVIL60","CIVIL61","CIVIL62","CIVIL63","CIVIL64","CIVIL65","CIVIL66","CIVIL67","CIVIL68","CIVIL69","CIVIL70","CIVIL71","CIVIL72","CIVIL73","CIVIL74","CIVIL75","CIVIL76","CIVIL77","CIVIL78","CIVIL79","CIVIL80","CIVIL81","CIVIL82","CIVIL83","CIVIL84","CIVIL85","CIVIL86","CIVIL87","CIVIL88","CIVIL89","CIVIL90","CIVIL91","CIVIL92","CIVIL93","CIVIL94","CIVIL95","CIVIL96","CIVIL97","CIVIL98","CIVIL99"],
};

var EEEROllNo = {
  A: ["EEE01","EEE02","EEE03","EEE04","EEE05","EEE06","EEE07","EEE08","EEE09","EEE10","EEE11","EEE12","EEE13","EEE14","EEE15","EEE16","EEE17","EEE18","EEE19","EEE20","EEE21","EEE22","EEE23","EEE24","EEE25","EEE26","EEE27","EEE28","EEE29","EEE30","EEE31","EEE32","EEE33","EEE34","EEE35","EEE36","EEE37","EEE38","EEE39","EEE40","EEE41","EEE42","EEE43","EEE44","EEE45","EEE46","EEE47","EEE48","EEE49","EEE50","EEE51","EEE52"],
  
 
  B: ["EEE53","EEE54","EEE55","EEE56","EEE57","EEE58","EEE59","EEE60","EEE61","EEE62","EEE63","EEE64","EEE65","EEE66","EEE67","EEE68","EEE69","EEE70","EEE71","EEE72","EEE73","EEE74","EEE75","EEE76","EEE77","EEE78","EEE79","EEE80","EEE81","EEE82","EEE83","EEE84","EEE85","EEE86","EEE87","EEE88","EEE89","EEE90","EEE91","EEE92","EEE93","EEE94","EEE95","EEE96","EEE97","EEE98","EEE99"],
};

var ECEROllNo = {
  A: ["ECE01","ECE02","ECE03","ECE04","ECE05","ECE06","ECE07","ECE08","ECE09","ECE10","ECE11","ECE12","ECE13","ECE14","ECE15","ECE16","ECE17","ECE18","ECE19","ECE20","ECE21","ECE22","ECE23","ECE24","ECE25","ECE26","ECE27","ECE28","ECE29","ECE30","ECE31","ECE32","ECE33","ECE34","ECE35","ECE36","ECE37","ECE38","ECE39","ECE40","ECE41","ECE42","ECE43","ECE44","ECE45","ECE46","ECE47","ECE48","ECE49","ECE50","ECE51","ECE52"],
  
 
  B: ["ECE53","ECE54","ECE55","ECE56","ECE57","ECE58","ECE59","ECE60","ECE61","ECE62","ECE63","ECE64","ECE65","ECE66","ECE67","ECE68","ECE69","ECE70","ECE71","ECE72","ECE73","ECE74","ECE75","ECE76","ECE77","ECE78","ECE79","ECE80","ECE81","ECE82","ECE83","ECE84","ECE85","ECE86","ECE87","ECE88","ECE89","ECE90","ECE91","ECE92","ECE93","ECE94","ECE95","ECE96","ECE97","ECE98","ECE99"],
};

var ITROllNo = {
  A: ["IT01","IT02","IT03","IT04","IT05","IT06","IT07","IT08","IT09","IT10","IT11","IT12","IT13","IT14","IT15","IT16","IT17","IT18","IT19","IT20","IT21","IT22","IT23","IT24","IT25","IT26","IT27","IT28","IT29","IT30","IT31","IT32","IT33","IT34","IT35","IT36","IT37","IT38","IT39","IT40","IT41","IT42","IT43","IT44","IT45","IT46","IT47","IT48","IT49","IT50","IT51","IT52"],
  
 
  B: ["IT53","IT54","IT55","IT56","IT57","IT58","IT59","IT60","IT61","IT62","IT63","IT64","IT65","IT66","IT67","IT68","IT69","IT70","IT71","IT72","IT73","IT74","IT75","IT76","IT77","IT78","IT79","IT80","IT81","IT82","IT83","IT84","IT85","IT86","IT87","IT88","IT89","IT90","IT91","IT92","IT93","IT94","IT95","IT96","IT97","IT98","IT99"],
};

/*Logic Section*/
function ROllNo(value) {
	var roll=document.getElementById("section").value;
  if (value.length == 0) document.getElementById("rollno").innerHTML = "<option></option>";
  else {
    var RollNo = "";
	if(roll=="A")
	{
		var i=1;
	}
	else{
		var i=53;
	}
	if(document.getElementById("branch").value=="CSE")
	{
	    for (RollVal in CSEROllNo[value]) {
    	var rollno = CSEROllNo[value][RollVal];
		 RollNo += "<label><input type='checkbox' name='categories' value='" + i + "' onclick='checkOptions()'>" 
      	+  rollno + "</input></label>";
		i++;
    }
	}
	
		if(document.getElementById("branch").value=="MECH")
	{
	    for (RollVal in MECHROllNo[value]) {
    	var rollno = MECHROllNo[value][RollVal];
		 RollNo += "<label><input type='checkbox' name='categories' value='" + i + "' onclick='checkOptions()'>" 
      	+  rollno + "</input></label>";
		i++;
    }
	}
	
		if(document.getElementById("branch").value=="CIVIL")
	{
	    for (RollVal in CIVILROllNo[value]) {
    	var rollno = CIVILROllNo[value][RollVal];
		 RollNo += "<label><input type='checkbox' name='categories' value='" + i + "' onclick='checkOptions()'>" 
      	+  rollno + "</input></label>";
		i++;
    }
	}
	
		if(document.getElementById("branch").value=="EEE")
	{
	    for (RollVal in EEEROllNo[value]) {
    	var rollno = EEEROllNo[value][RollVal];
		 RollNo += "<label><input type='checkbox' name='categories' value='" + i + "' onclick='checkOptions()'>" 
      	+  rollno + "</input></label>";
		i++;
    }
	}
	
		if(document.getElementById("branch").value=="ECE")
	{
	    for (RollVal in ECEROllNo[value]) {
    	var rollno = ECEROllNo[value][RollVal];
		 RollNo += "<label><input type='checkbox' name='categories' value='" + i + "' onclick='checkOptions()'>" 
      	+ rollno + "</input></label>";
		i++;
    }
	}
	
		if(document.getElementById("branch").value=="IT")
	{
	    for (RollVal in ITROllNo[value]) {
    	var rollno = ITROllNo[value][RollVal];
		 RollNo += "<label><input type='checkbox' name='categories' value='" + i + "' onclick='checkOptions()'>" 
      	+  rollno + "</input></label>";
		i++;
    }
	}
    document.getElementById("checkboxes").innerHTML = RollNo;
  }
}

var expanded = false;

function showCheckboxes() {
  var checkboxes = document.getElementById("checkboxes");
  if (!expanded) {
    checkboxes.style.display = "block";
    expanded = true;
  } else {
    checkboxes.style.display = "none";
    expanded = false;
  }
}

function checkOptions() {
  els = document.getElementsByName('categories');
  var selectedChecks = "", qtChecks = 0;
  for (i = 0; i < els.length; i++) {
  	if (els[i].checked) {
      if (qtChecks > 0) selectedChecks += ", "
	  selectedChecks += els[i].value;
      qtChecks++;
    }
  }
  
  if(selectedChecks != "") {
    document.getElementById("defaultCategory").innerText = selectedChecks;
  } else {
    document.getElementById("defaultCategory").innerText = "Select an option";
  }
}



