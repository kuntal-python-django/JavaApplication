package arrayloop;
import java.util.Scanner;

public class RowColumnMajor {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Row : ");
		int row = sc.nextInt();
		System.out.println("Enter a Column : ");
		int column = sc.nextInt();
		
		int[][] array = new int[row][];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.println("Enter a Number : ");
				array[i][j] = 1;
			}
		}
		
	}

}
