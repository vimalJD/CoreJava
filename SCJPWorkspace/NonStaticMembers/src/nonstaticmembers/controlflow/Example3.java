package nonstaticmembers.controlflow;

public class Example3 {

	int a = 10;

	{
		System.out.println("in NSB");
		System.out.println("a: " + a);
		System.out.println("b: " + this.b);
	}

	public static void main(String[] args) {

		Example3 example3 = new Example3();
		
		System.out.println("in main");
		System.out.println("a: " + example3.a);
		System.out.println("b: " + example3.b);
	}

	int b = 20;
}
