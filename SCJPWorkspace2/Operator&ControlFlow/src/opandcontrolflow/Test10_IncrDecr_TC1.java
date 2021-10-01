package opandcontrolflow;

public class Test10_IncrDecr_TC1 {

	public static void main(String[] args) {

		int x = 10;
		++x;
		System.out.println("x: " + x);

		int y = 10;
		y++;
		System.out.println("y: " + y);

		System.out.println();

		int a = 1;
		System.out.println("Hi-" + a++);
		System.out.println(a);
		System.out.println();

		a = 1;
		System.out.println("Hi-" + ++a);
		System.out.println(a);
	}
}
