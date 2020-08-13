package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaTester {
   public static void main(String args[]) throws NumberFormatException, IOException {
      BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an number:");
      int a = Integer.parseInt(bufferReader.readLine());
      System.out.printf("You entered: " + a);
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nEnter an number:");
      a = scanner.nextInt();
      System.out.printf("You entered: " + a);
   }
} 
