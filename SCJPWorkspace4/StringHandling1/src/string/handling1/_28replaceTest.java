//Operation #22,23: Replacing old char/substr with new char/substr
//Replacing old char/substr with new char/substr with regular expression
package string.handling1;

public class _28replaceTest {

	public static void main(String[] args) {

		String s1 = "abc abc abc";
		System.out.println(s1);

		s1.replace('a', 'b');
		System.out.println(s1);
		System.out.println();

		String s2 = s1.replace('a', 'b');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();

		String s3 = s1.replaceFirst("a", "b");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println();

		s1 = s1.replace('a', 'd');
		System.out.println(s1);
		System.out.println();

		String s4 = s1.replace("a", "e");
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1 == s4);
		System.out.println();

		String s5 = s1.replace("D", "e");
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s1 == s5);
		System.out.println();

		String s6 = "abc.txt";
		String s7 = s6.replace(".", "#");
		System.out.println(s6);
		System.out.println(s7);
		System.out.println();

		String s8 = s6.replaceAll(".", "#");
		System.out.println(s8);

		String s9 = s6.replaceFirst(".", "#");
		System.out.println(s9);

		String s10 = s6.replaceAll("\\.", "#");
		System.out.println(s10);

		String s11 = s6.replaceFirst("\\.", "#");
		System.out.println(s11);
		System.out.println();

		String s12 = "abc$bbc$cbc";
		System.out.println(s12);
		String s13 = s12.replaceAll("\\$", "");
		System.out.println(s13);
		String s14 = s13.replaceAll("\\?", "@");
		System.out.println(s14);
		System.out.println();

		String s15 = "abc";
		String s16 = s15.replace('a', 'b');
		String s17 = s15.replace('a', 'b');
		String s18 = s17.replace('a', 'b');
		System.out.println(s16 == s17);
		System.out.println(s17 == s18);
		System.out.println();
		System.out.println(s16.equals(s17));
		System.out.println(s17.equals(s18));
	}
}
