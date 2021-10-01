//Operation #27: insert new string charactrs

package string.handling1.bufferbuilder;

public class _38insertTest {

	public static void main(String[] args) {

		StringBuffer sb2 = new StringBuffer("27122004");
		System.out.println("SB chars: " + sb2);

		sb2.insert(2, "-");
		System.out.println("SB chars: " + sb2);

		sb2.insert(5, "-");
		System.out.println("SB chars: " + sb2);

//		sb2.insert(sb2.length()-1, null);
		sb2.insert(sb2.length() - 1, (String) null);
		sb2.insert(sb2.length(), (String) null);
		System.out.println("SB chars: " + sb2);

//		sb2.insert(sb2.length(), (char[]) null);
//		sb2.insert(20, "b");
//		sb2.insert(-5, "b");

		sb2.insert(0, "b");
		System.out.println("SB chars: " + sb2);
		System.out.println();
	}
}
