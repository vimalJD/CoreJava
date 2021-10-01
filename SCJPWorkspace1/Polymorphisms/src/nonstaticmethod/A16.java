package nonstaticmethod;

public class A16 {

	void m1() {
		System.out.println("A m1");
	}

	void m2() {
		System.out.println("A m2");
		m1();
	}
}
