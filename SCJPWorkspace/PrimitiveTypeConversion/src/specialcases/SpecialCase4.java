package specialcases;

public class SpecialCase4 {

	public static void main(String[] args) {

		byte b = 10;
		System.out.println("b :" + b);

		short s = 300;
		System.out.println("s :" + s);

		int i = 10;
		System.out.println("i:"+i);
		
		// cast operator
		int i2 = (int) 10L;
		System.out.println("i2 :" + i2);
		long l = 10L;
		System.out.println("l :" + l);

		float f = 10;
		System.out.println("f :" + f);

		float f1 = 10L;
		System.out.println("f1 :" + f1);

		float f2 = (float) 10.0;
		System.out.println("f2 :" + f2);

		float f3 = 10.0f;
		System.out.println("f3 :" + f3);

		double d = 10.0;
		System.out.println("d :" + d);

		double d1 = 10.0f;
		System.out.println("d1 :" + d1);

		double d2 = 10L;
		System.out.println("d2 :" + d2);

		double d3 = 'a';
		System.out.println("d3 :" + d3);

		double d4 = 10;
		System.out.println("d4 :" + d4);

		char ch = 108;
		System.out.println("ch :" + ch);

		boolean b1 = true;
		System.out.println("b1 is :" + b1);
	}
}
