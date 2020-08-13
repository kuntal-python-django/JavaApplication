package in;
import in.Animal;

public class Myclass implements Animal {
	
	public void SetAnimalName(String name)
	{
		System.out.println("Name is : " + name);
	}

	public static void main(String[] args) {
		
		Myclass obj = new Myclass();
		obj.SetAnimalName("Dog");
		
	}

}
