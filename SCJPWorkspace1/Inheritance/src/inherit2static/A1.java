package inherit2static;

public class A1 {

	static int a = m1();

	static int m1() {

		System.out.println("A Static Variable");
		return 10;
	}

	static {

		System.out.println("A static Block");
	}

	public static void main(String[] args) {

		System.out.println("A main");
	}
}
