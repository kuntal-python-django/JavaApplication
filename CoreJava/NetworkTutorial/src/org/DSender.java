package org;

import java.util.Scanner;
import java.net.*;  

public class DSender
{  
  public static void main(String[] args) throws Exception 
  {  
	 
    Scanner sc = new Scanner(System.in);
	DatagramSocket ds = new DatagramSocket();
    System.out.print("Enter your msg : ");
    String str = sc.next();  
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
     
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000); 
    System.out.println("Data Sending.....");
    ds.send(dp);
    ds.close();
    
  } 
}  