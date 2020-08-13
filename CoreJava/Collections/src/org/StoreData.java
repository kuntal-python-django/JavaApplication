package org;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

//import java.util.HashMap;
import org.Driver;
import org.w3c.dom.TypeInfo;

public class StoreData {

	public static void main(String[] args) {
		
//		ArrayList<Driver> store = new ArrayList<Driver>();
//		Driver d1 = new Driver();
//		store.add(d1);
//		System.out.println(store.get(0).getClass());
//		Driver demo = store.get(0);
		
//		Driver d1 = new Driver();
//		Driver d2 = new Driver();
//		Hashtable<Integer, Driver> ht = new Hashtable<Integer, Driver>();
//		ht.put(10, d1);
//		ht.put(11, d2);
//		System.out.println(ht.get(10));
		
//		HashMap<String, String> hm = new HashMap<String, String>();
//		hm.put("A", "Apple");
//		hm.put("B", "Berlin");
//		System.out.println(hm.get("A"));
		
		LinkedList<Driver> ll = new LinkedList<Driver>();
		for(int i=0; i<10; i++)
		{
			Driver d = new Driver();
			ll.add(d);
		}
		
		System.out.println(ll);
		
	}

}
