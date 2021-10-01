package exception.inner;

public class InnerTryDemoCase1 {

	public static void main(String[] args) {

		try {

			System.out.println("In Outer try");

			try {
				System.out.println("In inner try");

			} catch (ArithmeticException ae) {

				System.out.println("In inner catch");
			}
			System.out.println("After inner try/catch");
		} catch (ArithmeticException ae) {

			System.out.println("In Outer catch");
		}
		System.out.println("After Outer try/catch");
	}
}
