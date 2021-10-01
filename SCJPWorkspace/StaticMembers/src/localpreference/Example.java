package localpreference;

public class Example {

	static int a = 10;

	public static void main(String[] args) {

		int a = 20;;
		//a = a;
		Example.a = a;
		System.out.println(a);
		System.out.println(Example.a);
	}
}
