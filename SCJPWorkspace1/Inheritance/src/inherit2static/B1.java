package inherit2static;

public class B1 extends A1 {

	static int b =m2();

	static int m2() {
		
		System.out.println("class B Static Variable");
		return 20;
	}
	
	static {
		
		System.out.println("class B static Block");
	}
	
	/*public static void main(String[] args) {
		
		System.out.println("B main");
		
		System.out.println("\nB main a: "+a);
		
		System.out.println("B main b: "+b);
	}*/
}
