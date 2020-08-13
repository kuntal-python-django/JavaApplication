package SenderReciver;

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



/*
 * This class represents a socket for sending and receiving datagram packets.
 * A datagram socket is the sending or receiving point for a packet delivery service. 
 * Each packet sent or received on a datagram socket is individually addressed and routed. 
 * Multiple packets sent from one machine to another may be routed differently, and may arrive in any order.
 */
