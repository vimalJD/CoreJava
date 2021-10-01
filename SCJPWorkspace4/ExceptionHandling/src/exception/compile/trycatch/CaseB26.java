package exception.compile.trycatch;

public class CaseB26 {

	public static void main(String[] aegs) {

		int a = -1 ,c = 0 ,b = 0;

		try {
			a = c/b;
			System.out.println("In try: " + a);
		} catch (ArithmeticException ae) {
			a = 20;
			System.out.println("In catch: " + a);
		} finally {
			System.out.println("In finally: " + a);
		}
		System.out.println("after try catch finally: " + a);
	}
}
