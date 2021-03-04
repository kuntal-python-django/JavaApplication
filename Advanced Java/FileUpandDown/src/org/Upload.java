package org;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/Upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
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
		String JdbcURL = "jdbc:mysql://localhost:3306/db100?" + "autoReconnect=true&useSSL=false";
		String dbuser="root",dbpass="12345";
		Connection connect = null;
		PreparedStatement psmnt = null;
		FileInputStream fis;
		
		String saveFile="";
		String contentType = request.getContentType();
		System.out.println("contentType :" + contentType);
		
		
		DataInputStream in = new DataInputStream(request.getInputStream());
		int formDataLength = request.getContentLength();
		System.out.println("formDataLength : " + formDataLength);

		byte dataBytes[] = new byte[formDataLength];
		int byteRead = 0;
		int totalBytesRead = 0;

		while(totalBytesRead < formDataLength){
		byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
		totalBytesRead += byteRead;
		}

		String file = new String(dataBytes);
		saveFile = file.substring(file.indexOf("filename=\"") + 10);
		saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
		saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
		int lastIndex = contentType.lastIndexOf("=");
		String boundary = contentType.substring(lastIndex + 1,contentType.length());
		int pos;
		pos = file.indexOf("filename=\"");
		pos = file.indexOf("\n", pos) + 1;
		pos = file.indexOf("\n", pos) + 1;
		pos = file.indexOf("\n", pos) + 1;
		int boundaryLocation = file.indexOf(boundary, pos) - 4;
		int startPos = ((file.substring(0, pos)).getBytes()).length;
		int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
		File ff = new File(saveFile);
		FileOutputStream fileOut = new FileOutputStream(ff);
		fileOut.write(dataBytes, startPos, (endPos - startPos));
		fileOut.flush();
		fileOut.close();
		
		System.out.println("uploaded file is------>:"+saveFile);
		
		try 
		{
			System.out.println("seeting value reg into a1 table");
			Class.forName("com.mysql.jdbc.Driver");
	        connect = DriverManager.getConnection(JdbcURL, dbuser, dbpass);
	        System.out.println("DB IS Connected Successfully 111!!");
	        
	        File f = new File(saveFile);
	        psmnt = connect.prepareStatement("insert into myimage values(?,?)");  //name -- image
	        fis = new FileInputStream(f);
	        
	        psmnt.setInt(1, 1);
	        psmnt.setBinaryStream(2, (InputStream)fis, (int)(f.length()));
	        
	        int s = psmnt.executeUpdate();
			if(s>0)
			{
				System.out.println("Uploaded successfully !");
			}
			else
			{
				System.out.println("Error!");
			}
	        
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		out.println("HHHHHHHHHHHHHHHHH");
//		RequestDispatcher rd = request.getRequestDispatcher("/Download");
//		rd.forward(request, response);

	}

}
