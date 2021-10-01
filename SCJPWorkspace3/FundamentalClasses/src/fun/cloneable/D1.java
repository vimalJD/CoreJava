package fun.cloneable;

public class D1 extends C1 implements Cloneable {

	B1 b = new B1();

	public static void main(String[] args) throws CloneNotSupportedException {

		D1 d1 = new D1();
		D1 d2 = (D1) d1.clone();

		System.out.println(d1.a1 == d2.a1);
		System.out.println(d1.b == d2.b);

		d1.a1 = new A1();
		d2.b = new B1();

		System.out.println(d1.a1 == d2.a1);
		System.out.println(d1.b == d2.b);
	}
}
