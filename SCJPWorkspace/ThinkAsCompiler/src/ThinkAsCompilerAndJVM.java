
public class ThinkAsCompilerAndJVM {

	public static void main(String[] args) {

		System.out.println(10);
		System.out.println('a');
		System.out.println("a");
		System.out.println(10.0);
		System.out.println(10.246f);
		System.out.println(56l);
		System.out.println(56L);
		System.out.println(10 + 30);

		int a = 30;
		int b = 40;

		System.out.println(a + b);
		System.out.println("a+b");
		System.out.println("a+b" + a + b);
		System.out.println("a+b" + (a + b));

		System.out.println("" + 10 + 20);
		System.out.println(10 + "" + 30);
		System.out.println(10 + 50 + "");

		System.out.println(22 / 7 * 10 * 10);
		System.out.println(22f / 7 * 10 * 10);
		System.out.println(22D / 7 * 10 * 10);

		// compiler leads to arithmatic exception
//		System.out.println(10 / 0);

		// because of float or double = Infinity
		System.out.println(10.0f / 0);

//		System.out.println(-10 / 0);

//		System.out.println(0 / 0);

		// What is NaN?

		// “NaN” stands for “not a number”.
		/*
		 * “Nan” is produced if a floating point operation has some input parameters
		 * that cause the operation to produce some undefined result. For example, 0.0
		 * divided by 0.0 is arithmetically undefined.
		 */

		System.out.println(0.0 / 0);
		System.out.println(-0.0 / 0);
	}
}
