package file.printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("abc.txt");
		PrintStream ps = new PrintStream("bbc.txt");

		// storing data in abc.txt file using FileOutputStream object
		fos.write(97);
		fos.write(98);
		fos.write(99);
		System.out.println("Data is written to abc.txt file");

		// storing data in bbc.txt file using explicit PrintStream object
		ps.print(97);
		ps.print(98);
		ps.print(99);
		System.out.println("Data is written to bbc.txt file");

		// printing data on console using Implicit PrintStream object
		System.out.println(97);
		System.out.println(98);
		System.out.println(99);
	}
}
