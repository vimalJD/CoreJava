package implicittypeconversion;

public class ImplicitAutomaticWidening {

	/*
	 * static int a = 10; static long l = a;
	 */

	public static void main(String[] args) {

		int a = 40;
		long l = a;
		float f = l;
		double d = f;

		System.out.println(d);

		byte b = 57;
		short s = b;
		System.out.println(s);
		// convert byte into char (explicit conversion)
		// if we put 57 this is ACSII Number
		// desire output must be Character (explicit conversion)
		char c = (char) s;
		System.out.println(c);
		
		short s1 = (short) c;
		System.out.println(s1);
	}
}
