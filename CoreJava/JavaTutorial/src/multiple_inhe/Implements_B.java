package multiple_inhe;
import multiple_inhe.B;

public class Implements_B implements B
{

	@Override
	public void m3() 
	{	
		System.out.println("I am in M3 ");
	}

	@Override
	public String m4() {
		String name = "Kuntal";
		return name;
	}
	
}
