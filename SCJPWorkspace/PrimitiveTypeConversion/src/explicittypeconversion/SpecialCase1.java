package explicittypeconversion;

public class SpecialCase1 {

	public static void main(String[] args) {

		long l1 = 10;
		int i4 = (int) l1;
		System.out.println(i4);

		float f = l1;
		System.out.println(f);

		float f1 = 10;
		long l2 = (long) f1;
		System.out.println(l2);

		float f2 = 254.345f;
		System.out.println(f2);
		byte b5 = (byte) f2;
		System.out.println(b5);
	}
}
