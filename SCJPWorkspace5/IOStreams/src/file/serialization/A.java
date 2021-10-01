package file.serialization;

public class A implements java.io.Serializable {

	int x;

	public A() {

		x = 50;
		System.out.println("x is initialized with 50");
	}
}
