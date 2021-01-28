package org;

import java.io.*;
import java.net.*;

public class URLConnectionExample {

	public static void main(String[] args) throws IOException 
	{
		URL url = new URL("https://indiancybersecuritysolutions.com/java-training-in-kolkata/");  
		URLConnection urlcon = url.openConnection();  
		
		InputStream stream = urlcon.getInputStream();  
		int i;  
		while((i=stream.read())!=-1)
		{  
			System.out.print((char)i);  
		}  
	}

}
