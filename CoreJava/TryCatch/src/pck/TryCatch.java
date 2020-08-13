package pck;
import java.util.Scanner;

public class TryCatch 
{

	public static void main(String[] args) 
	{
		final double pi = 3.24;
		
//		Scanner sc = new Scanner(System.in);
//		double result;;
//		int n1;
//		int n2;
//		System.out.println("Enter N1 : ");
//		n1 = sc.nextInt();
//		System.out.println("Enter N2 : ");
//		n2 = sc.nextInt();
//		
//		try
//		{
//			result = n1 / n2;
//		}
//		catch (Exception e) 
//		{
//			System.out.println("There is any Issue !! " + e);
//			result = 0.0;
//		}
//		finally
//		{
//			System.out.println("I am in finally");
//		}
//		
//		System.out.println("Result is : " + result);
//		
//		System.out.println("Hey Try again");
//		System.out.println("Hey Try again");

		
		
		int[] a = new int[10];
		try {
			System.out.println(a[20]);
		}
		catch (Exception e) {
			System.out.println("There is any Issue !! " + e);
		}
		
		System.out.println("Hey Try again");
		System.out.println("Hey Try again");

		
	}

}
