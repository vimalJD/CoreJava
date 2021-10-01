package exception.compile.trycatch;

public class CaseC33Div {

	static int div(String[] args) {

		int res = -1;

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int c = a / b;

			res = 4;
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			res = 5;
		} catch (NumberFormatException nfe) {
			res = 6;
		} catch (ArithmeticException ae) {
			res = 7;
		}
		System.out.println("After try/catch");
		return res;
	}
}
