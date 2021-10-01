package file.serialization;

public class B extends A {

	int y;

	public B() {

		y = 60;
		System.out.println("y is initialized with 60");
	}

	@Override
	public String toString() {
		return "B [y=" + y + ", x=" + x + "]";
	}

}
