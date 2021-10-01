package collection.cursorobjects;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);

		System.out.println("AL elements before iterations: " + al);
		int count = 1;

		ListIterator lItr = al.listIterator();

		while (lItr.hasNext()) {

			Object obj = lItr.next();
			System.out.println("Current element: " + obj);

			if (obj instanceof String) {

				String s = (String) obj;
				lItr.set(s.toUpperCase());

			} else if (obj instanceof Integer) {

				if (count == 1) {

					lItr.add(20);
					count++;
				}
			} // else if
		} // while

		System.out.println("AL elements after iterations: " + al);
		// retrieving elements in reverse order

		while (lItr.hasPrevious()) {

			Object obj = lItr.previous();
			System.out.println(obj);
		}
	}
}
