package exception.inner.finallyblock;

public class Example {

	public static void main(String[] args) {

		m1();
	}

	static void m1() {

		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
			} catch (NullPointerException npe) {
				System.out.println("In inner catch");
			} finally {
				System.out.println("In inner finally");
			}
			System.out.println("After inner try/catch/finally");
		} catch (NullPointerException npe) {
			System.out.println("In outer catch");
		} finally {
			System.out.println("In outer finally");
		}
		System.out.println("After outer try/catch/finally");
	}
}
