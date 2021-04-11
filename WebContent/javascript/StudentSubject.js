

/* BRANCH WISE SUBJECTS*/

var CSESubjects = {

    I: ["Physics", "Chemistry", "M2", "Em"],
    II: ["SE", "MFCS", "Data Structures", "Python","R"],
    III: ["DBMS", "AJP", "UNIX", "OS", "HCI"]
}

var MECHSubjects = {

    I: ["Physics", "Chemistry", "M2", "Em"],
    II: ["SE", "MFCS", "Data Structures", "Python","R"],
    III: ["DBMS", "AJP", "UNIX", "OS", "HCI"]
}

var CIVILSubjects = {

    I: ["Physics", "Chemistry", "M2", "Em"],
    II: ["SE", "MFCS", "Data Structures", "Python","R"],
    III: ["DBMS", "AJP", "UNIX", "OS", "HCI"]
}

var EEESubjects = {

    I: ["Physics", "Chemistry", "M2", "Em"],
    II: ["SE", "MFCS", "Data Structures", "Python","R"],
    III: ["DBMS", "AJP", "UNIX", "OS", "HCI"]
}

var ECESubjects = {

    I: ["Physics", "Chemistry", "M2", "Em"],
    II: ["SE", "MFCS", "Data Structures", "Python","R"],
    III: ["DBMS", "AJP", "UNIX", "OS", "HCI"]
}

var ITSubjects = {

    I: ["Physics", "Chemistry", "M2", "Em"],
    II: ["SE", "MFCS", "Data Structures", "Python","R"],
    III: ["DBMS", "AJP", "UNIX", "OS", "HCI"]
}

  function Subject(value) {
		
		/*Declaration*/
		
		var branch = document.getElementById("branch").value;
		var year = document.getElementById("year").value;
		var Subjects = "";
        
		/*Logic*/
		
		if (value.length == 0) 
		{
		document.getElementById("subject").innerHTML = "<option>Select an option</option>";
		}
        
		else 
		{
			/*BRANCH WISE METHODS*/ 
			if(branch=="CSE")
			{
				   
				 document.body.style.backgroundColor = "#b8999c";
				for (subjectval in CSESubjects[value])
				{
					Subjects += "<option>" + CSESubjects[value][subjectval] + "</option>";
					
				}
			}
			if(branch=="MECH")
			{
				document.body.style.backgroundColor ="#d1e04c";
				for (subjectval in MECHSubjects[value])
				{
					Subjects += "<option>" + MECHSubjects[value][subjectval] + "</option>";
					 

				}
			}
			if(branch=="CIVIL")
			{
				document.body.style.backgroundColor = " #5c5233";
				for (subjectval in CIVILSubjects[value])
				{
					Subjects += "<option>" + CIVILSubjects[value][subjectval] + "</option>";
					

				}
			}
			if(branch=="EEE")
			{
				document.body.style.backgroundColor = " #ad5233";
				for (subjectval in EEESubjects[value])
				{
					Subjects += "<option>" + EEESubjects[value][subjectval] + "</option>";
					

				}
			}
			if(branch=="ECE")
			{
				document.body.style.backgroundColor = "#14eb66";
				for (subjectval in ECESubjects[value])
				{
					Subjects += "<option>" + ECESubjects[value][subjectval] + "</option>";		

				}
			}
			if(branch=="IT")
			{
				document.body.style.backgroundColor = "#a3e8ff";
				for (subjectval in ITSubjects[value])
				{
					Subjects += "<option>" + ITSubjects[value][subjectval] + "</option>";
				}
			}
			
		}
		
		/* FOR SELCET AN OPTION*/
		if(Subjects!="")
		{
			document.getElementById("subject").innerHTML = Subjects;
		}
		else
		{
			document.getElementById("subject").innerHTML = "<option>Select an option</option>";
		}
		
    }


