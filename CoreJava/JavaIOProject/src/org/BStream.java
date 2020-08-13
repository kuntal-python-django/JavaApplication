package org;

import java.io.*;    
public class BStream 
{ 
    public static void main(String[] args) throws IOException 
    { 
        FileInputStream sourceStream = null; 
        FileOutputStream targetStream = null; 
  
        try 
        { 
            sourceStream = new FileInputStream("G:\\J2EE Project\\Core Java\\JavaIOProject\\src\\org\\test.txt"); 
            targetStream = new FileOutputStream ("G:\\J2EE Project\\Core Java\\JavaIOProject\\src\\org\\targetfile.txt"); 
  
            // Reading source file and writing content to target 
            // file byte by byte 
            int temp; 
            while ((temp = sourceStream.read()) != -1) 
                targetStream.write((byte)temp);             
        } 
        finally 
        { 
            if (sourceStream != null) 
                sourceStream.close();             
            if (targetStream != null)             
                targetStream.close();
            
            System.out.println("File Copied !!");
        } 
    } 
}
