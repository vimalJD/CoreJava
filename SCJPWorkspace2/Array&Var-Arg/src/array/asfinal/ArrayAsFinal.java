package array.asfinal;

public class ArrayAsFinal {

	public static void main(String[] args) {

		final int[] ia = new int[5];

		// Modifying array location value
		ia[1] = 5;
		ia[2] = 6;

		// modifying array reference variable
		// ai = new int[6];

		// printing array locations value
		for (int i = 0; i < ia.length; i++) {

			System.out.println("ia[" + i + "]->" + ia[i]);
		}
	}
}
