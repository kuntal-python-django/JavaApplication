package orl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import orl.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServetwithJSP
 */
@WebServlet("/ServetwithJSP")
public class ServetwithJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServetwithJSP() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
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
		
		// Call Method
		ArrayList<Emp> list = null;
		try 
		{
			list =  db.get_all_emp();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		// sending data to jsp
		request.setAttribute("List", list);
		
		// servlet to jsp
		/*
		RequestDispatcher rd = request.getRequestDispatcher("/out_servletwithjsp.jsp");
		rd.forward(request, response);
		*/
		
		// servlet to servlet
		RequestDispatcher rd = request.getRequestDispatcher("/Servlet_calling_another_servlet");
		rd.forward(request, response);
		
	}

}
