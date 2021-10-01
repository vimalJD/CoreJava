package typesofvariables;

public class VolatileVariable {

	static volatile int x = 10;

	// non statac variable can be used by creating object with new keyword
	volatile int y = 20;

	static void m1(TransientVariable transientVariable) {
		// illegal modifier
		// volatile int z =50;
		System.out.println("static method value:" + 50);
	}

	public static void main(String[] args) {

		System.out.println("static volatile variable value :" + x);

		TransientVariable.m1(new TransientVariable());

	}
}
