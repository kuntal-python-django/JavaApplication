package encp;

import encp.Student;

public class MyEncp {

	public static void main(String[] args) 
	{
		Student obj = new Student();
		obj.setData(30, 25, "Kuntal");
		obj.ShowData();
		obj.setAge(70);
		obj.ShowData();

	}

}
