package clsobj;


public class Student 
{
	String name;
	int roll;
	String cls;
	
	public Student()
	{
		System.out.println("Objected Created");
		this.name = "";
		this.roll = 0;
		this.cls = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}
	

}
