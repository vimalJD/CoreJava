package arrya.muldimensional;

public class MulDimArrPrinter {

	public static void main(String[] args) {

		int[][] ia = { { 5, 6, 7 }, { 4, 3 }, { 1 }, { 4, 5, 7, 8, 9 } };

		for (int i = 0; i < ia.length; i++) {

			for (int j = 0; j < ia[i].length; j++) {

				System.out.print(ia[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
