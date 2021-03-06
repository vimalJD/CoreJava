package collection.cursorobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationArrayListTest {

	public static void main(String[] args) {
		
		ArrayList firstList = new ArrayList();

		firstList.add(101);

		firstList.add("Hello");
		firstList.add("World");
		firstList.add(true);
		firstList.add(101.5);

		Enumeration e = Collections.enumeration(firstList);

		System.out.print("Elements using Enumeration: ");

		while (e.hasMoreElements()) {
			Object obj = e.nextElement();
			System.out.print(obj + " ");
		}

	}
}
