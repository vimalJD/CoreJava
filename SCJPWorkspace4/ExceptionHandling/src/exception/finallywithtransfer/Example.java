package exception.finallywithtransfer;

public class Example {

	public static void main(String[] args) {

		System.out.println(m1());
	}

	static int m1() {
		try {

			System.out.println("In try");
//			return 10;
			return 10 / 0;

		} catch (ArithmeticException ae) {
			System.out.println("In catch");
			return 20;
		} finally {
			System.out.println("In finally");
			return 30;
		}
	}
}
