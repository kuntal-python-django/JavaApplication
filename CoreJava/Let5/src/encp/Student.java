package encp;

public class Student 
{
	private int roll, age;
	public String name;
	
	public Student() 
	{
		this.roll = 0;
		this.age = 0;
		this.name = "Unknown";
		System.out.println("Value Set");
	}
	
	private void setRoll(int roll)
	{
		this.roll = roll;
	}
	
	protected void setAge(int age)
	{
		this.age = age;
	}
	
	public void setData(int roll, int age, String name)
	{
		this.name = name;
		this.setRoll(roll);
		this.setAge(age);
	}
	
	public void ShowData()
	{
		System.out.println(this.roll + " " + this.age + " " + this.name);
	}
	

}
