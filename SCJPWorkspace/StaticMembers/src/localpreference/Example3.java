package localpreference;

public class Example3 {

	static int a =m1();
	
	static int m1() {
		
		System.out.println("in m1");
		System.out.println("SV: "+a);
		
		return 10;
	}
	
	public static void main(String[] args) {
		
		System.out.println("main");
		m1();
		
	}
}
