package multiple_inhe;
import multiple_inhe.Implements_A;
import multiple_inhe.Implements_B;


public class Call_Multiple_Inhe 
{

	public static void main(String[] args) 
	{
		Implements_A obj_a = new Implements_A();
		Implements_B obj_b = new Implements_B();
		System.out.println(obj_a.m2());
		System.out.println(obj_b.m4());
		
	}

}
