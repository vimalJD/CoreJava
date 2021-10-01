package methodoverloading.objectandsuperinterface;

public class A {

	/*
	 * void m1(Object object) { System.out.println("Object param"); }
	 */

	void m1(Foo foo) {
		System.out.println("Foo param");
	}

	void m1(Alpha alpha) {
		System.out.println("Alpha param");
	}

	public static void main(String[] args) {
		A a = new A();
//		a.m1(new Beta());

//		a.m1(null);

	}
}
