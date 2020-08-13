package org;

public interface B {
	
	default void SetFromB() 
	{
		System.out.println("Printing From Class B");
	}

}
