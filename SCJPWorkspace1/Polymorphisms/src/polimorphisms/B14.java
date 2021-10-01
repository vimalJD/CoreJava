package polimorphisms;

public class B14 extends A14 {

	void m1() {
		System.out.println("B m1");
	}

	public static void main(String[] args) {

		B14 b14 = new B14();
		b14.m1();
		b14.m2();

		A14 a14 = new B14();
		a14.m1();
		a14.m2();
	}
}
