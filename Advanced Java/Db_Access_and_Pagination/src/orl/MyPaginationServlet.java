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

@WebServlet("/MyPaginationServlet")
public class MyPaginationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyPaginationServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		int start = 0, end = 2;
		String spageid=request.getParameter("page");
		int pageid = Integer.parseInt(spageid);
		
		if(pageid == 1)
		{
			start = pageid - 1;
		}
		else
		{
			start = pageid;
		}
		
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
			list =  db.get_all_emp(start, end);
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
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getSalary() + "</td></tr>");  
        }  
        out.print("</table>");
        
        for(int i = start+1; i<= start+2; i++)
        {
        	String links = "<a href='/Db_Access_and_Pagination/MyPaginationServlet?page=" + i +" '>" + i +"</a>";
        	out.print(links);
        }
		
	}

}
