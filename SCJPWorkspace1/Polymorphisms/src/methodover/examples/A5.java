package methodover.examples;

public class A5 {

	void m1(Object object) {
		System.out.println("A Object-arg");
	}
}

class B5 extends A5 {

	void m1(String string) {
		System.out.println("B String-arg");
	}
}

class MOL8WithInheritance {

	public static void main(String[] args) {

		B5 b = new B5();
		b.m1("a");
		b.m1(10);

		System.out.println();
		A5 a = new B5();
		a.m1("a");
		a.m1(10);
	}
}
