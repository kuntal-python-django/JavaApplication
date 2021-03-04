package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.*;

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
	
	
	public int admin_login(String name, String password) throws SQLException
	{
		String query = "select * from admin where name = ? and password = ?";
		PreparedStatement preparedStmt = connect.prepareStatement(query);
		preparedStmt.setString(1, name);
		preparedStmt.setString(2, password);
		ResultSet rs = preparedStmt.executeQuery();
		if(rs.next())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	
	
}
