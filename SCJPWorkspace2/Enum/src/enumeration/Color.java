package enumeration;

public enum Color {

	RED(15), BLUE(25), GREEN;

	static int a = 10;
	int x = 20;

	static void m1() {
		System.out.println("SM");
	}
	
	void m2() {
		System.out.println("NSM");
	}
	
	static {
		System.out.println("SB");
	}
	
	{
		System.out.println("NSB");
	}
	Color() {
		System.out.println("no-arg constructor");
		this.x = 50;
	}

	Color(int x) {
		System.out.println("int-arg constructor");
		this.x = x;
	}
	
//	abstract void m3();
	
	public static void main(String[] args) {
		
		System.out.println("Color main");
	}
}
