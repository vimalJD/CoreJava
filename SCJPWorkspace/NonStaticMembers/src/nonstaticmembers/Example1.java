package nonstaticmembers;

public class Example1 {

	static int a =10;
	static int b = 20;
	
	int x=30;
	int y=40;
	
	public static void main(String[] args) {
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		System.out.println("a: "+Example1.a);
		System.out.println("a: "+Example1.b);
		
		Example1 example1 = new Example1();
		System.out.println("x: "+example1.x);
		System.out.println("x: "+example1.y);
		
		//it leads CE error because static variables
		/*System.out.println("a: "+e.a);
		System.out.println("b: "+e.b);*/
		
		//it leads CE error because Non-static variables
		/*System.out.println("a: "+Example1.x);
		System.out.println("a: "+Example1.x);*/
		
		Example1 example2 = null;
		System.out.println(example2.a);
		System.out.println(example2.x);
	}
}
