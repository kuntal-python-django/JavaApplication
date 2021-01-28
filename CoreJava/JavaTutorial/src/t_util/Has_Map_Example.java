package t_util;
import t_util.DriverClass;
import java.util.HashMap;
import java.util.Iterator;

public class Has_Map_Example 
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
		
		HashMap<Integer, DriverClass> hm = new HashMap<Integer, DriverClass>();
		hm.put(1, o1);
		hm.put(2, o2);
		System.out.println("Hashmap : " + hm);
		
		// display
		String name1, license_no1, car_no1;
		Iterator<Integer> my_ite = hm.keySet().iterator();
		while(my_ite.hasNext())
		{
			int k = my_ite.next();
			DriverClass t = hm.get(k);
			name1 = t.getName();
			license_no1 = t.getLicense_no();
			car_no1 = t.getCar_no();
			System.out.println(name1 + " " + license_no1 + " " + car_no1);
		}
		
	}
}
