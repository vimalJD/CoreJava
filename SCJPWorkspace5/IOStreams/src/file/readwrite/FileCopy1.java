package file.readwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {

	public static void copyFile(String srcFile, String destFile) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("bbc.txt");

		int i;
		while ((i = fis.read()) != -1) {

			fos.write(i);

		}
		System.out.println(" Data has been written to " + destFile);
	}

}
