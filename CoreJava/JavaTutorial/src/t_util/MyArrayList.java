package t_util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class MyArrayList {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		HashSet<String> hs = new HashSet<String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// data add ArrayList
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		System.out.println(al);
		
		// add data linked list
		ll.add(2);
		ll.add(4);
		ll.add(6);
		ll.addFirst(10);
		System.out.println(ll);
		
		// add data into hashmap
		hm.put(0, "Kuntal");
		hm.put(10, "AAAAA");
		System.out.println(hm.get(0));
		System.out.println(hm);

	}

}
