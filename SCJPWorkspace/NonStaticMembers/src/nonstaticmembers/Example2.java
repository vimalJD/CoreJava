package nonstaticmembers;

public class Example2 {

	/*static int a = 10;
	static int b = 20;*/

	int x = 30;
	int y = 40;

	public static void main(String[] args) {

		/*Example2 example1 = new Example2();

		Example2 example2 = new Example2();
		System.out.println(example2);*/

		Example2 example22 = null;
		System.out.println("Null referenced variable: " + example22.x);

		/*example1.a = 50;
		example1.b = 60;
		System.out.println(example1.a + "..." + example1.b);*/

		/*example1.x = 70;
		example1.y = 80;
		System.out.println(example1.x + "..." + example1.y);*/

	}
}
