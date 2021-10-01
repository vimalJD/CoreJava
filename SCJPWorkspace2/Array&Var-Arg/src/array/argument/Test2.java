package array.argument;

public class Test2 {

	public static void main(String[] args) {

		Example2[] e = { new Example2(), new Example2(), new Example2(), new Example2() };

		Sample2.m2(e);

		for (int i = 0; i < e.length; i++) {

			System.out.println(e[i].x);
			System.out.println(e[i].y);

			System.out.println();
		}
	}
}
