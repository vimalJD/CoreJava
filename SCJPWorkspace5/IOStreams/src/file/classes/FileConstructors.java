package file.classes;

import java.io.File;

public class FileConstructors {

	public static void main(String[] args) {

		File f1 = new File("abc.txt");
		File f2 = new File("test", "abc.txt");
		File f = new File("test");
		File f3 = new File(f, "abc.txt");
		File f4 = new File(f1.toURI());

		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		System.out.println("f: " + f);
		System.out.println("f3: " + f3);
		System.out.println("f4: " + f4);
	}
}
