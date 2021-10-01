package localpreference;

public class StaticBlock1 {

	static {
		System.out.println("Satic Block :");
	}

	static int a = m1();

	static int m1() {
		System.out.println("Static  variable :" + a);
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("main");
		m1();
	}
}
