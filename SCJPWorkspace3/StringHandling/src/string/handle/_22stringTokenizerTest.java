//Operation #14.1: StringTokenizerTest 
package string.handle;

import java.util.StringTokenizer;

public class _22stringTokenizerTest {

	public static void main(String[] args) {

//		StringTokenizer st = new StringTokenizer("Vimal PatelIT");

//		StringTokenizer st1 = new StringTokenizer("Vimal PatelIT", "a");

		StringTokenizer st2 = new StringTokenizer("Vimal PatelIT", "a", true);

		System.out.println("Number of Tokens: " + st2.countTokens());

		while (st2.hasMoreTokens()) {

			String token = st2.nextToken();
			System.out.println(token);
		}
	}
}
