//Converting any data type value, including primitive types, into string type.

package string.handle;

public class _24valueOfTest {

	public static void main(String[] args) {

		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.67));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(true));
		System.out.println();

		System.out.println(String.valueOf("abc"));
		System.out.println(String.valueOf(new char[] { 'a', 'b' }));
//		System.out.println(String.valueOf(null));
		System.out.println(String.valueOf((String) null));
		System.out.println(String.valueOf((A1) null));

		System.out.println(String.valueOf(new A1()));
		System.out.println(String.valueOf(new B1()));
		
		Integer.toString(10);

	}
}
