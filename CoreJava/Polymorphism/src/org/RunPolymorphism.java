package org;

class Bank
{
	public double getRateOfInterest()
	{
		return 5.0;
	}
}

class SBI extends Bank
{
	public double getRateOfInterest()
	{
		return 3.25;
	}
}

class HDFC extends Bank
{
	public double getRateOfInterest()
	{
		return 4.75;
	}
}


public class RunPolymorphism {

	public static void main(String[] args) 
	{
		Bank obj1 = new Bank();
		System.out.println(obj1.getRateOfInterest());

		Bank obj2 = new SBI();
		System.out.println(obj2.getRateOfInterest());
		
		Bank obj3 = new HDFC();
		System.out.println(obj3.getRateOfInterest());
		
		
		/*
		 *Static
		 */
//			Bank obj1 = new Bank();
//			System.out.println(obj1.getRateOfInterest());
//	
//			SBI obj2 = new SBI();
//			System.out.println(obj2.getRateOfInterest());
//			
//			HDFC obj3 = new HDFC();
//			System.out.println(obj3.getRateOfInterest());
		
	}

}
