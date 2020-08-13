package org;
import java.util.Scanner;

public class MethodExample {
	
	static int add1(int x, int y)
	{
		return x + y;
	}
	
	static int add2(int x, int y)
	{
		return x + y;
	}

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter 1 to Add"
					+ "Enter 2 to sub "
					+ "Enter 3 to Mul");
			
			int userInput = inp.nextInt();
			
			if(userInput == 1)
			{
				System.out.println("Enter 1st number : ");
				int a = inp.nextInt();
				System.out.println("Enter 2nd number : ");
				int b = inp.nextInt();
				
				int res = add1(a, b);
				
				System.out.println("Result is : " + res);
			}
			else if(userInput == 2)
			{
				System.out.println("Enter 1st number : ");
				int a = inp.nextInt();
				System.out.println("Enter 2nd number : ");
				int b = inp.nextInt();
				
				int res = add2(a, b);
				
				System.out.println("Result is : " + res);
			}
			else
			{
				System.out.println("Try again !");
			}
		}
		

	}

}
