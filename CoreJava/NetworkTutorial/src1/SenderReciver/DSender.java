package SenderReciver;

import java.net.*;  
public class DSender{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket ds = new DatagramSocket();  
    String str = "What Your Name";  
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
     
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000); 
    System.out.println("Data Sending.....");
    ds.send(dp);
    ds.close();  
  }  
}  