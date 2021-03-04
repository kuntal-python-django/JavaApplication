package orl;

import orl.*;
import java.sql.*;
import java.util.*;

public class DbAccess
{
	String JdbcURL, Username, password;
	Connection con;
	
	public DbAccess() throws ClassNotFoundException, SQLException 
	{
		this.JdbcURL = "jdbc:mysql://localhost:3306/db100?" + "autoReconnect=true&useSSL=false";
		this.Username = "root";
		this.password = "12345";
		this.con = null;
		Class.forName("com.mysql.jdbc.Driver");  // For Web
		con = DriverManager.getConnection(JdbcURL, Username, password);
		System.out.println("Your JDBC URL is as follows:" + JdbcURL);
	}
	
	
	public ArrayList<Emp> get_all_emp() throws SQLException 
	{
		ArrayList<Emp> list = new ArrayList<Emp>();
		// Fetching Data from DB
		String query = "select * from emp"; 
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next())
        {
			Emp o = new Emp();
			o.setId(rs.getInt(1));
			o.setName(rs.getString(2));
			o.setSalary(rs.getFloat(3));
			list.add(o);
        }
		return list;
	}
	
	
	public ArrayList<Emp> get_all_emp(int start, int end) throws SQLException 
	{
		ArrayList<Emp> list = new ArrayList<Emp>();
		// Fetching Data from DB
		String query = "select * from emp limit " + start + "," + end;
		PreparedStatement preparedStmt = con.prepareStatement(query);
		ResultSet rs = preparedStmt.executeQuery(query);
		while(rs.next())
        {
			Emp o = new Emp();
			o.setId(rs.getInt(1));
			o.setName(rs.getString(2));
			o.setSalary(rs.getFloat(3));
			list.add(o);
        }
		return list;
	}
	
	
	
}
