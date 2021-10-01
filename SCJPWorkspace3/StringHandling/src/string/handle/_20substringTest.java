//Operation #13: Retrieving substring, fixed substring and dynamic substring
package string.handle;

public class _20substringTest {

	public static void main(String[] args) {

		String s1 = "Java Programming Language";

		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 11));
		System.out.println(s1.substring(5, 12));
		System.out.println();

		System.out.println(s1.substring(5, 5));
//		System.out.println(s1.substring(12, 5));
//		System.out.println(s1.substring(-1, 12));
//		System.out.println(s1.substring(4, 27));
		System.out.println();

		System.out.println(s1.substring(5, 25));
//		System.out.println(s1.substring(5, 26));
		System.out.println();

		String s2 = "Java Programming Language";
		System.out.println(s2.substring(5, 12));
		System.out.println();

		int start = s2.indexOf("Program");// start=5
		int end = start + 7;
		System.out.println(s2.substring(start, end));

	}
}
