package file.printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class STDOutputDemo {

	public static void main(String[] args) throws Exception {

		// printed on console
		System.out.println("Hi1");
		System.out.println("Hello1");

		// Creating print stream objects with target files
		PrintStream ps1 = new PrintStream(new FileOutputStream("output.txt"));
		PrintStream ps2 = new PrintStream(new FileOutputStream("error.txt"));

		// changing default stream
		System.setOut(ps1);
		System.setErr(ps2);

		// passed to output stream
		System.out.println("Hi2");
		// passed error.txt
		System.err.println("Hello2");
		// AE exception is passed to error.txt
		int x = 10 / 0;
		// Here are also AE msg is stored in error.txt
		System.out.println(10 / 0);
	}
}
