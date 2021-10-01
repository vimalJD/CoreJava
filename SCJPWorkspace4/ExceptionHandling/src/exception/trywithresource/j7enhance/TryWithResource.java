package exception.trywithresource.j7enhance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"));) {

			String line = br.readLine();
			System.out.println(line);
		}
	}
}
