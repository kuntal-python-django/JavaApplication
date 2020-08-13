package org;

public class Student {
	int id, age;
	String name, address;
	
	public Student(int a, int b, String c, String d) 
	{
		this.id = a;
		this.age = b;
		this.name = c;
		this.address = d;
		System.out.println("New Objected Created !!");
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
	
	
	void setAll(int a, int b, String c, String d)
	{
		this.id = a;
		this.age = b;
		this.name = c;
		this.address = d;
	}
	
	void getAll()
	{
		System.out.println(this.id + " " + this.age + " " + this.name + " " + this.address);
	}
	
	
	
	
}
