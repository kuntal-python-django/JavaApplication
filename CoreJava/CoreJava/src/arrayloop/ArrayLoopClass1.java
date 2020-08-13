package arrayloop;

import java.util.Scanner;

public class ArrayLoopClass {

	public static void main(String[] args) 
	{
//		1D  array
		int[][] array = new int[4][3];
		int num;

		for(int i = 0; i<array.length; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
//		Data insert
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<array.length; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter a number : ");
				num = sc.nextInt();
				array[i][j] = num;
			}
		}
	
//		Data Printing
		for(int i = 0; i<array.length; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
