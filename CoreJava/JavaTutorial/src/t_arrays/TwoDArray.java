package t_arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) 
	{
		// int[] a = new int[10];  1D
		
		// 2D
		/*
		int[][] b = new int[3][3];
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				System.out.print(r + "" + c + " ");
//				System.out.print(b[r][c]);
			}
			System.out.println();
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String temp = "";
		String[][] array = new String[3][3];
		
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				System.out.print("Enter Name : ");
				temp = sc.next();
				array[r][c] = temp;
			}
		}
		
		System.out.println("Data Insert completed");
		
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<3; c++)
			{
				System.out.print(array[r][c] + " ");
			}
			System.out.println();
		}
		
		 

	}

}
