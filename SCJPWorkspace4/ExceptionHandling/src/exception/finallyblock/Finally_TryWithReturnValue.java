package exception.finallyblock;

public class Finally_TryWithReturnValue {

	public static void main(String[] args) {

		System.out.println(m1());
	}
	
	static int m1() {
		try {

			System.out.println("In try");
			return 10;

		} finally {
			System.out.println("In finally");
		}
//		 System.out.println("After try/finally");
		 
//		 return 20;
	}
}
