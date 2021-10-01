package vararg.parammethods;

public class ArrayWithParm {

	static void add(int[] a) {

		if (a.length == 0) {
			System.out.println("Values are not passed");
		} else {

			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
			}
			System.out.println("Result: " + sum);
		}
	}

	public static void main(String[] args) {

		add(new int[] {});
		add(new int[] { 5 });
		add(new int[] { 5, 6 });
		add(new int[] { 5, 6, 7 });
		add(new int[] { 5, 6, 7, 8 });
	}
}
