package org;

import java.net.*;

public class DReceiver
{  
  public static void main(String[] args) throws Exception 
  {  
		System.out.println("Server starting .....");
	    DatagramSocket ds = new DatagramSocket(3000); 
	    byte[] buf = new byte[1024];  
	    DatagramPacket dp = new DatagramPacket(buf, 1024);  
	    ds.receive(dp);  
	    String str = new String(dp.getData(), 0, dp.getLength());  
	    System.out.println("Recived Data : " + str);  
	    ds.close();  
  }  
} 
