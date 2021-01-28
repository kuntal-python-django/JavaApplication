package t_ifelse;

public class IFELSE_Tutorial {

	public static void main(String[] args) {
		
		// Type 1
		int n1 = 11;
		int n2 = 10;
		int n3 = 7;
		
		if(n1>n2)
		{
			System.out.println("Big : " + n1);
		}
		else
		{
			System.out.println("Big : " + n2);
		}
		
		// Type 2
		if(n1 > n2)
		{
			System.out.println("Big : " + n1);
		}
		if(n1 > n3)
		{
			System.out.println("Big : " + n1);
		}
		else
		{
			System.out.println("Min : " + n1);
		}
		
		// Type 3
		if(n1 > n2)
		{
			System.out.println("Big : " + n1);
		}
		else if(n1 > n3)
		{
			System.out.println("Big : " + n1);
		}
		else
		{
			System.out.println("Min : " + n1);
		}
		
		// Type 4 [Nested If Else]
		if(n1 > n2)
		{
			if(n1> n3)
			{
				if(n2 > n3)
				{
					System.out.println("Big : " + n2);
				}
				else
				{
					System.out.println("Big : " + n3);
				}
			}
		}

	}

}
