package exception.normal;

public class TestException {

	public static void main(String[] args) {

		try {

			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {

			System.out.println("getMessage() method output");
			System.out.println(ae.getMessage());
			System.out.println("===============");

			System.out.println("toString() method output");
			System.out.println(ae.toString());
			System.out.println("===============");

			System.out.println("printStackTrace() method output\n");
			ae.printStackTrace();
			System.out.println("===============");

			System.out.println("JVM default ouput");
			throw ae;
		}
	}
}
