package file.readerwriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionKeyboardReader {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter first integer value: ");
			String fno = br.readLine();

			System.out.println("Enter second integer value: ");
			String sno = br.readLine();

			// converting string from integer
			int i = Integer.parseInt(fno);
			int j = Integer.parseInt(sno);

			int k = i + j;
			System.out.println("Result: " + k);

		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			System.out.println("Please pass only integer value");
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
	}
}
