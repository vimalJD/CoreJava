package fun.cloneable;

public class Test1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Example1 example1 = new Example1();
		Example1 example12 = example1.clone();

		System.out.println(example1);
		System.out.println(example12);
	}
}
