package except;
import java.util.Scanner;
public class ExceptionClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter a number : ");
		int b = sc.nextInt();
		int result = 0;
		
		try 
		{
			result = a / b;
			
		} catch (Exception e) 
		{
//			e.printStackTrace();
//			System.out.println(e);
			result = 1;
		}
		finally {
			System.out.println("I am in here");
		}
		
		System.out.println("Result is : " + result);

	}

}
