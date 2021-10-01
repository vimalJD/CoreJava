package file.sequencebufferedios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceBufferedIOSDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = new FileInputStream("abc.txt");
		FileInputStream fis2 = new FileInputStream("bbc.txt");

		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

		int data;

		while ((data = sis.read()) != -1) {

			System.out.print((char) data);
		}
		sis.close();
	}
}
