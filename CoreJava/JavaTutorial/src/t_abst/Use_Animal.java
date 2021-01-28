package t_abst;
import t_abst.Animal;

public class Use_Animal extends Animal
{
	@Override
	void m1() 
	{
		System.out.println("I am in m1()");
	}

	public static void main(String[] args) 
	{
		Use_Animal obj = new Use_Animal();
		obj.m1();
		int y = obj.m2();
		System.out.println("Y : " + y);
	}

}
