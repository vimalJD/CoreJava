package opandcontrolflow;

public class Test10_IncrDecr_TC {

	public static void main(String[] args) {
		int i = 1;

		while (i++ <= 4) {
			System.out.println(i + "->Hello");
		}
		System.out.println("After loop i: " + i);
		System.out.println();

		i = 1;
		while (++i <= 4) {
			System.out.println(i + "->Hello");
		}
		System.out.println("After loop i: " + i);
	}
}
