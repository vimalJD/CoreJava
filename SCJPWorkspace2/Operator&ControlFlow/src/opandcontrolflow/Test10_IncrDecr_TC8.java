package opandcontrolflow;

public class Test10_IncrDecr_TC8 {

	public static void main(String[] args) {

		int x = 10;
		x++;
		++x;
		System.out.println(x);
		System.out.println();

		char ch = 'a';
		ch++;
		System.out.println("post ch: " + ch);
		++ch;
		System.out.println("pre ch: " + ch);
		System.out.println();

		byte b = 1;
		b++;
		System.out.println("post b: " + b);
		++b;
		System.out.println("pre b: " + b);

		b = 126;
		b++;
		System.out.println(b);
		System.out.println();

		boolean bo = true;
//		bo++;

		String a = "vim";
//		a++;

		class A {

		}
		A a1 = new A();
//		a1++;

		int[] ia = new int[6];
//		ia++;
	}
}
