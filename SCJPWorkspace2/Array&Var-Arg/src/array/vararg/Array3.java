package array.vararg;

public class Array3 {

	public static void main(String[] args) {

		Object object = new int[] { 1, 2, 3 };

		int[] someArray = (int[]) object;

		for (int i : someArray) {
			System.out.print(i + " ");
		}
	}
}
