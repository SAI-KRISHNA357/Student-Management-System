package com.StudentAttendence;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Servlet implementation class SearchbyValue
 */
@WebServlet("/SearchbyRollNo")
public class SearchbyRollNo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Dao daoObject;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchbyRollNo() {
        daoObject = new Dao();
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
		// TODO Auto-generated method stub
		StudentAttendence studentObject = new StudentAttendence();
		studentObject.setLname(request.getParameter("Lname"));
		studentObject.setBranch(request.getParameter("branch"));
		studentObject.setYear(request.getParameter("year"));
		studentObject.setSection(request.getParameter("section"));
		studentObject.setRollNo(request.getParameter("RollNo"));
		int val = 0;
		val = daoObject.SearchbyRollNo(studentObject);
		request.setAttribute("count", val);
		RequestDispatcher rd=request.getRequestDispatcher("/SearchbyRollNoResult.jsp");
		rd.forward(request, response);	
	}

}
