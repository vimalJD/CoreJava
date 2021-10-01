

public class TypeConversion {

	public static void main(String[] args) {

		byte b1 = 10;
		int i1 = b1;

//		byte b2 = i1;
		byte b2 = (byte) i1;

		/*
		 * int i = true; can not cast because of boolean type value int i = (int) true;
		 */

		int i2 = 254;
		byte b3 = (byte) i2;

		char ch1 = 'a';
		int i3 = ch1;

		int i4 = 97;
		char ch2 = (char) i4;

		long l1 = 10;
		float f1 = l1;

		long l2 = (long) f1;

		System.out.println("b1 :" + b1);
		System.out.println("i1 :" + i1);
		System.out.println("b2 :" + b2);
		System.out.println("i2 :" + i2);
		
		System.out.println("[-128+(254-127-1)]");
		System.out.println("[-128+(126)]");
		System.out.println("b3 :" + b3);
		
		System.out.println("ch1 :" + ch1);
		System.out.println("i3 :" + i3);
		System.out.println("i4 :" + i4);
		System.out.println("ch2 :" + ch2);
		System.out.println("l1 :" + l1);
		System.out.println("f1 :" + f1);
		System.out.println("l2 :" + l2);
	}
}
