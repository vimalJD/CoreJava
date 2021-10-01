package array.vararg;

public class Array1 {

	public static void main(String[] args) {

		/*
		 * int[] i = new int[5];
		 * 
		 * i[0] = 6; i[1] = 5; i[2] = 4;
		 * 
		 * i[3] = 7; i[4] = 8; i[5] = 9; i[-3] = 10;
		 * 
		 * System.out.println(i);
		 */
		/*
		 * i[10L] = 10; i['a'] = 6; i[true] = 6;
		 */

		int[] i1 = new int[2];
		System.out.println("i1: " + i1);

//		int[] i2 = new int[-2];
//		System.out.println(i2);

		int[] i3 = new int['a'];
		System.out.println("i3: " + i3);
//		int[] i4 = new int["a"];
//		int[] i5 = new int[34.5];

		int[] i6 = new int[(int) 45.26];
		System.out.println("i6: " + i6);

		int[] i7 = new int[0];
		System.out.println("i7: " + i7);

		// int[3] i8 = {1,2,3};

		int[] i9 = {};
		System.out.println("i9: " + i9);

		System.out.println("i3: " + i3['a']);
		System.out.println("i3: " + i3[-1]);
	}
}
