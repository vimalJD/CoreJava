package exception.finallywithtransfer;

public class Example7 {

	public static void main(String[] args) {

		System.out.println(m1(5));
	}

	static int m1(int a) {
		while (a == 5) {

			try {

				System.out.println("In try");
				return 10;

			} finally {
				System.out.println("In finally");
				continue;
			}
		}
		System.out.println("after try/catch/finally");
		return 20;
	}
}
