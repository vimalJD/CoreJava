package fun.cloneable;

public class Example implements Cloneable {

	int x = 10;
	int y = 20;

	public static void main(String[] args) throws CloneNotSupportedException {

		Example example1 = new Example();

		example1.x = 5;
		example1.y = 6;

		Example example2 = (Example) example1.clone();

		System.out.println(example1 == example2);
		System.out.println(example1.hashCode() == example2.hashCode());

		System.out.println(example1.x + "..." + example1.y);
		System.out.println(example2.x + "..." + example2.y);

		example2.x = 8;
		example2.y = 9;

		System.out.println();
		System.out.println(example1.x + "..." + example1.y);
		System.out.println(example2.x + "..." + example2.y);
	}
}
