package exception.finallyblock;

public class FinallyCase1 {

	public static void main(String[] args) {

		try {

			System.out.println("In try");
		} catch (ArithmeticException ae) {
			System.out.println("In catch");
		} finally {
			System.out.println("In finally");
		}
		System.out.println("After try/catch/finally");
	}
}
