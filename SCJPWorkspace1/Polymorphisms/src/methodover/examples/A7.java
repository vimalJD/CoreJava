package methodover.examples;

public class A7 {

	void m1(String s) {
		System.out.println("A String-arg");
	}

	void m1(Integer i) {
		System.out.println("A Integer-arg");
	}
}

class B7 extends A7 {

	void m1(Object o) {
		System.out.println("B Object-arg");
	}

	void m1(String s) {
		System.out.println("B String-arg");
	}

	void m1(Integer i) {
		System.out.println("B Integer-arg");
	}
}

class MOL10WithInheritance {

	public static void main(String[] args) {

		B7 b = new B7();
		b.m1("a");
		b.m1(10);

		System.out.println();
		A7 a = new B7();
		a.m1("a");
		a.m1(10);
	}
}