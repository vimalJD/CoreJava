package fun.cloneable;

public class Example2 implements Cloneable {

	A a = new A();

	public static void main(String[] args) throws CloneNotSupportedException {

		Example2 example1 = new Example2();
		Example2 example2 = (Example2) example1.clone();

		System.out.println(example1.a == example2.a);
	}
}
