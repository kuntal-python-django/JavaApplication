package org;

import java.util.Scanner;
import java.sql.*;

public class DBAccess 
{

	public static void main(String[] args) 
	{
		String JdbcURL = "jdbc:mysql://localhost:3306/ICSS?" + "autoReconnect=true&useSSL=false";
		   String Username = "root";
		   String password = "12345";
		   Connection con = null;
		     try 
		     {
		    	Scanner sc = new Scanner(System.in);
		        con = DriverManager.getConnection(JdbcURL, Username, password);
		        System.out.println("Your JDBC URL is as follows:" + JdbcURL);
		       
//		    	1. DATA INSERT
//		        Statement st = con.createStatement(); 
//	            st.executeUpdate("INSERT INTO Student " + 
//	            "VALUES (100, 'Simpson', 'Spring')"); 
		        
//		        Multi Value Insert
		        int i = 0;
		        while(i<3)
		        {
		        	System.out.println("Enter Roll : ");
		        	int roll = sc.nextInt();
		        	System.out.println("Enter Name : ");
		        	String name = sc.next();
		        	System.out.println("Enter Address : ");
		        	String address = sc.next();
		        	String query = "insert into Student" + " values (?, ?, ?)";
		        	PreparedStatement preparedStmt = con.prepareStatement(query);
		        	preparedStmt.setInt(1, roll);
		        	preparedStmt.setString(2, name);
		        	preparedStmt.setString(3, address);
		        	preparedStmt.executeUpdate();
		            System.out.println("Data Inserted !!");
		        }
		        
		        
	     
//		        2. UPDATE DATA
//		        String query = "update Student set roll = ? where name = ?";
//		        PreparedStatement preparedStmt = con.prepareStatement(query);
//		        preparedStmt.setInt   (1,4);
//		        preparedStmt.setString(2, "simpson");
//		        preparedStmt.executeUpdate();

		        
//		        3. DELETE
//		        String query = "DELETE FROM Student where name = ?";
//		        PreparedStatement preparedStmt = con.prepareStatement(query);
//		        preparedStmt.setString(1, "simpson");
//		        preparedStmt.executeUpdate();

		        
//		        4. Show All Data
//		        java.sql.Statement stmt = con.createStatement();
//		        java.sql.ResultSet rs = stmt.executeQuery("select * from Student");
//		        while(rs.next())
//		        {
//		        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
//		        }
		        
		        
		        con.close();
		       
		       
		     } catch (Exception exec) {
		        exec.printStackTrace();
		     }
	}

}
