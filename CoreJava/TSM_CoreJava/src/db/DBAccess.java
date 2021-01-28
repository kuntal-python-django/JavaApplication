package db;

import java.sql.*;
import run.AddData;
import run.ShowData;

public class DBAccess implements AddData, ShowData
{
	String JdbcURL, Username, password;
	Connection con;
	
	public DBAccess() 
	{
		this.JdbcURL = "jdbc:mysql://localhost:3306/db1?" + "autoReconnect=true&useSSL=false";
		this.Username = "root";
		this.password = "12345";
		this.con = null;
		try 
		{
			con = DriverManager.getConnection(JdbcURL, Username, password);
			System.out.println("Your JDBC URL is as follows:" + JdbcURL);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void showAllTeachers() 
	{
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Teachers");
			while(rs.next())
		    {
		       System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		    }
		}
		catch(Exception e)
		{
			System.out.println("No Record Found");
		}
		try {
			con.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void showAllStudents() 
	{
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Students");
			while(rs.next())
		    {
		       System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		    }
		}
		catch(Exception e)
		{
			System.out.println("No Record Found");
		}
		try {
			con.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Override
	public int addStudent(String fname, String lname, String email, String phone, String course_name, double fees, String batch_time) 
	{
		try
		{
			String query = "insert into Students" + " values (?, ?, ?, ?, ?, ?, ?)";
        	PreparedStatement preparedStmt = con.prepareStatement(query);
        	preparedStmt.setString(1, fname);
        	preparedStmt.setString(2, lname);
        	preparedStmt.setString(3, email);
        	preparedStmt.setString(4, phone);
        	preparedStmt.setString(5, course_name);
        	preparedStmt.setDouble(6, fees);
        	preparedStmt.setString(7, batch_time);
        	preparedStmt.executeUpdate();
			con.close();
			return 1;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	
	@Override
	public int addTeacher(String fname, String lname, String email, String phone, String department, String qualification) 
	{
		try
		{
			String query = "insert into Teachers" + " values (?, ?, ?, ?, ?, ?)";
        	PreparedStatement preparedStmt = con.prepareStatement(query);
        	preparedStmt.setString(1, fname);
        	preparedStmt.setString(2, lname);
        	preparedStmt.setString(3, email);
        	preparedStmt.setString(4, phone);
        	preparedStmt.setString(5, department);
        	preparedStmt.setString(6, qualification);
        	preparedStmt.executeUpdate();
			con.close();
			return 1;
		}
		catch(Exception e)
		{
			return 0;
		}
	}

	
}
