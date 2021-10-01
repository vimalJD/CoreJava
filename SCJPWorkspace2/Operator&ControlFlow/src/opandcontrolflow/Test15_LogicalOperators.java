package opandcontrolflow;

public class Test15_LogicalOperators {

	public static void main(String[] args) {

		int a = 5, b = 6;

		/*
		 * System.out.println(a && b); System.out.println(5 && 6);
		 */

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println(m1() && m2());
		System.out.println(m2() && m1());

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println(m1() || m2());
		System.out.println(m2() || m1());

	}

	static boolean m1() {
		System.out.println("From m1");
		return false;
	}

	static boolean m2() {
		System.out.println("From m2");
		return true;
	}
}
