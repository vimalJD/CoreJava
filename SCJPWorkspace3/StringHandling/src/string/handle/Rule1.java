package string.handle;

public class Rule1 {

	public static void main(String[] args) {

		byte[] b = { 97, 98, 99 };
		// RE because 0 to length-1
		/*
		 * String s10 = new String(b, 1, 4); System.out.println(s10);
		 */

		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' };
		/*
		 * String s7 = new String(ch, -2, 4); System.out.println(s7);
		 */
		/*
		 * String s8 = new String(ch, 2, -4); System.out.println(s8);
		 */

		/*
		 * String s9 = new String(ch, 2, 8); System.out.println(s9);
		 */

		/*
		 * String s10 = new String(ch, 2, 6); System.out.println(s10);
		 */

		/*
		 * String s11 = new String(ch, 2, 5); System.out.println(s11);
		 */

		String s12 = new String(ch, 2, 4);
		System.out.println("s12 chars: " + s12);
		System.out.println("s12 length: " + s12.length());
		System.out.println();

		/*
		 * String s13 = new String(ch, 6, 4); String s14 = new String(ch, 6, -4);
		 */
		String s15 = new String(ch, 6, 0);
		System.out.println("s15 chars: " + s15);
		System.out.println("s15 chars: " + s15.length());
		System.out.println();

		String s16 = new String(ch, 2, 0);
		System.out.println("s16 chars: " + s16);
		System.out.println("s16 chars: " + s16.length());
		System.out.println();

		String s17 = new String(ch, 2, 1);
		System.out.println("s17 chars: " + s17);
		System.out.println("s17 chars: " + s17.length());
		System.out.println();

		String s18 = new String(ch, 0, 2);
		System.out.println("s18 chars: " + s18);
		System.out.println("s18 chars: " + s18.length());
		System.out.println();
		
		//Rule #2 is ambiguous
//		String s19 = new String(null);
		
		
	}
}
