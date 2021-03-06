package abstractclass.method;

abstract public class Example {

	abstract void m1();

	static int a = 10;
	int x = 20;

	static {
		System.out.println("Example static block");
	}

	{
		System.out.println("Example Non-static block");
	}

	public Example() {
		System.out.println("Example constructor");
	}

	static void m2() {
		System.out.println("Example static method");
	}

	void m3() {
		System.out.println("Example Non-static method");
	}
	
//	abstract void m4() throws Exception;
	
//	public abstract Example m6();
	
//	private abstract final m10();
	
//	private abstract static m10();
//	abstract native m8();
	
//	abstract synchronized m10();
	
//	abstract strictfp m8();
	
//	protected abstract m15();

	public static void main(String[] args) {
		System.out.println("Example main");

		System.out.println("a: " + a);
		m2();

//		Example e = new Example();

	}
}
