package wrapper.classes;

public class WrapperClassesDemo {

	public static void main(String[] args) {

		// 1. PDT=> WCO conversion
		int i = 50;
		Integer io1 = new Integer(i);
		Integer io2 = Integer.valueOf(i);

		System.out.println("I: " + i);
		System.out.println("io1: " + io1);
		System.out.println("io2: " + io2);

		// find out CE errors
//		Byte b1 = new Byte(50);
		Byte b2 = new Byte((byte) 50);
		Character ch1 = new Character('a');
//		Character ch2 = new Character(97);
		Character ch3 = new Character((char) 97);
		Boolean bo = new Boolean(true);

		Float f1 = new Float(70);
		Float f2 = new Float(32.56f);
		Float f3 = new Float(50.45);

		Double d1 = new Double(67.54);
		Double d2 = new Double(98);
//		Double do = new Double('a');
		Double d3 = new Double('a');
		System.out.println();

		// 2. WCO=> PDT conversion
		Integer io3 = Integer.valueOf(254);
		int x = io3.intValue();
		byte b = io3.byteValue();
		short s = io3.shortValue();
		float f = io3.floatValue();

		System.out.println("X: " + x);
		System.out.println("b: " + b);
		System.out.println("s: " + s);
		System.out.println("f: " + f);

		// find out CE errors
//		char ch11 = io3.charValue();
//		char ch12 = io3.intValue();
		char ch13 = (char) io3.intValue();

//		boolean bo1 = io3.booleanValue();
//		boolean bo2 = io3.intValue();
//		boolean bo3 = (boolean)io3.intValue();

		// 3. PSO=> WSO converasion

		Integer io11 = new Integer("10");
		Integer io12 = new Integer("1");

		Byte bo1 = Byte.valueOf("1");
//		Byte bo2 = Byte.valueOf("128");

//		Integer io31 = Integer.valueOf("a");
//		Integer io4 = new Integer("5.4");
//		Integer io5 = new Integer("5L");

//		Long io111 = new Long("5L");

		Float fo1 = new Float("5");
//		Float fo2 = new Float("5L");
		Float fo3 = new Float("5.4");
		Float fo4 = new Float("5.4F");
		Float fo5 = new Float("5.4D");
//		Float fo6 = new Float("a");

//		Character ch = new Character("a");

		System.out.println("io11: " + io11);
		System.out.println("io12: " + io12);
		System.out.println("bo1: " + bo1);
		System.out.println("fo1: " + fo1);
//		System.out.println("fo2: " + fo2);
		System.out.println("fo3: " + fo3);
		System.out.println("fo4: " + fo4);
		System.out.println("fo5: " + fo5);
//		System.out.println("fo6: " + fo6);

	}
}
