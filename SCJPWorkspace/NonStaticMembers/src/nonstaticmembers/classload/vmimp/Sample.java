package nonstaticmembers.classload.vmimp;

public class Sample {

	static Example1 e1;
	
	static void m1(Example1 e) {
		
		e1 = e;
	}
	
	static void m2(String msg) {
		e1.print(msg);
		
	}
}
