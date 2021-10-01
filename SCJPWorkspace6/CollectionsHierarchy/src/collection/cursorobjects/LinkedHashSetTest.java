package collection.cursorobjects;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("abc");
		lhs.add("bbc");
		lhs.add("cbc");

		Iterator itr = lhs.iterator();

		while (itr.hasNext()) {

			Object object = itr.next();
			System.out.println(object);
		
		}
	}
}
