package nongenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGenericAL {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("a");
		al.add("b");
		al.add("c");

		Iterator ite = al.iterator();

		while (ite.hasNext()) {

			Object object = ite.next();
			String s = (String) object;

			System.out.println(s.toUpperCase());
		}
	}
}
