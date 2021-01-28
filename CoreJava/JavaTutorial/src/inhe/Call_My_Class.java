package inhe;
import inhe.Employee;

public class Call_My_Class {

	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		obj.name = "Kuntal";
		obj.pan = "DG2525";
		obj.salary = 1.2;
		
		System.out.println(obj.pan);
	}

}
