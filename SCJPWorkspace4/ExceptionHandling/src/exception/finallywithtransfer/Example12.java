package exception.finallywithtransfer;

public class Example12 {

	public static void main(String[] args) {

		System.out.println(m1(5));
	}

	static int m1(int a) {

		while (a == 5) {
			try {

				try {

					a = 10;

				} finally {
					a = 20;
				}
				a = 30;
				return a;

			} finally {
				if (a == 30) {
					continue;
				}
			}
		}

		return 40;
	}
}
