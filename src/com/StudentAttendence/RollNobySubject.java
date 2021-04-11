package com.StudentAttendence;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RollNobySubject
 */
@WebServlet("/RollNobySubject")
public class RollNobySubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Dao daoObject;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RollNobySubject() {
        daoObject=new Dao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentAttendence studentObject = new StudentAttendence();
		studentObject.setLname(request.getParameter("Lname"));
		studentObject.setBranch(request.getParameter("branch"));
		studentObject.setYear(request.getParameter("year"));
		studentObject.setSection(request.getParameter("section"));
		String subject = request.getParameter("subject");
		studentObject.setSubject(subject);
		String RollNo = request.getParameter("rollno");
		studentObject.setRollNo(RollNo);
		int val = 0;
		val = daoObject.RollNobySubject(studentObject);
		request.setAttribute("count", val);
		request.setAttribute("Subject", subject);
		request.setAttribute("RollNo", RollNo);
		
		RequestDispatcher rd=request.getRequestDispatcher("/RollNobySubjectResult.jsp");
		rd.forward(request, response);	
	}

}
