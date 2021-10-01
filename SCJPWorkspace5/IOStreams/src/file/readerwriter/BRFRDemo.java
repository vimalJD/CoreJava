package file.readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BRFRDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

		String line;

		while ((line = br.readLine()) != null) {

			System.out.print(line);

		}
	}
}
