package polimorphisms;

public class A13 {

	static void m1() {
		System.out.println("A m1");
	}

	void m2() {
		System.out.println("A m2");
		m1();
	}

}
