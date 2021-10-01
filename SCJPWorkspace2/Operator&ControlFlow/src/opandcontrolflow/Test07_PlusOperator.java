package opandcontrolflow;

public class Test07_PlusOperator {

	public static void main(String[] args) {

		System.out.println(10);
		System.out.println('a');
		System.out.println("a");
		System.out.println(10.0);
		System.out.println(10.345f);
		System.out.println(30L);
		System.out.println(30l);

		System.out.println(50 + 20);
		System.out.println(10 + 'a');
		System.out.println('a' + 'b');
		System.out.println("a" + "b");
		System.out.println("a" + 10);
		System.out.println("a" + true);
		System.out.println("a" + null);

		System.out.println("" + 10 + 20);
		System.out.println(10 + "" + 20);
		System.out.println(10 + 20 + "");

		System.out.println("" + (10 + 20));

		int a = 10;
		int b = 20;

		System.out.println(a + b);
		System.out.println("a+b");

		System.out.println("a+b" + a + b);
		System.out.println("a+b" + (a + b));

//		System.out.println("a-b"+a-b);
		System.out.println("a-b" + (a - b));

		System.out.println("a*b" + a * b);

	}
}
