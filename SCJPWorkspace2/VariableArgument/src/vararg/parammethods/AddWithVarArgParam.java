package vararg.parammethods;

public class AddWithVarArgParam {

	static void add(int... a) {

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

		add();
		add(5);
		add(5, 6);
		add(5, 6, 7);
		add(5, 6, 7, 8);
	}
}
