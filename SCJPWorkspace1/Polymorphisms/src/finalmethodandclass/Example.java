package finalmethodandclass;

public class Example {

	void m1() {
		System.out.println("A m1");
	}

	// we can overload final method in subclass by using different param and no-arg
	// of sub class method
	final void m2() {
		System.out.println("A m2");
	}

	void m3() {
		System.out.println("A m3");
	}
}
