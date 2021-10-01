package exception.inner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {

	public static void div() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int a;
			while (true) {

				try {

					System.out.println("\nEnter first number: ");
					a = Integer.parseInt(br.readLine());

					break;
				} catch (NumberFormatException nfe) {

					System.out.println("Enter only integer");
				}
			}

			while (true) {

				try {

					System.out.println("\nEnter second number: ");
					int b = Integer.parseInt(br.readLine());

					try {

						int c = a / b;
						System.out.println("Result: " + c);
						break;
					} catch (ArithmeticException ae) {
						System.out.println("Do not pass Zero");
					}

				} catch (NumberFormatException nfe) {
					System.out.println("Enter only integer");
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
