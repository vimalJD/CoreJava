package opandcontrolflow;

public class Test14_EqualityOperator_TC1 {

	public static void main(String[] args) {

//		System.out.println(10=10);

		int a = 97;

		System.out.println(a=30);
		System.out.println();
		System.out.println(a);

		System.out.println(a == 30);
		System.out.println(a);

		System.out.println(a == 40);
		System.out.println(a);

		char ch = 'a';
		System.out.println(a == ch);

//		System.out.println(true==10);

		int x = 10, y = 20, z = 20;
//		System.out.println(x=y==z);
		System.out.println((x = y) == z);
	}
}
