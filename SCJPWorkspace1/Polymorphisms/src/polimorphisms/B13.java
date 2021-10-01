package polimorphisms;

public class B13 extends A13 {

	static void m1() {
		System.out.println("B m1");
	}

	public static void main(String[] args) {

		B13 b13 = new B13();
		b13.m1();
		b13.m2();

		A13 a13 = new B13();
		a13.m1();
		a13.m2();

	}
}
