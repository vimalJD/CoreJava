package nonstaticmembers.controlflow;

public class Example1 {

		int a = 10;
	
		{
	
			System.out.println("a: " + a);
	//		System.out.println("b: " + b);
		}
	
		public static void main(String[] args) {
	
			Example1 example1 = new Example1();
			System.out.println("a: " + example1.a);
			System.out.println("b: " + example1.b);
		}
	
		int b = 20;
}
