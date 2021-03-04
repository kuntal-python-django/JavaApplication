package org;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class DBAccess 
{
	private Connection connect = null;
//    private Statement statement = null;
//    private PreparedStatement preparedStatement = null;
//    private ResultSet resultSet = null;
   
	private String JdbcURL = "jdbc:mysql://localhost:3306/db10?" + "autoReconnect=true&useSSL=false";
	private String dbuser="root",dbpass="12345";
	
	public DBAccess() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection(JdbcURL, dbuser, dbpass);
        System.out.println("DB IS Connected Successfully 111!!");
	}
	
	
	public int AdminLogin(String email, String password) throws SQLException
	{
		String query = "select * from admin where email = ? and password = ?";
		PreparedStatement preparedStmt = connect.prepareStatement(query);
		preparedStmt.setString(1, email);
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
	
	
	public int CreateStudent(String firstname, String lastname, String email, String phone, String course, 
			String address, Date dob, String education, String password) throws SQLException
	{
		java.sql.Date sql_dob = new java.sql.Date(dob.getTime());
		int approved = 0;
		
		String query = "insert into Student(firstname, lastname, email, phone, course, address, dob, "
				+ "education, password, approved)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    	PreparedStatement preparedStmt = connect.prepareStatement(query);
    	preparedStmt.setString(1, firstname);
    	preparedStmt.setString(2, lastname);
    	preparedStmt.setString(3, email);
    	preparedStmt.setString(4, phone);
    	preparedStmt.setString(5, course);
    	preparedStmt.setString(6, address);
    	preparedStmt.setDate(7, sql_dob);
    	preparedStmt.setString(8, education);
    	preparedStmt.setString(9, password);
		preparedStmt.setInt(10, approved);
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
	
	public int CreateTeacher(String firstname, String lastname, String phone, String email, String subject, String qualification,
			String address, Date dob, int experience, String hobby, String additional_qualification, String password) throws SQLException
	{
		java.sql.Date sql_dob = new java.sql.Date(dob.getTime());
		int approved = 0;
		
		String query = "insert into Teacher(firstname, lastname, phone, email, subject, qualification, "
				+ "address, dob, experience, hobby, additional_qualification, password, approved)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStmt = connect.prepareStatement(query);
		preparedStmt.setString(1, firstname);
		preparedStmt.setString(2, lastname);
		preparedStmt.setString(3, phone);
		preparedStmt.setString(4, email);
		preparedStmt.setString(5, subject);
		preparedStmt.setString(6, qualification);
		preparedStmt.setString(7, address);
		preparedStmt.setDate(8, sql_dob);
		preparedStmt.setInt(9, experience);
		preparedStmt.setString(10, hobby);
		preparedStmt.setString(11, additional_qualification);
		preparedStmt.setString(12, password);
		preparedStmt.setInt(13, approved);
		int n = preparedStmt.executeUpdate();
    	if(n > 0)
    	{
    		System.out.println("11111111111111111");
    		return 1;
    	}
    	else
    	{
    		System.out.println("0000000000000000000");
    		return 0;
    	}
	}
	
	
	public LinkedList<TeacherPOJO> GetAllTeacher() throws SQLException
	{
		LinkedList<TeacherPOJO> list = null;
		list = new LinkedList<TeacherPOJO>();
		
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Teacher");
		while(rs.next())
        {
			java.sql.Date sql_dob = rs.getDate(8);
			java.util.Date java_dob = null;
			String strDate = "";
			
			try 
			{
				java_dob = new java.util.Date(sql_dob.getTime());
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
                strDate = dateFormat.format(java_dob);  
				
			} catch (Exception e) {
				System.out.println("EXXX : " + e);
			}
			
			TeacherPOJO t = new TeacherPOJO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), 
					rs.getString(7), strDate, rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13), rs.getInt(14));
			list.add(t);
			
        }
		
		return list;
		
	}
	
	
	public LinkedList<StudentPOJO> GetAllStudent() throws SQLException
	{
		LinkedList<StudentPOJO> list = null;
		list = new LinkedList<StudentPOJO>();
		
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Student");
		while(rs.next())
        {
			java.sql.Date sql_dob = rs.getDate(7);
			java.util.Date java_dob = null;
			String strDate = "";
			
			try 
			{
				java_dob = new java.util.Date(sql_dob.getTime());
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
                strDate = dateFormat.format(java_dob);  
				
			} catch (Exception e) {
				System.out.println("EXXX : " + e);
			}
			
			StudentPOJO s = new StudentPOJO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), 
					rs.getString(6), strDate, rs.getString(8), rs.getString(9), rs.getInt(10), rs.getInt(11));
			list.add(s);
			
        }
		
		return list;
		
	}
	
	
	public int ApprovedStudent(int id) throws SQLException
	{
		String query = "update Student set approved = ? where id = ?";
		PreparedStatement preparedStmt = connect.prepareStatement(query);
		preparedStmt.setInt(1, 1);
		preparedStmt.setInt(2, id);
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
	
	
	public int ApprovedTeacher(int id) throws SQLException
	{
		String query = "update Teacher set approved = ? where id = ?";
		PreparedStatement preparedStmt = connect.prepareStatement(query);
		preparedStmt.setInt(1, 1);
		preparedStmt.setInt(2, id);
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
	
	
	public int CheckStatus(String table_name, String email) throws SQLException
	{
		String query = "";
		if (table_name.compareToIgnoreCase("Student")==0)
		{
			query = "select * from Student where email = ?";
		}
		if(table_name.compareToIgnoreCase("Teacher")==0)
		{
			query = "select * from Teacher where email = ?";
		}
		PreparedStatement preparedStmt = connect.prepareStatement(query);
		preparedStmt.setString(1, email);
		ResultSet rs = preparedStmt.executeQuery();
		int status = 0;
		while(rs.next())
		{
			if (table_name.compareToIgnoreCase("Student")==0)
			{
				if(rs.getInt(10)==1)
				{
					status = 1;
				}
				else
				{
					status = 0;
				}
			}
			if(table_name.compareToIgnoreCase("Teacher")==0)
			{
				if(rs.getInt(13)==1)
				{
					status = 1;
				}
				else
				{
					status = 0;
				}
			}
		}
		
		return status;
	}
	
	
}
