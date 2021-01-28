package t_io;

public class Stream_Example_Class {

	public static void main(String[] args) 
	{
		String inputString = "Hello World!";
		byte[] byteArrray = inputString.getBytes();
		
		for(int i=0; i<byteArrray.length; i++)
		{
			System.out.println(byteArrray[i] + " " + (char)byteArrray[i]);
		}
	}

}
