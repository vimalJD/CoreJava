package exception.finallyblock;

public class FinallyWithReturn {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println("\nIn loop: " + i);

			try {

				System.out.println("In try");

				if (i == 5) {

					return;
				}
			} finally {

				System.out.println("In finally");
			}
			System.out.println("After try/ finally");
		}
		System.out.println("\nAfter loop");
	}
}
