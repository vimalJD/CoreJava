package typesofmethod;

public class Example1 {

	static void m1(int p) {

		System.out.println("before if");
		if (p == 10) {

			System.out.println("in if");
			return;
		}
		System.out.println("after if");
		System.out.println("hi");
	}

	static int m2(int p) {

		System.out.println("before if");
		if (p == 10) {

			System.out.println("in if");
			return p + 10;
		}
		System.out.println("after if");
		System.out.println("hi");
		return 50;
	}

	public static void main(String[] args) {

		m1(10);
		m1(20);

		m2(10);
		m2(20);
		int x = m2(10);
		int y = m2(20);
		System.out.println(m2(0));
	}
}
