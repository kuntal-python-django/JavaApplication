package org;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		float[] a = new float[10];
		Scanner inp = new Scanner(System.in);
		
		for(int i=0; i<8; i++) 
		{
			System.out.println("Enter A Number : ");
			float n = inp.nextFloat();
			a[i] = n;	
		}
		
		System.out.println(a);

	}

}
