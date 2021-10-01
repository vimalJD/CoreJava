package constructorchaining;

public class SubClass extends SuperClass {

	public SubClass() {
		this(10);
		System.out.println("subclass no-arg");
	}

	public SubClass(int i) {
		this("vimal");
		System.out.println("subclass int-arg");
	}

	public SubClass(String string) {
		System.out.println("subclass string-arg");
	}
}
