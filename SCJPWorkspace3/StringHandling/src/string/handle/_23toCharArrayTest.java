//Operation #15, 16: Converting string to character array object
// Converting string to byte array object

package string.handle;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class _23toCharArrayTest {

	public static void main(String[] args) {

		String s1 = "Vimal";
		char[] ch1 = s1.toCharArray();
		byte[] b1 = s1.getBytes();

		System.out.println("s1: " + s1);
		System.out.println("ch1: " + Arrays.toString(ch1));
		System.out.println("b1: " + Arrays.toString(b1));
	}
}
