package typesofmethod;

public class Example {

	static void m1() {

		System.out.println("in m1");
		return;

	}

	static int m2() {

		System.out.println("in m2");
		return 50;
	}

	public static void main(String[] args) {

		m1();
		m2();

		int x = m2();

		System.out.println(x);

		System.out.println(m2());
		// int y = m1();
		// System.out.println(m1());
	}
}
