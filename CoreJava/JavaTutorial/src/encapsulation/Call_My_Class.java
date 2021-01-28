package encapsulation;
import encapsulation.Encapsulate_Example1;

public class Call_My_Class {

	public static void main(String[] args) 
	{
		Encapsulate_Example1 obj = new Encapsulate_Example1();
		obj.num = 50;
		obj.setName("Kuntal");
		obj.age = 25;
		
		System.out.println(obj.num);
		System.out.println(obj.getName());
		System.out.println(obj.age);
	}

}
