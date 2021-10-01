package opandcontrolflow;

public class Test10_IncrDecr_TC3 {

	public static void main(String[] args) {

		int x = 10;
		int y = ++x;

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println();

		x = 10;
		y = x++;
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		int b = 1, b1;
		b = ++b;
		System.out.println(b);

		b = 1;
		b1 = b++;
		System.out.println(++b1);

		int c;
		c = b1;
		System.out.println(c);
	}
}
