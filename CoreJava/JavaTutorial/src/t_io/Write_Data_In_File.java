package t_io;

import java.io.*;


public class Write_Data_In_File 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream sourceStream = null;  //s2
		
		sourceStream = new FileOutputStream ("A:\\Java\\test1.txt"); 
		
		sourceStream.write(115);  // char or byte or ascii code
		sourceStream.write('s');
	
		System.out.println("done");
		
	}
}
