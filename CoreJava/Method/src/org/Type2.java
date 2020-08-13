package org;

public class Type2 {

	static int getValue()
	{
		int k = 5;
		k = k + 5;
		return k;
	}
	
	public static void main(String[] args) 
	{
		int res = getValue();
		System.out.println(res);
	}

}
