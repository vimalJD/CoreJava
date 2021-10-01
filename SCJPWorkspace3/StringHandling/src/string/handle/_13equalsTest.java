//Operation #4: Compare string objects for equality with and without case
package string.handle;

public class _13equalsTest {

	public static void main(String[] args) {

		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");
		String s4 = new String("a");

		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");

		System.out.println("== Operator");
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(sb1 == sb2);
		System.out.println("Equals method");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(sb1.equals(sb2));
		System.out.println();
		String s5 = "a";
		String s6 = "A";
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));

		Example e1 = new Example(5);
		Example e2 = new Example(5);
		Example e3 = new Example(6);
		Example e4 = e3;
		System.out.println("Class Example");
		System.out.println(e1 == e2);
		System.out.println(e2 == e3);
		System.out.println(e3 == e4);
		System.out.println();
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println();

		Sample1 s11 = new Sample1();
		System.out.println("Class Sample1");
//		System.out.println(e1==s11);
		System.out.println(e1.equals(s11));
		System.out.println(s11.equals(e1));
		System.out.println(s1 == null);
		System.out.println(s1.equals(null));
		System.out.println(e1 == null);
		System.out.println(e1.equals(null));
	}
}
