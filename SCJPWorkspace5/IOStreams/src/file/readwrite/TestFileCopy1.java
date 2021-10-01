package file.readwrite;

import java.io.FileNotFoundException;

public class TestFileCopy1 {

	public static void main(String[] args) {

		try {

			FileCopy1.copyFile(args[0], args[1]);

		} catch (ArrayIndexOutOfBoundsException aioob) {
			// TODO: handle exception
			System.out.println("Error: please pass source and destination file names");
			System.out.println("Usage: java TestFileCopy1 abc.txt bbc.txt");
		} catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			System.out.println("Error: The given file " + args[0] + " , " + args[1]
					+ " are not found, make sure thay are available in current path");
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Error: Reading or writting failed");
			e.printStackTrace();
		}
	}
}
