package nonstaticmembers.classload.vmimp;

public class Example1 {

	/*static {
		System.out.println("Example SB - class is loaded");
		Example1 e = new Example1();
		Sample.m1(e);
		
	}*/
	
	{
		System.out.println("in NSB");
		Sample.m2("Vimal, A, Patel");
	}
	
	public Example1() {
		System.out.println("Example constructor - object is created: ");
	}
	
	
	void print(String msg) {
		
		System.out.println(msg);
	}
	
	
	public static void main(String[] args) {
		
		Example1 example1 = new Example1();
		System.out.println("Test Example1 : "+example1);
		

	}
}
