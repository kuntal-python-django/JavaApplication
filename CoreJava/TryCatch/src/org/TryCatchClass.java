package org;

public class TryCatchClass {
	
	static void Show() throws ArrayIndexOutOfBoundsException, ArithmeticException
	{
		throw new ArithmeticException("Firstname Error");
	}
	
	public static void main(String[] args) 
	{
		
		Show();
		
	}

}
