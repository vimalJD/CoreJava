package exception.compile.trycatch;

public class CaseB22 {

	public static void main(String[] aegs) {

		m1();
	}

	static void m1() {
		int a;

		try {
			a = 10;
			System.out.println(a);
		} catch (ArithmeticException ae) {
			a = 20;
			System.out.println(a);
		}
		System.out.println(a);
	}
}
