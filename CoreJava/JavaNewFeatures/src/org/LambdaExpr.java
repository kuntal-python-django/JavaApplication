package org;

interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int x, int y);
} 


public class LambdaExpr {
	
	public static void main(String[] args) 
	{
		// lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x, int y)->System.out.println(x + y); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5, 7); 
	}

}
