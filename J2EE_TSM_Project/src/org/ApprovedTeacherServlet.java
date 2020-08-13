package org;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApprovedTeacherServlet
 */
@WebServlet("/ApprovedTeacherServlet")
public class ApprovedTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApprovedTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id = request.getParameter("id");
		int id_int = Integer.parseInt(id);
		int res = 0;
		try 
		{
			DBAccess db = new DBAccess();
			res = db.ApprovedTeacher(id_int);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		String email = "";
//		if( cookies != null )
//		{
//			cookie = cookies[0];
//			System.out.println("cookie" + cookie.getName() + " " + cookie.getValue());
//			email = cookie.getName();
//			
//		}
		
		HttpSession session = request.getSession();
		email = (String) session.getAttribute("email");
		System.out.println("email : "+ email);
		
		request.setAttribute("admin",email);
		RequestDispatcher rd = request.getRequestDispatcher("/admin-home.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
