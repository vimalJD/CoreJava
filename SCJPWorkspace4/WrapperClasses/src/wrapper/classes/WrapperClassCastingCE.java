package wrapper.classes;

public class WrapperClassCastingCE {

	public static void main(String[] args) {

		Byte b1 = new Byte((byte) 10);
//		Integer i1= b1;

		// Cannot cast from byte to integet
//		Integer i2 = (Integer)b1;
		Integer i3 = new Integer(10);

		// incompatible operand and byte
		// System.out.println(b1==i3);

		System.out.println(b1);
		System.out.println(i3);
	}
}
