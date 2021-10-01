package exception.normal;

public class Division1 {

	public static void main(String[] args) {

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int c = a / b;

			System.out.println("Result: " + c);

		} 
		catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Please pass atleast two integer: ");
		} catch (NumberFormatException nfe) {
			System.out.println("Please pass only integer value");
		} catch (ArithmeticException ae) {
			System.out.println("Please Do not pass second value as zero");
		}
		
	}

}
