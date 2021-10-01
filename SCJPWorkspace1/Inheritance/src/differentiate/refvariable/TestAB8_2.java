package differentiate.refvariable;

import inherit.A;

public class TestAB8_2 {

	public static void main(String[] args) {

		B8 b = new B8();
		// CE, will solve in Polymorphism
		// A8 a = b;

		System.out.println("a :" + b.a);
//		System.out.println("a :"+a.a);

		System.out.println("x :" + b.x);
//		System.out.println("x :"+a.x);

	}
}
