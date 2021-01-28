package multiple_inhe;
import multiple_inhe.A;
import multiple_inhe.B;


public class Another_Approach implements A, B
{
	@Override
	public void m3() 
	{
		System.out.println("I am in M3");
	}

	@Override
	public String m4() 
	{
		String name = "Kuntal";
		return name;
	}

	@Override
	public void m1() 
	{
		System.out.println("I am in M1");
	}

	@Override
	public int m2() 
	{
		int ret = 60;
		return ret;
	}
	
	public static void main(String[] args) 
	{
		Another_Approach obj = new Another_Approach();
		obj.m1();
		obj.m3();
		
		System.out.println(obj.m2());
		
	}

}
