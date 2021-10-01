//Operation #1: Checking String empty or not
package string.handle;

import java.util.Scanner;

public class _08isEmptyTest {

	public static void main(String[] args) {

		String s1 = "";
		String s2 = " ";
		String s3 = "a";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 = new String("a");

		System.out.println("is s1 empty: " + s1.isEmpty());
		System.out.println("is s2 empty: " + s2.isEmpty());
		System.out.println("is s3 empty: " + s3.isEmpty());
		System.out.println("is s4 empty: " + s4.isEmpty());
		System.out.println("is s5 empty: " + s5.isEmpty());
		System.out.println("is s6 empty: " + s6.isEmpty());
		System.out.println("is s7 empty: " + s7.isEmpty());
//RE NPE
		/*String s8 = null;
		System.out.println("is s8 empty: " + s8.isEmpty());*/

		String s9;
//		System.out.println("is s9 empty: " + s9.isEmpty());

		Scanner scn = new Scanner(System.in);
		System.out.println("\nEnter string1: ");
		System.out.println(scn.nextLine().isEmpty());

		System.out.println("\nEnter string2: ");
		System.out.println(scn.nextLine().isEmpty());

		System.out.println("\nEnter string3: ");
		System.out.println(scn.nextLine().isEmpty());
	}
}
