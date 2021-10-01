package file.classes;

import java.io.File;
import java.io.IOException;

public class FileParentDirectoryDemo {

	public static void main(String[] args) throws IOException {

		File f1 = new File("abc.txt");
		// abc.txt is created as normal file in current working directory
		f1.createNewFile();

		File f2 = new File("bbc.txt");
		// bbc.txt is created as directory in current working directory
		f2.mkdir();

		File f3 = new File("xyz");
		// xyz is created as directory in current working directory
		f3.mkdir();

		File f4 = new File(f3, "1.txt");
		// 1.txt is created as normal file in xyz directory
		f4.createNewFile();

		File f5 = new File(f3, "abc");
		// abc is created as directory in xyz directory
		f5.mkdir();

		File f6 = new File("pqr", "stv");
		// abc is created as directory in current working directory, and stv is created
		// in pqr as sub directory
		f6.mkdirs();

		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		System.out.println("f3: " + f3);
		System.out.println("f4: " + f4);
		System.out.println("f5: " + f5);
		System.out.println("f6: " + f6);
	}
}
