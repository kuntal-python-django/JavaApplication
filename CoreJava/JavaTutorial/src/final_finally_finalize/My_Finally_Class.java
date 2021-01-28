package final_finally_finalize;

public class My_Finally_Class {

	public static void main(String[] args) 
	{
		int n1 = 0;
		int n2 = 10;
		double res = 0.0;
		
		try 
		{
			res = n2/n1;
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println(res);
		}
		
	}

}
