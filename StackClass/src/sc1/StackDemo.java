package sc1;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		System.out.println(s.search(30));
		System.out.println(s);
		System.out.println(s.push(50));
		System.out.println(s);
		System.out.println("Pop element : " + s.pop());
		System.out.println(s);
		System.out.println("Peak element : " + s.peek());
		System.out.println(s);
		System.out.println("Push element : " + s.push(70));
		System.out.println(s);
		System.out.println("Searh element : " + s.search(70));
		System.out.println("Searh element : " + s.search(10));

		System.out.println("Out of the stack value : " + s.search(50));

		System.out.println("None empty stack : " + s.empty());

		System.out.println(s.pop() + "\n" + s.pop() + "\n" + s.pop() + "\n" + s.pop());

		System.out.println("Empty stack : " + s.empty());
		System.out.println(s);
	}
}
