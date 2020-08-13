package org.cls.obj;
import java.util.ArrayList;
import java.util.Scanner;
import org.cls.obj.Driver;

public class DriverController {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Driver> store = new ArrayList<Driver>();
		String lc, fn, ad;
		int age;
		
		for(int i=0; i<4; i++)
		{
			Driver d = new Driver();
			System.out.print("Enter Licence Number : ");
			lc = sc.next();
			System.out.print("Enter Fullname : ");
			fn = sc.next();
			System.out.print("Enter Address : ");
			ad = sc.next();
			System.out.println("Enter age : ");
			age = sc.nextInt();
			d.setAllValues(lc, fn, ad, age);
			store.add(d);
			System.out.println("Store status : " + store);
		}
		
		
		for(int i=0; i<4; i++)
		{
			Driver x = store.get(i);
			System.out.println(x.getFullName() + " " + x.getAddress());
		}
		

	}

}
