package clsobj;
import clsobj.Student;
import java.util.Scanner;


public class Call_My_Student_Class {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Object Creation
		Student obj = new Student();
		
		// Uesr Input
		System.out.println("Enetr Name : ");
		String name = sc.next();
		
		System.out.println("Enter Roll : ");
		int roll = sc.nextInt();
		
		System.out.println("Enter class : ");
		String cls = sc.next();
		
		obj.setName(name);
		obj.setRoll(roll);
		obj.setCls(cls);
		
		System.out.println("Data Inserted by You are : ");
		
		name = obj.getName();
		roll = obj.getRoll();
		cls = obj.getCls();
		
		System.out.println("name : " + name + " Roll : " + roll + " Class : " + cls);
		
	}

}
