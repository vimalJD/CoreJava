package explicittypeconversion;

public class SpecialCase2 {

	public static void main(String[] args) {
		char ch = 'a';
		System.out.println("ch:" + ch);
		char ch1 = 97;
		System.out.println("ch1:" + ch1);

		char ch2 = 255;
		System.out.println("ch2:" + ch2);

		char ch3 = 65000;
		System.out.println("ch3:" + ch3);

		char ch4 = 65535;
		System.out.println("ch4:" + ch4);

//		char ch5 = 66000;
		char ch5 = (char) 66000;
		System.out.println("ch5:" + ch5);

		int i1 = 98;
		System.out.println("i1:" + i1);

		int i2 = 'b';
		System.out.println("i2:" + i2);

		char ch6 = 98;
		System.out.println("ch6:" + ch6);

		char ch7 = 250;
		System.out.println("ch7:" + ch7);

		int i3 = 98;
		// cast because integer data type range is higher than
		// char data type.
		char ch8 = (char) i3;
		System.out.println("ch8:" + ch8);
		char ch9 = 98;
		System.out.println("ch9:" + ch9);
	}
}
