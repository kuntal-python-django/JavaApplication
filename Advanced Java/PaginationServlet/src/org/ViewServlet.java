package org;

import org.Emp;
import org.EmpDao;
import java.io.IOException;
import java.io.PrintWriter;  
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        int pageidpageid = 0;
          
        String spageid=request.getParameter("page");  
        int pageid=Integer.parseInt(spageid);  
        int total=5;  
        if(pageid==1)
        {
        	
        }
        else
        {  
            pageidpageid=pageid-1;
            pageidpageid=pageid*total+1;
        }  
        List<Emp> list=EmpDao.getRecords(pageid,total);  
  
        out.print("<h1>Page No: "+spageid+"</h1>");  
        out.print("<table border='1' cellpadding='4' width='60%'>");  
        out.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");  
        for(Emp e:list)
        {  
            out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");  
        }  
        out.print("</table>");
        
        for(int i=1; i<=list.size(); i++)
        {
        	String links = "<a href='ViewServlet?page=" + i +" '>" + i +"</a>";
        	out.print(links);
        }
        
          
        out.close();  
		
	}

}
