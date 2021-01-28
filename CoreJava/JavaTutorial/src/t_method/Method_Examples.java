package t_method;

public class Method_Examples {
	
	// Type1
	
	void add()
	{
		int n1 = 5, n2 = 10, result = 0;
		result = n1 + n2;
		System.out.println("Add Result is = " + result);
	}
	
	// Type 2
	
	int mul()
	{
		int n1 = 5, n2 = 10, result = 0;
		result = n1 * n2;
		return result;
	}
	
	String full_name()
	{
		String name = "Alex Doe";
		return name;
	}
	

	// Type 3
	
	int my_cal(int a, double b, String c)
	{
		System.out.println("B: " + b + " C: " + c );
		return a;
	}
	
	
	// Type 4
	
	int price_calculate(double price, double num)
	{
		double total = price * num;
		return (int) total;
	}
	
	
}
