package exception.inner;

public class InnerTryDemoCase5 {

	public static void main(String[] args) {

		try {

			System.out.println("In Outer try");

			try {
				System.out.println("In inner try");
				System.out.println(10 / 0);

			} catch (NumberFormatException nfe) {

				System.out.println("In inner catch");
			}
			System.out.println("After inner try/catch");
		} catch (ArithmeticException ae) {

			System.out.println("In Outer catch");
		}
		System.out.println("After Outer try/catch");
	}
}
