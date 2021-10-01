package file.readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReader {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter data: ");

		String line = br.readLine();

		System.out.print("You entered: " + line);

	}
}
