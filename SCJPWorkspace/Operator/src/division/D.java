package division;

public class D {

	public static void main(String[] args) {

		int i = 10;
		int i1 = 10;
		float f = 22 / 7;
		float f1 = 22 / 7f;

		float f4 = 0.0f / 0;
		
		//it will give NaN (Not a Number)
		System.out.println(f4);

		/*
		 * float f3 = 10.0f / 0; System.out.println(f3);
		 */

		/*int i2 = 0 / 0;
		System.out.println(i2);*/

		double d = (f * i * i1);
		System.out.println(d);

		double d1 = (f1 * i * i1);
		System.out.println(d1);

		System.out.println(22 / 7 * 10 * 10);
		System.out.println(22 / 7f * 10 * 10);
	}

}
