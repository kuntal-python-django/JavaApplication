package t_math;
import java.math.*;


public class Java_Math_Tutorial {

	public static void main(String[] args) 
	{
		int n1 = 10;
		int n2 = 20;
		int n3 = 16;
		int n4 = 2;
		int n5 = -10;
		int big = Math.max(n1, n2);
		System.out.println("BIG : " + big);
		System.out.println("Min : " + Math.min(n1, n2));
		
		System.out.println(Math.abs(n5));
		System.out.println(Math.sqrt(n3));
		System.out.println(Math.PI);
		System.out.println(Math.pow(2, 5));
	}

}
