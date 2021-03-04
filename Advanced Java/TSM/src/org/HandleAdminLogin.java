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
 * Servlet implementation class HandleAdminLogin
 */

@WebServlet("/HandleAdminLogin")

public class HandleAdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleAdminLogin() {
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
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		int res = 0;
		try {
			DBAccess db = new DBAccess();
			res = db.AdminLogin(email, password);
			
//			Cookie
//			Cookie email_cookie = new Cookie("email", email);
//			email_cookie.setMaxAge(60*10);
//			response.addCookie(email_cookie);
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res>0)
		{
//			Session
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			
			request.setAttribute("admin",email);
			RequestDispatcher rd = request.getRequestDispatcher("/admin-home.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Email or Password is Worng");
			RequestDispatcher rd = request.getRequestDispatcher("/adminlogin.jsp");
			rd.forward(request, response);
		}
		
	}

}
