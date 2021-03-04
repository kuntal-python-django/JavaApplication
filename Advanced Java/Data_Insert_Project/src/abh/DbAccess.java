package abh;

import abh.*;
import java.sql.*;


public class DbAccess 
{
	String JdbcURL, Username, password;
	Connection connect;
	
	public DbAccess() throws ClassNotFoundException, SQLException 
	{
		this.JdbcURL = "jdbc:mysql://localhost:3306/db100?" + "autoReconnect=true&useSSL=false";
		this.Username = "root";
		this.password = "12345";
		this.connect = null;
		Class.forName("com.mysql.jdbc.Driver");  // For Web
		connect = DriverManager.getConnection(JdbcURL, Username, password);
		System.out.println("Your JDBC URL is as follows:" + JdbcURL);
	}
	
	public int insert_my_data(int id, String name, float salary) throws SQLException
	{
		String query = "insert into emp values (?, ?, ?)";
		PreparedStatement preparedStmt = connect.prepareStatement(query);
		preparedStmt.setInt(1, id);
		preparedStmt.setString(2, name);
		preparedStmt.setFloat(3, salary);
		int n = preparedStmt.executeUpdate();
		if(n > 0)
    	{
    		return 1;
    	}
    	else
    	{
    		return 0;
    	}
	}
	
}
