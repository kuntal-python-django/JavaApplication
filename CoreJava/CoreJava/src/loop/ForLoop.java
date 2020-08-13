package loop;

public class ForLoop {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		for(i=1; i<=5; i++)
		{
			System.out.println(i);
		}
		
		for(i=0; i<5; i++)
		{
			for(j=0; j<5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
