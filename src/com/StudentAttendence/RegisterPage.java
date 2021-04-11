package com.StudentAttendence;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterPage
 */
@WebServlet("/RegisterPage")
public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Dao daoObject;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterPage() {
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
		StudentAttendence StudentObject = new StudentAttendence();
		StudentObject.setFirstname(request.getParameter("fname"));
		StudentObject.setLastname(request.getParameter("lname"));
		StudentObject.setUsername(request.getParameter("uname"));
		StudentObject.setPassword(request.getParameter("pwd"));
		int returnval=this.daoObject.Register(StudentObject);
		if(returnval>0)
		{
			response.sendRedirect("SuccessfullyRegistered.jsp");
		}
		
	}

}
