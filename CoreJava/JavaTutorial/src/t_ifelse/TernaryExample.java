package t_ifelse;

public class TernaryExample {

	public static void main(String[] args) 
	{
		// [ ?: ]
		int num1 = 10;
		int num2 = 20;
		int temp = 0;

		/*
		if (num1>num2)
		{
			temp=num1;
		}
		else
		{
			temp=num2;
		}
		*/
		
		temp = (num1>num2) ? num1 : num2;
		
		
		System.out.println(temp);
		
		
	}

}
