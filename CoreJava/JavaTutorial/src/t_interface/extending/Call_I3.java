package t_interface.extending;
import t_interface.extending.I3;


public class Call_I3 implements I3
{
	@Override
	public void m1() 
	{
		System.out.println("I am in M1");
	}

	@Override
	public void m3() 
	{
		System.out.println("I am in M3");
	}
	
	public static void main(String[] args) 
	{
		Call_I3 obj = new Call_I3();
		obj.m1();
		obj.m3();
	}

}
