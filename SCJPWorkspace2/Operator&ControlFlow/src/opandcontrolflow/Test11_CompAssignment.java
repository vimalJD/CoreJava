package opandcontrolflow;

public class Test11_CompAssignment {

	public static void main(String[] args) {

		int i1 = 10;
		i1 += 5;
		System.out.println(i1);

		int i2 = 10;
		i2 *= 2 + 3;
		System.out.println(i2);

		byte b1 = 10;
		b1 += 5;
		System.out.println(b1);

		int i3 = 10;
		i3 += 10.5;
		System.out.println(i3);

		String s1 = "a";
		s1 += 1;
		System.out.println(s1);

		s1 += 10 - 20;
		System.out.println(s1);

	}
}
