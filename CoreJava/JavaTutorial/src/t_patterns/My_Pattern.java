package t_patterns;

public class My_Pattern {

	public static void main(String[] args) 
	{
		
		for(int i=1; i<=10; i++) // row
		{
			for(int j=1; j<=i; j++) // col
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=10; i>0; i--) // row
		{
			for(int j=1; j<=i; j++) // col
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
