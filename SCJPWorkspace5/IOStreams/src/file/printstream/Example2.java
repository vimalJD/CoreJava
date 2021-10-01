package file.printstream;

public class Example2 {

	public static void main(String[] args) throws java.io.IOException {

		System.out.println("Enter Any data: ");

		int data;

		//application is not terminated
		//while ((data = System.in.read()) != -1) {

		while ((data = System.in.read()) != 13) {
			
			System.out.println("You entered: " + (char) data);
		}
	}
}
