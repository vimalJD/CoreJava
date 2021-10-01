//Operation #2: Finding length of string
package string.handle;

import java.util.Scanner;

public class _09lengthTest {

	public static void main(String[] args) {

		String s1 = "";
		String s2 = " ";
		String s3 = "ab";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("ab");

		System.out.println("s1 length: " + s1.length());
		System.out.println("s2 length: " + s2.length());
		System.out.println("s3 length: " + s3.length());
		System.out.println("s4 length: " + s4.length());
		System.out.println("s5 length: " + s5.length());
		System.out.println("s6 length: " + s6.length());
		System.out.println("s7 length: " + s7.length());

//RE NPE
		/*
		 * String s8 = null; System.out.println("s8 length: " + s8.length());
		 */

		String s9 = "null";
		System.out.println("s9 length: " + s9.length());

		/*
		 * String s10; System.out.println("s10 length: " + s10.length());
		 */

//		System.out.println("s11 length: " + s11.length());
//		System.out.println("s11 is empty: " + s11.isEmpty());

		Scanner scn = new Scanner(System.in);
		System.out.println("\nEnter string1: ");
		System.out.println("You entered " + scn.nextLine().length() + " characters");

		System.out.println("\nEnter string2: ");
		System.out.println("You entered " + scn.nextLine().length() + " characters");

		System.out.println("\nEnter string3: ");
		System.out.println("You entered " + scn.nextLine().length() + " characters");
	}

	static String s11;
}
