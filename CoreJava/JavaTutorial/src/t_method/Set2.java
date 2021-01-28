package t_method;
import t_method.Method_Examples;

public class Set2 {

	public static void main(String[] args) 
	{
		
		Method_Examples obj = new Method_Examples();
		obj.add();
		int res = obj.mul();
		System.out.println("Mul Result is = " + res);
		int price_c = obj.price_calculate(20.30, 5);
		System.out.println("Price is = " + price_c);

	}

}
