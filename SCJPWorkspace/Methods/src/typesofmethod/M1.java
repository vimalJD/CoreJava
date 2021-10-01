package typesofmethod;

public class M1 {

	static int a = 10;
	static int b = a + 10;

	public static void main(String[] args) {

		System.out.println(a + "..." + b);
		m1();
		if (true) {
			System.out.println("Hi");
		}
	}

	static void m1() {
		System.out.println("m1");
	}

}
