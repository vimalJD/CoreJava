package exception.compile.trycatch;

public class CaseC32 {

public static void main(String[] args) {
		
		System.out.println(m1());
	}

	static int m1() {
		
		try {
			System.out.println("In try");
			return 10;
		} catch (ArithmeticException ae) {
			System.out.println("In catch");
			return 20;
		}
		//unreachable statments
//		System.out.println("After try/catch");
//		return null;
//		return (Integer) null;
	}
}
