package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericAL {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("a");
		al.add("b");
		al.add("c");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {

			String string = itr.next();
			System.out.println(string.toUpperCase());
		}
	}
}
