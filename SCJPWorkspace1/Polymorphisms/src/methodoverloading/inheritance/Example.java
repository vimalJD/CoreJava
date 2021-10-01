package methodoverloading.inheritance;

public class Example {

	void add(int a, int b) {
		System.out.println("Example int, int");
	}

	void add(String a, float b) {
		System.out.println("Example string, float");
	}

	int add(String s1, String s2) {
		System.out.println("Example string, string");
		return 10;
	}
}
