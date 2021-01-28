package t_exception;

public class Example_3 
{
	double m1(int x, int y) throws ArithmeticException
	{
		return y/x;
	}
	
	public static void main(String[] args) 
	{
		/*
		 * try
		 * catch
		 * finally
		 * throw
		 * throws
		 */
		
		Example_3 obj = new Example_3();
		try 
		{
			System.out.println(obj.m1(5, 10));
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		System.out.println("AAAAAAAAAAAAAAAAAAA");
		System.out.println("AAAAAAAAAAAAAAAAAAA");
		System.out.println("AAAAAAAAAAAAAAAAAAA");
		System.out.println("AAAAAAAAAAAAAAAAAAA");
		System.out.println("AAAAAAAAAAAAAAAAAAA");
	}

}
