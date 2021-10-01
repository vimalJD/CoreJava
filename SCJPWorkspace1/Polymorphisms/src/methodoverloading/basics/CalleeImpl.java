package methodoverloading.basics;

public class CalleeImpl {

	public void foo(Object object) {
		System.out.println("Object parameter");
	}

	public void foo(String string) {
		System.out.println("String parameter");
	}

	public void foo(Integer integer) {
		System.out.println("Integere parameter");
	}
}
