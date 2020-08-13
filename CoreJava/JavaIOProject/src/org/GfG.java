package org;

import java.io.*;   // Accessing FileReader, FileWriter, IOException 
public class GfG 
{ 
    public static void main(String[] args) throws IOException
    { 
        FileReader sourceStream = null; 
        try 
        { 
            sourceStream = new FileReader("G:\\J2EE Project\\Core Java\\JavaIOProject\\src\\org\\test.txt"); 
              
            // Reading sourcefile and writing content to  
            // target file character by character.  
            int temp; 
            while ((temp = sourceStream.read()) != -1) 
                 System.out.print((char)temp); 
        } 
        finally 
        {             
            // Closing stream as no longer in use  
            if (sourceStream != null)             
                sourceStream.close();          
        } 
    } 
}
