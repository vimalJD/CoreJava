package nonstaticmethod;

public class B16 extends A16 {

	void m1() {
		System.out.println("B m1");
	}

	void m3() {
		System.out.println("B m3");
		m1();
		super.m2();
	}

}
