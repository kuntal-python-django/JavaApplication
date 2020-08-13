package run;
import emp.*;
import stud.*;
import teach.*;
import db.*;

import java.util.Scanner;

public class MyMain
{	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1 -> Student List");
			System.out.println("2 -> Add Student");
			System.out.println("3 -> Teacher List");
			System.out.println("4 -> Add Teacher");
			System.out.print("Enter your choice : ");
			int n = sc.nextInt();
			if(n==1)
			{
				DBAccess da = new DBAccess();
				da.showAllStudents();
			}
			else if(n==2)
			{
				DBAccess da = new DBAccess();
				System.out.print("Enter Firstname : ");
				String fname = sc.next();
				System.out.print("Enter lastname : ");
				String lname = sc.next();
				System.out.print("Enter Email : ");
				String email = sc.next();
				System.out.print("Enter Phone : ");
				String phone = sc.next();
				System.out.print("Enter Course Name : ");
				String course_name = sc.next();
				System.out.print("Enter Course Fees : ");
				double fees = sc.nextDouble();
				System.out.print("Enter Batch Time : ");
				String batch_time = sc.next();
				int res = da.addStudent(fname, lname, email, phone, course_name, fees, batch_time);
				Student s = new Student();
				s.setValues(fname, lname, email, phone, course_name, fees, batch_time);
				if(res == 1)
				{
					System.out.println("-------- Data Inserted Successfully ----------");
					s.getValues();
					System.out.println("------------------ Record --------------------");
				}
				else
				{
					System.out.println("Somethings Went Worng");
				}
			}
			else if(n==3)
			{
				DBAccess da = new DBAccess();
				da.showAllTeachers();
			}
			else if(n==4)
			{
				DBAccess da = new DBAccess();
				System.out.print("Enter Firstname : ");
				String fname = sc.next();
				System.out.print("Enter lastname : ");
				String lname = sc.next();
				System.out.print("Enter Email : ");
				String email = sc.next();
				System.out.print("Enter Phone : ");
				String phone = sc.next();
				System.out.println("Enter Department : ");
				String department = sc.next();
				System.out.println("Enter Qalification : ");
				String qualification = sc.next();
				int res = da.addTeacher(fname, lname, email, phone, department, qualification);
				Teacher t = new Teacher();
				t.setValues(fname, lname, email, phone, department, qualification);
				if(res == 1)
				{
					System.out.println("Data Inserted Successfully");
					t.getValues();
					System.out.println("--------- Record -----------");
				}
				else
				{
					System.out.println("Somethings Went Worng");
				}
			}
			else
			{
				break;
			}
		}
		
		System.out.println("Thank You !!");

	}

}
