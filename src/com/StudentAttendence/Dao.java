package com.StudentAttendence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;





public class Dao {

	public int Register (StudentAttendence StudentObject)
	{
		Connection con=null;
		Statement st=null;
		int val=0;
		System.out.println(StudentObject.getFirstname());
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			val=st.executeUpdate("INSERT INTO Lecturers(Fname,Lname,Username,password) VALUES('"+StudentObject.getFirstname()+"','"+StudentObject.getLastname()+"','"+StudentObject.getUsername()+"','"+StudentObject.getPassword()+"')");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return val;
	}
	
	
	
	public StudentAttendence Login(StudentAttendence StudentObject) 
	{
		Connection con=null;
		Statement st = null;
		ResultSet rs=null;
		String password=null;
		StudentAttendence LoopObject = new StudentAttendence();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM Lecturers WHERE Username='"+StudentObject.getUsername()+"'");
			if(rs!=null)
			{	
			while(rs.next())
			{
				LoopObject.setUsername(rs.getString("Username"));
				 password = rs.getString("password");
			}
			if(password.equals(StudentObject.getPassword()))
			{
				return LoopObject;
			}
			}
			else
			{
				return null;
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null ;
	}
	
	



	public ArrayList<StudentAttendence> StudentRegister(StudentAttendence studentObject) throws ClassNotFoundException, SQLException
	{

		Connection con=null;
		Statement st=null;
		ResultSet rs = null;
		int val=0;
		ArrayList<StudentAttendence> returnList = new ArrayList<StudentAttendence>();
		try
		{
			System.out.println(studentObject.getAbsent());
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			val=st.executeUpdate("INSERT INTO Attendence(LName,Branch,Years,Section,Subject,Absent) VALUES('"+studentObject.getLname()+"','"+studentObject.getBranch()+"','"+studentObject.getYear()+"','"+studentObject.getSection()+"','"+studentObject.getSubject()+"','"+studentObject.getAbsent()+"')");
			
			con.close();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
				st = con.createStatement();
				rs = st.executeQuery("SELECT * FROM Attendence WHERE LName='"+studentObject.getLname()+"'");
			
				while(rs.next())
				{
					StudentAttendence LoopObject = new StudentAttendence();
					LoopObject.setId(rs.getString("Id"));
					LoopObject.setLname(rs.getString("LName"));
					LoopObject.setBranch(rs.getString("Branch"));
					LoopObject.setYear(rs.getString("Years"));
					LoopObject.setSection(rs.getString("Section"));
					LoopObject.setSubject(rs.getString("Subject"));
					LoopObject.setDate(rs.getString("Date"));
					LoopObject.setAbsent(rs.getString("Absent"));
					returnList.add(LoopObject);
					
				}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		finally
		{}
		}
		finally {}
		return returnList;
		
	}



	public ArrayList<StudentAttendence> RegisterValues(String Lname) {
		Connection con = null;
		Statement st =null;
		ResultSet rs =null;
		String str = null;
		 ArrayList<StudentAttendence> returnList = new ArrayList<StudentAttendence>();
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM Attendence WHERE LName='"+Lname+"'");
		
			while(rs.next())
			{
				StudentAttendence LoopObject = new StudentAttendence();
				LoopObject.setId(rs.getString("Id"));
				LoopObject.setLname(rs.getString("LName"));
				LoopObject.setBranch(rs.getString("Branch"));
				LoopObject.setYear(rs.getString("Years"));
				LoopObject.setSection(rs.getString("Section"));
				LoopObject.setSubject(rs.getString("Subject"));
				String val1=rs.getString("Absent");
				//String strNew =val1.replace("[]", " ");
				str = val1.replaceAll("[\\[\\]\\(\\)]", "");
				LoopObject.setAbsent(str);
				LoopObject.setDate(rs.getString("Date"));
				returnList.add(LoopObject);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return returnList;
		 
	}
	



	public ArrayList<StudentAttendence> Delete(String Id,String Username) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement st =null;
		ResultSet rs =null;
		int val = 0;
		 ArrayList<StudentAttendence> returnList = new ArrayList<StudentAttendence>();

			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
				st = con.createStatement();
				val = st.executeUpdate("delete from Attendence where Id='"+Id+"'");

				if(val!=0)
				{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM Attendence WHERE LName='"+Username+"'");
		
			while(rs.next())
			{
				StudentAttendence LoopObject = new StudentAttendence();
				LoopObject.setId(rs.getString("Id"));
				LoopObject.setLname(rs.getString("LName"));
				LoopObject.setBranch(rs.getString("Branch"));
				LoopObject.setYear(rs.getString("Years"));
				LoopObject.setSection(rs.getString("Section"));
				LoopObject.setSubject(rs.getString("Subject"));
						
				LoopObject.setAbsent(rs.getString("Absent"));
				LoopObject.setDate(rs.getString("Date"));
				returnList.add(LoopObject);
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
		}
	
				

}
			finally {}
			return returnList;
}






	public static StudentAttendence Update(String val) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs = null;
		StudentAttendence LoopObject = new StudentAttendence();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			rs = st.executeQuery("SELECT * FROM Attendence WHERE Id='"+val+"'");
			
			while(rs.next())
			{
				LoopObject.setId(rs.getString("Id"));
				LoopObject.setLname(rs.getString("LName"));
				LoopObject.setBranch(rs.getString("Branch"));
				LoopObject.setYear(rs.getString("Years"));
				LoopObject.setSection(rs.getString("Section"));
				LoopObject.setSubject(rs.getString("Subject"));
				String val1=rs.getString("Absent");
				//String strNew =val1.replace("[]", " ");
				String str = val1.replaceAll("[\\[\\]\\(\\)]", "");
				LoopObject.setAbsent(str);
				LoopObject.setDate(rs.getString("Date"));
				
			}

			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return LoopObject;
	}



	public ArrayList<StudentAttendence> UpdateUser(StudentAttendence studentObject) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement st =null;
		ResultSet rs =null;
		int val = 0;
		 ArrayList<StudentAttendence> returnList = new ArrayList<StudentAttendence>();

			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
				st = con.createStatement();
				val = st.executeUpdate("UPDATE Attendence SET LName='"+studentObject.getLname()+"',Branch='"+studentObject.getBranch()+"',Years='"+studentObject.getYear()+"',Section='"+studentObject.getSection()+"',Subject='"+studentObject.getSubject()+"',Absent='"+studentObject.getAbsent()+"'where Id='"+studentObject.getId()+"'");

				if(val!=0)
				{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM Attendence WHERE LName='"+studentObject.getLname()+"'");
		
			while(rs.next())
			{
				StudentAttendence LoopObject = new StudentAttendence();
				LoopObject.setId(rs.getString("Id"));
				LoopObject.setLname(rs.getString("LName"));
				LoopObject.setBranch(rs.getString("Branch"));
				LoopObject.setYear(rs.getString("Years"));
				LoopObject.setSection(rs.getString("Section"));
				LoopObject.setSubject(rs.getString("Subject"));
							
				LoopObject.setAbsent(rs.getString("Absent"));
				LoopObject.setDate(rs.getString("Date"));
				returnList.add(LoopObject);
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
		}
	
				

}
			finally {}
			return returnList;
}



	public int SearchbyRollNo(StudentAttendence studentObject) {
		// TODO Auto-generated method stub
		Connection  con= null;
		Statement st = null;
		ResultSet rs = null;
		int counter =0;
		int count = 0 ;
		
		ArrayList<String> returnList = new ArrayList<String>();
		ArrayList<Integer> returnListval = new ArrayList<Integer>();
		Map<Integer,Integer> mapval = new TreeMap<Integer,Integer>();
		Map<Integer,Integer> percentagelist = new TreeMap<Integer,Integer>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			rs = st.executeQuery("SELECT Absent FROM Attendence WHERE LName='"+studentObject.getLname()+"' AND Branch='"+studentObject.getBranch()+"'AND Years='"+studentObject.getYear()+"' AND (Section='"+studentObject.getSection()+"')");
			
			while(rs.next())
			{
				
				String value = rs.getString("Absent");
				counter++;
				returnList.add(value);
				
			}
			//To Find count of a particular no attended to all classes
			for (String element : returnList){
		       if (element.contains(studentObject.getRollNo())){
		               count++;
		               
		         }
			}
			System.out.println(count);
			 
		       
		        
		  
		        String listString="";

				  for (String s : returnList)
				  {
				      listString += s + "";
				      
				  }
				  
				  for(String word : listString.split("\\W")) {
					  if(word.isEmpty()) {
						  continue;
					  }
					  int intValue = Integer.parseInt(word);
					 returnListval.add(intValue);
				  }
				  for(int k:returnListval)
				  {
					  if(mapval.containsKey(k)) {
						  mapval.put(k, mapval.get(k)+1);
					  }
					  else {
						  mapval.put(k, 1);
					  }
				  }
		

				  for(Map.Entry<Integer, Integer> entry : mapval.entrySet()) {
					  System.out.println(entry.getKey() + ": " + entry.getValue());
				  }
				System.out.println(mapval);
				
				for(int i=1;i<=50;i++)
				{
					 if(mapval.get(i)==null) {
						  percentagelist.put(i,100);
					  }
					  else {
						  int val=mapval.get(i);
						  
						  int perval=(val*100)/counter;
						 perval=100-perval;
						  percentagelist.put(i, perval);
					  }
				}
				System.out.println(counter);
				System.out.println(percentagelist);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


		return count;
	}



	public int RollNobySubject(StudentAttendence studentObject) {
		Connection  con= null;
		Statement st = null;
		ResultSet rs = null;
	
		int count = 0 ;
		int counter =0;
		ArrayList<String> returnList = new ArrayList<String>();
		ArrayList<Integer> returnListval = new ArrayList<Integer>();
		Map<Integer,Integer> mapval = new TreeMap<Integer,Integer>();
		Map<Integer,Integer> percentagelist = new TreeMap<Integer,Integer>();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			rs = st.executeQuery("SELECT Absent FROM Attendence WHERE LName='"+studentObject.getLname()+"' AND  Branch='"+studentObject.getBranch()+"'AND Years='"+studentObject.getYear()+"' AND (Section='"+studentObject.getSection()+"' AND Subject='"+studentObject.getSubject()+"')");
			
			while(rs.next())
			{
				
				String value = rs.getString("Absent");
				counter++;
				returnList.add(value);
				
			}
			//To Find count of a particular no attended to all classes
			for (String element : returnList){
		       if (element.contains(studentObject.getRollNo())){
		               count++;
		               
		         }
			}
			System.out.println(count);
			 
		       
		        
		  
		        String listString="";

				  for (String s : returnList)
				  {
				      listString += s + "";
				      
				  }
				  
				  for(String word : listString.split("\\W")) {
					  if(word.isEmpty()) {
						  continue;
					  }
					  int intValue = Integer.parseInt(word);
					 returnListval.add(intValue);
				  }
				  for(int k:returnListval)
				  {
					  if(mapval.containsKey(k)) {
						  mapval.put(k, mapval.get(k)+1);
					  }
					  else {
						  mapval.put(k, 1);
					  }
				  }
		

				  for(Map.Entry<Integer, Integer> entry : mapval.entrySet()) {
					  System.out.println(entry.getKey() + ": " + entry.getValue());
				  }
				System.out.println(mapval);
				for(int i=1;i<=50;i++)
				{
					 if(mapval.get(i)==null) {
						  percentagelist.put(i,100);
					  }
					  else {
						  int val=mapval.get(i);
						  
						  int perval=(val*100)/counter;
						 perval=100-perval;
						  percentagelist.put(i, perval);
					  }
				}
				System.out.println(counter);
				System.out.println(percentagelist);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


		return count;
	}



	public int CountbyPerSubject(StudentAttendence studentObject) {
		// TODO Auto-generated method stub
		Connection  con= null;
		Statement st = null;
		ResultSet rs =null;
		int count = 0;
		
		System.out.println(studentObject.getSection());
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			rs=st.executeQuery("SELECT COUNT(*) FROM Attendence WHERE LName='"+studentObject.getLname()+"' AND Branch='"+studentObject.getBranch()+"' AND Years='"+studentObject.getYear()+"' AND (Section='"+studentObject.getSection()+"' AND Subject='"+studentObject.getSubject()+"')");
			while(rs.next())
			{
				count=rs.getInt(1);
			}
			
			System.out.println(count);
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		return count;
	}



	public Map<Integer, Integer> StudentPercentageList(StudentAttendence studentObject) {
		Connection  con= null;
		Statement st = null;
		ResultSet rs =null;
		int counter =0;
		int i=0;
		int number=0;
		String Branch= studentObject.getBranch();
		String Year= studentObject.getYear();
		String Section = studentObject.getSection();
		ArrayList<String> returnList = new ArrayList<String>();
		ArrayList<Integer> returnListval = new ArrayList<Integer>();
		Map<Integer,Integer> mapval = new TreeMap<Integer,Integer>();
		Map<Integer,Integer> returnmap = new TreeMap<Integer,Integer>();
		System.out.println(studentObject.getSection());
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			rs=st.executeQuery("SELECT Absent FROM Attendence WHERE LName='"+studentObject.getLname()+"' AND Branch='"+studentObject.getBranch()+"' AND Years='"+studentObject.getYear()+"' AND (Section='"+studentObject.getSection()+"')");
			while(rs.next())
			{
				
				String value = rs.getString("Absent");
				counter++;
				returnList.add(value);
				
			}

	        String listString="";

			  for (String s : returnList)
			  {
			      listString += s + "";
			      
			  }
			  
			  for(String word : listString.split("\\W")) {
				  if(word.isEmpty()) {
					  continue;
				  }
				  int intValue = Integer.parseInt(word);
				 returnListval.add(intValue);
			  }
			  for(int k:returnListval)
			  {
				  if(mapval.containsKey(k)) {
					  mapval.put(k, mapval.get(k)+1);
				  }
				  else {
					  mapval.put(k, 1);
				  }
			  }
	

			  for(Map.Entry<Integer, Integer> entry : mapval.entrySet()) {
				  System.out.println(entry.getKey() + ": " + entry.getValue());
			  }
			System.out.println(mapval);
			if(Branch.contentEquals("IT"))
			{
				if(Year.contentEquals("III"))
				{
					if(Section.contentEquals("A"))
					{
						 i = 1;
						number=52;
					}
					else
					{
						i=53;
						number=102;
					}
					}
				}
			returnmap=PercentageList(i,number,mapval,counter);
			
			System.out.println(counter);
			
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		return returnmap;
	}



	private Map<Integer, Integer> PercentageList(int i,int number, Map<Integer, Integer> mapval, int counter
			) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> percentagelist = new TreeMap<Integer,Integer>();
		int val=1;
					for( ;i<=number;i++)
					{
						 if(mapval.get(i)==null) {
							  percentagelist.put(i,100);
						  }
						  else {
							   val=mapval.get(i);
							  
							  int perval=(val*100)/counter;
							 perval=100-perval;
							  percentagelist.put(i,perval);
						  }
					}
				
			
		
		return percentagelist ;
	}



	public Map<Integer, Integer> PercentagebyPerSubject(StudentAttendence studentObject) {
		Connection  con= null;
		Statement st = null;
		ResultSet rs =null;
		int counter =0;
		int i=0;
		int number=0;
		String Branch= studentObject.getBranch();
		String Year= studentObject.getYear();
		String Section = studentObject.getSection();
		
		ArrayList<String> returnList = new ArrayList<String>();
		ArrayList<Integer> returnListval = new ArrayList<Integer>();
		Map<Integer,Integer> mapval = new TreeMap<Integer,Integer>();
		Map<Integer,Integer> returnmap = new TreeMap<Integer,Integer>();
		System.out.println(studentObject.getSection());
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			rs=st.executeQuery("SELECT Absent FROM Attendence WHERE LName='"+studentObject.getLname()+"' AND Branch='"+studentObject.getBranch()+"' AND Years='"+studentObject.getYear()+"' AND (Section='"+studentObject.getSection()+"' AND Subject='"+studentObject.getSubject()+"')");
			while(rs.next())
			{
				
				String value = rs.getString("Absent");
				counter++;
				returnList.add(value);
				
			}

	        String listString="";

			  for (String s : returnList)
			  {
			      listString += s + "";
			      
			  }
			  
			  for(String word : listString.split("\\W")) {
				  if(word.isEmpty()) {
					  continue;
				  }
				  int intValue = Integer.parseInt(word);
				 returnListval.add(intValue);
			  }
			  for(int k:returnListval)
			  {
				  if(mapval.containsKey(k)) {
					  mapval.put(k, mapval.get(k)+1);
				  }
				  else {
					  mapval.put(k, 1);
				  }
			  }
	

			  for(Map.Entry<Integer, Integer> entry : mapval.entrySet()) {
				  System.out.println(entry.getKey() + ": " + entry.getValue());
			  }
			System.out.println(mapval);
			if(Branch.contentEquals("IT"))
			{
				if(Year.contentEquals("III"))
				{
					if(Section.contentEquals("A"))
					{
						 i = 1;
						number=52;
					}
					else
					{
						i=53;
						number=102;
					}
					}
				}
			returnmap=PercentageList(i,number,mapval,counter);
			
			System.out.println(counter);
			
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		return returnmap;
	}



	public Map<Integer, Integer> DetainList(StudentAttendence studentObject) {
		Connection  con= null;
		Statement st = null;
		ResultSet rs =null;
		int counter =0;
		int i=0;
		int number=0;
		String Branch= studentObject.getBranch();
		String Year= studentObject.getYear();
		String Section = studentObject.getSection();
		ArrayList<String> returnList = new ArrayList<String>();
		ArrayList<Integer> returnListval = new ArrayList<Integer>();
		Map<Integer,Integer> mapval = new TreeMap<Integer,Integer>();
		Map<Integer,Integer> returnmap = new TreeMap<Integer,Integer>();
		System.out.println(studentObject.getSection());
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentattendence","root","Sai@2001");
			st=con.createStatement();
			rs=st.executeQuery("SELECT Absent FROM Attendence WHERE LName='"+studentObject.getLname()+"' AND Branch='"+studentObject.getBranch()+"' AND Years='"+studentObject.getYear()+"' AND (Section='"+studentObject.getSection()+"')");
			while(rs.next())
			{
				
				String value = rs.getString("Absent");
				counter++;
				returnList.add(value);
				
			}

	        String listString="";

			  for (String s : returnList)
			  {
			      listString += s + "";
			      
			  }
			  
			  for(String word : listString.split("\\W")) {
				  if(word.isEmpty()) {
					  continue;
				  }
				  int intValue = Integer.parseInt(word);
				 returnListval.add(intValue);
			  }
			  for(int k:returnListval)
			  {
				  if(mapval.containsKey(k)) {
					  mapval.put(k, mapval.get(k)+1);
				  }
				  else {
					  mapval.put(k, 1);
				  }
			  }
	

			  for(Map.Entry<Integer, Integer> entry : mapval.entrySet()) {
				  System.out.println(entry.getKey() + ": " + entry.getValue());
			  }
			System.out.println(mapval);
			if(Branch.contentEquals("IT"))
			{
				if(Year.contentEquals("III"))
				{
					if(Section.contentEquals("A"))
					{
						 i = 1;
						number=52;
					}
					else
					{
						i=53;
						number=102;
					}
					}
				}
			returnmap=DetainPercentageList(i,number,mapval,counter);
			
			System.out.println(counter);
			
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		return returnmap;
	}



	private Map<Integer, Integer> DetainPercentageList(int i, int number, Map<Integer, Integer> mapval, int counter) {
		Map<Integer,Integer> percentagelist = new TreeMap<Integer,Integer>();
		Map<Integer,Integer> Detainlist = new TreeMap<Integer,Integer>();
		for( ;i<=number;i++)
		{
			 if(mapval.get(i)==null) {
				  percentagelist.put(i,100);
			  }
			  else {
				  int val=mapval.get(i);
				  
				  int perval=(val*100)/counter;
				 perval=100-perval;
				  percentagelist.put(i, perval);
			
			  }
		}

		  for(Map.Entry<Integer, Integer> entry : percentagelist.entrySet()) {
			 if(entry.getValue()<=75)
			 {
				 Detainlist.put(entry.getKey(), entry.getValue());
			 }
		  }
	
		  System.out.println(Detainlist);

return Detainlist ;
	}

}