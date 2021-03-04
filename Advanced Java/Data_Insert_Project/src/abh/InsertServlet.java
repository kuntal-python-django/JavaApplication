package abh;

import abh.*;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public InsertServlet() 
    {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float salary = Float.parseFloat(request.getParameter("salary"));
		
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
			n = db.insert_my_data(id, name, salary);
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = null;
		if(n > 0)
		{
			// data inserted
			rd = request.getRequestDispatcher("/success.jsp");
			rd.forward(request, response);
		}
		else
		{
			// not inserted
			rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
		 
	}

}
