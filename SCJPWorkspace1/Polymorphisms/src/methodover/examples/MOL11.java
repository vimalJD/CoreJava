package methodover.examples;

class A11 {
	void m1(Object o) {
		System.out.println("A Object-arg");
	}
}

class B11 extends A11 {

	void m1(Object o) {
		System.out.println("B Object-arg");
	}

	void m1(String s) {
		System.out.println("B String-arg");
	}
}

public class MOL11 {

	public static void main(String[] args) {

		B11 b = new B11();
		b.m1("a");
		b.m1(10);

		System.out.println();
		A11 a = new A11();
		a.m1("a");
		a.m1(10);
	}
}
