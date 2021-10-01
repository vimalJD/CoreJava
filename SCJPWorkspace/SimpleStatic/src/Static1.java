
public class Static1 {

//	static int a;

	public static void main(String[] args) {
		/*
		 * int p = 1; System.out.println(a); System.out.println(p);
		 */

		int x = 50;
		int y = 50;
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x = y);
//		System.out.println(x= y == y);
		System.out.println((x = y) == y);

		System.out.println("Comparing float value with double value");
		System.out.println("Special cases --------------");
		System.out.println(3.0f == 3.0);
		System.out.println(3.1f == 3.1);
		System.out.println(3.2f == 3.2);
		System.out.println(3.3f == 3.3);
		System.out.println(3.4f == 3.4);
		System.out.println(3.5f == 3.5);
		System.out.println(3.6f == 3.6);
		System.out.println(3.7f == 3.7);
		System.out.println(3.8f == 3.8);
		System.out.println(3.9f == 3.9);
		System.out.println(3.10f == 3.10);
		System.out.println(3.11f == 3.11);
		System.out.println("It means an equality operator act as copmaring to round");
		System.out.println("floating point float and double values");
		System.out.println(15.5f == 15.5);

		System.out.println("Special cases --------------");
	}
}
