//Finding index of given char/substr first occurrence from 0 index & from the given index
//Finding index of given char/substr first occurrence from last index & from the given index
package string.handle;

public class _17indexLastIndexOfTest {

	public static void main(String[] args) {

		String s1 = "Java Programming Language";
		System.out.println(s1.length());
		System.out.println();

		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println();

		System.out.println(s1.indexOf('A'));
		System.out.println(s1.lastIndexOf('A'));
		System.out.println();

		System.out.println(s1.indexOf("Program"));
//		System.out.println(s1.lastIndexOf("Program"));
		System.out.println(s1.lastIndexOf("Language"));
		System.out.println();

		System.out.println(s1.indexOf('a', 5));
		System.out.println(s1.indexOf('r', 7));
		System.out.println(s1.lastIndexOf('a', 5));
		System.out.println(s1.lastIndexOf('r', 7));
		System.out.println();

		System.out.println(s1.indexOf('a', 1));
		System.out.println(s1.lastIndexOf('a', 1));
		System.out.println();

		System.out.println(s1.indexOf('a', 0));
		System.out.println(s1.lastIndexOf('a', 0));
		System.out.println();

		System.out.println(s1.indexOf('a', 24));
		System.out.println(s1.lastIndexOf('a', 24));
		System.out.println();

		System.out.println(s1.indexOf('a', 30));
		System.out.println(s1.lastIndexOf('a', 30));
		System.out.println();

		System.out.println(s1.indexOf('a', -5));
		System.out.println(s1.lastIndexOf('a', -5));
		System.out.println();

		String s2 = "VimalPatel";
		System.out.println(s2.indexOf("patel"));
		System.out.println();

		String s3 = s2.toLowerCase();
		System.out.println(s3.indexOf("patel"));
		System.out.println(s2);
		System.out.println(s3);
	}
}
