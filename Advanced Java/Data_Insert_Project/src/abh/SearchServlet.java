package abh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String query = request.getParameter("query");
		String hid = request.getParameter("hid");
		System.out.println("Query : " + query + " Hidden : " + hid);
		
		String ipadd = request.getLocalAddr();
		String host = request.getRemoteHost();
		System.out.println("Ip : " + ipadd);
		System.out.println("Host : " + host);
		
		response.sendRedirect("success.jsp");	
	}

}
