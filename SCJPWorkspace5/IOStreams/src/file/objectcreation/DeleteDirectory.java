package file.objectcreation;

import java.io.File;

public class DeleteDirectory {

	public static void main(String[] args) {

		File f1 = new File("1.txt");
		f1.delete();

		if (!f1.exists()) {

			System.out.println("1.txt is deleted");
		} else {
			System.out.println("1.txt is not deleted");
		}

		File f2 = new File("2.txt");
		f2.deleteOnExit();

		if (!f2.exists()) {

			System.out.println("2.txt is deleted");
		} else {
			System.out.println("2.txt is not deleted");
		}

		File f5 = new File("pqr");
		f5.delete();

		if (!f5.exists()) {

			System.out.println("pqr is deleted");
		} else {
			System.out.println("pqr is not deleted");
		}
	}
}
