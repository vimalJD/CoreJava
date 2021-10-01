package exception.compile.trycatch;

public class CaseB24 {

	public static void main(String[] aegs) {
		
		m1();
	}

	static void m1() {
		int a;
		
		try {
			a=10;
		} catch (ArithmeticException ae) {
			a=20;
		}
		finally {
//			System.out.println(a);
		}
	}
}
