package constructorchaining;

public class SuperClass {

	public SuperClass() {
		this(10);
		System.out.println("superclass no-arg");
	}

	public SuperClass(int i) {
		this("vimal");
		System.out.println("superclass int-arg");
	}

	public SuperClass(String string) {
		System.out.println("superclass string-arg");
	}
}
