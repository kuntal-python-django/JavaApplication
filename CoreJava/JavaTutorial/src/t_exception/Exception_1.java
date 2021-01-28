package t_exception;

public class Exception_1 
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 10;
		double res = 0.0;
		
		// Exception
		try 
		{
			res = y/x;
			System.out.println("Result is : " + res);
		}
		catch (Exception e) 
		{
			System.out.println("Exceeption is : " + e);
		}
		finally 
		{
			System.out.println("X : " + x + " " + " Y : " + y + " Result : " + res);
		}
		
		
		System.out.println("Hey How are you?");
		for(int z=0; z<6; z++)
		{
			System.out.println("Z : " + z);
		}
	}
}
