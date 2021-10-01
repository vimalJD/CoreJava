package methodoverloading.wideningpara;

public class Example {

	void m1(int i, float f) {
		System.out.println("int, float method");
	}

	void m1(float f, int i) {
		System.out.println("float, int method");
	}
}
