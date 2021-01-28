package t_exception;
import java.util.Scanner;

public class Example_2 
{

	public static void main(String[] args) 
	{
		/*
		 * try
		 * catch
		 * finally
		 * throw
		 * throws
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		if(age > 18)
		{
			System.out.println("Create Your Voter ID");
		}
		else
		{
			throw new ArithmeticException("We can't process your request");
		}
		
		
	}

}
