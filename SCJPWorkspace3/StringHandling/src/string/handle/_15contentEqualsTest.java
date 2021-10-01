//Operation #6: Comparing string object data with the data available in StringBuffer
// StringBuilder objects

package string.handle;

public class _15contentEqualsTest {

	public static void main(String[] args) {

		String s1 = new String("a");
		String s2 = new String("a");

		StringBuffer sb1 = new StringBuffer("a");

		System.out.println(s1.equals(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println();

		System.out.println(s1.equals(sb1));
		System.out.println(s1.contentEquals(sb1));
		System.out.println();

//		System.out.println(sb1.contentEquals(s1));
		System.out.println(s1 == s2);
	}
}
