package org;

public class Casting {

	public static void main(String[] args) 
	{
		
//		Coercion 
		/*
		 * converting one data type to another data type is know as Coercion  
		 */
//		Example
		
		String a = "10";
		int x = Integer.parseInt(a);
		int b = 5 * x;
		System.out.println("Output is : " + b);
		
//		type casting
		long y = 10;
		int t = (int) y;  //Dynamic type casting
		
		
		int v = 5;
		long k = v;  // Auto type casting
		
		
	}

}
