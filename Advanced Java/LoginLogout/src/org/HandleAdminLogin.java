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

import org.*;

@WebServlet("/HandleAdminLogin")
public class HandleAdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HandleAdminLogin() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("uname");
		String psw = request.getParameter("psw");
		
		// Object Creation
		DbAccess db = null;
		try 
		{
			db = new DbAccess();
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		int n = 0;
		try 
		{
			n = db.admin_login(name, psw);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		if(n>0)
		{
			// success
			HttpSession session = request.getSession();
			session.setAttribute("is_login", name);
			
			// request data seting
			request.setAttribute("admin_name", name);
			
			// Cookies
			Cookie ck = new Cookie("mycookie1", "cookie_value_1");//creating cookie object
//			ck.setMaxAge(60*1);
			response.addCookie(ck);
			
			RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
			rd.forward(request, response);	
		}
		else
		{
			// error
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
	}
	
}
