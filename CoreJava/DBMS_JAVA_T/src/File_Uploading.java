import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class File_Uploading {

	public static void main(String[] args) throws SQLException, IOException 
	{
		String JdbcURL = "jdbc:mysql://localhost:3306/db1?" + "sessionVariables=sql_mode='NO_ENGINE_SUBSTITUTION'&jdbcCompliantTruncation=false";
		String Username = "root";
		String password = "12345";
		Connection con = null;
		// connection creation
		con = DriverManager.getConnection(JdbcURL, Username, password);
        System.out.println("Your JDBC URL is as follows:" + JdbcURL);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path : ");
        String path = sc.next();
        System.out.println("Enter File name : ");
        String fname = sc.next();
        
        // file object
        File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		//SET GLOBAL max_allowed_packet=268435456;
		PreparedStatement ps=con.prepareStatement("insert into image_table (name,image) values(?,?)"); 
		ps.setString(1, fname);
		ps.setBinaryStream(2,fis,(int)file.length());
		ps.executeUpdate();

		ps.close();
		fis.close();
		con.close();
        
		
		System.out.println("File Uploading done");
	}

}
