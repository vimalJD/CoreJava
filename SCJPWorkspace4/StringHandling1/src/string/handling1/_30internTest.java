//Operation #25: Storing objects in string pool
package string.handling1;

public class _30internTest {

	public static void main(String[] args) {

		String s1 = "Vimal ";
		String s2 = s1.intern();
		System.out.println(s1 == s2);

		String s3 = new String("NIT");
		String s4 = s3.intern();

		String s5 = "NIT";
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println();

		String s6 = s1.trim();
		String s7 = s6.intern();
		System.out.println(s6 == s7);
		System.out.println();

		String s8 = "VimalNIT";
		String s9 = s6.concat(s5);
		String s10 = s9.intern();
		System.out.println(s8 == s10);

	}
}
