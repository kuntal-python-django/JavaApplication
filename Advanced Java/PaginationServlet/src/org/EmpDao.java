package org;

import org.*;
import java.sql.*;
import java.util.ArrayList;  
import java.util.List; 

public class EmpDao 
{
	public static Connection getConnection()
	{  
		String JdbcURL = "jdbc:mysql://localhost:3306/db2?" + "autoReconnect=true&useSSL=false";
		String Username = "root";
		String password = "12345";
        Connection con=null;
        
        try
        {  
        	Class.forName("com.mysql.jdbc.Driver");  // For Web
        	con = DriverManager.getConnection(JdbcURL, Username, password);
        	System.out.println("Your JDBC URL is as follows:" + JdbcURL);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }  
        return con;  
    }
	
	
	public static List<Emp> getRecords(int start,int total)
	{  
        List<Emp> list=new ArrayList<Emp>();  
        try
        {  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from emp limit "+(start-1)+","+total);  
            ResultSet rs = ps.executeQuery();  
            while(rs.next())
            {  
                Emp e = new Emp();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getFloat(3));
                list.add(e);  
            }  
            con.close();  
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }  
        return list;  
    }  
	
}
