package file.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {

		// print stream object creation connecting to abc.txt file
		PrintStream ps = new PrintStream("abc.txt");

		// storing data in abc.txt file using explicit PrintStream object
		ps.print("A");
		ps.println("B");
		ps.println("C");

		System.out.println("Data is written to abc.txt file");

		System.out.print("A");

		System.out.println("B");
		System.out.println("C");

//		System.out.print();
//		System.out.println(null);

		String s = null;
		System.out.println(s);

		char[] ch = null;
		System.out.println(ch);

	}
}
