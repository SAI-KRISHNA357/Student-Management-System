package com.StudentAttendence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EditPage
 */
@WebServlet("/EditPage")
public class EditPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Dao daoObject;
	 StudentAttendence StudentObject = new StudentAttendence();
	  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPage() {
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
	 * @return 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentObject.setId(request.getParameter("id"));
		StudentObject.setLname(request.getParameter("Lname"));
		StudentObject.setBranch(request.getParameter("branch"));
		StudentObject.setYear(request.getParameter("year"));
		StudentObject.setSection( request.getParameter("section"));
		StudentObject.setSubject(request.getParameter("subject"));
		//ArrayList<String> loopval = new ArrayList<String>();
		String[] absent   =request.getParameterValues("Absent");
		
		String listString="";

		  for (String s : absent)
		  {
			 System.out.println(s);
		      listString += s + "\t";
		  }

		  System.out.println(listString);
		StudentObject.setAbsent(listString);
		
		ArrayList<StudentAttendence> returnval = null;
		try {
			returnval = daoObject.UpdateUser(StudentObject);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(returnval!=null)
		{
			
		
			if(returnval!=null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("values",returnval);
				RequestDispatcher rd= request.getRequestDispatcher("/Dashboard.jsp");
				rd.forward(request, response);
			}
		}
		else {
			System.out.println(returnval);
		}
		
	
		
	}


	

}
