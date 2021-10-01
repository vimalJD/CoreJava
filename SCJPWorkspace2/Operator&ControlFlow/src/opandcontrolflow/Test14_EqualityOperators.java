package opandcontrolflow;

public class Test14_EqualityOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println();

		System.out.println(true == true);
		System.out.println(false == false);
		System.out.println(null == null);
		System.out.println();

		System.out.println(10 == 10);
		System.out.println(10 == 10.0);
		System.out.println();

		System.out.println(10.0F == 10.0);
		System.out.println(10.5F == 10.5);
		System.out.println();

		System.out.println(10.51F == 10.51);
		System.out.println(10.50F == 10.50);
		System.out.println();

		System.out.println(10.1F == 10.1);
		System.out.println(10.2F == 10.2);
		System.out.println(10.3F == 10.3);
		System.out.println(10.6F == 10.6);
		System.out.println();
	}
}
