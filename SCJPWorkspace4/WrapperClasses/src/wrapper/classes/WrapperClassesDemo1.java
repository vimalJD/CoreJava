package wrapper.classes;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {

		// boolean String object => Boolean WCO
		// false | true => WCO

		Boolean bo1 = new Boolean("false");
		Boolean bo2 = new Boolean("true");

		System.out.println("bo1: " + bo1);
		System.out.println("bo2: " + bo2);
		System.out.println();

		Boolean bo3 = Boolean.valueOf("false");
		Boolean bo4 = Boolean.valueOf("true");

		System.out.println("bo3: " + bo3);
		System.out.println("bo4: " + bo4);
		System.out.println();

		Boolean bo5 = Boolean.valueOf("True");
		Boolean bo6 = Boolean.valueOf("TrUe");
		Boolean bo7 = Boolean.valueOf("FALSE");

		System.out.println("bo5: " + bo5);
		System.out.println("bo6: " + bo6);
		System.out.println("bo7: " + bo7);
		System.out.println();

		Boolean bo8 = Boolean.valueOf("FALSE");
		Boolean bo9 = Boolean.valueOf("TRUE");
		Boolean bo10 = Boolean.valueOf("HARI");
		Boolean bo11 = Boolean.valueOf("");

		System.out.println("bo8: " + bo8);
		System.out.println("bo9: " + bo9);
		System.out.println("bo10: " + bo10);
		System.out.println("bo11: " + bo11);
		System.out.println();

		Boolean bo12 = Boolean.valueOf(null);
//		Integer io13 = Integer.valueOf(null);
//		Boolean bo14 = Boolean.valueOf(TRUE);
		Boolean bo15 = Boolean.valueOf(true);
		System.out.println("bo12: " + bo12);
//		System.err.println("io13: " + io13);
		System.out.println("bo15: " + bo15);
		System.out.println();

		// 4. PSO => PDT conversion
		// 1. PSO => WCO => PDT
		// 2. PSO=> PDT

		int i1 = Integer.parseInt("10");
//		int i2 = Integer.parseInt("10.0");

//		byte b1 = Byte.parseInt("40");
		byte b2 = Byte.parseByte("40");
//		byte b3 = Byte.parseByte("128");

		float f1 = Float.parseFloat("10");
		float f2 = Float.parseFloat("50.465");
		float f3 = Float.parseFloat("606.678F");

		boolean bo111 = Boolean.parseBoolean("TRUE");
		boolean bo112 = Boolean.parseBoolean("FALSE");
		boolean bo113 = Boolean.parseBoolean("HARI");
		boolean bo114 = Boolean.parseBoolean("TURE");

		System.out.println("bo1: " + bo1);
		System.out.println("bo2: " + bo2);
		System.out.println("bo3: " + bo3);
		System.out.println("bo4: " + bo4);
		System.out.println();

		// 5. WCO => String object conversion
		Integer io = new Integer(299);
		String s = io.toString();
		System.out.println(s);
		System.out.println(io);
		System.out.println();

		// 6. PDT => PSO
//		String s1 =10;
		String s2 = "10";
		String s3 = Integer.toString(10);
//		System.out.println("s1: "+s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);

//		String s4 = Byte.toString(10);
		String s5 = Byte.toString((byte) 10);
		System.out.println("s5: " + s5);
		System.out.println();

		String s6 = Integer.toString('a');
//		String s7 = Integer.toString("a");
//		String s8 = Integer.toString(10.0);
		System.out.println("s6: " + s6);
		System.out.println();

		String s91 = Float.toHexString(20);
		String s9 = Float.toString(20);
		String s10 = Float.toString(30L);
		String s11 = Float.toString(40.0f);
		String s12 = Float.toString(50.0F);
//		String s13 = Float.toString(60.0);
		String s13 = Float.toString((float) 60.0);
		System.out.println("s9: " + s9);
		System.out.println("s10: " + s10);
		System.out.println("s11: " + s11);
		System.out.println("s12: " + s12);
		System.out.println("s13: " + s13);
		System.out.println("s91: " + s91);

		String s14 = Boolean.toString(false);
		String s15 = Boolean.toString(true);
//		String s16 = Boolean.toString(TRUE);
		System.out.println("s14: " + s14);
		System.out.println("s15: " + s15);
	}
}
