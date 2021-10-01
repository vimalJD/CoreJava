package file.printstream;

//read() on console
public class Example1 {

	public static void main(String[] args) throws java.io.IOException {

		System.out.println("Enter data: ");

		int data = System.in.read();

		System.out.println("You entered: " + (char) data);
	}
}
