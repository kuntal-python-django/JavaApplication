package t_io;

import java.io.*;  //s1

public class My_BufferReader_Class 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));  //s2
		
		System.out.print("Enter your name : ");
		String name = bufferReader.readLine();
		
		System.out.print("Enter your age : ");
		int age = Integer.parseInt(bufferReader.readLine());
		
		System.out.println("Name : " + name + " " + "your age is : " + age);
	}
}
