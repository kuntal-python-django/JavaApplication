package t_scase;
import java.util.Scanner;


public class Switch_Case_Tutorial {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter a number : ");
//		int n = sc.nextInt();
		
		System.out.print("Enetr a choice : ");
		String n = sc.next();
		
		/*
		switch(n)
		{
			case 1:
				System.out.println("Hi, How are you ?");
				break;
			
			case 2:
				System.out.println("Hi, Today is Sunday ?");
				break;
				
			case 3:
				System.out.println("Hi, This is Java Batch");
				break;
			
			default:
				System.out.println("Try again !!");
				
		}
		*/
		
		switch(n)
		{
			case "a":
				System.out.println("Hi, How are you ?");
				break;
			
			case "b":
				System.out.println("Hi, Today is Sunday ?");
				break;
				
			case "c":
				System.out.println("Hi, This is Java Batch");
				break;
			
			default:
				System.out.println("Try again !!");
		}
		

	}

}
