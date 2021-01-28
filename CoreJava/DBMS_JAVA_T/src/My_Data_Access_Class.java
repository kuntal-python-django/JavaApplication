import java.sql.*;
import java.util.Scanner;

public class My_Data_Access_Class
{
	static void insert_data(Connection con, Scanner sc) throws SQLException
	{	
		while(true)
		{
			System.out.println("Do you want to continue ? 1. Yes 2. No");
			int res = sc.nextInt();
			if(res==1)
			{
				System.out.println("Enter Firstname : ");
		        String fn = sc.next();
		        System.out.println("Enter Lastname : ");
		        String ln = sc.next();
		        System.out.println("Enter Roll : ");
		        int rl = sc.nextInt();
		        
		        String query = "insert into Student (firstname, lastname, roll)" + " values (?, ?, ?)";
		    	PreparedStatement preparedStmt = con.prepareStatement(query);
		    	preparedStmt.setString(1, fn);
		    	preparedStmt.setString(2, ln);
		    	preparedStmt.setInt(3, rl);
		    	preparedStmt.executeUpdate();
		        System.out.println("Data Inserted !!");
			}
			else
			{
				break;
			}
		}
	}
	
	static void update_data(Connection con, Scanner sc) throws SQLException
	{
		System.out.println("Enter Firstname : ");
        String fn = sc.next();
        System.out.println("Enter Lastname : ");
        String ln = sc.next();
        System.out.println("Enter Roll : ");
        int rl = sc.nextInt();
        
        String query = "update Student set firstname = ?, lastname = ? where roll = ?";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, fn);
        preparedStmt.setString(2, ln);
        preparedStmt.setInt(3, rl);
        preparedStmt.executeUpdate();
        
        System.out.println("Update done");
	}
	
	
	static void delete_data(Connection con, Scanner sc) throws SQLException
	{
		System.out.println("Enter Roll : ");
        int rl = sc.nextInt();
        
        String query = "delete from student where roll = ?";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setInt(1, rl);
        preparedStmt.executeUpdate();
        
        System.out.println("Delete done");
	}
	
	static void show_all_data(Connection con) throws SQLException
	{
		Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student");
        while(rs.next())
        {
        	System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
        con.close();
	}
	
	public static void main(String[] args) throws SQLException 
	{
		Scanner sc = new Scanner(System.in);
		
		String JdbcURL = "jdbc:mysql://localhost:3306/db1?" + "autoReconnect=true&useSSL=false";
		String Username = "root";
		String password = "12345";
		Connection con = null;
		
		// connection creation
		con = DriverManager.getConnection(JdbcURL, Username, password);
        System.out.println("Your JDBC URL is as follows:" + JdbcURL);
		
        // Insert data
//        insert_data(con, sc);
        
        // update
//        update_data(con, sc);
        
        // delete
//        delete_data(con, sc);
        
        // show all data
        show_all_data(con);
	}
}
