package wrapper.classes;

public class AutoUnboxing {

	public static void main(String[] args) {

		byte b = new Byte((byte) 40);
		short s = new Short((short) 50);
		int i = new Integer(60);
		long l = new Long(70);
		float f = new Float(80);
		double d = new Double(90);
		char ch = new Character('a');
		boolean bo = new Boolean(true);

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bo);

		byte b1 = 50;
		int i1 = b1;

		int i2 = 50;
//		byte b2=i2;
		byte b3 = (byte) i2;
		int i3 = 'a';

		double d1 = 50;
		double d2 = 60l;
		double d3 = 70.34f;
		double d4 = 30.45;

		double d22 = 60L;
		double d33 = 70.34F;
		double d44 = 30.45d;
		double d45 = 30.45D;

//		double d5 = true;

		// Check CE
//		byte b11= new Integer(50);
		int i11 = new Byte((byte) 50);

		int i22 = new Integer(50);
//		byte b2 = new Integer(i22);

//		byte b31 = (byte)new Integer(i22);
		byte b31 = (byte) new Integer(i22).intValue();

		int i31 = new Character('a');

		double d111 = new Integer(50);
		double d222 = new Long(60L);
		double d333 = new Float(70.34f);
		double d444 = new Double(30.45);

//		double d555=new Boolean(true);
		Boolean d555 = new Boolean(true);
		int i41 = new Short((short) 100);
	}
}
