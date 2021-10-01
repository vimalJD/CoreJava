package typesofvariables;

public class TransientVariable {

	static transient int x = 10;

	// non statac variable can be used by creating object with new keyword
	transient int y = 20;

	static void m1(TransientVariable transientVariable) {
		// illegal modifier
		// transient int z =50;
		System.out.println("static method value:" + 50);
	}

	public static void main(String[] args) {

		System.out.println("static transient variable value :" + x);

		TransientVariable.m1(new TransientVariable());

		TransientVariable transientVariable = new TransientVariable();
		System.out.println(transientVariable.y);

	}

}
