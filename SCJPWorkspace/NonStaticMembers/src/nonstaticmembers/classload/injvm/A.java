package nonstaticmembers.classload.injvm;

public class A {

	void m1() {
		
		B b = new B();
		b.m2(this);
	}
	
	void print(String msg) {
		
		System.out.println(msg);
	}
}
