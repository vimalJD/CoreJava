package nonstaticmethod;

public class D16 extends C16 {

	void m1() {
		System.out.println("D m1");
	}

	void m2() {
		System.out.println("D m2");
	}

	void m4() {
		System.out.println("D m4");
	}

	public static void main(String[] args) {

		D16 d16 = new D16();
		d16.m1();
		d16.m2();
		d16.m3();
		d16.m4();

	}

}
