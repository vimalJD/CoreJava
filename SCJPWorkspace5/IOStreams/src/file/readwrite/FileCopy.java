package file.readwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("abc.txt");
//		FileOutputStream fos = new FileOutputStream("cbc.txt");
		FileOutputStream fos = new FileOutputStream("cbc.txt", true);
		int i;
		while ((i = fis.read()) != -1) {

			fos.write(i);

		}
		System.out.println("Data has been written");
	}
}
