package pck;

public class MethodeOverloading {
	
	String printBill(String ph, String item1)
	{
		return ph + " " + item1;
	}
	
	String printBill(int ph, String item1)
	{
		return item1;
	}
	
	public static void main(String[] args) 
	{
		MethodeOverloading obj = new MethodeOverloading();
		obj.printBill(123, "o;hgk");
		
	}

}
