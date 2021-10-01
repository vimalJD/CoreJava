package localpreference;

public class OrderOfStaticVarAndMainMethod {

	static int a = 20;
	static int b = 30;

	public static void main(String[] args) {

		System.out.println(a);
		System.out.println(b);

		int a = 50;

		System.out.println(a);
		System.out.println(OrderOfStaticVarAndMainMethod.a);
		System.out.println(b);
		System.out.println(OrderOfStaticVarAndMainMethod.b);
	}
}
