package t_io;

import java.io.*;  //s1

public class Read_Data_From_File 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		FileReader sourceStream = null;  //s2
		
		sourceStream = new FileReader("A:\\Java\\test.txt");  //s3
		
		int temp;
        while ((temp = sourceStream.read()) != -1)
             System.out.print((char)temp);
	}

}
