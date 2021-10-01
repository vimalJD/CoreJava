package collection.set.concreteclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesDemo {

	public static void main(String[] args) {

		// set objects creation

		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		TreeSet ts = new TreeSet();

		// printing initial size of collection objects
		System.out.println("hs length: " + hs.size());
		System.out.println("lhs length: " + lhs.size());
		System.out.println("ts length: " + ts.size());
		System.out.println();

		// adding elements to hs
		System.out.println("is 20 added: " + hs.add(Integer.toString(20)));
		System.out.println("is a added: " + hs.add(new Character('a')));
		System.out.println("is b added: " + hs.add(new Character('b')));
		System.out.println("is abc added: " + hs.add("abc"));
		System.out.println("is ABC added: " + hs.add("ABC"));
		System.out.println("is abc added: " + hs.add("abc"));
		System.out.println("is abc added: " + hs.add(new String("abc")));
		System.out.println("is Example added: " + hs.add(new Example()));
		System.out.println("is Example added: " + hs.add(new Example()));

		// null to hs
		System.out.println("is null added: " + hs.add(null));
		System.out.println("is null added: " + hs.add(null));
		System.out.println();

		// printing hs modified size and elements
		System.out.println(hs.size());
		System.out.println("hs: " + hs);

		// adding elements to lhs
		System.out.println("is 20 added: " + lhs.add(Integer.toString(20)));
		System.out.println("is a added: " + lhs.add(new Character('a')));
		System.out.println("is b added: " + lhs.add(new Character('b')));
		System.out.println("is abc added: " + lhs.add("abc"));
		System.out.println("is ABC added: " + lhs.add("ABC"));
		System.out.println("is abc added: " + lhs.add("abc"));
		System.out.println("is abc added: " + lhs.add(new String("abc")));
		System.out.println("is Example added: " + lhs.add(new Example()));
		System.out.println("is Example added: " + lhs.add(new Example()));

		// null to lhs
		System.out.println("is null added: " + lhs.add(null));
		System.out.println("is null added: " + lhs.add(null));
		System.out.println();

		// printing lhs modified size and elements
		System.out.println(lhs.size());
		System.out.println("lhs: " + lhs);

		// adding homogeneous elements to ts
		System.out.println("is abc added: " + ts.add("abc"));
		System.out.println("is xyz added: " + ts.add("xyz"));
		System.out.println("is bbc added: " + ts.add("bbc"));
		System.out.println("is pqr added: " + ts.add(new String("pqr")));

		// adding heterogeneous elements
//		System.out.println("is Integer added: " + ts.add(new Integer(10)));

		// adding null to ts
//		System.out.println("is null added: " + ts.add(null));
//		System.out.println("is null added: " + ts.add(null));
		System.out.println();

		// printing ts modified size and elements
		System.out.println(ts.size());
		System.out.println("ts: " + ts);
		
		//?) When can we add null to TreeSet?
		//if it is solo TreeSet we can add null, check the below code
		
		TreeSet solots = new TreeSet();
//		solots.add(null);
		solots.add(50);
		
		System.out.println(solots.size());
		System.out.println("solots: "+solots);
		
	}
}
