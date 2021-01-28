package t_util;
import t_util.DriverClass;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_Example 
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
		
		HashSet<DriverClass> hs = new HashSet<DriverClass>();
		hs.add(o1);
		hs.add(o2);
		System.out.println("Hashset : " + hs);
		
		// display
		String name1, license_no1, car_no1;
		Iterator my_data = hs.iterator();
		while (my_data.hasNext())
		{
			DriverClass t = (DriverClass) my_data.next();
			name1 = t.getName();
			license_no1 = t.getLicense_no();
			car_no1 = t.getCar_no();
			System.out.println(name1 + " " + license_no1 + " " + car_no1);
		}
	}
}
