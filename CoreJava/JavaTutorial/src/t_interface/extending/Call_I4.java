package t_interface.extending;
import t_interface.extending.I4;

public class Call_I4 implements I4
{
	@Override
	public void m1() 
	{
		System.out.println("I am in M1");
	}

	@Override
	public void m2() 
	{
		System.out.println("I am in M2");
	}

	@Override
	public void m4() 
	{
		System.out.println("I am in M4");
	}
	
	public static void main(String[] args) 
	{
		Call_I4 obj = new Call_I4();
		obj.m1();
		obj.m2();
		obj.m4();
	}
}
