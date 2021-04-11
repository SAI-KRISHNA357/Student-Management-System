package com.StudentAttendence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class IndexPage
 */
@WebServlet("/IndexPage")
public class IndexPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static Dao daoObject;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexPage() {
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
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		StudentAttendence StudentObject = new StudentAttendence();
		StudentObject.setUsername(request.getParameter("uname"));
		StudentObject.setPassword(request.getParameter("pwd"));
		StudentAttendence returnval = daoObject.Login(StudentObject);
		if(returnval!=null)
		{
			ArrayList<StudentAttendence> returnObject =(ArrayList<StudentAttendence>) daoObject.RegisterValues(StudentObject.getUsername());
			if(returnObject!=null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("values", returnObject);
				session.setAttribute("value1", returnval);
				RequestDispatcher rd=request.getRequestDispatcher("/Dashboard.jsp");
				rd.forward(request, response);

			}
			
		}
		else
		{
			response.sendRedirect("InvalidLogin.jsp");;
		}
		
}
	public static void delete(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, ServletException, IOException
	{
		HttpSession session=request.getSession();
		String val1 = request.getParameter("id");
		String val2 = request.getParameter("id1");
		ArrayList<StudentAttendence> returndel = daoObject.Delete(val1,val2);
		session.setAttribute("values", returndel);
		RequestDispatcher rd=request.getRequestDispatcher("/Dashboard.jsp");
		rd.forward(request, response);
		
	} 
	public static  StudentAttendence Update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String val = request.getParameter("id");
		StudentAttendence returnupd = (StudentAttendence) Dao.Update(val);
		RequestDispatcher rd=request.getRequestDispatcher("/EditPage.jsp");
		rd.forward(request, response);
		return returnupd;
		
	}
	
}
	
