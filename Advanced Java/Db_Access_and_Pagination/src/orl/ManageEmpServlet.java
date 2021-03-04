package orl;

import orl.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ManageEmpServlet")
public class ManageEmpServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
    public ManageEmpServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
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
		
		out.print("<h1> Employee List</h1>");  
        out.print("<table border='1' cellpadding='4' width='60%'>");  
        out.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");  
        for(Emp e : list)  // for each
        {  
            out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");  
        }  
        out.print("</table>");
		
		
	}

}
