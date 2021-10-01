package specialcases;

public class SpecialCase3 {

	public static void main(String[] args) {

		char ch1 = 'a';
		System.out.println("ch1 :" + ch1);

		char ch2 = 'l';
		System.out.println("ch2 :" + ch2);

		// invalid character constant
		// char ch3 = '10';
		System.out.println("add to valid symbol : ch3");

		char ch4 = 97;
		System.out.println("ch4 :" + ch4);

		char ch5 = 49;
		System.out.println("ch5 :" + ch5);

		// character value put in ''
		// char ch6 = l;
		System.out.println("add to cast ch6");

		char ch7 = 255;
		System.out.println("ch7 :" + ch7);

		char ch8 = 65000;
		System.out.println("ch8 :" + ch8);

		char ch9 = 65535;
		System.out.println("ch9 :" + ch9);

		// add to cast or change type
		// char ch10 = 66000;
		System.out.println("add to cast ch10");

		// add to cast or change type character has +ve num value
		// char ch11 = -97;
		System.out.println("character has +ve num value so that\n" + "add to cast ch11");

		int i1 = 97;
		System.out.println("i1 :" + i1);

		int i2 = 'a';
		System.out.println("i2 :" + i2);

		// add to cast
		// char ch12 = i1;
		System.out.println("add to cast ch12");

		char ch13 = (char) i1;
		System.out.println("ch13 :" + ch13);

		int i3 = -97;
		System.out.println("i3 :" + i3);

		// add to cast
		// char ch14 = i3;
		System.out.println("add to cast ch14");

		char ch15 = (char) i3;
		System.out.println("ch15 :" + ch15);

		float f = 'a';
		System.out.println("f :" + f);
	}
}
