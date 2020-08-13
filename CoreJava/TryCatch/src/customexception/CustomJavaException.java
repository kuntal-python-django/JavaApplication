package customexception;

//A Class that represents use-defined expception 
class MyException extends Exception 
{ 
 public MyException(String msg) 
 { 
     // Call constructor of parent Exception 
     super(msg); 
 } 
} 

public class CustomJavaException 
{
	public static void main(String[] args) 
	{
		try
        { 
            throw new MyException("ICSS by Kuntal"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Hello Exception");  
            System.out.println(ex.getMessage()); 
        } 
	}
}



/*
 * Final class can't be inherited, final method can't be overridden and final variable value can't be changed. 
Finally is used to place important code, it will be executed whether exception is handled or not. 
Finalize is used to perform clean up processing just before object is garbage collected.

 * */
