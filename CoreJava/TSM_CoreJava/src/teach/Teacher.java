package teach;

import emp.Employee;

public class Teacher extends Employee 
{
	public String department, qualification;
	
	public Teacher() 
	{
		super();
		this.department = "";
		this.qualification = "";
	}
	
	public void setValues(String fname, String lname, String email, String phone, String department, String qualification)
	{
		super.setValues(fname, lname, email, phone);
		this.department = department;
		this.qualification = qualification;
	}
	
	public void getValues()
	{
		super.getValues();
		System.out.println("\tDepartment is : " + this.department);
		System.out.println("\tQualification is : " + this.qualification);
	}

}
