package mulpi;

public class C implements A, B {
	
	public void setName(String x) 
	{
		System.out.println("Vlaue is : " + this.name);
		System.out.println("Given Name is : " + x);
	}

	public void getName() 
	{
		System.out.println("Get Name");
	}

	public static void main(String[] args) 
	{
		C obj = new C();
		obj.setName("Kuntal");
		obj.getName();
	}

}
