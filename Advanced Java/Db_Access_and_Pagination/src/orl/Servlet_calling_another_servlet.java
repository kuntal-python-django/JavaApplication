package orl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_calling_another_servlet
 */
@WebServlet("/Servlet_calling_another_servlet")
public class Servlet_calling_another_servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public Servlet_calling_another_servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("###############################");
		
		// servlet to jsp
		RequestDispatcher rd = request.getRequestDispatcher("/out_servletwithjsp.jsp");
		rd.forward(request, response);
	}

}
