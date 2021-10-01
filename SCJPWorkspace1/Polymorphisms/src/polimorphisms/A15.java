package polimorphisms;

public class A15 {

	private void m1() {
		System.out.println("A m1");
	}

	void m2() {
		System.out.println("A m2");
		m1();
	}

	/*public static void main(String[] args) {

		A15 a15 = new A15();
		a15.m1();
		a15.m2();
	}*/
}
