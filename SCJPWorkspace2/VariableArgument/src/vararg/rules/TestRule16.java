package vararg.rules;

class A3 {

	void m1(int[] ia) {
		System.out.println("A int[]");
	}
}

class B3 extends A3 {

	// var-arg method should override or be overridden
	void m1(int... ia) {
		System.out.println("B int...");
	}
}

public class TestRule16 {

	public static void main(String[] args) {

		B3 b = new B3();

		b.m1();
		b.m1(5);
		b.m1(new int[] { 5 });

		A3 a = new B3();
		/*a.m1();
		a.m1(5);*/
		a.m1(new int[] { 5 });
	}
}
