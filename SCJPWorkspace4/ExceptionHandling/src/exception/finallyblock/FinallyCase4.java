package exception.finallyblock;

public class FinallyCase4 {

	public static void main(String[] args) {

		try {

			System.out.println("In try");
		} finally {
			System.out.println("In finally");
		}
		System.out.println("After try/finally");
	}
}
