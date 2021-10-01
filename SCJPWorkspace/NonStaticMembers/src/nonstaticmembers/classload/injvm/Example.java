//class load by static member

package nonstaticmembers.classload.injvm;

public class Example {
	
	static int a = m1();
	
	static int m1() {
		
		System.out.println("Example sv a-variable is created: ");
		
		return 50;
	}
	
	static {
		System.out.println("Example SB- class is loaded");
	}
	public static void main(String[] args) {
		
		System.out.println("in main");
		
	}
	
	static void m2() {
		System.out.println("Example m2");
	}
	
	public Example() {
		
		System.out.println("Example constructed - object is created: ");
	}
}
