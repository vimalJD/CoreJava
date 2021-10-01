package methodoverloading.basics;

public class Sample {

	public static void main(String[] args) {

		byte b = 10;
		short s = 15;
		char ch = 'a';
		int i = 20;

		Example example = new Example();
		example.m1(b);
		example.m1(s);
		example.m1(ch);
		example.m1(i);

		System.out.println();
		example.m1(10);
		example.m1(15);
		example.m1('a');
		example.m1(20);

		System.out.println();
		example.m1((byte) 10);
		example.m1(15);
		example.m1('a');
		example.m1(20);
	}
}
