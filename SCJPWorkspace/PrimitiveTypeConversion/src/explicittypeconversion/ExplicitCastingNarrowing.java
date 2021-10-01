package explicittypeconversion;

public class ExplicitCastingNarrowing {

	public static void main(String[] args) {

		long l = 10;

		// we need to add cast operator is a data placed
		// in parenthesis after "=" operator and before source
		// CE error
		// int i = l;

		int i = (int) l;
		System.out.println(i + "\n");

		int i1 = 254;
		System.out.println(i1);

		byte b1 = (byte) i1;
		// no CE RE error short cut formula to reduce value.
		// [minRange+(result - maxRange-1)]
		// [-128+(254-127-1)]
		System.out.println("[minRange+(result - maxrange-1)]");
		System.out.println("[-128+(254-127-1)]");
		System.out.println(b1 + "\n");

		int i2 = 257;
		System.out.println(i2);

		byte b2 = (byte) i2;
		System.out.println("[-128+(257-127-1)]");
		System.out.println("[-128+(257-228)]");
		System.out.println("[-128+(129)]");
		System.out.println(b2);

		// boolean leads to CE error.
		// Except boolean all primitive data types are compatible.
		// it means boolean value or variable cannot be assigned to any
		// other data type.
		// boolean b = (boolean)i2;

		// if we put value after parenthesis
		// byte b3 will take directly to assign value is equal to 2.
		byte b3 = (short) 2;
		System.out.println("value of b3 :" + b3);

		byte b4 = (byte) (short) i2;
		System.out.println(b4);

		int i3 = 128;
		short s = (short) i3;
		System.out.println("value of short s :" + s);
		// here cast operator consider as byte
		// because of implicit type conversion ,so no CE error.
		short s1 = (short) (byte) i3;
		System.out.println("value of short s :" + s1);

		
	}
}
