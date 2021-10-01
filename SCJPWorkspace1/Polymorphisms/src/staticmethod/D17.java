package staticmethod;

public class D17 extends C17 {

	static void m1() {
		System.out.println("D m1");
	}

	static void m2() {
		System.out.println("D m2");
	}

	static void m4() {
		System.out.println("D m4");
	}

	public static void main(String[] args) {

		D17 d17 = new D17();
		d17.m1();
		d17.m2();
		d17.m3();
		d17.m4();
	}
}
