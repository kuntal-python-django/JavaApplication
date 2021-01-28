package final_finally_finalize;


final public class My_Final_Class {

	public static void main(String[] args) 
	{
		/*
		 * 1) if the variable is final you can't update that variable value
		 * 2) we can make a class final
		 * 3) We can't inh a class which is final
		 */
		
		final double pi = 3.144;
		int n = 20;
		n = 40;
		System.out.println(pi);
		
	}

}
