import java.io.*;
import java.sql.*;

public class File_Downloading {

	public static void main(String[] args) throws SQLException, IOException 
	{
		String JdbcURL = "jdbc:mysql://localhost:3306/db1?" + "autoReconnect=true&useSSL=false";
		String Username = "root";
		String password = "12345";
		Connection con = null;
		
		// connection creation
		con = DriverManager.getConnection(JdbcURL, Username, password);
        System.out.println("Your JDBC URL is as follows:" + JdbcURL);
        
        
        File file = new File("A:\\Java\\Java_Image\\mob123468.png");
		FileOutputStream fos = new FileOutputStream(file);
		byte b[];
		Blob blob;
		
		PreparedStatement ps=con.prepareStatement("select * from image_table"); 
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
			blob=rs.getBlob("image");
			b=blob.getBytes(1,(int)blob.length());
			fos.write(b);
		}
		
		ps.close();
		fos.close();
		con.close();
        
		
		System.out.println("Your file is ready");
	}

}
