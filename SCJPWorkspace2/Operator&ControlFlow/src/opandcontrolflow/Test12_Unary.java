package opandcontrolflow;

public class Test12_Unary {

	public static void main(String[] args) {

		int i1 = +5;
		System.out.println(i1);

		int i2 = -6;
		System.out.println(i2);

		boolean b1 = !true;
		System.out.println(b1);

		System.out.println(~5);
		System.out.println(~10);
		System.out.println(~50);

		int y = Example.x++ + new Example().x;
		System.out.println(y);

		Example.x = 1;
		int z = new Example().x + Example.x++;
		System.out.println(z);
	}
}
