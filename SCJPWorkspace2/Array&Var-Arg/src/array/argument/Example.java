package array.argument;

public class Example {

	static void m1(int[] ia) {

		System.out.println("Array size: " + ia.length);
		System.out.println("it's elements");

		for (int i = 0; i < ia.length; i++) {
			System.out.println(ia[i] + "\t");
		}
	}
}
