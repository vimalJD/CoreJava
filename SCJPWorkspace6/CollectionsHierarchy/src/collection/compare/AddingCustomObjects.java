package collection.compare;

import java.util.TreeSet;

public class AddingCustomObjects {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add(new Example());
		ts.add(new Example(20));
		ts.add(new Example());
		ts.add(new Example(5));
		ts.add(new Example(30));
		ts.add(new Example(20));
		ts.add(new Example());

		System.out.println(ts.size());
		System.out.println(ts);
	}
}
