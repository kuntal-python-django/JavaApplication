package encapsulation;

public class Encapsulate_Example1 
{
	public int num;
	private String name;
	protected int age;
	
	public Encapsulate_Example1() 
	{
		this.num = 0;
		this.name = "";
		this.age = 18;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
