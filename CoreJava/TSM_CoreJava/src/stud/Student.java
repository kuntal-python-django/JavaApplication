package stud;

import emp.Employee;

public class Student extends Employee
{
	public String course_name, batch_time;
	public double fees;
	
	public Student() 
	{
		super();
		this.course_name = "";
		this.batch_time = "";
		this.fees = 0.0;
	}
	
	public void setValues(String fname, String lname, String email, String phone, String course_name, double fees, String batch_time)
	{
		super.setValues(fname, lname, email, phone);
		this.course_name = course_name;
		this.fees = fees;
		this.batch_time = batch_time;
	}
	
	public void getValues()
	{
		super.getValues();
		System.out.println("\tCourse Name is = " + course_name);
		System.out.println("\tFees is = " + this.fees);
		System.out.println("\tBatch Time is : " + this.batch_time);
	}
	
}
