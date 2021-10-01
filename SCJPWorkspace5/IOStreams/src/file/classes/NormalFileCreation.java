package file.classes;

import java.io.File;
import java.io.IOException;

public class NormalFileCreation {

	public static void main(String[] args) throws IOException {

		// just file object is created, xyz.txt is not existed
		File f = new File("xyz.txt");

		if (!f.exists()) {

			System.out.println("f.createNewFile(): " + f.createNewFile());
			System.out.println("File is created");
		} else {
			if (f.isFile()) {

				System.out.println("in else blck");
				System.out.println("File object is normal file");
				System.out.println("f.getName(): " + f.getName());
				System.out.println("f.length(): " + f.length());

				System.out.println("f.canRead(): " + f.canRead());
				System.out.println("f.canWrite(): " + f.canWrite());
				System.out.println("f.getAbsolutePath(): " + f.getAbsolutePath());
				System.out.println("f.getPath(): " + f.getPath());
				System.out.println("f.deleteOnExit(): ");
				f.deleteOnExit();
				System.out.println("f.setReadOnly(): " + f.setReadOnly());

				System.out.println("f.canWrite(): " + f.canWrite());
			}
		}
	}
}
