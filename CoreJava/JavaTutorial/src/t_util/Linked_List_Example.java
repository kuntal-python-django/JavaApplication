package t_util;
import t_util.DriverClass;
import java.util.LinkedList;


public class Linked_List_Example 
{
	public static void main(String[] args) 
	{
		DriverClass o1 = new DriverClass();
		o1.setName("Driver 1");
		o1.setLicense_no("Lic0001");
		o1.setCar_no("Car0001");
		
		DriverClass o2 = new DriverClass();
		o2.setName("Driver 2");
		o2.setLicense_no("Lic0002");
		o2.setCar_no("Car0002");
		
		LinkedList<DriverClass> ll = new LinkedList<DriverClass>();
		ll.add(o1);
		ll.add(o2);
		System.out.println("Linked List : " + ll);
		
		// display
		String name1, license_no1, car_no1;
		for(int i=0; i<ll.size(); i++)
		{
			DriverClass t = ll.get(i);
			name1 = t.getName();
			license_no1 = t.getLicense_no();
			car_no1 = t.getCar_no();
			System.out.println(name1 + " " + license_no1 + " " + car_no1);
		}
	}
}
