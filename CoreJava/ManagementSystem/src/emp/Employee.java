package emp;

public class Employee 
{
	public String first_name, last_name, email, phone;
	
	public Employee() 
	{
		this.first_name = "";
		this.last_name = "";
		this.email = "";
		this.phone = "";
	}
	
	public void setValues(String fname, String lname, String email, String phone)
	{
		this.first_name = fname;
		this.last_name = lname;
		this.email = email;
		this.phone = phone;
	}
	
	public void getValues()
	{
		System.out.println("\tFirstName is : " + this.first_name);
		System.out.println("\tLastName is : " + this.last_name);
		System.out.println("\tEmail Id is : " + this.email);
		System.out.println("\tPhone Number is : " + this.phone);
	}
	
}
