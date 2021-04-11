package com.StudentAttendence;

import java.io.IOException;
import java.util.*;
import javax.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DetainList
 */
@WebServlet("/DetainList")
public class DetainList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Dao daoObject;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetainList() {
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
	
		StudentAttendence studentObject = new StudentAttendence();
		studentObject.setLname(request.getParameter("Lname"));
		studentObject.setBranch(request.getParameter("branch"));
		studentObject.setYear(request.getParameter("year"));
		studentObject.setSection(request.getParameter("section"));
		Map<Integer, Integer> val =  ( daoObject).DetainList(studentObject);
		request.setAttribute("count", val);
		RequestDispatcher rd=request.getRequestDispatcher("/ListOfStudent.jsp");
		rd.forward(request, response);	
	}

}
