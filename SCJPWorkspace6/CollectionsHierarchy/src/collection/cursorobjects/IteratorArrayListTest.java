package collection.cursorobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayListTest {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("abc");
		al.add("bbc");
		al.add("cbc");

		Iterator itr = al.iterator();

		while (itr.hasNext()) {

			Object object = itr.next();
			System.out.println(object);
		}
	}
}
