package string.handling1;

public class _26joinTest {

	public static void main(String[] args) {

		String s12 = String.join("-", "a", "b", "c", "d", "e");
		String s13 = String.join("", "a", "b", "c", "d");
		String s14 = String.join("-");
		String s15 = String.join("-", "a");
		String s16 = String.join("-", "a", "b");
		String s17 = String.join("-", "a", new StringBuffer("b"), new StringBuilder("c"));

		System.out.println("s12: " + s12);
		System.out.println("s13: " + s13);
		System.out.println("s14: " + s14);
		System.out.println("s15: " + s15);
		System.out.println("s16: " + s16);
		System.out.println("s17: " + s17);
		System.out.println();

		// performance
		String s18 = "p";
		System.out.println("s18: " + s18);
		String s19 = s18 + "q";
		System.out.println("s19: " + s19);

		String s11 = new StringBuilder().append(s18).append("q").toString();
		System.out.println("s11: " + s11);
		String s20 = s18.concat("q");
		System.out.println("s20: " + s20);
		System.out.println();

		// concatenating more strings
		String s21 = "a" + "b" + "c" + "d";
		String s22 = "a".concat("b").concat("c").concat("d");
		String s23 = String.join("", "a", "b", "c", "d");
		String s24 = String.join("-", "a", "b", "c", "d");

		System.out.println(s21);
		System.out.println(s22);
		System.out.println(s23);
		System.out.println(s24);
		System.out.println();
	}
}
