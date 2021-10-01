package declare.classasabstract;

public class Test {

	public static void main(String[] args) {

		Example1 example1 = new Sample1()
		{

			@Override
			void m2() {
				System.out.println("Example m2");
			}
		};
		example1.m1();
	}
}
