package exception.inner.finallyblock;

public class Example1 {
	public static void main(String[] args) {

		m1();
	}

	static int m1() {

		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
			} catch (NullPointerException npe) {
				System.out.println("In inner catch");
			} finally {
				System.out.println("In inner finally");
				return 10;
			}
//			System.out.println("After inner try/catch/finally");
		} catch (NullPointerException npe) {
			System.out.println("In outer catch");
		} finally {
			System.out.println("In outer finally");
			return 30;
		}
//		System.out.println("After outer try/catch/finally");
		
	}
}
