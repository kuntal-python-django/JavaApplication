package Array2dDemoData;
import java.util.Scanner;

public class My2dExample1 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		String[][] name = new String[2][2];
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<=1; j++)
			{
				System.out.println("Enter Your Name : ");
				String a = inp.nextLine();
				name[i][j] = a;
			}
		}
		
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<=1; j++)
			{
				System.out.print("[" + name[i][j] + "] ");
			}
			System.out.println();
		}
		
		
	}

}
