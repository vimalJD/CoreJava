package collection.compare;

import java.util.TreeSet;

public class Example implements Comparable {

	int x;

	public Example() {
		// TODO Auto-generated constructor stub
	}

	public Example(int x) {
		this.x = x;
	}

	@Override
	public int compareTo(Object o) {

		Example e = (Example) o;
		return e.x - this.x;
	}

	@Override
	public String toString() {
//		return "Example [x=" + x + "]";

		return "" + x;
	}
	
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
