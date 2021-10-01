package vararg.rules;

class A2 {
	void m1(int... ia) {
		System.out.println("A int...");
	}
}

class B2 extends A2 {

	// var-arg method should override or be overridden
	void m1(int[] ia) {
		System.out.println("B int[]");
	}
}

public class TestRule15 {

	public static void main(String[] args) {

		B2 b = new B2();
		/*
		 * b.m1(); b.m1(5);
		 */
		b.m1(new int[] { 5 });

		A2 a = new B2();
		a.m1();
		a.m1(5);
		a.m1(new int[] { 5 });

	}
}
