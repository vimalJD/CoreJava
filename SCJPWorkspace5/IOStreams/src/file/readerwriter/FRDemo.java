package file.readerwriter;

import java.io.FileReader;
import java.io.IOException;

public class FRDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("abc.txt");

		int data;

		while ((data = fr.read()) != -1) {

			System.out.print(data + " ... ");
			System.out.println((char) data);

		}
	}
}
