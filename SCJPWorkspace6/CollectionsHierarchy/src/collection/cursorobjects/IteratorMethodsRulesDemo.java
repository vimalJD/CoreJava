package collection.cursorobjects;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorMethodsRulesDemo {

	public static void main(String[] agrs) {

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");

		Iterator itr = lhs.iterator();

//		itr.remove();

		Object o1 = itr.next();
		System.out.println(o1);

//		itr.remove();

		lhs.add("d");
//		Object o2 = itr.next();
//		System.out.println(o2);

//		itr.remove();
//		Object o3 = itr.next();
//		System.out.println(o3);

//		Object o4 = itr.next();
//		itr.remove();

		lhs.add("d");
		System.out.println(lhs);
	}
}
