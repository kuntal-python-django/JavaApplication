package UserInput;
import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		String name = inp.next();
		System.out.println("Enter your Roll : ");
		int roll = inp.nextInt();
		
		System.out.println(name  + " " + roll);

	}

}
