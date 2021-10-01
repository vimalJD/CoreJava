package string.handle;

public class Rule3 {

	public static void main(String[] args) {

		String s1 = null;
		// RE NPE
//		String s2 = new String(s1);
//		String s3 = new String((StringBuffer) null);

//		String s19 = new String(null);
//		String s20 = new String((String) null);

		String s21 = null;
		System.out.println("s21: " + s21);
		// RE NPE
//		System.out.println("s21: " + s21.length());
		System.out.println();

		String s22 = "null";
		System.out.println("s22 chars: " + s22);
		System.out.println("s21 length: " + s22.length());
		System.out.println();

		String s23 = new String("null");
		System.out.println("s23 chars: " + s23);
		System.out.println("s23 length: " + s23.length());
		System.out.println();

		String s4 = "";
		System.out.println("s4: " + s4);
		String s5 = new String();
		System.out.println("s5: " + s5);
		String s6 = new String("");
		System.out.println("s6: " + s6);

		String s7 = null;
		System.out.println("s7 :" + s7);

		String s8 = new String("A");
		System.out.println("s8: " + s8);

		String s9 = new String(s8);
		System.out.println("s9: " + s9);

		String s10 = new String("B");
		System.out.println("s10: " + s10);
		String s11 = s10;
		System.out.println("s11: " + s11);

	}
}
