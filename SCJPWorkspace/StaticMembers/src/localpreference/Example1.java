package localpreference;

public class Example1 {

//	static int a;
	static int a=10;

	static void m1(int a) {

//		Example1.a = a;
		a=Example1.a;
		System.out.println(a);
//		return;
	}

	public static void main(String[] args) {

		System.out.println(a);
		m1(50);
		System.out.println(a);
	}
}
