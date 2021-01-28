package org;

import java.io.IOException;
import java.net.*;

public class HttpURLConnectionDemo {

	public static void main(String[] args) throws IOException 
	{
		URL url= new URL("https://indiancybersecuritysolutions.com/java-training-in-kolkata/");
		
		HttpURLConnection huc = (HttpURLConnection)url.openConnection();
		
		for(int i=1;i<=20;i++)
		{  
			System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
		}  
		
		huc.disconnect();   
	}

}
