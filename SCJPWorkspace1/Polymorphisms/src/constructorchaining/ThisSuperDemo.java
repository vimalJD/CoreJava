package constructorchaining;

public class ThisSuperDemo {

	public static void main(String[] args) {

		new SubClass();

		System.out.println();
		new SubClass(10);

		System.out.println();
		new SubClass("vimal001");
	}
}
