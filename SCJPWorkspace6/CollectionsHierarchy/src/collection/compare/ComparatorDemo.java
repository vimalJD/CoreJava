package collection.compare;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		// Creating a TreeSet object using no-arg constructor,
		// so, elements are sorted according to natural sorting order of adding object

		TreeSet ts = new TreeSet();

		// Add elements to the TreeSet
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");

		System.out.println("ts object with default comparator: " + ts);

		// Creating TreeSet object using Comparator parameter constructor,
		// to sort elements according to custom comparator sorting order

		TreeSet tsc = new TreeSet(new StringComparator());

		tsc.add("C");
		tsc.add("A");
		tsc.add("B");
		tsc.add("E");
		tsc.add("F");
		tsc.add("D");

		System.out.println("tsc object with custom comparator: " + tsc);
	}
}
