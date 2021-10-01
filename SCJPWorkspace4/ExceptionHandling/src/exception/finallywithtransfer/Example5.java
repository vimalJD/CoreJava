package exception.finallywithtransfer;

public class Example5 {

	public static void main(String[] args) {

		System.out.println(m1());
	}

	static int m1() {
		try {

			System.out.println("In try");
			return 10;

		} catch (ArithmeticException ae) {
			System.out.println("In catch");
		} finally {
			System.out.println("In finally");
			return 30;
		}
//		System.out.println("after try/catch/finally");
	}
}
