package methodover.examples1;

class A {

	int x = m1();

	int m1() {
		System.out.println("A m1");
		return 50;
	}
}

class B extends A {

	int y = m1();

	int m1() {
		System.out.println("B m1");
		return 60;

	}
}

public class TestAB {

	public static void main(String[] args) {

		B b = new B();

		System.out.println("x: " + b.x);
		System.out.println("y: " + b.y);
	}
}
