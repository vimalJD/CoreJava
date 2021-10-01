package wrapper.classes;

public class AutoBoxing {

	public static void main(String[] args) {

		Byte b = 40;
		Short s = 50;
		Integer i = 60;
		Long L = 70L;
		Float f = 80F;
		Double d = 90D;
		Character ch = 'a';
		Boolean bo = true;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(L);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bo);

		byte b1 = 40;
//		byte b2 =128;
		byte b2 = 127;
		int i1 = 'a';
		long l = 50;

		Byte bo1 = 40;
//		Byte bo2 = 128;
		Byte bo2 = 127;
//		Integer io = 'a';
//		Long lo = 50;
		Long lo = 50L;

		Character ch1 = 'a';
		Character ch2 = 97;
//		Character ch3 = 65537;
		Character ch3 = 65535;
	}
}
