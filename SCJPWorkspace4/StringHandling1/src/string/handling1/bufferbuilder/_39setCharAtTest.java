//Operation #28: Replacing existing character or sequence of characters
package string.handling1.bufferbuilder;

public class _39setCharAtTest {

	public static void main(String[] args) {

		StringBuffer sb6 = new StringBuffer("abc bbc cbc");
		System.out.println("SB chars: " + sb6);

		sb6.setCharAt(3, '-');
		System.out.println("SB chars: " + sb6);

		sb6.setCharAt(5, 'B');
		System.out.println("SB chars: " + sb6);
	}
}
