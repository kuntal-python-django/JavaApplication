package inhr;

import inhr.Base;

public class Animal extends Base {

	public static void main(String[] args) {
		
		Animal obj = new Animal();
		obj.setCatagory("Dog");
		obj.setColor("Brown");
		obj.setName("Bhulo");
		
		System.out.println("Name : " + obj.getName());

	}

}
