package org;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApprovedStudentServlet
 */
@WebServlet("/ApprovedStudentServlet")
public class ApprovedStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApprovedStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		Cookie cookie = null;
	    Cookie[] cookies = null;
		cookies = request.getCookies();
//		System.out.println("cookies1 : " + cookies);
//		System.out.println(cookies[0].getName() + cookies[0].getMaxAge());
		
		String id = request.getParameter("id");
		int id_int = Integer.parseInt(id);
		int res = 0;
		try 
		{
			DBAccess db = new DBAccess();
//			res = db.ApprovedStudent(id_int);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		String email = "";

		
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
