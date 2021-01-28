package t_loop;

public class Nested_For {

	public static void main(String[] args) 
	{
		// Nested For
		// 2 D
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.println(i + " " + j);
			}
//			System.out.println();
		}
		
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// 3 D
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				for(int k=1; k<=3; k++)
				{
					System.out.print(k + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
