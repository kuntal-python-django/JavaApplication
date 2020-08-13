package org;
import java.util.Scanner;

public class JumpClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i<20; i++)
//		{
//			System.out.println("Enter A Number : ");
//			int b = sc.nextInt();
//			System.out.println("I is : " + i);
//			if(b==i)
//			{
//				break;
//			}
//		}
//		
//		System.out.println("END");
		
		
		
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			else
			{
				System.out.println(i*i);
			}
			System.out.println("***");
		}
		
		

	}

}
