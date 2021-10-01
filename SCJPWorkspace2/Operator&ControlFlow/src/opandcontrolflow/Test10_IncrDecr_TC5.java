package opandcontrolflow;

public class Test10_IncrDecr_TC5 {

	public static void main(String[] args) {

		int x = 1;
		System.out.println("x:" + x);

		/*
		 * int y = x++; System.out.println("y: " + y);
		 * 
		 * int y2 = ++x; System.out.println("y2: " + y2);
		 */

//		int y1 = y + y2;
		int y = x++ + ++x;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println();

		x = 1;
		System.out.println(x);
		y = x++ + ++x + x++ + x-- + --x + ++x;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println();

		x = 1;
		System.out.println("X: " + x);
		y = ++x + --x - x-- + x++ - ++x;
		System.out.println("Y: " + y);
	}
}
