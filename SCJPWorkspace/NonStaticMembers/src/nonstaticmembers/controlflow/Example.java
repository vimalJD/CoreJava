package nonstaticmembers.controlflow;

public class Example {

	static int a=10;
	
	static {
		
		System.out.println("a: "+a);
//		System.out.println("b: "+b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	static int b=20;
}
