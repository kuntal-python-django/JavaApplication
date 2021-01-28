package t_io;
import java.util.*;  //s1

public class My_Scanner_Class 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);  //s2
		
		System.out.print("Enter your name : ");
		String name = sc.next();
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Name : " + name + " " + "your age is : " + age);
		
	}
}
