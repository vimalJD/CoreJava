package array.examples;

public class Example {

//	static int[] a ;

	static int[] a = new int[5];

	public static void main(String[] args) {

//		int[] a ;
		for (int i = 0; i < 10; i++) {

			a[i] = i * i;
			System.out.println("Square of: " + i);
			System.out.println("Value of a[i]: " + (a[i] = i * i) + "\n");
		}
	}
}
