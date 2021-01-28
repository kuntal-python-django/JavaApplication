package t_arrays;
import java.util.Scanner;

public class My_Array {

	public static void main(String[] args) 
	{
		// 1D
		/*
		int[] array = new int[10];
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		}
		
		for(int i=0; i<array.length; i++)
		{
			array[i]=1;
		}
		
		System.out.println();
		
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		}
		
		
		float[] array1 = new float[10];
		for(int i=0; i<array1.length; i++)
		{
			System.out.println(array1[i]);
		}
		
		
		byte[] array2 = new byte[10];
		for(int i=0; i<array2.length; i++)
		{
			System.out.println(array2[i]);
		}
		*/
		
		
		// Application [Custom Input]
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records you want to store ? ");
		int n = sc.nextInt();
		String[] array = new String[n];
		for(int i=0; i<array.length; i++)
		{
			System.out.print("Enter name : ");
			array[i] = sc.next();
		}
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

}
