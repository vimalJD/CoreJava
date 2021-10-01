package methodoverloading.inheritance;

public class Sample extends Example {

	void add(int x, int y) {
		System.out.println("Sample int, int");
	}

	float add(float a, int b) {
		System.out.println("Sample float, int");
		return a + b;
	}

	String add(String s1, double d) {
		System.out.println("Sample string, double");
		return s1 + d;
	}
}
