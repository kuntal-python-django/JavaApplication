package poly;

public class Static_Poly 
{
	void m1(int n)
	{
		System.out.println(n);
	}
	
	void m1(int n, int m)
	{
		System.out.println(n + " " + m);
	}
	
	void m1(String s)
	{
		System.out.println(s);
	}
	
	void m1(String s, String t)
	{
		System.out.println(s + " " + t);
	}
	
	public static void main(String[] args)
	{
		Static_Poly obj = new Static_Poly();
		obj.m1(5);
		obj.m1(5, 6);
		obj.m1("Kuntal");
		obj.m1("Alex" , "Doe");
	}

}
