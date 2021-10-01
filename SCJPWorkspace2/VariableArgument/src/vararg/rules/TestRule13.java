package vararg.rules;

class A {
	/*
	 * void m1(int... ia) { System.out.println("A int..."); }
	 */

	void m1(long... ia) {
		System.out.println("A long...");
	}
}

class B extends A {
	/*
	 * void m1(long... ia) { System.out.println("B long..."); }
	 */

	void m1(int... ia) {
		System.out.println("B int...");
	}
}

public class TestRule13 {

	public static void main(String[] args) {

		B b = new B();
		b.m1();
		b.m1(5);
		b.m1(5L);

		A a = new B();
		a.m1();
		a.m1(5);
		a.m1(5L);
	}
}
