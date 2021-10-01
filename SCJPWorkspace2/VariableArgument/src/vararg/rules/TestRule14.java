package vararg.rules;

class A1 {
	void m1(int... ia) {
		System.out.println("A int...");
	}
}

class B1 extends A1 {
	void m1(int... ia) {
		System.out.println("B int...");
	}
}

public class TestRule14 {

	public static void main(String[] args) {

		B1 b = new B1();
		b.m1();
		b.m1(5);
//		b.m1(5L);

		A1 a = new B1();
		a.m1();
		a.m1(5);
//		a.m1(5L);
	}
}
