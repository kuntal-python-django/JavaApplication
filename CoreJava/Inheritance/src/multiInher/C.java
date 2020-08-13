package multiInher;

import multiInher.B;

public class C extends B {

	public static void main(String[] args) {
		
		C obj = new C();
		obj.setA1("A1");
		obj.setA2("A2");
		obj.setA3("A3");
		obj.setB1("B1");
		obj.setB2("B2");
		obj.setB3("B3");
		
		System.out.println("Class A : " + obj.getA1());
		System.out.println("Class A : " + obj.getB1());

	}

}
