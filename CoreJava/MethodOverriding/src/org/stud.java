package org;

class college 
{
	 public void move() 
	 {
	  System.out.println("College is open");
	 }
}
class univ extends college 
{
	 public void move() 
	 {
	  System.out.println("University is open too");
	 }
}
public class stud 
{
	public void move() 
	{
		System.out.println("Student is open too");
	}
	 public static void main(String args[]) 
	 {
		 
	  college b = new univ(); // RUN
	  
	  college a = new college(); //Static
	  stud c = new stud(); // Static
	  a.move();
	  b.move();
	  c.move();
	 }
}
