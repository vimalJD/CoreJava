package polimorphisms;

public class B15 extends A15 {

	void m1() {
		System.out.println("B m1");
	}

	public static void main(String[] args) {

		B15 b15 = new B15();
		b15.m1();
		b15.m2();

		A15 a15 = new B15();
		// a15.m1();
		a15.m2();
	}
}
