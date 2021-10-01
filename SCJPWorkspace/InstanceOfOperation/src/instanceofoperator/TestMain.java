package instanceofoperator;

public class TestMain {

	public static void main(String[] args) {

		A a = new B();
		System.out.println(a instanceof Object);
		// if we put some string value it should be error
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		// it's given CE becsuse class d is sibling
		// System.out.println(a instanceof D);

		System.out.println();
		Object object = new B();
		System.out.println(a instanceof Object);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		// it's given CE becsuse class d is sibling
		// System.out.println(a instanceof D);

		System.out.println("class object :");
		// doubt in below statement
//		Object	object2 = new D();
		System.out.println(object instanceof D);

	}
}
