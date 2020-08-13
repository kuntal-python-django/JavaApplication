package org;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandleTrackApplication
 */
@WebServlet("/HandleTrackApplication")
public class HandleTrackApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleTrackApplication() {
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
		String roll = request.getParameter("roll");
		int res = 0;
		try 
		{
			DBAccess db = new DBAccess();
			res = db.CheckStatus(roll, email);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res > 0)
		{
			request.setAttribute("trackmsg", "Your Application is approved Now Try for Login");
			RequestDispatcher rd = request.getRequestDispatcher("/TrackMessage.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("trackmsg", "Application Pending !! Please Wait...");
			RequestDispatcher rd = request.getRequestDispatcher("/TrackMessage.jsp");
			rd.forward(request, response);
		}
		
	}

}
