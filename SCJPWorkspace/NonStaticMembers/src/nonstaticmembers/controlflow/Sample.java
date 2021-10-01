package nonstaticmembers.controlflow;

public class Sample {

	public static void main(String[] args) {
		
		System.out.println("in main");
		
//		System.out.println("a: "+a);
		
		System.out.println("a: "+Example9.a);
		
		Example9 e1 = null;
//		System.out.println("b: "e1.b);
		
		Example9 e2 = new Example9();
		System.out.println("b :"+e2.b);
		Example9.m1();
		
//		System.out.println(Example9.x);
		
		System.out.println(e1.x);
		System.out.println(e2.x);
		System.out.println(e2.y);
		e2.m2();
	}
}
