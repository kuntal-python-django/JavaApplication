package multiple_inhe;
import multiple_inhe.A;

public class Implements_A implements A
{

	@Override
	public void m1() 
	{
		System.out.println("I am in M1 ");
	}

	@Override
	public int m2() 
	{
		int ret = 60;
		return ret;
	}
	
}
