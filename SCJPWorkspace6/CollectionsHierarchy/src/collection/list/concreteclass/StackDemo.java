package collection.list.concreteclass;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack st = new Stack();

		st.push(new Integer(10));
		st.push(new Integer(20));
		st.push(new Integer(30));
		st.push(new Integer(40));
		st.push(new Integer(50));

		System.out.println(st);

		System.out.println(st.pop());
		System.out.println(st);

		System.out.println(st.peek());
		System.out.println(st);

		System.out.println(st.search(new Integer(20)));
	}
}
