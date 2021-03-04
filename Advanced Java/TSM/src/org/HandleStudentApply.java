package org;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandleStudentApply
 */
@WebServlet("/HandleStudentApply")
public class HandleStudentApply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleStudentApply() {
        super();
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String course = request.getParameter("course");
		String address = request.getParameter("address");
		String education = request.getParameter("education");
		String password = request.getParameter("password");
		String bday = request.getParameter("dob");
		
		Date dob = null;
		int n = 0;
		try
		{
			dob = new SimpleDateFormat("dd/MM/yyyy").parse(bday);
		}
		catch (ParseException e1) 
		{
			e1.printStackTrace();
		}
		
		try
		{
			DBAccess db = new DBAccess();
			n = db.CreateStudent(firstname, lastname, email, phone, course, address, dob, education, password);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		if(n > 0)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/home.html");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/student-apply.jsp");
			rd.forward(request, response);
		}
	}

}
