package collection.compare;

import java.util.TreeSet;

public class AddingSBtoTS {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new SBComparator());

		ts.add(new StringBuffer("a"));
		ts.add(new StringBuffer("b"));
		ts.add(new StringBuffer("x"));
		ts.add(new StringBuffer("c"));
		ts.add(new StringBuffer("y"));

		System.out.println(ts);

	}
}
