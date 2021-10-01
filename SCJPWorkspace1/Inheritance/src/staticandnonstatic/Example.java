package staticandnonstatic;

public class Example {

	static int a = m1();

	static {
		System.out.println("Example static block");
	}

	int x = m2();

	{
		System.out.println("Example non static block");
	}

	public Example() {
		System.out.println("Example constructor");
	}

	static int m1() {
		System.out.println("Example static variable is created");
		return 10;
	}

	int m2() {
		System.out.println("Example non static variable is created");
		return 20;
	}

	void abc() {
		System.out.println("Example abc method is created ");
	}

	void bbc() {
		System.out.println("Example bbc method is created");
	}
}
