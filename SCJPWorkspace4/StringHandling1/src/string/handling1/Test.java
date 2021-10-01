//Test reverse string
package string.handling1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");

		String str = s.nextLine();
		String result = StringWordsRevers.reverseStringWords(str);

		System.out.println("Original string: " + str);
		System.out.println("Reverse string: " + result);
	}
}
