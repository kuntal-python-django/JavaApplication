import java.util.Scanner;


public class RowColumnMajor {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter Number of employee ? ");
		int row = inp.nextInt();
		
		String[][] a = new String[row][];
		
		int i = 0;
		int j = 0;
		
		for(i=0; i<row; i++)
		{
			for(;;)
			{
				System.out.println("Enter Name : ");
				String n = inp.nextLine();
				a[i][j] = n;
				break;
			}
		}
		
		

	}

}
