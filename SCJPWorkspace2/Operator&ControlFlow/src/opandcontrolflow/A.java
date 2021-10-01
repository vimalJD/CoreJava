package opandcontrolflow;

public class A {

	void m1() {
		int p = 10;
		int q = 20;

		p = q;
//		p==q;
	}

	public static void main(String[] args) {

		int a = 10;
		if (a == 20) {
			System.out.println("Hi");
		} else {
			System.out.println("Hello");
		}

		boolean b = true;
		if (b != false) {
			System.out.println("Hi");
		} else {
			System.out.println("Hello");
		}
		System.out.println(b);
	}
}
