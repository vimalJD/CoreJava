package nonstaticmembers.controlflow;

public class Example9 {

	static int a=10;
	static int b=20;
	
	int x=30;
	int y=40;
	
	static void m1() {
		System.out.println("in m1()");
	}
	
	void m2() {
		System.out.println("in m2()");
	}
}
