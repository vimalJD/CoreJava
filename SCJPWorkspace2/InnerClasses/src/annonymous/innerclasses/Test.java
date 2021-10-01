package annonymous.innerclasses;

public class Test {

	public static void main(String[] args) {

		new Thread() {
			void m1() {
				System.out.println("hi");
			}
		};

		System.out.println("Hello");
	}
}
