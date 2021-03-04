package org;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Download
 */
@WebServlet("/Download")
public class Download extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Download() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String JdbcURL = "jdbc:mysql://localhost:3306/db100?" + "autoReconnect=true&useSSL=false";
		String dbuser="root",dbpass="12345";
		Connection connect = null;
		
		String a = "download.jpg";
		String sql = "select * from myimage where id=" + 1;
		System.out.println(sql);
		
		try{
			
			String imgpath = "A:\\Java\\" + a;
			
			Class.forName("com.mysql.jdbc.Driver");
	        connect = DriverManager.getConnection(JdbcURL, dbuser, dbpass);
	        System.out.println("DB IS Connected Successfully 111!!");
	        
			PreparedStatement ps = connect.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
						
			while(rs.next())
			{
				Blob b=rs.getBlob(2);
				byte barr[]=new byte[(int)b.length()];//an array is created but contains no data
				barr=b.getBytes(1,(int)b.length());
							
				FileOutputStream fout=new FileOutputStream(imgpath);
				fout.write(barr);
						    
				fout.close();
				System.out.println("image copied ok----->okay");
			}
			
			connect.close();
						
			}catch (Exception e) {e.printStackTrace();	}
		
		PrintWriter out = response.getWriter();
		out.print("AAAAAAAAAA");
	}

}
