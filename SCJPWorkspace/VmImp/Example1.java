//package nonstaticmembers.classload.vmimp;

public class Example1 {

	static {
		System.out.println("Example SB - class is loaded");
		Example1 e = new Example1();
		Sample.m1(e);
		
	}
	
	public Example1() {
		System.out.println("Example constructor - object is created: ");
	}
	
	void print(String msg) {
		
		System.out.println(msg);
	}
}
