package com.StudentAttendence;

import java.util.ArrayList;

public class StudentAttendence {
	
	private String id;
	private String Firstname;
	private String Lastname;
	private String Username;
	private String Password;
	private String Lname;
	private String Branch;
	private String Year;
	private String Section;
	private String Subject;
	private String Date;
	private String Absent;
	private String Absent1;
	private String RollNo;
	public StudentAttendence()
	{}
	public StudentAttendence(String Id,String firstname, String lastname, String username, String password, String lname,
			String branch, String year, String section, String subject, String date ,String absent,String absent1,String rollNo) {
		super();
		id=Id;
		Firstname = firstname;
		Lastname = lastname;
		Username = username;
		Password = password;
		Lname = lname;
		Branch = branch;
		Year = year;
		Section = section;
		Subject = subject;
		Date = date;
		Absent=absent;
		Absent1=absent1;
		RollNo=rollNo;
	}
	
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getAbsent() {
		return Absent;
	}
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public void setAbsent(String absent) {
		// TODO Auto-generated method stub
		Absent=absent;
	}
	public String getAbsent1() {
		return Absent1;
	}
	public void setAbsent1(String sb) {
		Absent1 = sb;
	}
	
	
}


