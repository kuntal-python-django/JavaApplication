package org;
import org.Student;
import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		
//		Student s = new Student();
//		s.setId(1);
//		s.setAge(25);
//		s.setName("Kuntal");
//		s.setAddress("Haldirams");
//		
//		System.out.println(s.getId() + " " +  s.getAge());
		
		
//		Student s = new Student();
//		s.setAll(1, 25, "Kuntal", "Haldirams");
//		s.getAll();
		
		for(int i=0; i<3; i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id : ");
			int x1 = sc.nextInt();
			System.out.println("Enter Age : ");
			int x2 = sc.nextInt();
			System.out.println("Enter Name : ");
			String nm = sc.next();
			System.out.println("Enter Address : ");
			String adr = sc.next();
			
			Student s = new Student(x1, x2, nm, adr);
			System.out.println(s.name + " " + s.address);
		}
		
	}

}
