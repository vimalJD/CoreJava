package methodover.examples1;

class A2 {

	int x = m1();

	int m1() {
		System.out.println("A m1");
		x = 50;
		return 60;
	}
}

class B2 extends A2 {

	int x;

	int m1() {
		System.out.println("B m1");
		x = 70;
		return 80;
	}
}

public class TestAB2 {

	public static void main(String[] args) {

		B2 b = new B2();

		A2 a = b;

		System.out.println("x: " + b.x);
		System.out.println("x: " + a.x);
	}
}
