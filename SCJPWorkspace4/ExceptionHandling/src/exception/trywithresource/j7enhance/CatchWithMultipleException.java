package exception.trywithresource.j7enhance;

public class CatchWithMultipleException {

	public static void main(String[] args) {

		try {

			int i1 = Integer.parseInt(args[0]);
			int i2 = Integer.parseInt(args[1]);
			int i3 = i1 / i2;

			System.out.println("Result: " + i3);
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("Hi");
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Hello");
		}
	}
}
