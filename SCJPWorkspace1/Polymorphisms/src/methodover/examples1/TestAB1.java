package methodover.examples1;

class A1 {
	int x = m1();

	static int m1() {
		System.out.println("A m1");
		return 50;
	}
}

class B1 extends A1 {
	int y = m1();

	static int m1() {

		System.out.println("B m1");
		return 60;
	}
}

public class TestAB1 {

	public static void main(String[] args) {

		B1 b = new B1();

		System.out.println("x: " + b.x);
		System.out.println("y: " + b.y);

	}
}
