package staticmethod;

public class B17 extends A17 {

	static void m1() {
		System.out.println("B m1");
	}

	void m3() {
		System.out.println("B m3");
		m1();
		super.m2();
	}
}
