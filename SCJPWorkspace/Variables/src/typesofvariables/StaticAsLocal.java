package typesofvariables;

public class StaticAsLocal {

	static int a = 10;

	public static void m1() {
		int p = 20;
		// variable created inside static methods is to be local.
		// static int q=30;
		System.out.println(p);
		System.out.println("in m1 :"+a);
	}

	public static void main(String[] args) {
		System.out.println(a);
		
		StaticAsLocal.m1();
	}
}
