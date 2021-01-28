package t_thread;

public class Static_Example_Class 
{
	static void m1()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
	
	void m2()
	{
		System.out.println("10");
		System.out.println("11");
		System.out.println("12");
		System.out.println("13");
		System.out.println("14");
	}
	
	public static void main(String[] args) 
	{
		Static_Example_Class o = new Static_Example_Class();
		o.m2();
		
		m1();
	}

}
