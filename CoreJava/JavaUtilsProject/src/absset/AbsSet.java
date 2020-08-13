package absset;

import java.util.AbstractSet;
import java.util.TreeSet;

public class AbsSet {

	public static void main(String[] args) {
		
		AbstractSet<Integer> as = new TreeSet<Integer>();
		as.add(1);
		as.add(2);
		as.add(3);
		
		System.out.println(as);
		

	}

}
