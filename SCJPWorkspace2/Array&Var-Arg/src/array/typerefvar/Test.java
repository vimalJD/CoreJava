package array.typerefvar;

public class Test {

	static int[] ia1 = new int[5];
	int[] ia2 = { 40, 50, 60, 70 };

	public static void main(String[] args) {

		int[] ia3 = new int[3];

		System.out.println(ia1[1]);

//		System.out.println(ia2[1]);
		System.out.println(ia3[1]);

		Test t = new Test();
		System.out.println(t.ia2[1]);
//		System.out.println(t.e2[1]);

	}
}
