package org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class MyUtils {

	public static void main(String[] args) 
	{
		
//		ArrayList
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("aaaa");
//		al.add("aaaa");
//		al.add("bbbb");
//		System.out.println(al.get(0));
		
//		Linked List
//		LinkedList<Integer> ll = new LinkedList<Integer>();
//		ll.add(2);
//		ll.add(4);
//		ll.add(6);
//		ll.addFirst(1);
//		ll.add(2, 3);
//		ll.add(4, 5);
//		System.out.println(ll);
		
		
//		HasMap
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.put(0, "Kuntal");
//		hm.put(10, "AAAAA");
//		System.out.println(hm.get(9));
		
		
//		HashSet
		/* 
		 * HashSet stores the elements by using a mechanism called hashing. 
		 * HashSet contains unique elements only.
		 */
		HashSet<String> hs = new HashSet<String>();
		hs.add("AAAA");
		hs.add("BBBB");
		hs.add("CCCC");
		hs.add("AAAA");
		Iterator<String> i = hs.iterator();
        while (i.hasNext()) 
            System.out.println(i.next());
		
		

	}

}
