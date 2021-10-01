package file.readwrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileOutputStream fos = new FileOutputStream("bbt.txt", true);

		fos.write('a');
		fos.write('b');
		fos.write(99);

		System.out.println("data is written to file");
	}
}
